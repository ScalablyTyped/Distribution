package typings.ethereumjsBlockchain

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callbackifyMod {
  
  @JSImport("ethereumjs-blockchain/dist/callbackify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def callbackify(original: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("callbackify")(original.asInstanceOf[js.Any]).asInstanceOf[Any]
}
