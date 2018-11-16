package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * An ordered iterable collection.
    * It optionally enforces the type of elements that may be added to the List.
    */
@JSImport("go", "List")
@js.native
class List[T] ()
  extends goLib.goMod.goNs.List[T] {
  /**
          * This creates a List that checks the type of the values to be instances of a particular kind of Object.
          * @param {function(...)} type this must be a class function/constructor.
          */
  def this(`type`: goLib.goMod.goNs.Constructor) = this()
  /**
          * This creates a List that may check the types of the values.
          * @param {string=} type if supplied, this must be one of: 'number', 'string', 'boolean', or 'function' for the value type.
          */
  def this(`type`: java.lang.String) = this()
  /*This is an interface and thus does not have a constructor.*/
  
  /**Gets an Iterator that can iterate over the items in the collection.*/
  /* CompleteClass */
  override var iterator: goLib.goMod.goNs.Iterator[T] = js.native
}

