package typings.ethers.mod

import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderJsonrpcMod.JsonRpcApiProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("ethers", "JsonRpcApiProvider")
@js.native
open class JsonRpcApiProvider ()
  extends typings.ethers.typesEthersMod.JsonRpcApiProvider {
  def this(network: Networkish) = this()
  def this(network: Unit, options: JsonRpcApiProviderOptions) = this()
  def this(network: Networkish, options: JsonRpcApiProviderOptions) = this()
}
