package typings.firebaseUtil

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcQueryMod {
  
  @JSImport("@firebase/util/dist/node-esm/src/query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractQuerystring(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractQuerystring")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def querystring(querystringParams: StringDictionary[String | Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("querystring")(querystringParams.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def querystringDecode(querystring: String): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("querystringDecode")(querystring.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
}
