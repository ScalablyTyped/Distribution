package typings.firebaseUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryMod {
  
  @JSImport("@firebase/util/dist/src/query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def querystring(querystringParams: StringDictionary[String | Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("querystring")(querystringParams.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def querystringDecode(querystring: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("querystringDecode")(querystring.asInstanceOf[js.Any]).asInstanceOf[js.Object]
}
