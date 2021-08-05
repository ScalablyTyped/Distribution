package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontVariationAxis extends StObject {
  
  /**
    * The default value.
    */
  var defaultValue: Double
  
  /**
    * The maximum value (inclusive) the font supports for this tag.
    */
  var maxValue: Double
  
  /**
    * The minimum value (inclusive) the font supports for this tag.
    */
  var minValue: Double
  
  /**
    * Human-readable variation name in the default language (normally, "en").
    */
  var name: String
  
  /**
    * The font-variation-setting tag (a.k.a. "axis tag").
    */
  var tag: String
}
object FontVariationAxis {
  
  inline def apply(defaultValue: Double, maxValue: Double, minValue: Double, name: String, tag: String): FontVariationAxis = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontVariationAxis]
  }
  
  extension [Self <: FontVariationAxis](x: Self) {
    
    inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
