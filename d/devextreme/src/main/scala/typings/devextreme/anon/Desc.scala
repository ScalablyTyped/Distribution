package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Desc extends StObject {
  
  var desc: js.UndefOr[Boolean] = js.undefined
}
object Desc {
  
  inline def apply(): Desc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Desc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Desc] (val x: Self) extends AnyVal {
    
    inline def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
  }
}
