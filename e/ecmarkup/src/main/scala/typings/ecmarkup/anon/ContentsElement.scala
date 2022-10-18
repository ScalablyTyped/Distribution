package typings.ecmarkup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentsElement extends StObject {
  
  var contents: String
  
  var element: typings.std.Element
}
object ContentsElement {
  
  inline def apply(contents: String, element: typings.std.Element): ContentsElement = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentsElement]
  }
  
  extension [Self <: ContentsElement](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
