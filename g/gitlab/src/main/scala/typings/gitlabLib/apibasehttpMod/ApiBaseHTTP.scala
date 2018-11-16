package typings
package gitlabLib.apibasehttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/ApiBaseHTTP", "ApiBaseHTTP")
@js.native
class ApiBaseHTTP ()
  extends gitlabLib.apibaseMod.ApiBase {
  def delete(path: java.lang.String): js.Any = js.native
  def delete(path: java.lang.String, fn: js.Function): js.Any = js.native
  def fn_wrapper[T /* <: js.Function */](fn: T): T = js.native
  def get(path: java.lang.String): js.Any = js.native
  def get(path: java.lang.String, fn: js.Function): js.Any = js.native
  def get(path: java.lang.String, query: js.Object): js.Any = js.native
  def get(path: java.lang.String, query: js.Object, fn: js.Function): js.Any = js.native
  def patch(path: java.lang.String): js.Any = js.native
  def patch(path: java.lang.String, data: js.Object): js.Any = js.native
  def patch(path: java.lang.String, data: js.Object, fn: js.Function): js.Any = js.native
  def post(path: java.lang.String): js.Any = js.native
  def post(path: java.lang.String, data: js.Object): js.Any = js.native
  def post(path: java.lang.String, data: js.Object, fn: js.Function): js.Any = js.native
  def prepare_opts[T](opts: T): T = js.native
  def put(path: java.lang.String): js.Any = js.native
  def put(path: java.lang.String, data: js.Object): js.Any = js.native
  def put(path: java.lang.String, data: js.Object, fn: js.Function): js.Any = js.native
}

