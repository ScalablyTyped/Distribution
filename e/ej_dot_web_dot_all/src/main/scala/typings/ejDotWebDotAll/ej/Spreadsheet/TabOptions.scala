package typings.ejDotWebDotAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabOptions extends js.Object {
  /** Pass the align type
    */
  var alignType: js.UndefOr[HTMLElement] = js.undefined
  /** Pass the content object to be displayed in ribbon tab
    */
  var contents: js.UndefOr[js.Any] = js.undefined
  /** Pass the defaults object to be displayed in ribbon tab
    */
  var defaults: js.UndefOr[js.Any] = js.undefined
  /** Pass the text to displayed in ribbon tab
    */
  var text: js.UndefOr[String] = js.undefined
}

object TabOptions {
  @scala.inline
  def apply(
    alignType: HTMLElement = null,
    contents: js.Any = null,
    defaults: js.Any = null,
    text: String = null
  ): TabOptions = {
    val __obj = js.Dynamic.literal()
    if (alignType != null) __obj.updateDynamic("alignType")(alignType)
    if (contents != null) __obj.updateDynamic("contents")(contents)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TabOptions]
  }
}

