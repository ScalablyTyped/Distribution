package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.dexie.mod.IntervalTreeNode
  - typings.dexie.mod.EmptyRange
*/
trait IntervalTree extends StObject
object IntervalTree {
  
  inline def EmptyRange(): typings.dexie.mod.EmptyRange = {
    val __obj = js.Dynamic.literal(d = 0)
    __obj.asInstanceOf[typings.dexie.mod.EmptyRange]
  }
  
  inline def IntervalTreeNode(d: Double, from: IndexableType, to: IndexableType): typings.dexie.mod.IntervalTreeNode = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], l = null, r = null)
    __obj.asInstanceOf[typings.dexie.mod.IntervalTreeNode]
  }
}
