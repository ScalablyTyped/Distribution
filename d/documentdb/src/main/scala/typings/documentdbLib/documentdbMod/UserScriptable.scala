package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserScriptable extends UniqueId {
  /** The user function. Must set one of body or serverscript */
  var body: js.UndefOr[UserFunction] = js.undefined
  /** The user function. Must set one of body or serverscript */
  var serverScript: js.UndefOr[UserFunction] = js.undefined
}

