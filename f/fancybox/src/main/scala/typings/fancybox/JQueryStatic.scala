package typings.fancybox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var fancybox: FancyBoxJQueryMethods
}
object JQueryStatic {
  
  @scala.inline
  def apply(fancybox: FancyBoxJQueryMethods): JQueryStatic = {
    val __obj = js.Dynamic.literal(fancybox = fancybox.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFancybox(value: FancyBoxJQueryMethods): Self = StObject.set(x, "fancybox", value.asInstanceOf[js.Any])
  }
}
