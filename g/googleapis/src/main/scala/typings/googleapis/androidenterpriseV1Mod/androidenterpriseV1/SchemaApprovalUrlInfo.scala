package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information on an approval URL.
  */
trait SchemaApprovalUrlInfo extends StObject {
  
  /**
    * A URL that displays a product&#39;s permissions and that can also be used
    * to approve the product with the Products.approve call.
    */
  var approvalUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#approvalUrlInfo&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaApprovalUrlInfo {
  
  @scala.inline
  def apply(): SchemaApprovalUrlInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApprovalUrlInfo]
  }
  
  @scala.inline
  implicit class SchemaApprovalUrlInfoMutableBuilder[Self <: SchemaApprovalUrlInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalUrl(value: String): Self = StObject.set(x, "approvalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalUrlUndefined: Self = StObject.set(x, "approvalUrl", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
