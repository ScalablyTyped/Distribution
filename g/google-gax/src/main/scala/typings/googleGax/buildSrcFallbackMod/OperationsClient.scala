package typings.googleGax.buildSrcFallbackMod

import typings.googleGax.buildSrcClientInterfaceMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax/build/src/fallback", "OperationsClient")
@js.native
open class OperationsClient protected ()
  extends typings.googleGax.buildSrcOperationsClientMod.OperationsClient {
  def this(gaxGrpc: GrpcClient, operationsProtos: Any, options: ClientOptions) = this()
  def this(
    gaxGrpc: typings.googleGax.buildSrcGrpcMod.GrpcClient,
    operationsProtos: Any,
    options: ClientOptions
  ) = this()
}
