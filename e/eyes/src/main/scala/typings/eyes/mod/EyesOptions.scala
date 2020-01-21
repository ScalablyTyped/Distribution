package typings.eyes.mod

import typings.eyes.AnonAll
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EyesOptions extends js.Object {
  /** Don't output functions at all */
  var hideFunctions: js.UndefOr[Boolean] = js.undefined
  /** Truncate output if longer */
  var maxLength: js.UndefOr[Double] = js.undefined
  /** Indent object literals */
  var pretty: js.UndefOr[Boolean] = js.undefined
  /** Stream to write to, or null */
  var stream: js.UndefOr[WritableStream] = js.undefined
  /** Styles applied to stdout */
  var styles: js.UndefOr[AnonAll] = js.undefined
}

object EyesOptions {
  @scala.inline
  def apply(
    hideFunctions: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    stream: WritableStream = null,
    styles: AnonAll = null
  ): EyesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hideFunctions)) __obj.updateDynamic("hideFunctions")(hideFunctions.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[EyesOptions]
  }
}

