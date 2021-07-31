package typings.firebase.mod.default.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettingsOptions extends StObject {
  
  /** Sets custom name for `dataLayer` array used by gtag. */
  var dataLayerName: js.UndefOr[String] = js.undefined
  
  /** Sets custom name for `gtag` function. */
  var gtagName: js.UndefOr[String] = js.undefined
}
object SettingsOptions {
  
  @scala.inline
  def apply(): SettingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsOptions]
  }
  
  @scala.inline
  implicit class SettingsOptionsMutableBuilder[Self <: SettingsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataLayerName(value: String): Self = StObject.set(x, "dataLayerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLayerNameUndefined: Self = StObject.set(x, "dataLayerName", js.undefined)
    
    @scala.inline
    def setGtagName(value: String): Self = StObject.set(x, "gtagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGtagNameUndefined: Self = StObject.set(x, "gtagName", js.undefined)
  }
}
