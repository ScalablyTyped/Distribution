package typings.escapeGoat

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("escape-goat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def htmlEscape(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlEscape")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def htmlEscape(template: TemplateStringsArray, substitutions: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlEscape")(template.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def htmlUnescape(htmlString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlUnescape")(htmlString.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def htmlUnescape(template: TemplateStringsArray, substitutions: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlUnescape")(template.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[String]
}
