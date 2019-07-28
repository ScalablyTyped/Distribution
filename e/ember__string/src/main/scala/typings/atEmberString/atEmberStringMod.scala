package typings.atEmberString

import typings.atEmberString.dashPrivateHandlebarsMod.SafeString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/string", JSImport.Namespace)
@js.native
object atEmberStringMod extends js.Object {
  def camelize(str: String): String = js.native
  def capitalize(str: String): String = js.native
  def classify(str: String): String = js.native
  def dasherize(str: String): String = js.native
  def decamelize(str: String): String = js.native
  def htmlSafe(str: String): SafeString = js.native
  def isHTMLSafe(str: js.Any): /* is @ember/string.@ember/string/-private/handlebars.SafeString */ Boolean = js.native
  def loc(template: String): String = js.native
  def loc(template: String, args: js.Array[String]): String = js.native
  def underscore(str: String): String = js.native
  def w(str: String): js.Array[String] = js.native
}

