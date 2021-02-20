package typings.docxTemplates

import typings.docxTemplates.typesMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlMod {
  
  @JSImport("docx-templates/lib/xml", "buildXml")
  @js.native
  def buildXml(node: Node, options: XmlOptions): String = js.native
  @JSImport("docx-templates/lib/xml", "buildXml")
  @js.native
  def buildXml(node: Node, options: XmlOptions, indent: String): String = js.native
  
  @JSImport("docx-templates/lib/xml", "parseXml")
  @js.native
  def parseXml(templateXml: String): js.Promise[Node] = js.native
  
  @js.native
  trait XmlOptions extends StObject {
    
    var literalXmlDelimiter: String = js.native
  }
  object XmlOptions {
    
    @scala.inline
    def apply(literalXmlDelimiter: String): XmlOptions = {
      val __obj = js.Dynamic.literal(literalXmlDelimiter = literalXmlDelimiter.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlOptions]
    }
    
    @scala.inline
    implicit class XmlOptionsMutableBuilder[Self <: XmlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLiteralXmlDelimiter(value: String): Self = StObject.set(x, "literalXmlDelimiter", value.asInstanceOf[js.Any])
    }
  }
}
