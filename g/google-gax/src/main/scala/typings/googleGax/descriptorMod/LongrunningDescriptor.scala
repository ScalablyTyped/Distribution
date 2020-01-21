package typings.googleGax.descriptorMod

import typings.googleGax.longRunningDescriptorMod.AnyDecoder
import typings.googleGax.longRunningDescriptorMod.LongRunningDescriptor
import typings.googleGax.operationsClientMod.OperationsClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/descriptor", "LongrunningDescriptor")
@js.native
class LongrunningDescriptor protected () extends LongRunningDescriptor {
  def this(operationsClient: OperationsClient, responseDecoder: AnyDecoder, metadataDecoder: AnyDecoder) = this()
}

