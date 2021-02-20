package typings.escapeGoat

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("escape-goat", "htmlEscape")
  @js.native
  def htmlEscape(string: String): String = js.native
  @JSImport("escape-goat", "htmlEscape")
  @js.native
  def htmlEscape(template: TemplateStringsArray, substitutions: js.Any*): String = js.native
  
  @JSImport("escape-goat", "htmlUnescape")
  @js.native
  def htmlUnescape(htmlString: String): String = js.native
  @JSImport("escape-goat", "htmlUnescape")
  @js.native
  def htmlUnescape(template: TemplateStringsArray, substitutions: js.Any*): String = js.native
}
