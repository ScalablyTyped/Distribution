package typings.fortawesomeFontawesomeSvgCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Params extends StObject {
  
  var attributes: js.UndefOr[Attributes] = js.native
  
  var classes: js.UndefOr[String | js.Array[String]] = js.native
  
  var styles: js.UndefOr[Styles] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleId: js.UndefOr[String] = js.native
}
object Params {
  
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  
  @scala.inline
  implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setClasses(value: String | js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: Styles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleId(value: String): Self = StObject.set(x, "titleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleIdUndefined: Self = StObject.set(x, "titleId", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
