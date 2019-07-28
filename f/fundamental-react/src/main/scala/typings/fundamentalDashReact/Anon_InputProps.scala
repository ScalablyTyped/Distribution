package typings.fundamentalDashReact

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputProps extends js.Object {
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
}

object Anon_InputProps {
  @scala.inline
  def apply(inputProps: StringDictionary[js.Any] = null, language: String = null, placeholder: String = null): Anon_InputProps = {
    val __obj = js.Dynamic.literal()
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (language != null) __obj.updateDynamic("language")(language)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[Anon_InputProps]
  }
}

