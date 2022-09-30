package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a DeleteBackupRequest. */
trait IDeleteBackupRequest extends StObject {
  
  /** DeleteBackupRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object IDeleteBackupRequest {
  
  inline def apply(): IDeleteBackupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeleteBackupRequest]
  }
  
  extension [Self <: IDeleteBackupRequest](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
