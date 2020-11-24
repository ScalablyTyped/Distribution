package typings.ethersprojectProviders.baseProviderMod

import typings.ethersprojectProviders.ethersprojectProvidersNumbers.`60`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnsResolver extends js.Object {
  
  val address: String = js.native
  
  def getAddress(): js.Promise[String] = js.native
  @JSName("getAddress")
  def getAddress_60(coinType: `60`): js.Promise[String] = js.native
  
  def getContentHash(): js.Promise[String] = js.native
  
  def getText(key: String): js.Promise[String] = js.native
  
  val name: String = js.native
}
