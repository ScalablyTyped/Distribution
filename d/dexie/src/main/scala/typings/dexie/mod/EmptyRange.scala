package typings.dexie.mod

import typings.dexie.dexieInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyRange
  extends StObject
     with IntervalTree {
  
  var d: `0`
}
object EmptyRange {
  
  inline def apply(): EmptyRange = {
    val __obj = js.Dynamic.literal(d = 0)
    __obj.asInstanceOf[EmptyRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmptyRange] (val x: Self) extends AnyVal {
    
    inline def setD(value: `0`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
  }
}
