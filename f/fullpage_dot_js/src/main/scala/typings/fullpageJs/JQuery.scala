package typings.fullpageJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def fullpage(): Any
  def fullpage(options: FullPageJsOptions): Any
  @JSName("fullpage")
  var fullpage_Original: FullPageJs
}
object JQuery {
  
  inline def apply(fullpage: FullPageJs): JQuery = {
    val __obj = js.Dynamic.literal(fullpage = fullpage.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setFullpage(value: FullPageJs): Self = StObject.set(x, "fullpage", value.asInstanceOf[js.Any])
  }
}
