package typings.futoinHkdf

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tlsMod {
  
  inline def apply(ikm: String, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(ikm.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def apply(ikm: String, length: Double, option: Options): Buffer = (^.asInstanceOf[js.Dynamic].apply(ikm.asInstanceOf[js.Any], length.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def apply(ikm: Buffer, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(ikm.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def apply(ikm: Buffer, length: Double, option: Options): Buffer = (^.asInstanceOf[js.Dynamic].apply(ikm.asInstanceOf[js.Any], length.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @JSImport("futoin-hkdf/tls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expandLabel(hash: String, hash_len: Double, prk: String, length: Double, label: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("expand_label")(hash.asInstanceOf[js.Any], hash_len.asInstanceOf[js.Any], prk.asInstanceOf[js.Any], length.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def expandLabel(hash: String, hash_len: Double, prk: String, length: Double, label: String, context: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("expand_label")(hash.asInstanceOf[js.Any], hash_len.asInstanceOf[js.Any], prk.asInstanceOf[js.Any], length.asInstanceOf[js.Any], label.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def expandLabel(hash: String, hash_len: Double, prk: String, length: Double, label: String, context: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("expand_label")(hash.asInstanceOf[js.Any], hash_len.asInstanceOf[js.Any], prk.asInstanceOf[js.Any], length.asInstanceOf[js.Any], label.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def expandLabel(hash: String, hash_len: Double, prk: Buffer, length: Double, label: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("expand_label")(hash.asInstanceOf[js.Any], hash_len.asInstanceOf[js.Any], prk.asInstanceOf[js.Any], length.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def expandLabel(hash: String, hash_len: Double, prk: Buffer, length: Double, label: String, context: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("expand_label")(hash.asInstanceOf[js.Any], hash_len.asInstanceOf[js.Any], prk.asInstanceOf[js.Any], length.asInstanceOf[js.Any], label.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def expandLabel(hash: String, hash_len: Double, prk: Buffer, length: Double, label: String, context: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("expand_label")(hash.asInstanceOf[js.Any], hash_len.asInstanceOf[js.Any], prk.asInstanceOf[js.Any], length.asInstanceOf[js.Any], label.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def info(length: Double, label: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(length.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def info(length: Double, label: String, context: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(length.asInstanceOf[js.Any], label.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def info(length: Double, label: String, context: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(length.asInstanceOf[js.Any], label.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  trait Options extends StObject {
    
    var context: js.UndefOr[Buffer | String] = js.undefined
    
    var hash: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var salt: js.UndefOr[Buffer | String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Buffer | String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setSalt(value: Buffer | String): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    }
  }
}
