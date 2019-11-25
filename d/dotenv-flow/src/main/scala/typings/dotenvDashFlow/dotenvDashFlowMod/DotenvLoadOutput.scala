package typings.dotenvDashFlow.dotenvDashFlowMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotenvLoadOutput extends js.Object {
  var error: js.UndefOr[Error] = js.undefined
  var parsed: js.UndefOr[DotenvParseOutput] = js.undefined
}

object DotenvLoadOutput {
  @scala.inline
  def apply(error: Error = null, parsed: DotenvParseOutput = null): DotenvLoadOutput = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (parsed != null) __obj.updateDynamic("parsed")(parsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotenvLoadOutput]
  }
}

