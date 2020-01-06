package typings.atEmberArray

import typings.atEmberArray.atEmberArrayMod.Array
import typings.atEmberArray.dashPrivateEnumerableMod.Enumerable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/array/mutable", JSImport.Namespace)
@js.native
object mutableMod extends js.Object {
  /**
    * This mixin defines the API for modifying array-like objects. These methods
    * can be applied only to a collection that keeps its items in an ordered set.
    * It builds upon the Array mixin and adds methods to modify the array.
    * One concrete implementations of this class include ArrayProxy.
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atEmberArray.dashPrivateEnumerableMod.Enumerable because Already inherited
  - typings.atEmberArray.dashPrivateMutableDashEnumerableMod.MutableEnumerable because var conflicts: `[]`, every_Original, filter_Original, find_Original, firstObject, forEach_Original, lastObject, map_Original, reduce_Original. Inlined addObject, addObjects, removeObject, removeObjects */ @js.native
  trait MutableArray[T] extends Array[T] {
    /**
      * __Required.__ You must implement this method to apply this mixin.
      */
    def addObject(`object`: T): T = js.native
    /**
      * Adds each object in the passed enumerable to the receiver.
      */
    def addObjects(objects: Enumerable[T]): this.type = js.native
    /**
      * Remove all elements from the array. This is useful if you
      * want to reuse an existing array without having to recreate it.
      */
    def clear(): this.type = js.native
    /**
      * This will use the primitive `replace()` method to insert an object at the
      * specified index.
      */
    def insertAt(idx: Double, `object`: js.Object): this.type = js.native
    /**
      * Pop object from array or nil if none are left. Works just like `pop()` but
      * it is KVO-compliant.
      */
    def popObject(): T = js.native
    /**
      * Push the object onto the end of the array. Works just like `push()` but it
      * is KVO-compliant.
      */
    def pushObject(obj: T): T = js.native
    /**
      * Add the objects in the passed numerable to the end of the array. Defers
      * notifying observers of the change until all objects are added.
      */
    def pushObjects(objects: Enumerable[T]): this.type = js.native
    /**
      * Remove an object at the specified index using the `replace()` primitive
      * method. You can pass either a single index, or a start and a length.
      */
    def removeAt(start: Double): this.type = js.native
    def removeAt(start: Double, len: Double): this.type = js.native
    /**
      * __Required.__ You must implement this method to apply this mixin.
      */
    def removeObject(`object`: T): T = js.native
    /**
      * Removes each object in the passed enumerable from the receiver.
      */
    def removeObjects(objects: Enumerable[T]): this.type = js.native
    /**
      * __Required.__ You must implement this method to apply this mixin.
      */
    def replace(idx: Double, amt: Double, objects: js.Array[_]): js.Any = js.native
    /**
      * Reverse objects in the array. Works just like `reverse()` but it is
      * KVO-compliant.
      */
    def reverseObjects(): this.type = js.native
    /**
      * Replace all the receiver's content with content of the argument.
      * If argument is an empty array receiver will be cleared.
      */
    def setObjects(objects: Array[T]): this.type = js.native
    /**
      * Shift an object from start of array or nil if none are left. Works just
      * like `shift()` but it is KVO-compliant.
      */
    def shiftObject(): T = js.native
    /**
      * Unshift an object to start of array. Works just like `unshift()` but it is
      * KVO-compliant.
      */
    def unshiftObject(obj: T): T = js.native
    /**
      * Adds the named objects to the beginning of the array. Defers notifying
      * observers until all objects have been added.
      */
    def unshiftObjects(objects: Enumerable[T]): this.type = js.native
  }
  
  val default: typings.atEmberObject.mixinMod.default[MutableArray[js.Any], typings.atEmberObject.atEmberObjectMod.default] = js.native
}

