package typings.framerMotion.anon

import typings.framerMotion.mod.ResolvedValues1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var onUpdate: js.UndefOr[js.Function1[/* latest */ ResolvedValues1, Unit]] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setOnUpdate(value: /* latest */ ResolvedValues1 => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
    
    inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
  }
}
