package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("StalkerX86Iterator")
@js.native
abstract class StalkerX86Iterator () extends X86Writer {
  def keep(): Unit = js.native
  def next(): X86Instruction | Null = js.native
  def putCallout(callout: StalkerCallout): Unit = js.native
  def putCallout(callout: StalkerCallout, data: NativePointerValue): Unit = js.native
}

