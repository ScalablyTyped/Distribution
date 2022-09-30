package typings.escapeGoat

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("escape-goat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def htmlEscape(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlEscape")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def htmlEscape(template: TemplateStringsArray, substitutions: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlEscape")(scala.List(template.asInstanceOf[js.Any]).`++`(substitutions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  inline def htmlUnescape(htmlString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlUnescape")(htmlString.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def htmlUnescape(template: TemplateStringsArray, substitutions: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlUnescape")(scala.List(template.asInstanceOf[js.Any]).`++`(substitutions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
}
