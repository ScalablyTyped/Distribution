package typings.fortawesomeFontawesomeSvgCore.mod

import typings.std.HTMLCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fortawesomeFontawesomeSvgCore.mod.Icon_
  - typings.fortawesomeFontawesomeSvgCore.mod.Text_
*/
trait IconOrText extends StObject
object IconOrText {
  
  inline def Text_(`abstract`: js.Array[AbstractElement], html: js.Array[String], node: HTMLCollection): typings.fortawesomeFontawesomeSvgCore.mod.Text_ = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[typings.fortawesomeFontawesomeSvgCore.mod.Text_]
  }
}
