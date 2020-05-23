package typings.extjs.Ext.slider

import typings.extjs.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITip
  extends typings.extjs.Ext.tip.ITip {
  /** [Config Option] (String) */
  var align: js.UndefOr[String] = js.undefined
  /** [Method] Used to create the text that appears in the Tip s body
    * @param thumb Ext.slider.Thumb The Thumb that the Tip is attached to
    * @returns String The text to display in the tip
    */
  var getText: js.UndefOr[js.Function1[/* thumb */ js.UndefOr[IThumb], String]] = js.undefined
  /** [Config Option] (Array) */
  var offsets: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.undefined
}

object ITip {
  @scala.inline
  def apply(
    ITip: typings.extjs.Ext.tip.ITip = null,
    align: String = null,
    getText: /* thumb */ js.UndefOr[IThumb] => String = null,
    offsets: Array = null,
    position: String = null
  ): ITip = {
    val __obj = js.Dynamic.literal()
    if (ITip != null) js.Dynamic.global.Object.assign(__obj, ITip)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (getText != null) __obj.updateDynamic("getText")(js.Any.fromFunction1(getText))
    if (offsets != null) __obj.updateDynamic("offsets")(offsets.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITip]
  }
}

