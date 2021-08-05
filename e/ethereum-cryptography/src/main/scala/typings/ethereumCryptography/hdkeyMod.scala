package typings.ethereumCryptography

import typings.ethereumCryptography.anon.Xpriv
import typings.ethereumCryptography.pureHdkeyMod.HDKeyT
import typings.ethereumCryptography.pureHdkeyMod.Versions
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    inline def HARDENED_OFFSET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HARDENED_OFFSET")(x.asInstanceOf[js.Any])
    
    inline def fromExtendedKey(base58key: String): HDKeyT = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedKey")(base58key.asInstanceOf[js.Any]).asInstanceOf[HDKeyT]
    inline def fromExtendedKey(base58key: String, versions: Versions): HDKeyT = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedKey")(base58key.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[HDKeyT]
    
    inline def fromJSON(json: Xpriv): HDKeyT = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[HDKeyT]
    
    inline def fromMasterSeed(seed: Buffer): HDKeyT = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMasterSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[HDKeyT]
    inline def fromMasterSeed(seed: Buffer, versions: Versions): HDKeyT = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMasterSeed")(seed.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[HDKeyT]
  }
}
