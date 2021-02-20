package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.AcquirePermission
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaFamilyInfo extends StObject {
  
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
  implicit class SchemaFamilyInfoMutableBuilder[Self <: SchemaFamilyInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMembership(value: AcquirePermission): Self = StObject.set(x, "membership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembershipUndefined: Self = StObject.set(x, "membership", js.undefined)
  }
}
