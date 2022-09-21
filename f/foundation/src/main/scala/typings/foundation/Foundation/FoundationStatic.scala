package typings.foundation.Foundation

import typings.foundation.JQuery
import typings.foundation.anon.Addcustomrule
import typings.foundation.anon.Namespace
import typings.std.CSSStyleSheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoundationStatic extends StObject {
  
  var global: Namespace = js.native
  
  def inherit(scope: JQuery, methods: String): Unit = js.native
  
  def init(scope: JQuery): JQuery = js.native
  def init(scope: JQuery, libraries: String, method: String, options: js.Object): JQuery = js.native
  def init(scope: JQuery, libraries: String, method: Options): JQuery = js.native
  def init(scope: JQuery, libraries: Options): JQuery = js.native
  
  def init_lib(lib: Any, args: Any): js.Function1[/* repeated */ Any, Any] = js.native
  
  var libs: Any = js.native
  
  var media_queries: js.Object = js.native
  
  var name: String = js.native
  
  def patch(lib: Any): Unit = js.native
  
  def set_namespace(): Unit = js.native
  
  var stylesheet: CSSStyleSheet = js.native
  
  var utils: Addcustomrule = js.native
  
  var version: String = js.native
}
