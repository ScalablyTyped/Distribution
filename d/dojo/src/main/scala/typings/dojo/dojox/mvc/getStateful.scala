package typings.dojo.dojox.mvc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.mvc.getStateful")
@js.native
object getStateful extends js.Object {
  /**
    * Returns the stateful version of the given array.
    *
    * @param a The array.
    */
  type getStatefulArray = js.Function1[/* a */ js.Array[js.Any], js.Any]
  /**
    * Returns the stateful version of the given object.
    *
    * @param o The object.
    */
  type getStatefulObject = js.Function1[/* o */ js.Object, js.Any]
  /**
    * Just returns the given value.
    *
    * @param v
    */
  type getStatefulValue = js.Function1[/* v */ js.Any, js.Any]
  /**
    * Returns the type of the given value.
    *
    * @param v The value.
    */
  type getType = js.Function1[/* v */ js.Any, String]
}

