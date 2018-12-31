package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParDoInstruction extends js.Object {
  /** The input. */
  var input: js.UndefOr[InstructionInput] = js.undefined
  /** Information about each of the outputs, if user_fn is a  MultiDoFn. */
  var multiOutputInfos: js.UndefOr[js.Array[MultiOutputInfo]] = js.undefined
  /** The number of outputs. */
  var numOutputs: js.UndefOr[scala.Double] = js.undefined
  /** Zero or more side inputs. */
  var sideInputs: js.UndefOr[js.Array[SideInputInfo]] = js.undefined
  /** The user function to invoke. */
  var userFn: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

