package typings.framerMotion.distDomEntryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceLabelWithTime extends StObject {
  
  var at: SequenceTime
  
  var name: SequenceLabel
}
object SequenceLabelWithTime {
  
  inline def apply(at: SequenceTime, name: SequenceLabel): SequenceLabelWithTime = {
    val __obj = js.Dynamic.literal(at = at.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceLabelWithTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SequenceLabelWithTime] (val x: Self) extends AnyVal {
    
    inline def setAt(value: SequenceTime): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setName(value: SequenceLabel): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
