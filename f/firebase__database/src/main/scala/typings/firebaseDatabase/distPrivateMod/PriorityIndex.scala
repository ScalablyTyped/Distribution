package typings.firebaseDatabase.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PriorityIndex
  extends StObject
     with Index
object PriorityIndex {
  
  inline def apply(
    compare: (NamedNode, NamedNode) => Double,
    getCompare: () => Comparator[NamedNode],
    indexedValueChanged: (Node2, Node2) => Boolean,
    isDefinedOn: Node2 => Boolean,
    makePost: (Any, String) => NamedNode,
    maxPost: () => NamedNode,
    minPost: () => NamedNode
  ): PriorityIndex = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), getCompare = js.Any.fromFunction0(getCompare), indexedValueChanged = js.Any.fromFunction2(indexedValueChanged), isDefinedOn = js.Any.fromFunction1(isDefinedOn), makePost = js.Any.fromFunction2(makePost), maxPost = js.Any.fromFunction0(maxPost), minPost = js.Any.fromFunction0(minPost))
    __obj.asInstanceOf[PriorityIndex]
  }
}
