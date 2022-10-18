package typings.ethersprojectContracts

import typings.ethersprojectBignumber.libBignumberMod.BigNumberish
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
    
    inline def apply(from: String, nonce: BigNumberish): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: BigNumberish): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    }
  }
  
  trait Nonce extends StObject {
    
    var from: String
    
    var nonce: BytesLike | BigNumber | Double
  }
  object Nonce {
    
    inline def apply(from: String, nonce: BytesLike | BigNumber | Double): Nonce = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.asInstanceOf[Nonce]
    }
    
    extension [Self <: Nonce](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: BytesLike | BigNumber | Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    }
  }
  
  trait Object extends StObject {
    
    var `object`: String
  }
  object Object {
    
    inline def apply(`object`: String): Object = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Object]
    }
    
    extension [Self <: Object](x: Self) {
      
      inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
}
