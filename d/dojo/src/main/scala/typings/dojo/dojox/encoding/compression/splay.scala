package typings.dojo.dojox.encoding.compression

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.encoding.compression.splay")
@js.native
object splay extends js.Object {
  /**
    *
    * @param stream
    */
  type decode = js.Function1[/* stream */ js.Any, Double]
  /**
    *
    * @param value
    * @param stream
    */
  type encode = js.Function2[/* value */ js.Any, /* stream */ js.Any, js.Any]
  /**
    *
    */
  type reset = js.Function0[Unit]
  /**
    *
    * @param i
    */
  type splay = js.Function1[/* i */ js.Any, Unit]
}

