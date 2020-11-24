package typings.ethersprojectProviders.mod

import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectWeb.mod.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers", "UrlJsonRpcProvider")
@js.native
abstract class UrlJsonRpcProvider ()
  extends typings.ethersprojectProviders.urlJsonRpcProviderMod.UrlJsonRpcProvider {
  def this(network: Networkish) = this()
  def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
}
/* static members */
@JSImport("@ethersproject/providers", "UrlJsonRpcProvider")
@js.native
object UrlJsonRpcProvider extends js.Object {
  
  def getApiKey(apiKey: js.Any): js.Any = js.native
  
  def getUrl(network: Network, apiKey: js.Any): String | ConnectionInfo = js.native
}
