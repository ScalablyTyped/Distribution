package typings.ethersprojectBytes

import typings.ethersprojectBytes.anon.R
import typings.ethersprojectBytes.ethersprojectBytesStrings.left
import typings.ethersprojectBytes.ethersprojectBytesStrings.right
import typings.std.ArrayLike
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/bytes", "arrayify")
  @js.native
  def arrayify(value: Double): Uint8Array = js.native
  @JSImport("@ethersproject/bytes", "arrayify")
  @js.native
  def arrayify(value: Double, options: DataOptions): Uint8Array = js.native
  @JSImport("@ethersproject/bytes", "arrayify")
  @js.native
  def arrayify(value: BytesLike): Uint8Array = js.native
  @JSImport("@ethersproject/bytes", "arrayify")
  @js.native
  def arrayify(value: BytesLike, options: DataOptions): Uint8Array = js.native
  @JSImport("@ethersproject/bytes", "arrayify")
  @js.native
  def arrayify(value: Hexable): Uint8Array = js.native
  @JSImport("@ethersproject/bytes", "arrayify")
  @js.native
  def arrayify(value: Hexable, options: DataOptions): Uint8Array = js.native
  
  @JSImport("@ethersproject/bytes", "concat")
  @js.native
  def concat(items: js.Array[BytesLike]): Uint8Array = js.native
  
  @JSImport("@ethersproject/bytes", "hexConcat")
  @js.native
  def hexConcat(items: js.Array[BytesLike]): String = js.native
  
  @JSImport("@ethersproject/bytes", "hexDataLength")
  @js.native
  def hexDataLength(data: BytesLike): Double = js.native
  
  @JSImport("@ethersproject/bytes", "hexDataSlice")
  @js.native
  def hexDataSlice(data: BytesLike, offset: Double): String = js.native
  @JSImport("@ethersproject/bytes", "hexDataSlice")
  @js.native
  def hexDataSlice(data: BytesLike, offset: Double, endOffset: Double): String = js.native
  
  @JSImport("@ethersproject/bytes", "hexStripZeros")
  @js.native
  def hexStripZeros(value: BytesLike): String = js.native
  
  @JSImport("@ethersproject/bytes", "hexValue")
  @js.native
  def hexValue(value: Double): String = js.native
  @JSImport("@ethersproject/bytes", "hexValue")
  @js.native
  def hexValue(value: BytesLike): String = js.native
  @JSImport("@ethersproject/bytes", "hexValue")
  @js.native
  def hexValue(value: Hexable): String = js.native
  
  @JSImport("@ethersproject/bytes", "hexZeroPad")
  @js.native
  def hexZeroPad(value: BytesLike, length: Double): String = js.native
  
  @JSImport("@ethersproject/bytes", "hexlify")
  @js.native
  def hexlify(value: Double): String = js.native
  @JSImport("@ethersproject/bytes", "hexlify")
  @js.native
  def hexlify(value: Double, options: DataOptions): String = js.native
  @JSImport("@ethersproject/bytes", "hexlify")
  @js.native
  def hexlify(value: BytesLike): String = js.native
  @JSImport("@ethersproject/bytes", "hexlify")
  @js.native
  def hexlify(value: BytesLike, options: DataOptions): String = js.native
  @JSImport("@ethersproject/bytes", "hexlify")
  @js.native
  def hexlify(value: Hexable): String = js.native
  @JSImport("@ethersproject/bytes", "hexlify")
  @js.native
  def hexlify(value: Hexable, options: DataOptions): String = js.native
  
  @JSImport("@ethersproject/bytes", "isBytes")
  @js.native
  def isBytes(value: js.Any): /* is @ethersproject/bytes.@ethersproject/bytes.Bytes */ Boolean = js.native
  
  @JSImport("@ethersproject/bytes", "isBytesLike")
  @js.native
  def isBytesLike(value: js.Any): /* is @ethersproject/bytes.@ethersproject/bytes.BytesLike */ Boolean = js.native
  
  @JSImport("@ethersproject/bytes", "isHexString")
  @js.native
  def isHexString(value: js.Any): Boolean = js.native
  @JSImport("@ethersproject/bytes", "isHexString")
  @js.native
  def isHexString(value: js.Any, length: Double): Boolean = js.native
  
  @JSImport("@ethersproject/bytes", "joinSignature")
  @js.native
  def joinSignature(signature: SignatureLike): String = js.native
  
  @JSImport("@ethersproject/bytes", "splitSignature")
  @js.native
  def splitSignature(signature: SignatureLike): Signature = js.native
  
  @JSImport("@ethersproject/bytes", "stripZeros")
  @js.native
  def stripZeros(value: BytesLike): Uint8Array = js.native
  
  @JSImport("@ethersproject/bytes", "zeroPad")
  @js.native
  def zeroPad(value: BytesLike, length: Double): Uint8Array = js.native
  
  type Bytes = ArrayLike[Double]
  
  type BytesLike = Bytes | String
  
  @js.native
  trait DataOptions extends StObject {
    
    var allowMissingPrefix: js.UndefOr[Boolean] = js.native
    
    var hexPad: js.UndefOr[left | right | Null] = js.native
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
  
  @js.native
  trait Hexable extends StObject {
    
    def toHexString(): String = js.native
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
  
  @js.native
  trait Signature extends StObject {
    
    var _vs: String = js.native
    
    var r: String = js.native
    
    var recoveryParam: Double = js.native
    
    var s: String = js.native
    
    var v: Double = js.native
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
