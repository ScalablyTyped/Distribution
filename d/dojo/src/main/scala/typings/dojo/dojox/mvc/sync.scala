package typings.dojo.dojox.mvc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.mvc.sync")
@js.native
object sync extends js.Object {
  /**
    * Data binding goes in both directions (dojox/mvc/Bind.from | dojox/mvc/Bind.to)
    *
    */
  var both: Double = js.native
  /**
    * Data binding goes from the source to the target
    *
    */
  var from: Double = js.native
  /**
    * Data binding goes from the target to the source
    *
    */
  var to: Double = js.native
  /**
    * Returns if the given two values are equal.
    *
    * @param dst
    * @param src
    */
  type equals = js.Function2[/* dst */ js.Any, /* src */ js.Any, Boolean]
}

