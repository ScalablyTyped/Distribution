package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StalkerArm64Iterator")
@js.native
abstract class StalkerArm64Iterator () extends Arm64Writer {
  def keep(): Unit = js.native
  def next(): Arm64Instruction | Null = js.native
  def putCallout(callout: StalkerCallout): Unit = js.native
}

