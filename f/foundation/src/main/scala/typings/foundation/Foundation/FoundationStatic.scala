package typings.foundation.Foundation

import typings.foundation.AnonAddcustomrule
import typings.foundation.AnonNamespace
import typings.foundation.JQuery
import typings.std.CSSStyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoundationStatic extends js.Object {
  var global: AnonNamespace = js.native
  var libs: js.Any = js.native
  var media_queries: js.Object = js.native
  var name: String = js.native
  var stylesheet: CSSStyleSheet = js.native
  var utils: AnonAddcustomrule = js.native
  var version: String = js.native
  def inherit(scope: JQuery, methods: String): Unit = js.native
  def init(scope: JQuery): JQuery = js.native
  def init(scope: JQuery, libraries: String, method: String, options: js.Object): JQuery = js.native
  def init(scope: JQuery, libraries: String, method: Options): JQuery = js.native
  def init(scope: JQuery, libraries: Options): JQuery = js.native
  def init_lib(lib: js.Any, args: js.Any): js.Function1[/* repeated */ js.Any, _] = js.native
  def patch(lib: js.Any): Unit = js.native
  def set_namespace(): Unit = js.native
}

