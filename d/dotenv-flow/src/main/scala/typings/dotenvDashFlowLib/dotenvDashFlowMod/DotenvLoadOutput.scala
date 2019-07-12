package typings
package dotenvDashFlowLib.dotenvDashFlowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotenvLoadOutput extends js.Object {
  var error: js.UndefOr[stdLib.Error] = js.undefined
  var parsed: js.UndefOr[DotenvParseOutput] = js.undefined
}

object DotenvLoadOutput {
  @scala.inline
  def apply(error: stdLib.Error = null, parsed: DotenvParseOutput = null): DotenvLoadOutput = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (parsed != null) __obj.updateDynamic("parsed")(parsed)
    __obj.asInstanceOf[DotenvLoadOutput]
  }
}

