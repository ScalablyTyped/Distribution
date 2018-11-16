package typings
package frisbyLib.frisbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("frisby", "FrisbySpec")
@js.native
class FrisbySpec protected () extends js.Object {
  def this(args: js.Any*) = this()
  def `catch`(): FrisbySpec = js.native
  def `catch`(onRejected: js.Function1[/* error */ nodeLib.Error, scala.Unit]): FrisbySpec = js.native
  def del(url: java.lang.String): FrisbySpec = js.native
  def del(url: java.lang.String, params: js.Object): FrisbySpec = js.native
  def done(doneFn: js.Function1[/* repeated */js.Any, scala.Unit]): FrisbySpec = js.native
  def expect(expectName: java.lang.String, args: js.Any*): FrisbySpec = js.native
  def expectNot(expectName: java.lang.String): FrisbySpec = js.native
  def fetch(url: java.lang.String): FrisbySpec = js.native
  def fetch(url: java.lang.String, params: js.Object): FrisbySpec = js.native
  def fetch(url: java.lang.String, params: js.Object, options: js.Object): FrisbySpec = js.native
  def fromJSON(json: js.Object): FrisbySpec = js.native
  def get(url: java.lang.String): FrisbySpec = js.native
  def get(url: java.lang.String, params: js.Object): FrisbySpec = js.native
  def getBaseUrl(): java.lang.String | scala.Boolean = js.native
  def inspectBody(): FrisbySpec = js.native
  def inspectHeaders(): FrisbySpec = js.native
  def inspectJSON(): FrisbySpec = js.native
  def inspectLog(args: js.Any*): FrisbySpec = js.native
  def inspectRequest(): FrisbySpec = js.native
  def inspectRequestHeaders(): FrisbySpec = js.native
  def inspectResponse(): FrisbySpec = js.native
  def inspectStatus(): FrisbySpec = js.native
  def patch(url: java.lang.String): FrisbySpec = js.native
  def patch(url: java.lang.String, params: js.Object): FrisbySpec = js.native
  def post(url: java.lang.String): FrisbySpec = js.native
  def post(url: java.lang.String, params: js.Object): FrisbySpec = js.native
  def promise(): stdLib.Promise[frisbyLib.frisbyMod.nodeFetchNs.Response] = js.native
  def put(url: java.lang.String): FrisbySpec = js.native
  def put(url: java.lang.String, params: js.Object): FrisbySpec = js.native
  def setup(opts: js.Object, replace: scala.Boolean): FrisbySpec = js.native
  def `then`(onFulfilled: js.Function1[/* repeated */js.Any, scala.Unit]): FrisbySpec = js.native
  def `then`(
    onFulfilled: js.Function1[/* repeated */js.Any, scala.Unit],
    onRejected: js.Function1[/* repeated */js.Any, scala.Unit]
  ): FrisbySpec = js.native
  def `then`(onFulfilled: js.Object): FrisbySpec = js.native
  def `then`(onFulfilled: js.Object, onRejected: js.Function1[/* repeated */js.Any, scala.Unit]): FrisbySpec = js.native
  def timeout(timeout: scala.Double): scala.Double = js.native
  def use(fn: js.Function1[/* repeated */js.Any, scala.Unit]): FrisbySpec = js.native
}

@JSImport("frisby", "FrisbySpec")
@js.native
object FrisbySpec extends js.Object {
  def addExpectHandler(expectName: java.lang.String, expectFn: js.Function1[/* repeated */js.Any, _]): scala.Unit = js.native
  def removeExpectHandler(expectName: java.lang.String): scala.Unit = js.native
}

