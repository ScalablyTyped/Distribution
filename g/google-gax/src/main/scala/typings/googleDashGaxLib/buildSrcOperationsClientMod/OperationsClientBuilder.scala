package typings
package googleDashGaxLib.buildSrcOperationsClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/operationsClient", "OperationsClientBuilder")
@js.native
class OperationsClientBuilder protected () extends js.Object {
  /**
    * Builds a new Operations Client
    * @param gaxGrpc {GrpcClient}
    */
  def this(gaxGrpc: googleDashGaxLib.buildSrcGrpcMod.GrpcClient) = this()
  def operationsClient(opts: OperationsClientOptions): OperationsClient = js.native
}

