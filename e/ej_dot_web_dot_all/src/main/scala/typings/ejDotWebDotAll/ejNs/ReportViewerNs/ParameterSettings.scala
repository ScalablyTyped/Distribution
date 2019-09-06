package typings.ejDotWebDotAll.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterSettings extends js.Object {
  /** Sets the separator when the multiSelectMode with delimiter option or checkbox is enabled with the dropdown. When you enter the delimiter value, the texts after the delimiter are
    * considered as a separate word or query. The delimiter string is a single character and must be a symbol. Mostly, the delimiter symbol is used as comma (,) or semi-colon (;) or
    * any other special character.
    * @Default {,}
    */
  var delimiterChar: js.UndefOr[String] = js.undefined
  /** Specifies the height of the combobox parameter popup list. By default, the popup height value is &quot;152px&quot;.
    * @Default {152px}
    */
  var popupHeight: js.UndefOr[String] = js.undefined
  /** Specifies the width of the combobox parameter popup list. By default, the popup width sets based on the width of the component.
    * @Default {auto}
    */
  var popupWidth: js.UndefOr[String] = js.undefined
}

object ParameterSettings {
  @scala.inline
  def apply(delimiterChar: String = null, popupHeight: String = null, popupWidth: String = null): ParameterSettings = {
    val __obj = js.Dynamic.literal()
    if (delimiterChar != null) __obj.updateDynamic("delimiterChar")(delimiterChar)
    if (popupHeight != null) __obj.updateDynamic("popupHeight")(popupHeight)
    if (popupWidth != null) __obj.updateDynamic("popupWidth")(popupWidth)
    __obj.asInstanceOf[ParameterSettings]
  }
}

