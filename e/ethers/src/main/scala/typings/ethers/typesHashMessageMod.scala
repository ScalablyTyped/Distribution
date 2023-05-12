package typings.ethers

import typings.ethers.typesCryptoSignatureMod.SignatureLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHashMessageMod {
  
  @JSImport("ethers/types/hash/message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hashMessage(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashMessage")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hashMessage(message: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashMessage")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def verifyMessage(message: String, sig: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyMessage")(message.asInstanceOf[js.Any], sig.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def verifyMessage(message: js.typedarray.Uint8Array, sig: SignatureLike): String = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyMessage")(message.asInstanceOf[js.Any], sig.asInstanceOf[js.Any])).asInstanceOf[String]
}
