package typings.fresh

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(reqHeaders: Headers, resHeaders: Headers): Boolean = (^.asInstanceOf[js.Dynamic].apply(reqHeaders.asInstanceOf[js.Any], resHeaders.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("fresh", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Headers = StringDictionary[js.UndefOr[String | js.Array[String] | Double]]
}
