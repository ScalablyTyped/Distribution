package typings.firebase.mod.default.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsCallOptions extends StObject {
  
  /**
    * If true, this config or event call applies globally to all
    * analytics properties on the page.
    */
  var global: Boolean = js.native
}
object AnalyticsCallOptions {
  
  @scala.inline
  def apply(global: Boolean): AnalyticsCallOptions = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsCallOptions]
  }
  
  @scala.inline
  implicit class AnalyticsCallOptionsMutableBuilder[Self <: AnalyticsCallOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
  }
}
