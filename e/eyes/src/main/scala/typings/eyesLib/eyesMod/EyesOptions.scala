package typings
package eyesLib.eyesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EyesOptions extends js.Object {
  /** Don't output functions at all */
  var hideFunctions: js.UndefOr[scala.Boolean] = js.undefined
  /** Truncate output if longer */
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  /** Indent object literals */
  var pretty: js.UndefOr[scala.Boolean] = js.undefined
  /** Stream to write to, or null */
  var stream: js.UndefOr[nodeLib.NodeJSNs.WritableStream] = js.undefined
  /** Styles applied to stdout */
  var styles: js.UndefOr[eyesLib.Anon_All] = js.undefined
}

object EyesOptions {
  @scala.inline
  def apply(
    hideFunctions: js.UndefOr[scala.Boolean] = js.undefined,
    maxLength: scala.Int | scala.Double = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    stream: nodeLib.NodeJSNs.WritableStream = null,
    styles: eyesLib.Anon_All = null
  ): EyesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hideFunctions)) __obj.updateDynamic("hideFunctions")(hideFunctions)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[EyesOptions]
  }
}

