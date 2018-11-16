package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * An unordered iterable collection that cannot contain two instances of the same kind of value.
    * It optionally enforces the type of elements that may be added to the Set.
    */
@JSImport("go", "Set")
@js.native
class Set[T] ()
  extends goLib.goMod.goNs.Set[T] {
  /**
          * This creates a Set that checks the type of the values.
          * @param {function(...)} type this must be a class function/constructor.
          */
  def this(`type`: goLib.goMod.goNs.Constructor) = this()
  /**
          * This creates a Set that may check the types of the values.
          * @param {string=} type if supplied, this must be one of: 'number' or 'string' for the key type.
          */
  def this(`type`: java.lang.String) = this()
  /*This is an interface and thus does not have a constructor.*/
  
  /**Gets an Iterator that can iterate over the items in the collection.*/
  /* CompleteClass */
  override var iterator: goLib.goMod.goNs.Iterator[T] = js.native
}

