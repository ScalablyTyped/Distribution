package typings.dynogels.mod.AWS

import typings.awsSdk2Types.libTokenTokenProviderChainMod.provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dynogels", "AWS.TokenProviderChain")
@js.native
/**
  * Creates a new TokenProviderChain with a default set of providers specified by defaultProviders.
  */
open class TokenProviderChain ()
  extends typings.awsSdk2Types.mod.TokenProviderChain {
  def this(providers: js.Array[provider]) = this()
}
/* static members */
object TokenProviderChain {
  
  @JSImport("dynogels", "AWS.TokenProviderChain")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dynogels", "AWS.TokenProviderChain.defaultProviders")
  @js.native
  def defaultProviders: js.Array[provider] = js.native
  inline def defaultProviders_=(x: js.Array[provider]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProviders")(x.asInstanceOf[js.Any])
}
