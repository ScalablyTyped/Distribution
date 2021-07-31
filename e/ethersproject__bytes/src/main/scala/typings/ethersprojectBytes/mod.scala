package typings.ethersprojectBytes

import typings.ethersprojectBytes.anon.R
import typings.ethersprojectBytes.ethersprojectBytesStrings.left
import typings.ethersprojectBytes.ethersprojectBytesStrings.right
import typings.std.ArrayLike
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/bytes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def arrayify(value: Double): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  @scala.inline
  def arrayify(value: Double, options: DataOptions): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  @scala.inline
  def arrayify(value: BytesLike): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  @scala.inline
  def arrayify(value: BytesLike, options: DataOptions): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  @scala.inline
  def arrayify(value: Hexable): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  @scala.inline
  def arrayify(value: Hexable, options: DataOptions): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  @scala.inline
  def concat(items: js.Array[BytesLike]): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(items.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  @scala.inline
  def hexConcat(items: js.Array[BytesLike]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexConcat")(items.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def hexDataLength(data: BytesLike): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hexDataLength")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def hexDataSlice(data: BytesLike, offset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexDataSlice")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def hexDataSlice(data: BytesLike, offset: Double, endOffset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexDataSlice")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], endOffset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def hexStripZeros(value: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexStripZeros")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def hexValue(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def hexValue(value: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def hexValue(value: Hexable): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def hexZeroPad(value: BytesLike, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexZeroPad")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def hexlify(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def hexlify(value: Double, options: DataOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def hexlify(value: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def hexlify(value: BytesLike, options: DataOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def hexlify(value: Hexable): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def hexlify(value: Hexable, options: DataOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hexlify")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def isBytes(value: js.Any): /* is @ethersproject/bytes.@ethersproject/bytes.Bytes */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBytes")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/bytes.@ethersproject/bytes.Bytes */ Boolean]
  
  @scala.inline
  def isBytesLike(value: js.Any): /* is @ethersproject/bytes.@ethersproject/bytes.BytesLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBytesLike")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/bytes.@ethersproject/bytes.BytesLike */ Boolean]
  
  @scala.inline
  def isHexString(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isHexString(value: js.Any, length: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHexString")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def joinSignature(signature: SignatureLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("joinSignature")(signature.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def splitSignature(signature: SignatureLike): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("splitSignature")(signature.asInstanceOf[js.Any]).asInstanceOf[Signature]
  
  @scala.inline
  def stripZeros(value: BytesLike): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("stripZeros")(value.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  @scala.inline
  def zeroPad(value: BytesLike, length: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("zeroPad")(value.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  type Bytes = ArrayLike[Double]
  
  type BytesLike = Bytes | String
  
  trait DataOptions extends StObject {
    
    var allowMissingPrefix: js.UndefOr[Boolean] = js.undefined
    
    var hexPad: js.UndefOr[left | right | Null] = js.undefined
  }
  object DataOptions {
    
    @scala.inline
    def apply(): DataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataOptions]
    }
    
    @scala.inline
    implicit class DataOptionsMutableBuilder[Self <: DataOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowMissingPrefix(value: Boolean): Self = StObject.set(x, "allowMissingPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMissingPrefixUndefined: Self = StObject.set(x, "allowMissingPrefix", js.undefined)
      
      @scala.inline
      def setHexPad(value: left | right): Self = StObject.set(x, "hexPad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHexPadNull: Self = StObject.set(x, "hexPad", null)
      
      @scala.inline
      def setHexPadUndefined: Self = StObject.set(x, "hexPad", js.undefined)
    }
  }
  
  trait Hexable extends StObject {
    
    def toHexString(): String
  }
  object Hexable {
    
    @scala.inline
    def apply(toHexString: () => String): Hexable = {
      val __obj = js.Dynamic.literal(toHexString = js.Any.fromFunction0(toHexString))
      __obj.asInstanceOf[Hexable]
    }
    
    @scala.inline
    implicit class HexableMutableBuilder[Self <: Hexable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToHexString(value: () => String): Self = StObject.set(x, "toHexString", js.Any.fromFunction0(value))
    }
  }
  
  trait Signature extends StObject {
    
    var _vs: String
    
    var r: String
    
    var recoveryParam: Double
    
    var s: String
    
    var v: Double
  }
  object Signature {
    
    @scala.inline
    def apply(_vs: String, r: String, recoveryParam: Double, s: String, v: Double): Signature = {
      val __obj = js.Dynamic.literal(_vs = _vs.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], recoveryParam = recoveryParam.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[Signature]
    }
    
    @scala.inline
    implicit class SignatureMutableBuilder[Self <: Signature] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setR(value: String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecoveryParam(value: Double): Self = StObject.set(x, "recoveryParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_vs(value: String): Self = StObject.set(x, "_vs", value.asInstanceOf[js.Any])
    }
  }
  
  type SignatureLike = R | BytesLike
}
