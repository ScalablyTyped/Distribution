package typings
package extjsLib.ExtNs.toolbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextItem extends IItem {
  /** [Method] Updates this item s text setting the text to be used as innerHTML
  		* @param text String The text to display (html accepted).
  		*/
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object ITextItem {
  @scala.inline
  def apply(
    IItem: IItem = null,
    baseCls: java.lang.String = null,
    renderTpl: js.Any = null,
    setText: /* text */ js.UndefOr[java.lang.String] => scala.Unit = null,
    text: java.lang.String = null
  ): ITextItem = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IItem)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (renderTpl != null) __obj.updateDynamic("renderTpl")(renderTpl)
    if (setText != null) __obj.updateDynamic("setText")(js.Any.fromFunction1(setText))
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ITextItem]
  }
}

