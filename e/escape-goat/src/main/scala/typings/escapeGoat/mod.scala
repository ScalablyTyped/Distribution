package typings.escapeGoat

import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("escape-goat", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def htmlEscape(string: String): String = js.native
  def htmlEscape(template: TemplateStringsArray, substitutions: js.Any*): String = js.native
  
  def htmlUnescape(htmlString: String): String = js.native
  def htmlUnescape(template: TemplateStringsArray, substitutions: js.Any*): String = js.native
}
