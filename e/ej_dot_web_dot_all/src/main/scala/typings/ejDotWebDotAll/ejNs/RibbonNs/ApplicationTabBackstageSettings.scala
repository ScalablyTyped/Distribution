package typings.ejDotWebDotAll.ejNs.RibbonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationTabBackstageSettings extends js.Object {
  /** Specifies the width of backstage page header that contains tabs and buttons.
    * @Default {null}
    */
  var headerWidth: js.UndefOr[String | Double] = js.undefined
  /** Specifies the height of ribbon backstage page.
    * @Default {null}
    */
  var height: js.UndefOr[String | Double] = js.undefined
  /** Specifies the ribbon backstage page with its tab and button elements.
    * @Default {Array}
    */
  var pages: js.UndefOr[js.Array[ApplicationTabBackstageSettingsPage]] = js.undefined
  /** Specifies the display text of application tab.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specifies the width of ribbon backstage page.
    * @Default {null}
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object ApplicationTabBackstageSettings {
  @scala.inline
  def apply(
    headerWidth: String | Double = null,
    height: String | Double = null,
    pages: js.Array[ApplicationTabBackstageSettingsPage] = null,
    text: String = null,
    width: String | Double = null
  ): ApplicationTabBackstageSettings = {
    val __obj = js.Dynamic.literal()
    if (headerWidth != null) __obj.updateDynamic("headerWidth")(headerWidth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages)
    if (text != null) __obj.updateDynamic("text")(text)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationTabBackstageSettings]
  }
}

