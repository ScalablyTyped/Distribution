package typings.engineIoClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEsmContribParseqsMod {
  
  @JSImport("engine.io-client/build/esm/contrib/parseqs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(qs: Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(qs.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def encode(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
}
