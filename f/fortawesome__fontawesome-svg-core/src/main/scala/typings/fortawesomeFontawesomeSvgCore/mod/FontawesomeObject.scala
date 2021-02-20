package typings.fortawesomeFontawesomeSvgCore.mod

import typings.std.HTMLCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontawesomeObject extends StObject {
  
  val `abstract`: js.Array[AbstractElement] = js.native
  
  val html: js.Array[String] = js.native
  
  val node: HTMLCollection = js.native
}
object FontawesomeObject {
  
  @scala.inline
  def apply(`abstract`: js.Array[AbstractElement], html: js.Array[String], node: HTMLCollection): FontawesomeObject = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontawesomeObject]
  }
  
  @scala.inline
  implicit class FontawesomeObjectMutableBuilder[Self <: FontawesomeObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbstract(value: js.Array[AbstractElement]): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbstractVarargs(value: AbstractElement*): Self = StObject.set(x, "abstract", js.Array(value :_*))
    
    @scala.inline
    def setHtml(value: js.Array[String]): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlVarargs(value: String*): Self = StObject.set(x, "html", js.Array(value :_*))
    
    @scala.inline
    def setNode(value: HTMLCollection): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
