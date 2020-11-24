package typings.getenv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("getenv", "boolish")
@js.native
object boolish extends js.Object {
  
  /**
    * Return as boolean. Allows true/false/1/0 as valid values.
    */
  def apply(name: String): Boolean = js.native
  def apply(name: String, fallback: Boolean): Boolean = js.native
}
