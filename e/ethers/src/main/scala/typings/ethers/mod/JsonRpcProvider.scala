package typings.ethers.mod

import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderJsonrpcMod.JsonRpcApiProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "JsonRpcProvider")
@js.native
open class JsonRpcProvider ()
  extends typings.ethers.typesEthersMod.JsonRpcProvider {
  def this(url: String) = this()
  def this(url: typings.ethers.typesUtilsMod.FetchRequest) = this()
  def this(url: String, network: Networkish) = this()
  def this(url: Unit, network: Networkish) = this()
  def this(url: typings.ethers.typesUtilsMod.FetchRequest, network: Networkish) = this()
  def this(url: String, network: Unit, options: JsonRpcApiProviderOptions) = this()
  def this(url: String, network: Networkish, options: JsonRpcApiProviderOptions) = this()
  def this(url: Unit, network: Unit, options: JsonRpcApiProviderOptions) = this()
  def this(url: Unit, network: Networkish, options: JsonRpcApiProviderOptions) = this()
  def this(url: typings.ethers.typesUtilsMod.FetchRequest, network: Unit, options: JsonRpcApiProviderOptions) = this()
  def this(
    url: typings.ethers.typesUtilsMod.FetchRequest,
    network: Networkish,
    options: JsonRpcApiProviderOptions
  ) = this()
}
