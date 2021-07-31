package typings.ethereumjsUtil

import typings.ethereumjsUtil.addressMod.Address
import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("ethereumjs-util/dist/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bnToHex(value: typings.bnJs.mod.^): PrefixedHexString = ^.asInstanceOf[js.Dynamic].applyDynamic("bnToHex")(value.asInstanceOf[js.Any]).asInstanceOf[PrefixedHexString]
  
  @scala.inline
  def bnToRlp(value: typings.bnJs.mod.^): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("bnToRlp")(value.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  type AddressLike = Address | Buffer | String
  
  type BNLike = typings.bnJs.mod.^ | String | Double
  
  type BufferLike = Buffer | Uint8Array | js.Array[Double] | Double | typings.bnJs.mod.^ | TransformableToBuffer | PrefixedHexString
  
  type PrefixedHexString = String
  
  trait TransformableToArray extends StObject {
    
    def toArray(): Uint8Array
    
    var toBuffer: js.UndefOr[js.Function0[Buffer]] = js.undefined
  }
  object TransformableToArray {
    
    @scala.inline
    def apply(toArray: () => Uint8Array): TransformableToArray = {
      val __obj = js.Dynamic.literal(toArray = js.Any.fromFunction0(toArray))
      __obj.asInstanceOf[TransformableToArray]
    }
    
    @scala.inline
    implicit class TransformableToArrayMutableBuilder[Self <: TransformableToArray] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToArray(value: () => Uint8Array): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToBuffer(value: () => Buffer): Self = StObject.set(x, "toBuffer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToBufferUndefined: Self = StObject.set(x, "toBuffer", js.undefined)
    }
  }
  
  trait TransformableToBuffer extends StObject {
    
    var toArray: js.UndefOr[js.Function0[Uint8Array]] = js.undefined
    
    def toBuffer(): Buffer
  }
  object TransformableToBuffer {
    
    @scala.inline
    def apply(toBuffer: () => Buffer): TransformableToBuffer = {
      val __obj = js.Dynamic.literal(toBuffer = js.Any.fromFunction0(toBuffer))
      __obj.asInstanceOf[TransformableToBuffer]
    }
    
    @scala.inline
    implicit class TransformableToBufferMutableBuilder[Self <: TransformableToBuffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToArray(value: () => Uint8Array): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToArrayUndefined: Self = StObject.set(x, "toArray", js.undefined)
      
      @scala.inline
      def setToBuffer(value: () => Buffer): Self = StObject.set(x, "toBuffer", js.Any.fromFunction0(value))
    }
  }
}
