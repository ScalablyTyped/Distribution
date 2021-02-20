package typings.fortawesomeFontawesomeSvgCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerParams extends StObject {
  
  var classes: js.UndefOr[String | js.Array[String]] = js.native
}
object LayerParams {
  
  @scala.inline
  def apply(): LayerParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerParams]
  }
  
  @scala.inline
  implicit class LayerParamsMutableBuilder[Self <: LayerParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: String | js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value :_*))
  }
}
