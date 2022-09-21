package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRemoteLockEvent extends StObject {
  
  /**
    * Package name of the admin app requesting the change.
    */
  var adminPackageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User ID of the admin app from the which the change was requested.
    */
  var adminUserId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * User ID in which the change was requested in.
    */
  var targetUserId: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRemoteLockEvent {
  
  inline def apply(): SchemaRemoteLockEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoteLockEvent]
  }
  
  extension [Self <: SchemaRemoteLockEvent](x: Self) {
    
    inline def setAdminPackageName(value: String): Self = StObject.set(x, "adminPackageName", value.asInstanceOf[js.Any])
    
    inline def setAdminPackageNameNull: Self = StObject.set(x, "adminPackageName", null)
    
    inline def setAdminPackageNameUndefined: Self = StObject.set(x, "adminPackageName", js.undefined)
    
    inline def setAdminUserId(value: Double): Self = StObject.set(x, "adminUserId", value.asInstanceOf[js.Any])
    
    inline def setAdminUserIdNull: Self = StObject.set(x, "adminUserId", null)
    
    inline def setAdminUserIdUndefined: Self = StObject.set(x, "adminUserId", js.undefined)
    
    inline def setTargetUserId(value: Double): Self = StObject.set(x, "targetUserId", value.asInstanceOf[js.Any])
    
    inline def setTargetUserIdNull: Self = StObject.set(x, "targetUserId", null)
    
    inline def setTargetUserIdUndefined: Self = StObject.set(x, "targetUserId", js.undefined)
  }
}
