package typings.ethersprojectContracts

import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBignumber.mod.BigNumber
import typings.ethersprojectBytes.mod.BytesLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait From extends StObject {
    
    var from: String
    
    var nonce: BigNumberish
  }
  object From {
    
    @scala.inline
    def apply(from: String, nonce: BigNumberish): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit class FromMutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: BigNumberish): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    }
  }
  
  trait Nonce extends StObject {
    
    var from: String
    
    var nonce: BytesLike | BigNumber | Double
  }
  object Nonce {
    
    @scala.inline
    def apply(from: String, nonce: BytesLike | BigNumber | Double): Nonce = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.asInstanceOf[Nonce]
    }
    
    @scala.inline
    implicit class NonceMutableBuilder[Self <: Nonce] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: BytesLike | BigNumber | Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    }
  }
  
  trait Object extends StObject {
    
    var `object`: String
  }
  object Object {
    
    @scala.inline
    def apply(`object`: String): Object = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Object]
    }
    
    @scala.inline
    implicit class ObjectMutableBuilder[Self <: Object] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
}
