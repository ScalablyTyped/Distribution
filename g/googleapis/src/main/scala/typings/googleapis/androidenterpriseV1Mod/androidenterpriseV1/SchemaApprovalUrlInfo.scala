package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information on an approval URL.
  */
@js.native
trait SchemaApprovalUrlInfo extends js.Object {
  
  /**
    * A URL that displays a product&#39;s permissions and that can also be used
    * to approve the product with the Products.approve call.
    */
  var approvalUrl: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#approvalUrlInfo&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaApprovalUrlInfo {
  
  @scala.inline
  def apply(): SchemaApprovalUrlInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApprovalUrlInfo]
  }
  
  @scala.inline
  implicit class SchemaApprovalUrlInfoOps[Self <: SchemaApprovalUrlInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApprovalUrl(value: String): Self = this.set("approvalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprovalUrl: Self = this.set("approvalUrl", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
