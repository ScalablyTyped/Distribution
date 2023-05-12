package typings.googleMaps.google.maps.places

import typings.googleMaps.google.maps.LatLngBounds
import typings.googleMaps.google.maps.LatLngBoundsLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchBoxOptions extends StObject {
  
  /**
    * The area towards which to bias query predictions. Predictions are biased
    * towards, but not restricted to, queries targeting these bounds.
    */
  var bounds: js.UndefOr[LatLngBounds | Null | LatLngBoundsLiteral] = js.undefined
}
object SearchBoxOptions {
  
  inline def apply(): SearchBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBoxOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchBoxOptions] (val x: Self) extends AnyVal {
    
    inline def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsNull: Self = StObject.set(x, "bounds", null)
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
  }
}
