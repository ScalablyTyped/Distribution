package typings.googleGax.longrunningMod

import typings.googleGax.gaxMod.BackoffSettings
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.longRunningDescriptorMod.LongRunningDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/longRunningCalls/longrunning", "operation")
@js.native
object operation extends js.Object {
  def apply(op: LROOperation, longrunningDescriptor: LongRunningDescriptor, backoffSettings: BackoffSettings): Operation_ = js.native
  def apply(
    op: LROOperation,
    longrunningDescriptor: LongRunningDescriptor,
    backoffSettings: BackoffSettings,
    callOptions: CallOptions
  ): Operation_ = js.native
}

