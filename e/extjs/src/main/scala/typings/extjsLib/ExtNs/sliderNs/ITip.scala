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

