package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Export extends js.Object {
  /**
    * Exports all the properties of a given plain object as userScript globals
    * @param sourceObject A plain object whose properties are exported as userScript globals
    */
  var defineGlobals: js.Function1[/* sourceObject */ js.Object, scala.Unit]
  /**
    * Convert a given value to make it accessible to the userScript code
    * @param value A value to convert into an object accessible to the userScript
    */
  var export: js.Function1[/* value */ js.Any, _]
  /** The userScript global */
  var global: js.Any
  /** The userScript metadata (as set in userScripts.register) */
  var metadata: js.Any
}

