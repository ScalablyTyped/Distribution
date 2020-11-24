package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.AcquirePermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaFamilyInfo extends js.Object {
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Family membership info of the user that made the request.
    */
  var membership: js.UndefOr[AcquirePermission] = js.native
}
object SchemaFamilyInfo {
  
  @scala.inline
  def apply(): SchemaFamilyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFamilyInfo]
  }
  
  @scala.inline
  implicit class SchemaFamilyInfoOps[Self <: SchemaFamilyInfo] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMembership(value: AcquirePermission): Self = this.set("membership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembership: Self = this.set("membership", js.undefined)
  }
}
