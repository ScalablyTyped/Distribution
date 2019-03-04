package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefineGlobals extends js.Object {
  /** The userScript global */
  var global: js.Any
  /** The userScript metadata (as set in userScripts.register) */
  var metadata: js.Any
  /**
    * Exports all the properties of a given plain object as userScript globals
    * @param sourceObject A plain object whose properties are exported as userScript globals
    */
  def defineGlobals(sourceObject: js.Object): scala.Unit
  /**
    * Convert a given value to make it accessible to the userScript code
    * @param value A value to convert into an object accessible to the userScript
    */
  def export(value: js.Any): js.Any
}

object Anon_DefineGlobals {
  @scala.inline
  def apply(
    defineGlobals: js.Function1[js.Object, scala.Unit],
    export: js.Function1[js.Any, js.Any],
    global: js.Any,
    metadata: js.Any
  ): Anon_DefineGlobals = {
    val __obj = js.Dynamic.literal(defineGlobals = defineGlobals, export = export, global = global, metadata = metadata)
  
    __obj.asInstanceOf[Anon_DefineGlobals]
  }
}

