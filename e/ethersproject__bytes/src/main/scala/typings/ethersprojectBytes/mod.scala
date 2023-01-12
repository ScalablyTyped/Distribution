package typings.ethersprojectBytes

import typings.ethersprojectBytes.anon.R
import typings.ethersprojectBytes.ethersprojectBytesStrings.left
import typings.ethersprojectBytes.ethersprojectBytesStrings.right
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/bytes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayify(value: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def arrayify(value: Double, options: DataOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def arrayify(value: BytesLike): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def arrayify(value: BytesLike, options: DataOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def arrayify(value: Hexable): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def arrayify(value: Hexable, options: DataOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def concat(items: js.Array[BytesLike]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def hexConcat(items: js.Array[BytesLike]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexConcat")(items.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexDataLength(data: BytesLike): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hexDataLength")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hexDataSlice(data: BytesLike, offset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexDataSlice")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexDataSlice(data: BytesLike, offset: Double, endOffset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexDataSlice")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endOffset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hexStripZeros(value: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexStripZeros")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexValue(value: js.BigInt): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexValue(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexValue(value: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexValue(value: Hexable): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexZeroPad(value: BytesLike, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexZeroPad")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hexlify(value: js.BigInt): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexlify(value: js.BigInt, options: DataOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexlify(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexlify(value: Double, options: DataOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexlify(value: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexlify(value: BytesLike, options: DataOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hexlify(value: Hexable): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hexlify(value: Hexable, options: DataOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isBytes(value: Any): /* is @ethersproject/bytes.@ethersproject/bytes.Bytes */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBytes")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/bytes.@ethersproject/bytes.Bytes */ Boolean]
  
  inline def isBytesLike(value: Any): /* is @ethersproject/bytes.@ethersproject/bytes.BytesLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBytesLike")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/bytes.@ethersproject/bytes.BytesLike */ Boolean]
  
  inline def isHexString(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isHexString(value: Any, length: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def joinSignature(signature: SignatureLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("joinSignature")(signature.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def splitSignature(signature: SignatureLike): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("splitSignature")(signature.asInstanceOf[js.Any]).asInstanceOf[Signature]
  
  inline def stripZeros(value: BytesLike): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("stripZeros")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def zeroPad(value: BytesLike, length: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("zeroPad")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  type Bytes = ArrayLike[Double]
  
  type BytesLike = Bytes | String
  
  trait DataOptions extends StObject {
    
    var allowMissingPrefix: js.UndefOr[Boolean] = js.undefined
    
    var hexPad: js.UndefOr[left | right | Null] = js.undefined
  }
  object DataOptions {
    
    inline def apply(): DataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowMissingPrefix(value: Boolean): Self = StObject.set(x, "allowMissingPrefix", value.asInstanceOf[js.Any])
      
      inline def setAllowMissingPrefixUndefined: Self = StObject.set(x, "allowMissingPrefix", js.undefined)
      
      inline def setHexPad(value: left | right): Self = StObject.set(x, "hexPad", value.asInstanceOf[js.Any])
      
      inline def setHexPadNull: Self = StObject.set(x, "hexPad", null)
      
      inline def setHexPadUndefined: Self = StObject.set(x, "hexPad", js.undefined)
    }
  }
  
  trait Hexable extends StObject {
    
    def toHexString(): String
  }
  object Hexable {
    
    inline def apply(toHexString: () => String): Hexable = {
      val __obj = js.Dynamic.literal(toHexString = js.Any.fromFunction0(toHexString))
      __obj.asInstanceOf[Hexable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hexable] (val x: Self) extends AnyVal {
      
      inline def setToHexString(value: () => String): Self = StObject.set(x, "toHexString", js.Any.fromFunction0(value))
    }
  }
  
  trait Signature extends StObject {
    
    var _vs: String
    
    var compact: String
    
    var r: String
    
    var recoveryParam: Double
    
    var s: String
    
    var v: Double
    
    var yParityAndS: String
  }
  object Signature {
    
    inline def apply(
      _vs: String,
      compact: String,
      r: String,
      recoveryParam: Double,
      s: String,
      v: Double,
      yParityAndS: String
    ): Signature = {
      val __obj = js.Dynamic.literal(_vs = _vs.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], recoveryParam = recoveryParam.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], yParityAndS = yParityAndS.asInstanceOf[js.Any])
      __obj.asInstanceOf[Signature]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Signature] (val x: Self) extends AnyVal {
      
      inline def setCompact(value: String): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRecoveryParam(value: Double): Self = StObject.set(x, "recoveryParam", value.asInstanceOf[js.Any])
      
      inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      inline def setYParityAndS(value: String): Self = StObject.set(x, "yParityAndS", value.asInstanceOf[js.Any])
      
      inline def set_vs(value: String): Self = StObject.set(x, "_vs", value.asInstanceOf[js.Any])
    }
  }
  
  type SignatureLike = R | BytesLike
}
