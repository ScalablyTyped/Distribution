package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomScheme extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/custom-scheme
  var privileges: js.UndefOr[Privileges] = js.undefined
  
  /**
    * Custom schemes to be registered with options.
    */
  var scheme: String
}
object CustomScheme {
  
  inline def apply(scheme: String): CustomScheme = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomScheme]
  }
  
  extension [Self <: CustomScheme](x: Self) {
    
    inline def setPrivileges(value: Privileges): Self = StObject.set(x, "privileges", value.asInstanceOf[js.Any])
    
    inline def setPrivilegesUndefined: Self = StObject.set(x, "privileges", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
