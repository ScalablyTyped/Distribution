package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontVariationAxis extends StObject {
  
  /**
    * The default value.
    */
  var defaultValue: Double = js.native
  
  /**
    * The maximum value (inclusive) the font supports for this tag.
    */
  var maxValue: Double = js.native
  
  /**
    * The minimum value (inclusive) the font supports for this tag.
    */
  var minValue: Double = js.native
  
  /**
    * Human-readable variation name in the default language (normally, "en").
    */
  var name: String = js.native
  
  /**
    * The font-variation-setting tag (a.k.a. "axis tag").
    */
  var tag: String = js.native
}
object FontVariationAxis {
  
  @scala.inline
  def apply(defaultValue: Double, maxValue: Double, minValue: Double, name: String, tag: String): FontVariationAxis = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontVariationAxis]
  }
  
  @scala.inline
  implicit class FontVariationAxisMutableBuilder[Self <: FontVariationAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
