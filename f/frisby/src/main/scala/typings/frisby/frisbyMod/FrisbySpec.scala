package typings.frisby.frisbyMod

import typings.frisby.frisbyMod.nodeFetchNs.Response
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("frisby", "FrisbySpec")
@js.native
class FrisbySpec protected () extends js.Object {
  def this(args: js.Any*) = this()
  def `catch`(): FrisbySpec = js.native
  def `catch`(onRejected: js.Function1[/* error */ Error, Unit]): FrisbySpec = js.native
  def del(url: String): FrisbySpec = js.native
  def del(url: String, params: js.Object): FrisbySpec = js.native
  def done(doneFn: js.Function1[/* repeated */ js.Any, Unit]): FrisbySpec = js.native
  def expect(expectName: String, args: js.Any*): FrisbySpec = js.native
  def expectNot(expectName: String, args: js.Any*): FrisbySpec = js.native
  def fetch(url: String): FrisbySpec = js.native
  def fetch(url: String, params: js.Object): FrisbySpec = js.native
  def fetch(url: String, params: js.Object, options: js.Object): FrisbySpec = js.native
  def fromJSON(json: js.Object): FrisbySpec = js.native
  def get(url: String): FrisbySpec = js.native
  def get(url: String, params: js.Object): FrisbySpec = js.native
  def getBaseUrl(): String | Boolean = js.native
  def inspectBody(): FrisbySpec = js.native
  def inspectHeaders(): FrisbySpec = js.native
  def inspectJSON(): FrisbySpec = js.native
  def inspectLog(args: js.Any*): FrisbySpec = js.native
  def inspectRequest(): FrisbySpec = js.native
  def inspectRequestHeaders(): FrisbySpec = js.native
  def inspectResponse(): FrisbySpec = js.native
  def inspectStatus(): FrisbySpec = js.native
  def patch(url: String): FrisbySpec = js.native
  def patch(url: String, params: js.Object): FrisbySpec = js.native
  def post(url: String): FrisbySpec = js.native
  def post(url: String, params: js.Object): FrisbySpec = js.native
  def promise(): js.Promise[Response] = js.native
  def put(url: String): FrisbySpec = js.native
  def put(url: String, params: js.Object): FrisbySpec = js.native
  def setup(opts: js.Object, replace: Boolean): FrisbySpec = js.native
  def `then`(onFulfilled: js.Function1[/* repeated */ js.Any, Unit]): FrisbySpec = js.native
  def `then`(
    onFulfilled: js.Function1[/* repeated */ js.Any, Unit],
    onRejected: js.Function1[/* repeated */ js.Any, Unit]
  ): FrisbySpec = js.native
  def `then`(onFulfilled: js.Object): FrisbySpec = js.native
  def `then`(onFulfilled: js.Object, onRejected: js.Function1[/* repeated */ js.Any, Unit]): FrisbySpec = js.native
  def timeout(timeout: Double): Double = js.native
  def use(fn: js.Function1[/* repeated */ js.Any, Unit]): FrisbySpec = js.native
}

/* static members */
@JSImport("frisby", "FrisbySpec")
@js.native
object FrisbySpec extends js.Object {
  def addExpectHandler(expectName: String, expectFn: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def removeExpectHandler(expectName: String): Unit = js.native
}

