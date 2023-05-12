package typings.embroiderSharedInternals.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Addon extends StObject {
  
  var addon: String
  
  var `addon-styles`: String
  
  var `addon-test-support`: String
  
  var app: String
  
  var public: String
  
  var styles: String
  
  var `test-support`: String
  
  var vendor: String
}
object Addon {
  
  inline def apply(
    addon: String,
    `addon-styles`: String,
    `addon-test-support`: String,
    app: String,
    public: String,
    styles: String,
    `test-support`: String,
    vendor: String
  ): Addon = {
    val __obj = js.Dynamic.literal(addon = addon.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.updateDynamic("addon-styles")(`addon-styles`.asInstanceOf[js.Any])
    __obj.updateDynamic("addon-test-support")(`addon-test-support`.asInstanceOf[js.Any])
    __obj.updateDynamic("test-support")(`test-support`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Addon] (val x: Self) extends AnyVal {
    
    inline def setAddon(value: String): Self = StObject.set(x, "addon", value.asInstanceOf[js.Any])
    
    inline def `setAddon-styles`(value: String): Self = StObject.set(x, "addon-styles", value.asInstanceOf[js.Any])
    
    inline def `setAddon-test-support`(value: String): Self = StObject.set(x, "addon-test-support", value.asInstanceOf[js.Any])
    
    inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def `setTest-support`(value: String): Self = StObject.set(x, "test-support", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
  }
}
