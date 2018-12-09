package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////////
// Mixins Interfaces
//////////////////////////////////////////////////////////////////////////////
@js.native
trait ICollection[T] extends js.Object {
  /**
  	 * Adds objects to collection, then renders canvas (if `renderOnAddRemove` is not `false`)
  	 * Objects should be instances of (or inherit from) fabric.Object
  	 * @param object Zero or more fabric instances
  	 */
  def add(`object`: Object*): T = js.native
  /**
  	 * Returns number representation of a collection complexity
  	 * @return complexity
  	 */
  def complexity(): scala.Double = js.native
  /**
  	 * Returns true if collection contains an object
  	 * @param object Object to check against
  	 * @return `true` if collection contains an object
  	 */
  def contains(`object`: Object): scala.Boolean = js.native
  /**
  	 * Executes given function for each object in this group
  	 * @param context Context (aka thisObject)
  	 * @return thisArg
  	 */
  def forEachObject(
    callback: js.Function3[
      /* element */ Object, 
      /* index */ scala.Double, 
      /* array */ js.Array[Object], 
      scala.Unit
    ]
  ): T = js.native
  /**
  	 * Executes given function for each object in this group
  	 * @param context Context (aka thisObject)
  	 * @return thisArg
  	 */
  def forEachObject(
    callback: js.Function3[
      /* element */ Object, 
      /* index */ scala.Double, 
      /* array */ js.Array[Object], 
      scala.Unit
    ],
    context: js.Any
  ): T = js.native
  /**
  	 * Returns an array of children objects of this instance
  	 * Type parameter introduced in 1.3.10
  	 * @param [type] When specified, only objects of this type are returned
  	 */
  def getObjects(): js.Array[Object] = js.native
  /**
  	 * Returns an array of children objects of this instance
  	 * Type parameter introduced in 1.3.10
  	 * @param [type] When specified, only objects of this type are returned
  	 */
  def getObjects(`type`: java.lang.String): js.Array[Object] = js.native
  /**
  	 * Inserts an object into collection at specified index, then renders canvas (if `renderOnAddRemove` is not `false`)
  	 * An object should be an instance of (or inherit from) fabric.Object
  	 * @param object Object to insert
  	 * @param index Index to insert object at
  	 * @param nonSplicing When `true`, no splicing (shifting) of objects occurs
  	 * @return thisArg
  	 * @chainable
  	 */
  def insertAt(`object`: Object, index: scala.Double, nonSplicing: scala.Boolean): T = js.native
  /**
  	 * Returns true if collection contains no objects
  	 * @return true if collection is empty
  	 */
  def isEmpty(): scala.Boolean = js.native
  /**
  	 * Returns object at specified index
  	 * @return thisArg
  	 */
  def item(index: scala.Double): T = js.native
  /**
  	 * Removes objects from a collection, then renders canvas (if `renderOnAddRemove` is not `false`)
  	 * @param object Zero or more fabric instances
  	 * @return thisArg
  	 * @chainable
  	 */
  def remove(`object`: Object*): T = js.native
  /**
  	 * Returns a size of a collection (i.e: length of an array containing its objects)
  	 * @return Collection size
  	 */
  def size(): scala.Double = js.native
}

