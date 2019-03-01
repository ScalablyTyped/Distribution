package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultFontFamily extends js.Object {
  /**
    * Defaults to Script.
    */
  var cursive: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defaults to Impact.
    */
  var fantasy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defaults to Courier New.
    */
  var monospace: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defaults to Arial.
    */
  var sansSerif: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defaults to Times New Roman.
    */
  var serif: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defaults to Times New Roman.
    */
  var standard: js.UndefOr[java.lang.String] = js.undefined
}

object DefaultFontFamily {
  @scala.inline
  def apply(
    cursive: java.lang.String = null,
    fantasy: java.lang.String = null,
    monospace: java.lang.String = null,
    sansSerif: java.lang.String = null,
    serif: java.lang.String = null,
    standard: java.lang.String = null
  ): DefaultFontFamily = {
    val __obj = js.Dynamic.literal()
    if (cursive != null) __obj.updateDynamic("cursive")(cursive)
    if (fantasy != null) __obj.updateDynamic("fantasy")(fantasy)
    if (monospace != null) __obj.updateDynamic("monospace")(monospace)
    if (sansSerif != null) __obj.updateDynamic("sansSerif")(sansSerif)
    if (serif != null) __obj.updateDynamic("serif")(serif)
    if (standard != null) __obj.updateDynamic("standard")(standard)
    __obj.asInstanceOf[DefaultFontFamily]
  }
}

