package typings
package foundationLib.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoundationStatic extends js.Object {
  var global: foundationLib.Anon_Namespace = js.native
  var libs: js.Any = js.native
  var media_queries: js.Object = js.native
  var name: java.lang.String = js.native
  var stylesheet: stdLib.CSSStyleSheet = js.native
  var utils: foundationLib.Anon_Addcustomrule = js.native
  var version: java.lang.String = js.native
  def inherit(scope: foundationLib.JQuery, methods: java.lang.String): scala.Unit = js.native
  def init(scope: foundationLib.JQuery): foundationLib.JQuery = js.native
  def init(scope: foundationLib.JQuery, libraries: Options): foundationLib.JQuery = js.native
  def init(scope: foundationLib.JQuery, libraries: java.lang.String, method: Options): foundationLib.JQuery = js.native
  def init(
    scope: foundationLib.JQuery,
    libraries: java.lang.String,
    method: java.lang.String,
    options: js.Object
  ): foundationLib.JQuery = js.native
  def init_lib(lib: js.Any, args: js.Any): js.Function1[/* repeated */ js.Any, _] = js.native
  def patch(lib: js.Any): scala.Unit = js.native
  def set_namespace(): scala.Unit = js.native
}

