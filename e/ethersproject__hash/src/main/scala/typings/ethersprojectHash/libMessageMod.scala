package typings.ethersprojectHash

import typings.ethersprojectBytes.mod.Bytes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMessageMod {
  
  @JSImport("@ethersproject/hash/lib/message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hashMessage(message: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashMessage")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hashMessage(message: Bytes): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashMessage")(message.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@ethersproject/hash/lib/message", "messagePrefix")
  @js.native
  val messagePrefix: /* "\\u0019Ethereum Signed Message:\n" */ String = js.native
}
