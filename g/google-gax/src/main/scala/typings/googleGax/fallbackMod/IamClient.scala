package typings.googleGax.fallbackMod

import typings.googleGax.clientInterfaceMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax/build/src/fallback", "IamClient")
@js.native
open class IamClient protected ()
  extends typings.googleGax.srcIamServiceMod.IamClient {
  def this(gaxGrpc: GrpcClient, options: ClientOptions) = this()
  def this(gaxGrpc: typings.googleGax.grpcMod.GrpcClient, options: ClientOptions) = this()
}
