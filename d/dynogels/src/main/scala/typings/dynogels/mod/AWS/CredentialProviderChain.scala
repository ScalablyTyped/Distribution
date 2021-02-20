package typings.dynogels.mod.AWS

import typings.awsSdk.credentialProviderChainMod.provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynogels", "AWS.CredentialProviderChain")
@js.native
/**
  * Creates a new CredentialProviderChain with a default set of providers specified by defaultProviders.
  */
class CredentialProviderChain ()
  extends typings.awsSdk.mod.CredentialProviderChain {
  def this(providers: js.Array[provider]) = this()
}
/* static members */
object CredentialProviderChain {
  
  @JSImport("dynogels", "AWS.CredentialProviderChain")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dynogels", "AWS.CredentialProviderChain.defaultProviders")
  @js.native
  def defaultProviders: js.Array[provider] = js.native
  @scala.inline
  def defaultProviders_=(x: js.Array[provider]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProviders")(x.asInstanceOf[js.Any])
}
