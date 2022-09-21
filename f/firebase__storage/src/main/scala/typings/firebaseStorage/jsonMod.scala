package typings.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/implementation/json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jsonObjectOrNull(s: String): StringDictionary[Any] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonObjectOrNull")(s.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any] | Null]
}
