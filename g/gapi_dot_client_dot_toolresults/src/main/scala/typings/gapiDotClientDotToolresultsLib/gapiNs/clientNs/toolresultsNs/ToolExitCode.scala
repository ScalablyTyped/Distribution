package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolExitCode extends js.Object {
  /**
    * Tool execution exit code. A value of 0 means that the execution was successful.
    *
    * - In response: always set - In create/update request: always set
    */
  var number: js.UndefOr[scala.Double] = js.undefined
}

object ToolExitCode {
  @scala.inline
  def apply(number: scala.Int | scala.Double = null): ToolExitCode = {
    val __obj = js.Dynamic.literal()
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolExitCode]
  }
}

