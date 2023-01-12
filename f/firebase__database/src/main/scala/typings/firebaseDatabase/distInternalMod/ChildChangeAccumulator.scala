package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildChangeAccumulator extends StObject {
  
  /* private */ val changeMap: Any
  
  def getChanges(): js.Array[Change]
  
  def trackChildChange(change: Change): Unit
}
object ChildChangeAccumulator {
  
  inline def apply(changeMap: Any, getChanges: () => js.Array[Change], trackChildChange: Change => Unit): ChildChangeAccumulator = {
    val __obj = js.Dynamic.literal(changeMap = changeMap.asInstanceOf[js.Any], getChanges = js.Any.fromFunction0(getChanges), trackChildChange = js.Any.fromFunction1(trackChildChange))
    __obj.asInstanceOf[ChildChangeAccumulator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildChangeAccumulator] (val x: Self) extends AnyVal {
    
    inline def setChangeMap(value: Any): Self = StObject.set(x, "changeMap", value.asInstanceOf[js.Any])
    
    inline def setGetChanges(value: () => js.Array[Change]): Self = StObject.set(x, "getChanges", js.Any.fromFunction0(value))
    
    inline def setTrackChildChange(value: Change => Unit): Self = StObject.set(x, "trackChildChange", js.Any.fromFunction1(value))
  }
}
