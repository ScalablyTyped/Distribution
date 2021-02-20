package typings.emberComponent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFieldMod {
  
  @JSImport("@ember/component/text-field", JSImport.Default)
  @js.native
  class default () extends TextField
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : Component.extend(TextSupport) * / any */ @js.native
  trait TextField extends StObject {
    
    /**
      * The `max` attribute of input element used with `type="number"` or `type="range"`.
      */
    var max: String = js.native
    
    /**
      * The `min` attribute of input element used with `type="number"` or `type="range"`.
      */
    var min: String = js.native
    
    /**
      * The `pattern` attribute of input element.
      */
    var pattern: String = js.native
    
    /**
      * The `size` of the text field in characters.
      */
    var size: String = js.native
    
    /**
      * The `type` attribute of the input element.
      */
    var `type`: String = js.native
    
    /**
      * The `value` attribute of the input element. As the user inputs text, this
      * property is updated live.
      */
    var value: String = js.native
  }
  object TextField {
    
    @scala.inline
    def apply(max: String, min: String, pattern: String, size: String, `type`: String, value: String): TextField = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextField]
    }
    
    @scala.inline
    implicit class TextFieldMutableBuilder[Self <: TextField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
