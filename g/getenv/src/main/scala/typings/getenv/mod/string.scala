package typings.getenv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("getenv", "string")
@js.native
object string extends js.Object {
  
  /**
    * Return as string.
    */
  def apply(name: String): String = js.native
  def apply(name: String, fallback: String): String = js.native
}
