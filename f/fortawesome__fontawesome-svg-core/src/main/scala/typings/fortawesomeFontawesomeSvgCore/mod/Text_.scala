package typings.fortawesomeFontawesomeSvgCore.mod

import typings.std.HTMLCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text_
  extends StObject
     with FontawesomeObject
     with IconOrText {
  
  val `type`: typings.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.text
}
object Text_ {
  
  @scala.inline
  def apply(`abstract`: js.Array[AbstractElement], html: js.Array[String], node: HTMLCollection): Text_ = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[Text_]
  }
  
  @scala.inline
  implicit class Text_MutableBuilder[Self <: Text_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.fortawesomeFontawesomeSvgCore.fortawesomeFontawesomeSvgCoreStrings.text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
