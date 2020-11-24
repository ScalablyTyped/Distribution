package typings.emberComponent.textFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : Component.extend(TextSupport) * / any */ @js.native
trait TextField extends js.Object {
  
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
  implicit class TextFieldOps[Self <: TextField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMax(value: String): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: String): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
