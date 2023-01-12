package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.PolylineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * PolylineSetup options.
  */
trait PolylineSetupOptions extends StObject {
  
  /**
    * Polyline options.
    */
  var polylineOptions: js.UndefOr[PolylineOptions | Null] = js.undefined
  
  /**
    * Polyline visibility.
    */
  var visible: js.UndefOr[Boolean | Null] = js.undefined
}
object PolylineSetupOptions {
  
  inline def apply(): PolylineSetupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineSetupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolylineSetupOptions] (val x: Self) extends AnyVal {
    
    inline def setPolylineOptions(value: PolylineOptions): Self = StObject.set(x, "polylineOptions", value.asInstanceOf[js.Any])
    
    inline def setPolylineOptionsNull: Self = StObject.set(x, "polylineOptions", null)
    
    inline def setPolylineOptionsUndefined: Self = StObject.set(x, "polylineOptions", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleNull: Self = StObject.set(x, "visible", null)
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
