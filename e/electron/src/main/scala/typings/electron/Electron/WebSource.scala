package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSource extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/web-source
  var code: String
  
  /**
    * Default is 1.
    */
  var startLine: js.UndefOr[Double] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object WebSource {
  
  @scala.inline
  def apply(code: String): WebSource = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSource]
  }
  
  @scala.inline
  implicit class WebSourceMutableBuilder[Self <: WebSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
