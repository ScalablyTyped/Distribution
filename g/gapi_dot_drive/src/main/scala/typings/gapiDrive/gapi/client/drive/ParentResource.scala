package typings.gapiDrive.gapi.client.drive

import typings.gapiDrive.gapiDriveStrings.driveNumbersignparentReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentResource extends StObject {
  
  var id: String = js.native
  
  var isRoot: Boolean = js.native
  
  var kind: driveNumbersignparentReference = js.native
  
  var parentLink: String = js.native
  
  var selfLink: String = js.native
}
object ParentResource {
  
  @scala.inline
  def apply(
    id: String,
    isRoot: Boolean,
    kind: driveNumbersignparentReference,
    parentLink: String,
    selfLink: String
  ): ParentResource = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isRoot = isRoot.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parentLink = parentLink.asInstanceOf[js.Any], selfLink = selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentResource]
  }
  
  @scala.inline
  implicit class ParentResourceMutableBuilder[Self <: ParentResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRoot(value: Boolean): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: driveNumbersignparentReference): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentLink(value: String): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
  }
}
