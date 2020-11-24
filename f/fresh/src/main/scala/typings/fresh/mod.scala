package typings.fresh

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fresh", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(reqHeaders: Headers, resHeaders: Headers): Boolean = js.native
  
  type Headers = StringDictionary[js.UndefOr[String | js.Array[String] | Double]]
}
