package typings.easyDashXDashHeaders.replMod

import typings.easyDashXDashHeaders.NodeJS.ReadableStream
import typings.easyDashXDashHeaders.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplOptions extends js.Object {
  var eval: js.UndefOr[js.Function] = js.undefined
  var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
  var input: js.UndefOr[ReadableStream] = js.undefined
  var output: js.UndefOr[WritableStream] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var terminal: js.UndefOr[Boolean] = js.undefined
  var useColors: js.UndefOr[Boolean] = js.undefined
  var useGlobal: js.UndefOr[Boolean] = js.undefined
  var writer: js.UndefOr[js.Function] = js.undefined
}

object ReplOptions {
  @scala.inline
  def apply(
    eval: js.Function = null,
    ignoreUndefined: js.UndefOr[Boolean] = js.undefined,
    input: ReadableStream = null,
    output: WritableStream = null,
    prompt: String = null,
    terminal: js.UndefOr[Boolean] = js.undefined,
    useColors: js.UndefOr[Boolean] = js.undefined,
    useGlobal: js.UndefOr[Boolean] = js.undefined,
    writer: js.Function = null
  ): ReplOptions = {
    val __obj = js.Dynamic.literal()
    if (eval != null) __obj.updateDynamic("eval")(eval)
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined)
    if (input != null) __obj.updateDynamic("input")(input)
    if (output != null) __obj.updateDynamic("output")(output)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (!js.isUndefined(terminal)) __obj.updateDynamic("terminal")(terminal)
    if (!js.isUndefined(useColors)) __obj.updateDynamic("useColors")(useColors)
    if (!js.isUndefined(useGlobal)) __obj.updateDynamic("useGlobal")(useGlobal)
    if (writer != null) __obj.updateDynamic("writer")(writer)
    __obj.asInstanceOf[ReplOptions]
  }
}

