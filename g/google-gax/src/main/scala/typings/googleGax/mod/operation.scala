package typings.googleGax.mod

import typings.googleGax.gaxMod.BackoffSettings
import typings.googleGax.gaxMod.CallOptions
import typings.googleGax.longRunningDescriptorMod.LongRunningDescriptor
import typings.googleGax.longrunningMod.LROOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "operation")
@js.native
object operation extends js.Object {
  def apply(op: LROOperation, longrunningDescriptor: LongRunningDescriptor, backoffSettings: BackoffSettings): typings.googleGax.longrunningMod.Operation_ = js.native
  def apply(
    op: LROOperation,
    longrunningDescriptor: LongRunningDescriptor,
    backoffSettings: BackoffSettings,
    callOptions: CallOptions
  ): typings.googleGax.longrunningMod.Operation_ = js.native
}

