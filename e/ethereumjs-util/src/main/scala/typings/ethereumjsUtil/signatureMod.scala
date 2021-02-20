package typings.ethereumjsUtil

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureMod {
  
  @JSImport("ethereumjs-util/dist/signature", "ecrecover")
  @js.native
  def ecrecover(msgHash: Buffer, v: Double, r: Buffer, s: Buffer): Buffer = js.native
  @JSImport("ethereumjs-util/dist/signature", "ecrecover")
  @js.native
  def ecrecover(msgHash: Buffer, v: Double, r: Buffer, s: Buffer, chainId: Double): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/signature", "ecsign")
  @js.native
  def ecsign(msgHash: Buffer, privateKey: Buffer): ECDSASignature = js.native
  @JSImport("ethereumjs-util/dist/signature", "ecsign")
  @js.native
  def ecsign(msgHash: Buffer, privateKey: Buffer, chainId: Double): ECDSASignature = js.native
  
  @JSImport("ethereumjs-util/dist/signature", "fromRpcSig")
  @js.native
  def fromRpcSig(sig: String): ECDSASignature = js.native
  
  @JSImport("ethereumjs-util/dist/signature", "hashPersonalMessage")
  @js.native
  def hashPersonalMessage(message: Buffer): Buffer = js.native
  
  @JSImport("ethereumjs-util/dist/signature", "isValidSignature")
  @js.native
  def isValidSignature(v: Double, r: Buffer, s: Buffer): Boolean = js.native
  @JSImport("ethereumjs-util/dist/signature", "isValidSignature")
  @js.native
  def isValidSignature(v: Double, r: Buffer, s: Buffer, homesteadOrLater: js.UndefOr[scala.Nothing], chainId: Double): Boolean = js.native
  @JSImport("ethereumjs-util/dist/signature", "isValidSignature")
  @js.native
  def isValidSignature(v: Double, r: Buffer, s: Buffer, homesteadOrLater: Boolean): Boolean = js.native
  @JSImport("ethereumjs-util/dist/signature", "isValidSignature")
  @js.native
  def isValidSignature(v: Double, r: Buffer, s: Buffer, homesteadOrLater: Boolean, chainId: Double): Boolean = js.native
  
  @JSImport("ethereumjs-util/dist/signature", "toRpcSig")
  @js.native
  def toRpcSig(v: Double, r: Buffer, s: Buffer): String = js.native
  @JSImport("ethereumjs-util/dist/signature", "toRpcSig")
  @js.native
  def toRpcSig(v: Double, r: Buffer, s: Buffer, chainId: Double): String = js.native
  
  @js.native
  trait ECDSASignature extends StObject {
    
    var r: Buffer = js.native
    
    var s: Buffer = js.native
    
    var v: Double = js.native
  }
  object ECDSASignature {
    
    @scala.inline
    def apply(r: Buffer, s: Buffer, v: Double): ECDSASignature = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[ECDSASignature]
    }
    
    @scala.inline
    implicit class ECDSASignatureMutableBuilder[Self <: ECDSASignature] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setR(value: Buffer): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Buffer): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
}
