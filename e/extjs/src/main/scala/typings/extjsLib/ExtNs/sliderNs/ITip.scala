package typings
package extjsLib.ExtNs.sliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITip
  extends extjsLib.ExtNs.tipNs.ITip {
  /** [Config Option] (String) */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Used to create the text that appears in the Tip s body
  		* @param thumb Ext.slider.Thumb The Thumb that the Tip is attached to
  		* @returns String The text to display in the tip
  		*/
  var getText: js.UndefOr[js.Function1[/* thumb */ js.UndefOr[IThumb], java.lang.String]] = js.undefined
  /** [Config Option] (Array) */
  var offsets: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (String) */
  var position: js.UndefOr[java.lang.String] = js.undefined
}

object ITip {
  @scala.inline
  def apply(
    ITip: extjsLib.ExtNs.tipNs.ITip = null,
    align: java.lang.String = null,
    getText: /* thumb */ js.UndefOr[IThumb] => java.lang.String = null,
    minWidth: scala.Int | scala.Double = null,
    offsets: extjsLib.ExtNs.Array = null,
    position: java.lang.String = null
  ): ITip = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ITip)
    if (align != null) __obj.updateDynamic("align")(align)
    if (getText != null) __obj.updateDynamic("getText")(js.Any.fromFunction1(getText))
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (offsets != null) __obj.updateDynamic("offsets")(offsets)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[ITip]
  }
}

