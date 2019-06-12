package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StalkerX86Iterator")
@js.native
abstract class StalkerX86Iterator () extends X86Writer {
  def keep(): scala.Unit = js.native
  def next(): X86Instruction | scala.Null = js.native
  def putCallout(callout: StalkerCallout): scala.Unit = js.native
}

