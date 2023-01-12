package typings.fortawesomeFontawesomeSvgCore.mod

import typings.std.HTMLCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontawesomeObject extends StObject {
  
  val `abstract`: js.Array[AbstractElement]
  
  val html: js.Array[String]
  
  val node: HTMLCollection
}
object FontawesomeObject {
  
  inline def apply(`abstract`: js.Array[AbstractElement], html: js.Array[String], node: HTMLCollection): FontawesomeObject = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontawesomeObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontawesomeObject] (val x: Self) extends AnyVal {
    
    inline def setAbstract(value: js.Array[AbstractElement]): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    inline def setAbstractVarargs(value: AbstractElement*): Self = StObject.set(x, "abstract", js.Array(value*))
    
    inline def setHtml(value: js.Array[String]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlVarargs(value: String*): Self = StObject.set(x, "html", js.Array(value*))
    
    inline def setNode(value: HTMLCollection): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
