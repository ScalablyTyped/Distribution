package typings.googleGax.buildSrcFallbackMod

import typings.googleGax.buildSrcClientInterfaceMod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax/build/src/fallback", "IamClient")
@js.native
open class IamClient protected ()
  extends typings.googleGax.buildSrcIamServiceMod.IamClient {
  def this(gaxGrpc: GrpcClient, options: ClientOptions) = this()
  def this(gaxGrpc: typings.googleGax.buildSrcGrpcMod.GrpcClient, options: ClientOptions) = this()
}
