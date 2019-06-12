package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HexdumpOptions extends js.Object {
  /**
    * Whether ANSI colors should be used. Defaults to false.
    */
  var ansi: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether a header should be included. Defaults to true.
    */
  var header: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Limits how many bytes to dump.
    */
  var length: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies byte offset of where to start dumping. Defaults to 0.
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
}

object HexdumpOptions {
  @scala.inline
  def apply(
    ansi: js.UndefOr[scala.Boolean] = js.undefined,
    header: js.UndefOr[scala.Boolean] = js.undefined,
    length: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null
  ): HexdumpOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ansi)) __obj.updateDynamic("ansi")(ansi)
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexdumpOptions]
  }
}

