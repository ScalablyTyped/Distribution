package typings.fortawesomeFontawesomeSvgCore.mod

import typings.std.HTMLCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layer_
  extends StObject
     with FontawesomeObject {
  
  val `type`: "layer"
}
object Layer_ {
  
  inline def apply(`abstract`: js.Array[AbstractElement], html: js.Array[String], node: HTMLCollection): Layer_ = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("layer")
    __obj.asInstanceOf[Layer_]
  }
  
  extension [Self <: Layer_](x: Self) {
    
    inline def setType(value: "layer"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
