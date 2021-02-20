package typings.ethereumjsWallet

import typings.ethereumjsWallet.mod.KDFParamsOut
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cipher extends StObject {
    
    var cipher: String = js.native
    
    var cipherparams: Iv = js.native
    
    var ciphertext: String = js.native
    
    var kdf: String = js.native
    
    var kdfparams: KDFParamsOut = js.native
    
    var mac: String = js.native
  }
  object Cipher {
    
    @scala.inline
    def apply(
      cipher: String,
      cipherparams: Iv,
      ciphertext: String,
      kdf: String,
      kdfparams: KDFParamsOut,
      mac: String
    ): Cipher = {
      val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], cipherparams = cipherparams.asInstanceOf[js.Any], ciphertext = ciphertext.asInstanceOf[js.Any], kdf = kdf.asInstanceOf[js.Any], kdfparams = kdfparams.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cipher]
    }
    
    @scala.inline
    implicit class CipherMutableBuilder[Self <: Cipher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCipherparams(value: Iv): Self = StObject.set(x, "cipherparams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKdf(value: String): Self = StObject.set(x, "kdf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKdfparams(value: KDFParamsOut): Self = StObject.set(x, "kdfparams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CipherText extends StObject {
    
    var CipherText: String = js.native
    
    var IV: String = js.native
    
    var KeyHeader: Kdf = js.native
    
    var MAC: String = js.native
    
    var Salt: String = js.native
  }
  object CipherText {
    
    @scala.inline
    def apply(CipherText: String, IV: String, KeyHeader: Kdf, MAC: String, Salt: String): CipherText = {
      val __obj = js.Dynamic.literal(CipherText = CipherText.asInstanceOf[js.Any], IV = IV.asInstanceOf[js.Any], KeyHeader = KeyHeader.asInstanceOf[js.Any], MAC = MAC.asInstanceOf[js.Any], Salt = Salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[CipherText]
    }
    
    @scala.inline
    implicit class CipherTextMutableBuilder[Self <: CipherText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCipherText(value: String): Self = StObject.set(x, "CipherText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIV(value: String): Self = StObject.set(x, "IV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyHeader(value: Kdf): Self = StObject.set(x, "KeyHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMAC(value: String): Self = StObject.set(x, "MAC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSalt(value: String): Self = StObject.set(x, "Salt", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DkLen extends StObject {
    
    var DkLen: Double = js.native
    
    var N: Double = js.native
    
    var P: Double = js.native
    
    var R: Double = js.native
    
    var SaltLen: Double = js.native
  }
  object DkLen {
    
    @scala.inline
    def apply(DkLen: Double, N: Double, P: Double, R: Double, SaltLen: Double): DkLen = {
      val __obj = js.Dynamic.literal(DkLen = DkLen.asInstanceOf[js.Any], N = N.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any], SaltLen = SaltLen.asInstanceOf[js.Any])
      __obj.asInstanceOf[DkLen]
    }
    
    @scala.inline
    implicit class DkLenMutableBuilder[Self <: DkLen] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDkLen(value: Double): Self = StObject.set(x, "DkLen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: Double): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP(value: Double): Self = StObject.set(x, "P", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltLen(value: Double): Self = StObject.set(x, "SaltLen", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Iv extends StObject {
    
    var iv: String = js.native
  }
  object Iv {
    
    @scala.inline
    def apply(iv: String): Iv = {
      val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any])
      __obj.asInstanceOf[Iv]
    }
    
    @scala.inline
    implicit class IvMutableBuilder[Self <: Iv] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Kdf extends StObject {
    
    var Kdf: String = js.native
    
    var KdfParams: DkLen = js.native
    
    var Version: String = js.native
  }
  object Kdf {
    
    @scala.inline
    def apply(Kdf: String, KdfParams: DkLen, Version: String): Kdf = {
      val __obj = js.Dynamic.literal(Kdf = Kdf.asInstanceOf[js.Any], KdfParams = KdfParams.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Kdf]
    }
    
    @scala.inline
    implicit class KdfMutableBuilder[Self <: Kdf] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKdf(value: String): Self = StObject.set(x, "Kdf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKdfParams(value: DkLen): Self = StObject.set(x, "KdfParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<ethereumjs-wallet.ethereumjs-wallet.V3Params> */
  @js.native
  trait PartialV3Params extends StObject {
    
    var c: js.UndefOr[Double] = js.native
    
    var cipher: js.UndefOr[String] = js.native
    
    var dklen: js.UndefOr[Double] = js.native
    
    var iv: js.UndefOr[String | Buffer] = js.native
    
    var kdf: js.UndefOr[String] = js.native
    
    var n: js.UndefOr[Double] = js.native
    
    var p: js.UndefOr[Double] = js.native
    
    var r: js.UndefOr[Double] = js.native
    
    var salt: js.UndefOr[String | Buffer] = js.native
    
    var uuid: js.UndefOr[String | Buffer] = js.native
  }
  object PartialV3Params {
    
    @scala.inline
    def apply(): PartialV3Params = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialV3Params]
    }
    
    @scala.inline
    implicit class PartialV3ParamsMutableBuilder[Self <: PartialV3Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCUndefined: Self = StObject.set(x, "c", js.undefined)
      
      @scala.inline
      def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCipherUndefined: Self = StObject.set(x, "cipher", js.undefined)
      
      @scala.inline
      def setDklen(value: Double): Self = StObject.set(x, "dklen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDklenUndefined: Self = StObject.set(x, "dklen", js.undefined)
      
      @scala.inline
      def setIv(value: String | Buffer): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      @scala.inline
      def setKdf(value: String): Self = StObject.set(x, "kdf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKdfUndefined: Self = StObject.set(x, "kdf", js.undefined)
      
      @scala.inline
      def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNUndefined: Self = StObject.set(x, "n", js.undefined)
      
      @scala.inline
      def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      @scala.inline
      def setSalt(value: String | Buffer): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      @scala.inline
      def setUuid(value: String | Buffer): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
}
