package typings
package ffiDashNapiLib.ffiDashNapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariadicForeignFunction extends js.Object {
  /**
    * Return type as a property of the function generator to
    * allow for monkey patching the return value in the very rare case where the
    * return type is variadic as well
    */
  var returnType: js.Any = js.native
  /**
    * What gets returned is another function that needs to be invoked with the rest
    * of the variadic types that are being invoked from the function.
    */
  def apply(args: js.Any*): ForeignFunction = js.native
}

