package typings.ethersprojectProviders.baseProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers/lib/base-provider", "Resolver")
@js.native
class Resolver protected () extends EnsResolver {
  def this(provider: BaseProvider, address: String, name: String) = this()
  
  def _fetchBytes(selector: String): js.Promise[String] = js.native
  def _fetchBytes(selector: String, parameters: String): js.Promise[String] = js.native
  
  def _getAddress(coinType: Double, hexBytes: String): String = js.native
  
  def getAddress(coinType: Double): js.Promise[String] = js.native
  
  val provider: BaseProvider = js.native
}
