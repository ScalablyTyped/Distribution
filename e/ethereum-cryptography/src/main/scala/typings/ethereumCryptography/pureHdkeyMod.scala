package typings.ethereumCryptography

import typings.ethereumCryptography.anon.Xpriv
import typings.ethereumCryptography.anon.Xpub
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pureHdkeyMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("ethereum-cryptography/pure/hdkey", "HDKey")
  @js.native
  class HDKey () extends HDKeyT
  object HDKey {
    
    @JSImport("ethereum-cryptography/pure/hdkey", "HDKey")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethereum-cryptography/pure/hdkey", "HDKey.HARDENED_OFFSET")
    @js.native
    def HARDENED_OFFSET: Double = js.native
    inline def HARDENED_OFFSET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HARDENED_OFFSET")(x.asInstanceOf[js.Any])
    
    inline def fromExtendedKey(base58key: String): HDKeyT = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedKey")(base58key.asInstanceOf[js.Any]).asInstanceOf[HDKeyT]
    inline def fromExtendedKey(base58key: String, versions: Versions): HDKeyT = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedKey")(base58key.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[HDKeyT]
    
    inline def fromJSON(json: Xpriv): HDKeyT = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[HDKeyT]
    
    inline def fromMasterSeed(seed: Buffer): HDKeyT = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMasterSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[HDKeyT]
    inline def fromMasterSeed(seed: Buffer, versions: Versions): HDKeyT = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMasterSeed")(seed.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[HDKeyT]
  }
  
  @JSImport("ethereum-cryptography/pure/hdkey", "HDKeyT")
  @js.native
  /* private */ class HDKeyT () extends StObject {
    
    var chainCode: Buffer | Null = js.native
    
    var depth: Double = js.native
    
    def derive(path: String): HDKeyT = js.native
    
    def deriveChild(index: Double): HDKeyT = js.native
    
    var fingerprint: Double = js.native
    
    var identifier: js.UndefOr[Buffer] = js.native
    
    var index: Double = js.native
    
    var parentFingerprint: Double = js.native
    
    var privateExtendedKey: String = js.native
    
    var privateKey: Buffer | Null = js.native
    
    var pubKeyHash: js.UndefOr[Buffer] = js.native
    
    var publicExtendedKey: String = js.native
    
    var publicKey: Buffer | Null = js.native
    
    def sign(hash: Buffer): Buffer = js.native
    
    def toJSON(): Xpub = js.native
    
    def verify(hash: Buffer, signature: Buffer): Boolean = js.native
    
    var versions: Versions = js.native
    
    def wipePrivateData(): this.type = js.native
  }
  /* static members */
  object HDKeyT {
    
    @JSImport("ethereum-cryptography/pure/hdkey", "HDKeyT")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ethereum-cryptography/pure/hdkey", "HDKeyT.HARDENED_OFFSET")
    @js.native
    def HARDENED_OFFSET: Double = js.native
    inline def HARDENED_OFFSET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HARDENED_OFFSET")(x.asInstanceOf[js.Any])
    
    inline def fromExtendedKey(base58key: String): HDKeyT = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedKey")(base58key.asInstanceOf[js.Any]).asInstanceOf[HDKeyT]
    inline def fromExtendedKey(base58key: String, versions: Versions): HDKeyT = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtendedKey")(base58key.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[HDKeyT]
    
    inline def fromJSON(json: Xpriv): HDKeyT = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[HDKeyT]
    
    inline def fromMasterSeed(seed: Buffer): HDKeyT = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMasterSeed")(seed.asInstanceOf[js.Any]).asInstanceOf[HDKeyT]
    inline def fromMasterSeed(seed: Buffer, versions: Versions): HDKeyT = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMasterSeed")(seed.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[HDKeyT]
  }
  
  trait Versions extends StObject {
    
    var `private`: Double
    
    var public: Double
  }
  object Versions {
    
    inline def apply(`private`: Double, public: Double): Versions = {
      val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Versions]
    }
    
    extension [Self <: Versions](x: Self) {
      
      inline def setPrivate(value: Double): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: Double): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
}
