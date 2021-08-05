package typings.docxTemplates

import typings.docxTemplates.typesMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlMod {
  
  @JSImport("docx-templates/lib/xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildXml(node: Node, options: XmlOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildXml")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def buildXml(node: Node, options: XmlOptions, indent: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildXml")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseXml(templateXml: String): js.Promise[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseXml")(templateXml.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Node]]
  
  trait XmlOptions extends StObject {
    
    var literalXmlDelimiter: String
  }
  object XmlOptions {
    
    inline def apply(literalXmlDelimiter: String): XmlOptions = {
      val __obj = js.Dynamic.literal(literalXmlDelimiter = literalXmlDelimiter.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlOptions]
    }
    
    extension [Self <: XmlOptions](x: Self) {
      
      inline def setLiteralXmlDelimiter(value: String): Self = StObject.set(x, "literalXmlDelimiter", value.asInstanceOf[js.Any])
    }
  }
}
