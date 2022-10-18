package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  def compare(a: NamedNode, b: NamedNode): Double
  
  /**
    * @returns A standalone comparison function for
    * this index
    */
  def getCompare(): Comparator[NamedNode]
  
  /**
    * Given a before and after value for a node, determine if the indexed value has changed. Even if they are different,
    * it's possible that the changes are isolated to parts of the snapshot that are not indexed.
    *
    *
    * @returns True if the portion of the snapshot being indexed changed between oldNode and newNode
    */
  def indexedValueChanged(oldNode: Node2, newNode: Node2): Boolean
  
  def isDefinedOn(node: Node2): Boolean
  
  def makePost(indexValue: Any, name: String): NamedNode
  
  /**
    * @returns a node wrapper that will sort greater than or equal to
    * any other node wrapper, using this index
    */
  def maxPost(): NamedNode
  
  /**
    * @returns a node wrapper that will sort equal to or less than
    * any other node wrapper, using this index
    */
  def minPost(): NamedNode
}
object Index {
  
  inline def apply(
    compare: (NamedNode, NamedNode) => Double,
    getCompare: () => Comparator[NamedNode],
    indexedValueChanged: (Node2, Node2) => Boolean,
    isDefinedOn: Node2 => Boolean,
    makePost: (Any, String) => NamedNode,
    maxPost: () => NamedNode,
    minPost: () => NamedNode
  ): Index = {
    val __obj = js.Dynamic.literal(compare = js.Any.fromFunction2(compare), getCompare = js.Any.fromFunction0(getCompare), indexedValueChanged = js.Any.fromFunction2(indexedValueChanged), isDefinedOn = js.Any.fromFunction1(isDefinedOn), makePost = js.Any.fromFunction2(makePost), maxPost = js.Any.fromFunction0(maxPost), minPost = js.Any.fromFunction0(minPost))
    __obj.asInstanceOf[Index]
  }
  
  extension [Self <: Index](x: Self) {
    
    inline def setCompare(value: (NamedNode, NamedNode) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
    
    inline def setGetCompare(value: () => Comparator[NamedNode]): Self = StObject.set(x, "getCompare", js.Any.fromFunction0(value))
    
    inline def setIndexedValueChanged(value: (Node2, Node2) => Boolean): Self = StObject.set(x, "indexedValueChanged", js.Any.fromFunction2(value))
    
    inline def setIsDefinedOn(value: Node2 => Boolean): Self = StObject.set(x, "isDefinedOn", js.Any.fromFunction1(value))
    
    inline def setMakePost(value: (Any, String) => NamedNode): Self = StObject.set(x, "makePost", js.Any.fromFunction2(value))
    
    inline def setMaxPost(value: () => NamedNode): Self = StObject.set(x, "maxPost", js.Any.fromFunction0(value))
    
    inline def setMinPost(value: () => NamedNode): Self = StObject.set(x, "minPost", js.Any.fromFunction0(value))
  }
}
