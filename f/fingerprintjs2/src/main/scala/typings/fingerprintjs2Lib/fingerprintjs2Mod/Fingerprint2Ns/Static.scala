package typings
package fingerprintjs2Lib.fingerprintjs2Mod.Fingerprint2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  var VERSION: java.lang.String = js.native
  def get(callback: js.Function1[/* components */ js.Array[Component], scala.Unit]): scala.Unit = js.native
  def get(options: Options, callback: js.Function1[/* components */ js.Array[Component], scala.Unit]): scala.Unit = js.native
  def getPromise(): js.Promise[js.Array[Component]] = js.native
  def getPromise(options: Options): js.Promise[js.Array[Component]] = js.native
  def getV18(
    callback: js.Function2[/* murmur */ java.lang.String, /* components */ js.Array[V18Component], scala.Unit]
  ): scala.Unit = js.native
  def getV18(
    options: Options,
    callback: js.Function2[/* murmur */ java.lang.String, /* components */ js.Array[V18Component], scala.Unit]
  ): scala.Unit = js.native
  def x64hash128(value: java.lang.String, num: scala.Double): java.lang.String = js.native
}

