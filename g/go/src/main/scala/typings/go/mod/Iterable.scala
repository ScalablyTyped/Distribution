package typings.go.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface is implemented by the List, Set, and Map
  * classes; it provides the .iterator read-only property that returns an Iterator.
  */
@JSImport("go", "Iterable")
@js.native
class Iterable[T] () extends StObject {
  
  /*This is an interface and thus does not have a constructor.*/
  /**Gets an Iterator that can iterate over the items in the collection.*/
  var iterator: Iterator[T] = js.native
}
