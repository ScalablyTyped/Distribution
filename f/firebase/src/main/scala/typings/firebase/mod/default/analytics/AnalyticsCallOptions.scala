package typings.firebase.mod.default.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsCallOptions extends StObject {
  
  /**
    * If true, this config or event call applies globally to all
    * analytics properties on the page.
    */
  var global: Boolean
}
object AnalyticsCallOptions {
  
  inline def apply(global: Boolean): AnalyticsCallOptions = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsCallOptions]
  }
  
  extension [Self <: AnalyticsCallOptions](x: Self) {
    
    inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
  }
}
