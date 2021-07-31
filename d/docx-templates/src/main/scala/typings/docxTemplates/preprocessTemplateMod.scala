package typings.docxTemplates

import typings.docxTemplates.typesMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preprocessTemplateMod {
  
  @JSImport("docx-templates/lib/preprocessTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(template: Node, delimiter: js.Tuple2[String, String]): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(template.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[Node]
}
