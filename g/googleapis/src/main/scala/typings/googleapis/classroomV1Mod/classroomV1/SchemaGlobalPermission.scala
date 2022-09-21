package typings.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGlobalPermission extends StObject {
  
  /**
    * Permission value.
    */
  var permission: js.UndefOr[String | Null] = js.undefined
}
object SchemaGlobalPermission {
  
  inline def apply(): SchemaGlobalPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGlobalPermission]
  }
  
  extension [Self <: SchemaGlobalPermission](x: Self) {
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionNull: Self = StObject.set(x, "permission", null)
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
