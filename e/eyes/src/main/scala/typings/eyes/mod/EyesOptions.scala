package typings.eyes.mod

import typings.eyes.anon.All
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
  var styles: js.UndefOr[All] = js.undefined
}

object EyesOptions {
  @scala.inline
  def apply(
    hideFunctions: js.UndefOr[Boolean] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    pretty: js.UndefOr[Boolean] = js.undefined,
    stream: WritableStream = null,
    styles: All = null
  ): EyesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hideFunctions)) __obj.updateDynamic("hideFunctions")(hideFunctions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[EyesOptions]
  }
}

