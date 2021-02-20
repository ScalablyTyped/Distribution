package typings.fsJetpack.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileOptions extends StObject {
  
  var content: js.UndefOr[WritableData] = js.native
  
  var jsonIndent: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[String | Double] = js.native
}
object FileOptions {
  
  @scala.inline
  def apply(): FileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileOptions]
  }
  
  @scala.inline
  implicit class FileOptionsMutableBuilder[Self <: FileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: WritableData): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: js.Any*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    @scala.inline
    def setJsonIndent(value: Double): Self = StObject.set(x, "jsonIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonIndentUndefined: Self = StObject.set(x, "jsonIndent", js.undefined)
    
    @scala.inline
    def setMode(value: String | Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
