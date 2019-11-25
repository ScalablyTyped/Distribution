package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HexdumpOptions extends js.Object {
  /**
    * Whether ANSI colors should be used. Defaults to false.
    */
  var ansi: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether a header should be included. Defaults to true.
    */
  var header: js.UndefOr[Boolean] = js.undefined
  /**
    * Limits how many bytes to dump.
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * Specifies byte offset of where to start dumping. Defaults to 0.
    */
  var offset: js.UndefOr[Double] = js.undefined
}

object HexdumpOptions {
  @scala.inline
  def apply(
    ansi: js.UndefOr[Boolean] = js.undefined,
    header: js.UndefOr[Boolean] = js.undefined,
    length: Int | Double = null,
    offset: Int | Double = null
  ): HexdumpOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ansi)) __obj.updateDynamic("ansi")(ansi.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexdumpOptions]
  }
}

