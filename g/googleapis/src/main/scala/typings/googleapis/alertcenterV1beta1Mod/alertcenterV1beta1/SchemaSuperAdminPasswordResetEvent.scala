package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSuperAdminPasswordResetEvent extends StObject {
  
  /**
    * email of person whose password was reset
    */
  var userEmail: js.UndefOr[String | Null] = js.undefined
}
object SchemaSuperAdminPasswordResetEvent {
  
  inline def apply(): SchemaSuperAdminPasswordResetEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuperAdminPasswordResetEvent]
  }
  
  extension [Self <: SchemaSuperAdminPasswordResetEvent](x: Self) {
    
    inline def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    inline def setUserEmailNull: Self = StObject.set(x, "userEmail", null)
    
    inline def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
  }
}
