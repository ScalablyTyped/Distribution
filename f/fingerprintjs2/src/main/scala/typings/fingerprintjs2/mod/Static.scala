package typings.fingerprintjs2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  var VERSION: String = js.native
  def get(callback: js.Function1[/* components */ js.Array[Component], Unit]): Unit = js.native
  def get(options: Options, callback: js.Function1[/* components */ js.Array[Component], Unit]): Unit = js.native
  def getPromise(): js.Promise[js.Array[Component]] = js.native
  def getPromise(options: Options): js.Promise[js.Array[Component]] = js.native
  def getV18(callback: js.Function2[/* murmur */ String, /* components */ js.Array[V18Component], Unit]): Unit = js.native
  def getV18(
    options: Options,
    callback: js.Function2[/* murmur */ String, /* components */ js.Array[V18Component], Unit]
  ): Unit = js.native
  def x64hash128(value: String, num: Double): String = js.native
}

