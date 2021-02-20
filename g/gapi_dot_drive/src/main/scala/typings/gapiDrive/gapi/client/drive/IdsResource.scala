package typings.gapiDrive.gapi.client.drive

import typings.gapiDrive.gapiDriveStrings.driveNumbersigngeneratedIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdsResource extends StObject {
  
  var ids: js.Array[String] = js.native
  
  var kind: driveNumbersigngeneratedIds = js.native
  
  var space: String = js.native
}
object IdsResource {
  
  @scala.inline
  def apply(ids: js.Array[String], kind: driveNumbersigngeneratedIds, space: String): IdsResource = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdsResource]
  }
  
  @scala.inline
  implicit class IdsResourceMutableBuilder[Self <: IdsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: driveNumbersigngeneratedIds): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
  }
}
