package typings.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def jsonObjectOrNull(s: String): StringDictionary[js.Any] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("jsonObjectOrNull")(s.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any] | Null]
}
