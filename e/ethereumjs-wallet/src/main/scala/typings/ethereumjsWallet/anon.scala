package typings.ethereumjsWallet

import typings.ethereumjsWallet.mod.KDFParamsOut
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cipher extends StObject {
    
    var cipher: String
    
    var cipherparams: Iv
    
    var ciphertext: String
    
    var kdf: String
    
    var kdfparams: KDFParamsOut
    
    var mac: String
  }
  object Cipher {
    
    inline def apply(
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
    
    extension [Self <: Cipher](x: Self) {
      
      inline def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
      
      inline def setCipherparams(value: Iv): Self = StObject.set(x, "cipherparams", value.asInstanceOf[js.Any])
      
      inline def setCiphertext(value: String): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      inline def setKdf(value: String): Self = StObject.set(x, "kdf", value.asInstanceOf[js.Any])
      
      inline def setKdfparams(value: KDFParamsOut): Self = StObject.set(x, "kdfparams", value.asInstanceOf[js.Any])
      
      inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    }
  }
  
  trait CipherText extends StObject {
    
    var CipherText: String
    
    var IV: String
    
    var KeyHeader: Kdf
    
    var MAC: String
    
    var Salt: String
  }
  object CipherText {
    
    inline def apply(CipherText: String, IV: String, KeyHeader: Kdf, MAC: String, Salt: String): CipherText = {
      val __obj = js.Dynamic.literal(CipherText = CipherText.asInstanceOf[js.Any], IV = IV.asInstanceOf[js.Any], KeyHeader = KeyHeader.asInstanceOf[js.Any], MAC = MAC.asInstanceOf[js.Any], Salt = Salt.asInstanceOf[js.Any])
      __obj.asInstanceOf[CipherText]
    }
    
    extension [Self <: CipherText](x: Self) {
      
      inline def setCipherText(value: String): Self = StObject.set(x, "CipherText", value.asInstanceOf[js.Any])
      
      inline def setIV(value: String): Self = StObject.set(x, "IV", value.asInstanceOf[js.Any])
      
      inline def setKeyHeader(value: Kdf): Self = StObject.set(x, "KeyHeader", value.asInstanceOf[js.Any])
      
      inline def setMAC(value: String): Self = StObject.set(x, "MAC", value.asInstanceOf[js.Any])
      
      inline def setSalt(value: String): Self = StObject.set(x, "Salt", value.asInstanceOf[js.Any])
    }
  }
  
  trait DkLen extends StObject {
    
    var DkLen: Double
    
    var N: Double
    
    var P: Double
    
    var R: Double
    
    var SaltLen: Double
  }
  object DkLen {
    
    inline def apply(DkLen: Double, N: Double, P: Double, R: Double, SaltLen: Double): DkLen = {
      val __obj = js.Dynamic.literal(DkLen = DkLen.asInstanceOf[js.Any], N = N.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any], SaltLen = SaltLen.asInstanceOf[js.Any])
      __obj.asInstanceOf[DkLen]
    }
    
    extension [Self <: DkLen](x: Self) {
      
      inline def setDkLen(value: Double): Self = StObject.set(x, "DkLen", value.asInstanceOf[js.Any])
      
      inline def setN(value: Double): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      inline def setP(value: Double): Self = StObject.set(x, "P", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
      
      inline def setSaltLen(value: Double): Self = StObject.set(x, "SaltLen", value.asInstanceOf[js.Any])
    }
  }
  
  trait Iv extends StObject {
    
    var iv: String
  }
  object Iv {
    
    inline def apply(iv: String): Iv = {
      val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any])
      __obj.asInstanceOf[Iv]
    }
    
    extension [Self <: Iv](x: Self) {
      
      inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    }
  }
  
  trait Kdf extends StObject {
    
    var Kdf: String
    
    var KdfParams: DkLen
    
    var Version: String
  }
  object Kdf {
    
    inline def apply(Kdf: String, KdfParams: DkLen, Version: String): Kdf = {
      val __obj = js.Dynamic.literal(Kdf = Kdf.asInstanceOf[js.Any], KdfParams = KdfParams.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Kdf]
    }
    
    extension [Self <: Kdf](x: Self) {
      
      inline def setKdf(value: String): Self = StObject.set(x, "Kdf", value.asInstanceOf[js.Any])
      
      inline def setKdfParams(value: DkLen): Self = StObject.set(x, "KdfParams", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<ethereumjs-wallet.ethereumjs-wallet.V3Params> */
  trait PartialV3Params extends StObject {
    
    var c: js.UndefOr[Double] = js.undefined
    
    var cipher: js.UndefOr[String] = js.undefined
    
    var dklen: js.UndefOr[Double] = js.undefined
    
    var iv: js.UndefOr[String | Buffer] = js.undefined
    
    var kdf: js.UndefOr[String] = js.undefined
    
    var n: js.UndefOr[Double] = js.undefined
    
    var p: js.UndefOr[Double] = js.undefined
    
    var r: js.UndefOr[Double] = js.undefined
    
    var salt: js.UndefOr[String | Buffer] = js.undefined
    
    var uuid: js.UndefOr[String | Buffer] = js.undefined
  }
  object PartialV3Params {
    
    inline def apply(): PartialV3Params = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialV3Params]
    }
    
    extension [Self <: PartialV3Params](x: Self) {
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setCUndefined: Self = StObject.set(x, "c", js.undefined)
      
      inline def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
      
      inline def setCipherUndefined: Self = StObject.set(x, "cipher", js.undefined)
      
      inline def setDklen(value: Double): Self = StObject.set(x, "dklen", value.asInstanceOf[js.Any])
      
      inline def setDklenUndefined: Self = StObject.set(x, "dklen", js.undefined)
      
      inline def setIv(value: String | Buffer): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      inline def setKdf(value: String): Self = StObject.set(x, "kdf", value.asInstanceOf[js.Any])
      
      inline def setKdfUndefined: Self = StObject.set(x, "kdf", js.undefined)
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
      
      inline def setP(value: Double): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
      
      inline def setSalt(value: String | Buffer): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      inline def setUuid(value: String | Buffer): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
}
