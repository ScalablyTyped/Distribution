package typings.googleGax.mod

import typings.googleGax.clientInterfaceMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "OperationsClient")
@js.native
class OperationsClient protected ()
  extends typings.googleGax.operationsClientMod.OperationsClient {
  def this(
    gaxGrpc: typings.googleGax.fallbackMod.GrpcClient,
    operationsProtos: js.Any,
    options: ClientOptions
  ) = this()
  def this(gaxGrpc: typings.googleGax.grpcMod.GrpcClient, operationsProtos: js.Any, options: ClientOptions) = this()
}
