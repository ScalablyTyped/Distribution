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

