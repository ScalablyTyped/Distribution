package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compile extends StObject {
  
  var compile: js.UndefOr[js.Function] = js.undefined
  
  var render: js.UndefOr[js.Function] = js.undefined
}
object Compile {
  
  inline def apply(): Compile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Compile] (val x: Self) extends AnyVal {
    
    inline def setCompile(value: js.Function): Self = StObject.set(x, "compile", value.asInstanceOf[js.Any])
    
    inline def setCompileUndefined: Self = StObject.set(x, "compile", js.undefined)
    
    inline def setRender(value: js.Function): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
  }
}
