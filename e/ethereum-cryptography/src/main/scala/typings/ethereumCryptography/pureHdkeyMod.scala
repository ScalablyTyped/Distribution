package typings.ethereumCryptography

import typings.ethereumCryptography.anon.Xpriv
import typings.ethereumCryptography.anon.Xpub
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    @scala.inline
    def HARDENED_OFFSET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HARDENED_OFFSET")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereum-cryptography/pure/hdkey", "HDKey.fromExtendedKey")
    @js.native
    def fromExtendedKey(base58key: String): HDKeyT = js.native
    @JSImport("ethereum-cryptography/pure/hdkey", "HDKey.fromExtendedKey")
    @js.native
    def fromExtendedKey(base58key: String, versions: Versions): HDKeyT = js.native
    
    @JSImport("ethereum-cryptography/pure/hdkey", "HDKey.fromJSON")
    @js.native
    def fromJSON(json: Xpriv): HDKeyT = js.native
    
    @JSImport("ethereum-cryptography/pure/hdkey", "HDKey.fromMasterSeed")
    @js.native
    def fromMasterSeed(seed: Buffer): HDKeyT = js.native
    @JSImport("ethereum-cryptography/pure/hdkey", "HDKey.fromMasterSeed")
    @js.native
    def fromMasterSeed(seed: Buffer, versions: Versions): HDKeyT = js.native
  }
  
  @JSImport("ethereum-cryptography/pure/hdkey", "HDKeyT")
  @js.native
  class HDKeyT protected () extends StObject {
    
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
    @scala.inline
    def HARDENED_OFFSET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HARDENED_OFFSET")(x.asInstanceOf[js.Any])
    
    @JSImport("ethereum-cryptography/pure/hdkey", "HDKeyT.fromExtendedKey")
    @js.native
    def fromExtendedKey(base58key: String): HDKeyT = js.native
    @JSImport("ethereum-cryptography/pure/hdkey", "HDKeyT.fromExtendedKey")
    @js.native
    def fromExtendedKey(base58key: String, versions: Versions): HDKeyT = js.native
    
    @JSImport("ethereum-cryptography/pure/hdkey", "HDKeyT.fromJSON")
    @js.native
    def fromJSON(json: Xpriv): HDKeyT = js.native
    
    @JSImport("ethereum-cryptography/pure/hdkey", "HDKeyT.fromMasterSeed")
    @js.native
    def fromMasterSeed(seed: Buffer): HDKeyT = js.native
    @JSImport("ethereum-cryptography/pure/hdkey", "HDKeyT.fromMasterSeed")
    @js.native
    def fromMasterSeed(seed: Buffer, versions: Versions): HDKeyT = js.native
  }
  
  @js.native
  trait Versions extends StObject {
    
    var `private`: Double = js.native
    
    var public: Double = js.native
  }
  object Versions {
    
    @scala.inline
    def apply(`private`: Double, public: Double): Versions = {
      val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Versions]
    }
    
    @scala.inline
    implicit class VersionsMutableBuilder[Self <: Versions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrivate(value: Double): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublic(value: Double): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
}
