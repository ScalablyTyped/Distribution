package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StalkerArmIterator extends ArmWriter {
  def keep(): Unit = js.native
  def next(): ArmInstruction | Null = js.native
  def putCallout(callout: StalkerCallout): Unit = js.native
  def putCallout(callout: StalkerCallout, data: NativePointerValue): Unit = js.native
}

