package typings.ethereumCryptography

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Recovery extends StObject {
    
    var recovery: Double
    
    var signature: Buffer
  }
  object Recovery {
    
    @scala.inline
    def apply(recovery: Double, signature: Buffer): Recovery = {
      val __obj = js.Dynamic.literal(recovery = recovery.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[Recovery]
    }
    
    @scala.inline
    implicit class RecoveryMutableBuilder[Self <: Recovery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecovery(value: Double): Self = StObject.set(x, "recovery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait Xpriv extends StObject {
    
    var xpriv: String
  }
  object Xpriv {
    
    @scala.inline
    def apply(xpriv: String): Xpriv = {
      val __obj = js.Dynamic.literal(xpriv = xpriv.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xpriv]
    }
    
    @scala.inline
    implicit class XprivMutableBuilder[Self <: Xpriv] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setXpriv(value: String): Self = StObject.set(x, "xpriv", value.asInstanceOf[js.Any])
    }
  }
  
  trait Xpub extends StObject {
    
    var xpriv: String
    
    var xpub: String
  }
  object Xpub {
    
    @scala.inline
    def apply(xpriv: String, xpub: String): Xpub = {
      val __obj = js.Dynamic.literal(xpriv = xpriv.asInstanceOf[js.Any], xpub = xpub.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xpub]
    }
    
    @scala.inline
    implicit class XpubMutableBuilder[Self <: Xpub] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setXpriv(value: String): Self = StObject.set(x, "xpriv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXpub(value: String): Self = StObject.set(x, "xpub", value.asInstanceOf[js.Any])
    }
  }
}
