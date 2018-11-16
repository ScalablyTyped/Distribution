package typings
package es6DashPromisifyLib.es6DashPromisifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("es6-promisify", "promisify")
@js.native
object promisifyNs extends js.Object {
  /**
       * The user can supply their own Promise implementation by setting it
       * here. Otherwise, the global Promise object will be used.
       */
  var Promise: stdLib.PromiseConstructor = js.native
  /**
       * This symbol can be placed on the function to be promisified to
       * provide names as an array of strings for the values in a success
       * callback.
       */
  val argumentNames: js.Symbol = js.native
}

