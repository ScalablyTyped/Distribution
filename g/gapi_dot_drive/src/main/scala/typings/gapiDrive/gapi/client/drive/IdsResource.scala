package typings.gapiDrive.gapi.client.drive

import typings.gapiDrive.gapiDriveStrings.driveNumbersigngeneratedIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdsResource extends StObject {
  
  var ids: js.Array[String]
  
  var kind: driveNumbersigngeneratedIds
  
  var space: String
}
object IdsResource {
  
  inline def apply(ids: js.Array[String], space: String): IdsResource = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], kind = "drive#generatedIds", space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdsResource]
  }
  
  extension [Self <: IdsResource](x: Self) {
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setKind(value: driveNumbersigngeneratedIds): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
  }
}
