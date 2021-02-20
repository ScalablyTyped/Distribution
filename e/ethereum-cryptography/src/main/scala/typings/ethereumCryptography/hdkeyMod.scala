package typings.ethereumCryptography

import typings.ethereumCryptography.anon.Xpriv
import typings.ethereumCryptography.pureHdkeyMod.HDKeyT
import typings.ethereumCryptography.pureHdkeyMod.Versions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hdkeyMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("ethereum-cryptography/hdkey", "HDKey")
  @js.native
  class HDKey () extends HDKeyT
  object HDKey {
    
    @JSImport("ethereum-cryptography/hdkey", "HDKey")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethereum-cryptography/hdkey", "HDKey.HARDENED_OFFSET")
    @js.native
    def HARDENED_OFFSET: Double = js.native
    @scala.inline
    def HARDENED_OFFSET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HARDENED_OFFSET")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereum-cryptography/hdkey", "HDKey.fromExtendedKey")
    @js.native
    def fromExtendedKey(base58key: String): HDKeyT = js.native
    @JSImport("ethereum-cryptography/hdkey", "HDKey.fromExtendedKey")
    @js.native
    def fromExtendedKey(base58key: String, versions: Versions): HDKeyT = js.native
    
    @JSImport("ethereum-cryptography/hdkey", "HDKey.fromJSON")
    @js.native
    def fromJSON(json: Xpriv): HDKeyT = js.native
    
    @JSImport("ethereum-cryptography/hdkey", "HDKey.fromMasterSeed")
    @js.native
    def fromMasterSeed(seed: Buffer): HDKeyT = js.native
    @JSImport("ethereum-cryptography/hdkey", "HDKey.fromMasterSeed")
    @js.native
    def fromMasterSeed(seed: Buffer, versions: Versions): HDKeyT = js.native
  }
}
