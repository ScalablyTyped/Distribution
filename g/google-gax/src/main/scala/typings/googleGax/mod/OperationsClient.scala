package typings.googleGax.mod

import typings.googleGax.buildSrcClientInterfaceMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "OperationsClient")
@js.native
open class OperationsClient protected ()
  extends typings.googleGax.buildSrcOperationsClientMod.OperationsClient {
  def this(
    gaxGrpc: typings.googleGax.buildSrcFallbackMod.GrpcClient,
    operationsProtos: Any,
    options: ClientOptions
  ) = this()
  def this(
    gaxGrpc: typings.googleGax.buildSrcGrpcMod.GrpcClient,
    operationsProtos: Any,
    options: ClientOptions
  ) = this()
}
