package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcJsonMod {
  
  @JSImport("@firebase/util/dist/node-esm/src/json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jsonEval(str: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonEval")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def stringify(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any]).asInstanceOf[String]
}
