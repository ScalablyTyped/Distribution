package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These options specify the appearance of a marker label. A marker label is a
  * string (often a single character) which will appear inside the marker. If
  * you are using it with a custom marker, you can reposition it with the
  * <code>labelOrigin</code> property in the <code>Icon</code> class.
  */
trait MarkerLabel extends StObject {
  
  /**
    * The className property of the label&#39;s element (equivalent to the
    * element&#39;s class attribute). Multiple space-separated CSS classes can
    * be added. The font color, size, weight, and family can only be set via
    * the other properties of <code>MarkerLabel</code>. CSS classes should not
    * be used to change the position nor orientation of the label (e.g. using
    * translations and rotations) if also using <a
    * href="https://developers.google.com/maps/documentation/javascript/examples/marker-collision-management">marker
    * collision management</a>.
    * @defaultValue <code>&#39;&#39;</code> (empty string)
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * The color of the label text.
    * @defaultValue <code>&#39;black&#39;</code>
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * The font family of the label text (equivalent to the CSS font-family
    * property).
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The font size of the label text (equivalent to the CSS font-size
    * property).
    * @defaultValue <code>&#39;14px&#39;</code>
    */
  var fontSize: js.UndefOr[String] = js.undefined
  
  /**
    * The font weight of the label text (equivalent to the CSS font-weight
    * property).
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  
  /**
    * The text to be displayed in the label.
    */
  var text: String
}
object MarkerLabel {
  
  inline def apply(text: String): MarkerLabel = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerLabel]
  }
  
  extension [Self <: MarkerLabel](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
