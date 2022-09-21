package typings.ethjsSigner

import typings.ethjsSigner.ethjsSignerBooleans.`false`
import typings.ethjsSigner.ethjsSignerBooleans.`true`
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ethjs-signer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def recover(rawTx: String, v: Double, r: Buffer, s: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("recover")(rawTx.asInstanceOf[js.Any], v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def recover(rawTx: Buffer, v: Double, r: Buffer, s: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("recover")(rawTx.asInstanceOf[js.Any], v.asInstanceOf[js.Any], r.asInstanceOf[js.Any], s.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def sign(transaction: js.Object, privateKey: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(transaction.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sign_false(transaction: js.Object, privateKey: String, toObject: `false`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(transaction.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], toObject.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sign_true(transaction: js.Object, privateKey: String, toObject: `true`): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(transaction.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], toObject.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
