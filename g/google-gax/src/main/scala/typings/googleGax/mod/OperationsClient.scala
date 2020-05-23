package typings.googleGax.mod

import typings.googleGax.operationsClientMod.OperationsClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "OperationsClient")
@js.native
class OperationsClient protected ()
  extends typings.googleGax.operationsClientMod.OperationsClient {
  def this(
    gaxGrpc: typings.googleGax.fallbackMod.GrpcClient,
    operationsProtos: js.Any,
    options: OperationsClientOptions
  ) = this()
  def this(
    gaxGrpc: typings.googleGax.grpcMod.GrpcClient,
    operationsProtos: js.Any,
    options: OperationsClientOptions
  ) = this()
}

