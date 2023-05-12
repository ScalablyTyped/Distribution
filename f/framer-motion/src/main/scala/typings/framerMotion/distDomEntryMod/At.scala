package typings.framerMotion.distDomEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait At extends StObject {
  
  var at: js.UndefOr[SequenceTime] = js.undefined
}
object At {
  
  inline def apply(): At = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[At]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: At] (val x: Self) extends AnyVal {
    
    inline def setAt(value: SequenceTime): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
  }
}
