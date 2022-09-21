package typings.firebaseDatabase.privateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Since updates to filtered nodes might require nodes to be pulled in from "outside" the node, this interface
  * can help to get complete children that can be pulled in.
  * A class implementing this interface takes potentially multiple sources (e.g. user writes, server data from
  * other views etc.) to try it's best to get a complete child that might be useful in pulling into the view.
  *
  * @interface
  */
trait CompleteChildSource extends StObject {
  
  def getChildAfterChild(index: Index, child: NamedNode, reverse: Boolean): NamedNode | Null
  
  def getCompleteChild(childKey: String): Node2 | Null
}
object CompleteChildSource {
  
  inline def apply(
    getChildAfterChild: (Index, NamedNode, Boolean) => NamedNode | Null,
    getCompleteChild: String => Node2 | Null
  ): CompleteChildSource = {
    val __obj = js.Dynamic.literal(getChildAfterChild = js.Any.fromFunction3(getChildAfterChild), getCompleteChild = js.Any.fromFunction1(getCompleteChild))
    __obj.asInstanceOf[CompleteChildSource]
  }
  
  extension [Self <: CompleteChildSource](x: Self) {
    
    inline def setGetChildAfterChild(value: (Index, NamedNode, Boolean) => NamedNode | Null): Self = StObject.set(x, "getChildAfterChild", js.Any.fromFunction3(value))
    
    inline def setGetCompleteChild(value: String => Node2 | Null): Self = StObject.set(x, "getCompleteChild", js.Any.fromFunction1(value))
  }
}
