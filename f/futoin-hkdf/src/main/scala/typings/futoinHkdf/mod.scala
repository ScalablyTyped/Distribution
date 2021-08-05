package typings.futoinHkdf

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(ikm: String, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(ikm.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def apply(ikm: String, length: Double, option: Options): Buffer = (^.asInstanceOf[js.Dynamic].apply(ikm.asInstanceOf[js.Any], length.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def apply(ikm: Buffer, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(ikm.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def apply(ikm: Buffer, length: Double, option: Options): Buffer = (^.asInstanceOf[js.Dynamic].apply(ikm.asInstanceOf[js.Any], length.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @JSImport("futoin-hkdf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expand(hash: String, hash_len: Double, prk: String, length: Double, info: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(hash.asInstanceOf[js.Any], hash_len.asInstanceOf[js.Any], prk.asInstanceOf[js.Any], length.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def expand(hash: String, hash_len: Double, prk: String, length: Double, info: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(hash.asInstanceOf[js.Any], hash_len.asInstanceOf[js.Any], prk.asInstanceOf[js.Any], length.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def expand(hash: String, hash_len: Double, prk: Buffer, length: Double, info: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(hash.asInstanceOf[js.Any], hash_len.asInstanceOf[js.Any], prk.asInstanceOf[js.Any], length.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def expand(hash: String, hash_len: Double, prk: Buffer, length: Double, info: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("expand")(hash.asInstanceOf[js.Any], hash_len.asInstanceOf[js.Any], prk.asInstanceOf[js.Any], length.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def extract(hash: String, hash_len: Double, ikm: String, salt: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(hash.asInstanceOf[js.Any], hash_len.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def extract(hash: String, hash_len: Double, ikm: String, salt: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(hash.asInstanceOf[js.Any], hash_len.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def extract(hash: String, hash_len: Double, ikm: Buffer, salt: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(hash.asInstanceOf[js.Any], hash_len.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def extract(hash: String, hash_len: Double, ikm: Buffer, salt: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(hash.asInstanceOf[js.Any], hash_len.asInstanceOf[js.Any], ikm.asInstanceOf[js.Any], salt.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def hashLength(hash: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hash_length")(hash.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait Options extends StObject {
    
    var hash: js.UndefOr[String] = js.undefined
    
    var info: js.UndefOr[Buffer | String] = js.undefined
    
    var salt: js.UndefOr[Buffer | String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setInfo(value: Buffer | String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setSalt(value: Buffer | String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    }
  }
}
