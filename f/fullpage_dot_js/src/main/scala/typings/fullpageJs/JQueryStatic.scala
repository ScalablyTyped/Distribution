package typings.fullpageJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def fullpage(): js.Any
  def fullpage(options: FullPageJsOptions): js.Any
  @JSName("fullpage")
  var fullpage_Original: FullPageJsMethods
}
object JQueryStatic {
  
  @scala.inline
  def apply(fullpage: FullPageJsMethods): JQueryStatic = {
    val __obj = js.Dynamic.literal(fullpage = fullpage.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullpage(value: FullPageJsMethods): Self = StObject.set(x, "fullpage", value.asInstanceOf[js.Any])
  }
}
