package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StalkerArm64Iterator")
@js.native
abstract class StalkerArm64Iterator () extends Arm64Writer {
  def keep(): scala.Unit = js.native
  def next(): Arm64Instruction | scala.Null = js.native
  def putCallout(callout: StalkerCallout): scala.Unit = js.native
}

