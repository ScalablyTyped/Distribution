package typings.fluentBundle.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fluent/bundle", "FluentBundle")
@js.native
class FluentBundle protected () extends js.Object {
  def this(locales: String) = this()
  def this(locales: js.Array[String]) = this()
  def this(locales: String, options: FluentBundleConstructorOptions) = this()
  def this(locales: js.Array[String], options: FluentBundleConstructorOptions) = this()
  
  def addResource(res: FluentResource): js.Array[String] = js.native
  def addResource(res: FluentResource, options: FluentBundleAddResourceOptions): js.Array[String] = js.native
  
  def formatPattern(pattern: String): String = js.native
  def formatPattern(pattern: String, args: js.UndefOr[scala.Nothing], errors: js.Array[Error]): String = js.native
  def formatPattern(pattern: String, args: js.Object): String = js.native
  def formatPattern(pattern: String, args: js.Object, errors: js.Array[Error]): String = js.native
  def formatPattern(pattern: Pattern): String = js.native
  def formatPattern(pattern: Pattern, args: js.UndefOr[scala.Nothing], errors: js.Array[Error]): String = js.native
  def formatPattern(pattern: Pattern, args: js.Object): String = js.native
  def formatPattern(pattern: Pattern, args: js.Object, errors: js.Array[Error]): String = js.native
  
  def getMessage(id: String): RawMessage = js.native
  
  def hasMessage(id: String): Boolean = js.native
  
  var locales: js.Array[String] = js.native
}
