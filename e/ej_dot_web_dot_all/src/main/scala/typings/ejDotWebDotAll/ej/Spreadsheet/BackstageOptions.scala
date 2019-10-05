package typings.ejDotWebDotAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackstageOptions extends js.Object {
  /** Pass the id to added in backstage
    */
  var id: js.UndefOr[String] = js.undefined
  /** Pass the item type to added in backstage
    */
  var itemType: js.UndefOr[HTMLElement] = js.undefined
  /** Pass the text to added in backstage
    */
  var text: js.UndefOr[String] = js.undefined
}

object BackstageOptions {
  @scala.inline
  def apply(id: String = null, itemType: HTMLElement = null, text: String = null): BackstageOptions = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemType != null) __obj.updateDynamic("itemType")(itemType)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[BackstageOptions]
  }
}

