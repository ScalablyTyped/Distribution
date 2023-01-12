package typings.fullpageJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def fullpage(): Any
  def fullpage(options: FullPageJsOptions): Any
  @JSName("fullpage")
  var fullpage_Original: FullPageJsMethods
}
object JQueryStatic {
  
  inline def apply(fullpage: FullPageJsMethods): JQueryStatic = {
    val __obj = js.Dynamic.literal(fullpage = fullpage.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    inline def setFullpage(value: FullPageJsMethods): Self = StObject.set(x, "fullpage", value.asInstanceOf[js.Any])
  }
}
