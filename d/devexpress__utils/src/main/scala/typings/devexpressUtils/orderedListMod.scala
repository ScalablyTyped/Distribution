package typings.devexpressUtils

import typings.devexpressUtils.typesMod.CmpFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orderedListMod {
  
  @JSImport("@devexpress/utils/lib/class/ordered-list", "OrderedList")
  @js.native
  class OrderedList[T] protected () extends StObject {
    def this(comparer: CmpFunc[T]) = this()
    
    def add(elem: T): this.type = js.native
    
    var comparer: js.Any = js.native
    
    def findElement(elem: T): T | Null = js.native
    
    def findIndex(elem: T): Double = js.native
    
    var list: js.Array[T] = js.native
    
    def sort(): Unit = js.native
  }
}
