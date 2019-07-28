package typings.frisby.frisbyMod

import typings.std.FormData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("frisby", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: String = js.native
  def addExpectHandler(expectName: String, expectFn: js.Function1[/* repeated */ js.Any, _]): FrisbySpec = js.native
  def baseUrl(url: String): Unit = js.native
  def create(name: String): Unit = js.native
  def del(args: js.Any*): FrisbySpec = js.native
  def fetch(args: js.Any*): FrisbySpec = js.native
  def formData(): FormData = js.native
  def fromJSON(args: js.Any*): FrisbySpec = js.native
  def get(args: js.Any*): FrisbySpec = js.native
  def globalSetup(opts: js.Object): Unit = js.native
  def patch(args: js.Any*): FrisbySpec = js.native
  def post(args: js.Any*): FrisbySpec = js.native
  def put(args: js.Any*): FrisbySpec = js.native
  def removeExpectHandler(expectName: String, expectFn: js.Function1[/* repeated */ js.Any, _]): FrisbySpec = js.native
  def setup(args: js.Any*): FrisbySpec = js.native
  def timeout(args: js.Any*): FrisbySpec = js.native
  def use(args: js.Any*): FrisbySpec = js.native
}

