package typings.googleGax.mod.fallback

import typings.googleGax.clientInterfaceMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "fallback.IamClient")
@js.native
open class IamClient protected ()
  extends typings.googleGax.srcIamServiceMod.IamClient {
  def this(gaxGrpc: typings.googleGax.fallbackMod.GrpcClient, options: ClientOptions) = this()
  def this(gaxGrpc: typings.googleGax.grpcMod.GrpcClient, options: ClientOptions) = this()
}
