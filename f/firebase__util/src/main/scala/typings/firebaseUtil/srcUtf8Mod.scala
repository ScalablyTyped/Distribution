package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtf8Mod {
  
  @JSImport("@firebase/util/dist/src/utf8", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringLength(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("stringLength")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def stringToByteArray(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToByteArray")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
