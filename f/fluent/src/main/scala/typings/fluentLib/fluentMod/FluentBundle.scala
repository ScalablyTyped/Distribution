package typings
package fluentLib.fluentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluent", "FluentBundle")
@js.native
class FluentBundle protected () extends js.Object {
  def this(locales: java.lang.String) = this()
  def this(locales: js.Array[java.lang.String]) = this()
  def this(locales: java.lang.String, options: FluentBundleContructorOptions) = this()
  def this(locales: js.Array[java.lang.String], options: FluentBundleContructorOptions) = this()
  var messages: stdLib.IterableIterator[js.Tuple2[java.lang.String, js.Array[FluentNode]]] = js.native
  def addMessages(source: java.lang.String): js.Array[java.lang.String] = js.native
  def addResource(res: FluentResource): js.Array[java.lang.String] = js.native
  def format(message: js.Array[FluentNode]): java.lang.String = js.native
  def format(message: js.Array[FluentNode], args: js.Object): java.lang.String = js.native
  def format(message: js.Array[FluentNode], args: js.Object, errors: js.Array[java.lang.String | stdLib.Error]): java.lang.String = js.native
  def getMessage(id: java.lang.String): js.Array[FluentNode] = js.native
  def hasMessage(source: java.lang.String): scala.Boolean = js.native
}

