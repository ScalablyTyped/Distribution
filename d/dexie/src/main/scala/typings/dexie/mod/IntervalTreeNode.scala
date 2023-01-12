package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntervalTreeNode
  extends StObject
     with IntervalTree {
  
  // right
  var d: Double
  
  var from: IndexableType
  
  // upper bound
  var l: IntervalTreeNode | Null
  
  // left
  var r: IntervalTreeNode | Null
  
  // lower bound
  var to: IndexableType
}
object IntervalTreeNode {
  
  inline def apply(d: Double, from: IndexableType, to: IndexableType): IntervalTreeNode = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], l = null, r = null)
    __obj.asInstanceOf[IntervalTreeNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntervalTreeNode] (val x: Self) extends AnyVal {
    
    inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: IndexableType): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromVarargs(value: (js.Array[Unit] | IndexableTypePart)*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setL(value: IntervalTreeNode): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setLNull: Self = StObject.set(x, "l", null)
    
    inline def setR(value: IntervalTreeNode): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRNull: Self = StObject.set(x, "r", null)
    
    inline def setTo(value: IndexableType): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToVarargs(value: (js.Array[Unit] | IndexableTypePart)*): Self = StObject.set(x, "to", js.Array(value*))
  }
}
