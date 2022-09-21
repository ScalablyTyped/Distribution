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
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setFullpage(value: FullPageJsMethods): Self = StObject.set(x, "fullpage", value.asInstanceOf[js.Any])
  }
}
