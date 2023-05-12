package typings.eggView

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderOptions
  extends StObject
     with PlainObject[Any] {
  
  var locals: js.UndefOr[PlainObject[Any]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var viewEngine: js.UndefOr[String] = js.undefined
}
object RenderOptions {
  
  inline def apply(): RenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
    
    inline def setLocals(value: PlainObject[Any]): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
    
    inline def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setViewEngine(value: String): Self = StObject.set(x, "viewEngine", value.asInstanceOf[js.Any])
    
    inline def setViewEngineUndefined: Self = StObject.set(x, "viewEngine", js.undefined)
  }
}
