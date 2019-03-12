package typings
package dotenvLib.dotenvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotenvConfigOutput extends js.Object {
  var error: js.UndefOr[stdLib.Error] = js.undefined
  var parsed: js.UndefOr[DotenvParseOutput] = js.undefined
}

object DotenvConfigOutput {
  @scala.inline
  def apply(error: stdLib.Error = null, parsed: DotenvParseOutput = null): DotenvConfigOutput = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (parsed != null) __obj.updateDynamic("parsed")(parsed)
    __obj.asInstanceOf[DotenvConfigOutput]
  }
}

