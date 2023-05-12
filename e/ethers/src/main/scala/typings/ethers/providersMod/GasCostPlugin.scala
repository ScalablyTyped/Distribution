package typings.ethers.providersMod

import typings.ethers.typesProvidersPluginsNetworkMod.GasCostParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/providers", "GasCostPlugin")
@js.native
open class GasCostPlugin ()
  extends typings.ethers.typesProvidersMod.GasCostPlugin {
  def this(effectiveBlock: Double) = this()
  def this(effectiveBlock: Double, costs: GasCostParameters) = this()
  def this(effectiveBlock: Unit, costs: GasCostParameters) = this()
}
