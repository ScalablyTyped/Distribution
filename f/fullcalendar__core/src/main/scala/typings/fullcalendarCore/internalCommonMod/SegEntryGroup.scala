package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegEntryGroup extends StObject {
  
  var entries: js.Array[SegEntry]
  
  var span: SegSpan
}
object SegEntryGroup {
  
  inline def apply(entries: js.Array[SegEntry], span: SegSpan): SegEntryGroup = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegEntryGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SegEntryGroup] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: js.Array[SegEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: SegEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setSpan(value: SegSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
  }
}
