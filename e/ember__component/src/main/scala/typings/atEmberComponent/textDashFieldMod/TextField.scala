package typings.atEmberComponent.textDashFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: parser.TsParser#tsDeclClass functionCall $anonfun class extends from : Component.extend(TextSupport) * / any */ trait TextField extends js.Object {
  /**
    * The `max` attribute of input element used with `type="number"` or `type="range"`.
    */
  var max: String
  /**
    * The `min` attribute of input element used with `type="number"` or `type="range"`.
    */
  var min: String
  /**
    * The `pattern` attribute of input element.
    */
  var pattern: String
  /**
    * The `size` of the text field in characters.
    */
  var size: String
  /**
    * The `type` attribute of the input element.
    */
  var `type`: String
  /**
    * The `value` attribute of the input element. As the user inputs text, this
    * property is updated live.
    */
  var value: String
}

object TextField {
  @scala.inline
  def apply(max: String, min: String, pattern: String, size: String, `type`: String, value: String): TextField = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextField]
  }
}

