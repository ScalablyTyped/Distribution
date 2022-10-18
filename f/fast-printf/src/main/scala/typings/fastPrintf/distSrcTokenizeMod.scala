package typings.fastPrintf

import typings.fastPrintf.distSrcTypesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTokenizeMod {
  
  @JSImport("fast-printf/dist/src/tokenize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tokenize(subject: String): js.Array[Token] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(subject.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
}
