package typings.framerMotion.anon

import typings.framerMotion.distDomEntryMod.ResolvedValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnUpdate extends StObject {
  
  var onUpdate: js.UndefOr[js.Function1[/* latest */ ResolvedValues, Unit]] = js.undefined
}
object OnUpdate {
  
  inline def apply(): OnUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnUpdate] (val x: Self) extends AnyVal {
    
    inline def setOnUpdate(value: /* latest */ ResolvedValues => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
    
    inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
  }
}
