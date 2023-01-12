package typings.electron

import typings.electron.Electron.WebviewTag
import typings.electron.electronStrings.webview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  @JSName("createElement")
  def createElement_webview(tagName: webview): WebviewTag
}
object Document {
  
  inline def apply(createElement: webview => WebviewTag): Document = {
    val __obj = js.Dynamic.literal(createElement = js.Any.fromFunction1(createElement))
    __obj.asInstanceOf[Document]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
    
    inline def setCreateElement(value: webview => WebviewTag): Self = StObject.set(x, "createElement", js.Any.fromFunction1(value))
  }
}
