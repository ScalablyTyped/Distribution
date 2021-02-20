package typings.firebaseUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryMod {
  
  @JSImport("@firebase/util/dist/src/query", "querystring")
  @js.native
  def querystring(querystringParams: StringDictionary[String | Double]): String = js.native
  
  @JSImport("@firebase/util/dist/src/query", "querystringDecode")
  @js.native
  def querystringDecode(querystring: String): js.Object = js.native
}
