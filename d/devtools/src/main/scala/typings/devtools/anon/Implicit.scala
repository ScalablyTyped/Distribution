package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Implicit extends StObject {
  
  var `implicit`: js.UndefOr[Double] = js.undefined
  
  var pageLoad: js.UndefOr[Double] = js.undefined
  
  var script: js.UndefOr[Double] = js.undefined
}
object Implicit {
  
  inline def apply(): Implicit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Implicit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Implicit] (val x: Self) extends AnyVal {
    
    inline def setImplicit(value: Double): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
    
    inline def setImplicitUndefined: Self = StObject.set(x, "implicit", js.undefined)
    
    inline def setPageLoad(value: Double): Self = StObject.set(x, "pageLoad", value.asInstanceOf[js.Any])
    
    inline def setPageLoadUndefined: Self = StObject.set(x, "pageLoad", js.undefined)
    
    inline def setScript(value: Double): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
