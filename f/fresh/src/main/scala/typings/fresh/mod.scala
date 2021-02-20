package typings.fresh

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fresh", JSImport.Namespace)
  @js.native
  def apply(reqHeaders: Headers, resHeaders: Headers): Boolean = js.native
  
  type Headers = StringDictionary[js.UndefOr[String | js.Array[String] | Double]]
}
