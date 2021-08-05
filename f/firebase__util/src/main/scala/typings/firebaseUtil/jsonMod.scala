package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonMod {
  
  @JSImport("@firebase/util/dist/src/json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jsonEval(str: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonEval")(str.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def stringify(data: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any]).asInstanceOf[String]
}
