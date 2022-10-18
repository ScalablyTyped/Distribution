package typings.expoConstants.buildConstantsDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientScopingConfig extends StObject {
  
  /**
    * An opaque unique string for scoping client-side data to this project. This value
    * will not change when a project is transferred between accounts or renamed.
    */
  var scopeKey: js.UndefOr[String] = js.undefined
}
object ClientScopingConfig {
  
  inline def apply(): ClientScopingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientScopingConfig]
  }
  
  extension [Self <: ClientScopingConfig](x: Self) {
    
    inline def setScopeKey(value: String): Self = StObject.set(x, "scopeKey", value.asInstanceOf[js.Any])
    
    inline def setScopeKeyUndefined: Self = StObject.set(x, "scopeKey", js.undefined)
  }
}
