package typings.ethereumjsUtil

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureMod {
  
  @JSImport("ethereumjs-util/dist/signature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ecrecover(msgHash: Buffer, v: Double, r: Buffer, s: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ecrecover")(msgHash.asInstanceOf[js.Any], v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def ecrecover(msgHash: Buffer, v: Double, r: Buffer, s: Buffer, chainId: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("ecrecover")(msgHash.asInstanceOf[js.Any], v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def ecsign(msgHash: Buffer, privateKey: Buffer): ECDSASignature = (^.asInstanceOf[js.Dynamic].applyDynamic("ecsign")(msgHash.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[ECDSASignature]
  inline def ecsign(msgHash: Buffer, privateKey: Buffer, chainId: Double): ECDSASignature = (^.asInstanceOf[js.Dynamic].applyDynamic("ecsign")(msgHash.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[ECDSASignature]
  
  inline def fromRpcSig(sig: String): ECDSASignature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRpcSig")(sig.asInstanceOf[js.Any]).asInstanceOf[ECDSASignature]
  
  inline def hashPersonalMessage(message: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hashPersonalMessage")(message.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def isValidSignature(v: Double, r: Buffer, s: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidSignature")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidSignature(v: Double, r: Buffer, s: Buffer, homesteadOrLater: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidSignature")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], homesteadOrLater.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidSignature(v: Double, r: Buffer, s: Buffer, homesteadOrLater: Boolean, chainId: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidSignature")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], homesteadOrLater.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidSignature(v: Double, r: Buffer, s: Buffer, homesteadOrLater: Unit, chainId: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidSignature")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], homesteadOrLater.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def toRpcSig(v: Double, r: Buffer, s: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toRpcSig")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toRpcSig(v: Double, r: Buffer, s: Buffer, chainId: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toRpcSig")(v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any], chainId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait ECDSASignature extends StObject {
    
    var r: Buffer
    
    var s: Buffer
    
    var v: Double
  }
  object ECDSASignature {
    
    inline def apply(r: Buffer, s: Buffer, v: Double): ECDSASignature = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[ECDSASignature]
    }
    
    extension [Self <: ECDSASignature](x: Self) {
      
      inline def setR(value: Buffer): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setS(value: Buffer): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
}
