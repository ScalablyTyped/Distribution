package typings.fabric.fabricImplMod

import typings.fabric.fabricStrings._empty
import typings.fabric.fabricStrings.`use-credentials`
import typings.fabric.fabricStrings.anonymous
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPatternOptions extends StObject {
  
  /**
    * crossOrigin value (one of "", "anonymous", "use-credentials")
    * @see https://developer.mozilla.org/en-US/docs/HTML/CORS_settings_attributes
    */
  var crossOrigin: js.UndefOr[_empty | anonymous | `use-credentials`] = js.undefined
  
  /**
    * Pattern horizontal offset from object's left/top corner
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * Pattern vertical offset from object's left/top corner
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * Transform matrix to change the pattern, imported from svgs
    */
  var patternTransform: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Repeat property of a pattern (one of repeat, repeat-x, repeat-y or no-repeat)
    */
  var repeat: js.UndefOr[String] = js.undefined
  
  /**
    * The source for the pattern
    */
  var source: String | HTMLImageElement
}
object IPatternOptions {
  
  inline def apply(source: String | HTMLImageElement): IPatternOptions = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPatternOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPatternOptions] (val x: Self) extends AnyVal {
    
    inline def setCrossOrigin(value: _empty | anonymous | `use-credentials`): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setPatternTransform(value: js.Array[Double]): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
    
    inline def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
    
    inline def setPatternTransformVarargs(value: Double*): Self = StObject.set(x, "patternTransform", js.Array(value*))
    
    inline def setRepeat(value: String): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setSource(value: String | HTMLImageElement): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
