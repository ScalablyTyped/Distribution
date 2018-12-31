package typings
package frisbyLib.frisbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("frisby", JSImport.Namespace)
@js.native
object frisbyModMembers extends js.Object {
  val version: java.lang.String = js.native
  def addExpectHandler(expectName: java.lang.String, expectFn: js.Function1[/* repeated */ js.Any, _]): FrisbySpec = js.native
  def baseUrl(url: java.lang.String): scala.Unit = js.native
  def create(name: java.lang.String): scala.Unit = js.native
  def del(args: js.Any*): FrisbySpec = js.native
  def fetch(args: js.Any*): FrisbySpec = js.native
  def formData(): stdLib.FormData = js.native
  def fromJSON(args: js.Any*): FrisbySpec = js.native
  def get(args: js.Any*): FrisbySpec = js.native
  def globalSetup(opts: js.Object): scala.Unit = js.native
  def patch(args: js.Any*): FrisbySpec = js.native
  def post(args: js.Any*): FrisbySpec = js.native
  def put(args: js.Any*): FrisbySpec = js.native
  def removeExpectHandler(expectName: java.lang.String, expectFn: js.Function1[/* repeated */ js.Any, _]): FrisbySpec = js.native
  def setup(args: js.Any*): FrisbySpec = js.native
  def timeout(args: js.Any*): FrisbySpec = js.native
  def use(args: js.Any*): FrisbySpec = js.native
}

