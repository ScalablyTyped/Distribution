package typings.ethers.mod.ethers

import typings.ethers.typesProvidersProviderMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.HDNodeVoidWallet")
@js.native
open class HDNodeVoidWallet protected ()
  extends typings.ethers.typesEthersMod.HDNodeVoidWallet {
  def this(
    guard: Any,
    address: String,
    publicKey: String,
    parentFingerprint: String,
    chainCode: String,
    path: String,
    index: Double,
    depth: Double
  ) = this()
  /**
    *  @private
    */
  def this(
    guard: Any,
    address: String,
    publicKey: String,
    parentFingerprint: String,
    chainCode: String,
    path: Null,
    index: Double,
    depth: Double
  ) = this()
  def this(
    guard: Any,
    address: String,
    publicKey: String,
    parentFingerprint: String,
    chainCode: String,
    path: String,
    index: Double,
    depth: Double,
    provider: Provider
  ) = this()
  def this(
    guard: Any,
    address: String,
    publicKey: String,
    parentFingerprint: String,
    chainCode: String,
    path: Null,
    index: Double,
    depth: Double,
    provider: Provider
  ) = this()
}
