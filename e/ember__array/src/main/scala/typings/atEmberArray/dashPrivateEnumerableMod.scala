package typings.atEmberArray

import typings.atEmberArray.dashPrivateNativeDashArrayMod.NativeArray
import typings.atEmberObject.computedMod.ComputedProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/array/-private/enumerable", JSImport.Namespace)
@js.native
object dashPrivateEnumerableMod extends js.Object {
  /**
    * This mixin defines the common interface implemented by enumerable objects
    * in Ember. Most of these methods follow the standard Array iteration
    * API defined up to JavaScript 1.8 (excluding language-specific features that
    * cannot be emulated in older versions of JavaScript).
    */
  @js.native
  trait Enumerable[T] extends js.Object {
    /**
      * This is the handler for the special array content property. If you get
      * this property, it will return this. If you set this property to a new
      * array, it will replace the current content.
      */
    var `[]`: ComputedProperty[this.type, this.type] = js.native
    /**
      * Returns `true` if the passed function returns true for every item in the
      * enumeration. This corresponds with the `every()` method in JavaScript 1.6.
      */
    @JSName("every")
    var every_Original: Fn_ArrayCallbackfnIndexThisArg[T] = js.native
    /**
      * Returns an array with all of the items in the enumeration that the passed
      * function returns true for. This method corresponds to `filter()` defined in
      * JavaScript 1.6.
      */
    @JSName("filter")
    var filter_Original: Fn_ArrayCallbackfnIndex[T] = js.native
    /**
      * Returns the first item in the array for which the callback returns true.
      * This method works similar to the `filter()` method defined in JavaScript 1.6
      * except that it will stop working on the array once a match is found.
      */
    @JSName("find")
    var find_Original: Fn_Index[T] = js.native
    /**
      * Helper method returns the first object from a collection. This is usually
      * used by bindings and other parts of the framework to extract a single
      * object if the enumerable contains only one item.
      */
    var firstObject: ComputedProperty[js.UndefOr[T], js.UndefOr[T]] = js.native
    /**
      * Iterates through the enumerable, calling the passed function on each
      * item. This method corresponds to the `forEach()` method defined in
      * JavaScript 1.6.
      */
    @JSName("forEach")
    var forEach_Original: Fn_Array[T] = js.native
    /**
      * Helper method returns the last object from a collection. If your enumerable
      * contains only one object, this method should always return that object.
      * If your enumerable is empty, this method should return `undefined`.
      */
    var lastObject: ComputedProperty[js.UndefOr[T], js.UndefOr[T]] = js.native
    /**
      * Maps all of the items in the enumeration to another value, returning
      * a new array. This method corresponds to `map()` defined in JavaScript 1.6.
      */
    @JSName("map")
    var map_Original: Fn_ArrayCallbackfn[T] = js.native
    /**
      * This will combine the values of the enumerator into a single value. It
      * is a useful way to collect a summary value from an enumeration. This
      * corresponds to the `reduce()` method defined in JavaScript 1.8.
      */
    @JSName("reduce")
    var reduce_Original: Fn_ArrayCallbackfnCurrentIndex[T] = js.native
    /**
      * Returns `true` if the passed function returns true for any item in the
      * enumeration.
      */
    def any(callback: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): Boolean = js.native
    def any(
      callback: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
      target: js.Object
    ): Boolean = js.native
    /**
      * Returns a copy of the array with all `null` and `undefined` elements removed.
      */
    def compact(): NativeArray[T] = js.native
    /**
      * @deprecated Use `Enumerable#includes` instead.
      */
    def contains(obj: T): Boolean = js.native
    /**
      * Returns `true` if the passed function returns true for every item in the
      * enumeration. This corresponds with the `every()` method in JavaScript 1.6.
      */
    def every(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _]): Boolean = js.native
    /**
      * Returns `true` if the passed function returns true for every item in the
      * enumeration. This corresponds with the `every()` method in JavaScript 1.6.
      */
    def every(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _],
      thisArg: js.Any
    ): Boolean = js.native
    /**
      * Returns an array with all of the items in the enumeration that the passed
      * function returns true for. This method corresponds to `filter()` defined in
      * JavaScript 1.6.
      */
    def filter(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _]): js.Array[T] = js.native
    /**
      * Returns an array with all of the items in the enumeration that the passed
      * function returns true for. This method corresponds to `filter()` defined in
      * JavaScript 1.6.
      */
    def filter(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _],
      thisArg: js.Any
    ): js.Array[T] = js.native
    /**
      * Returns an array with just the items with the matched property. You
      * can pass an optional second argument with the target value. Otherwise
      * this will match any property that evaluates to `true`.
      */
    def filterBy(key: String): NativeArray[T] = js.native
    def filterBy(key: String, value: js.Any): NativeArray[T] = js.native
    /**
      * Returns an array with all of the items in the enumeration that the passed
      * function returns true for. This method corresponds to `filter()` defined in
      * JavaScript 1.6.
      */
    @JSName("filter")
    def filter_S_T[S /* <: T */](
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], /* is S */ Boolean]
    ): js.Array[S] = js.native
    /**
      * Returns an array with all of the items in the enumeration that the passed
      * function returns true for. This method corresponds to `filter()` defined in
      * JavaScript 1.6.
      */
    @JSName("filter")
    def filter_S_T[S /* <: T */](
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], /* is S */ Boolean],
      thisArg: js.Any
    ): js.Array[S] = js.native
    /**
      * Returns the first item in the array for which the callback returns true.
      * This method works similar to the `filter()` method defined in JavaScript 1.6
      * except that it will stop working on the array once a match is found.
      */
    def find(predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ js.Array[T], _]): js.UndefOr[T] = js.native
    /**
      * Returns the first item in the array for which the callback returns true.
      * This method works similar to the `filter()` method defined in JavaScript 1.6
      * except that it will stop working on the array once a match is found.
      */
    def find(
      predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ js.Array[T], _],
      thisArg: js.Any
    ): js.UndefOr[T] = js.native
    /**
      * Returns the first item in the array for which the callback returns true.
      * This method works similar to the `filter()` method defined in JavaScript 1.6
      * except that it will stop working on the array once a match is found.
      */
    def find[S /* <: T */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ T, 
          /* index */ Double, 
          /* obj */ js.Array[T], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    /**
      * Returns the first item in the array for which the callback returns true.
      * This method works similar to the `filter()` method defined in JavaScript 1.6
      * except that it will stop working on the array once a match is found.
      */
    def find[S /* <: T */](
      predicate: js.ThisFunction3[
          /* this */ Unit, 
          /* value */ T, 
          /* index */ Double, 
          /* obj */ js.Array[T], 
          /* is S */ Boolean
        ],
      thisArg: js.Any
    ): js.UndefOr[S] = js.native
    /**
      * Returns the first item with a property matching the passed value. You
      * can pass an optional second argument with the target value. Otherwise
      * this will match any property that evaluates to `true`.
      */
    def findBy(key: String): js.UndefOr[T] = js.native
    def findBy(key: String, value: js.Any): js.UndefOr[T] = js.native
    /**
      * Iterates through the enumerable, calling the passed function on each
      * item. This method corresponds to the `forEach()` method defined in
      * JavaScript 1.6.
      */
    def forEach(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]): Unit = js.native
    /**
      * Iterates through the enumerable, calling the passed function on each
      * item. This method corresponds to the `forEach()` method defined in
      * JavaScript 1.6.
      */
    def forEach(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit],
      thisArg: js.Any
    ): Unit = js.native
    /**
      * Alias for `mapBy`
      */
    def getEach(key: String): js.Array[_] = js.native
    /**
      * Returns `true` if the passed object can be found in the enumerable.
      */
    def includes(searchElement: T): Boolean = js.native
    def includes(searchElement: T, fromIndex: Double): Boolean = js.native
    /**
      * Invokes the named method on every object in the receiver that
      * implements it. This method corresponds to the implementation in
      * Prototype 1.6.
      */
    def invoke(methodName: String, args: js.Any*): js.Array[_] = js.native
    /**
      * Returns `true` if the passed property resolves to the value of the second
      * argument for any item in the enumerable. This method is often simpler/faster
      * than using a callback.
      */
    def isAny(key: String): Boolean = js.native
    def isAny(key: String, value: js.Any): Boolean = js.native
    /**
      * Returns `true` if the passed property resolves to the value of the second
      * argument for all items in the enumerable. This method is often simpler/faster
      * than using a callback.
      */
    def isEvery(key: String): Boolean = js.native
    def isEvery(key: String, value: js.Any): Boolean = js.native
    /**
      * Maps all of the items in the enumeration to another value, returning
      * a new array. This method corresponds to `map()` defined in JavaScript 1.6.
      */
    def map[U](callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], U]): js.Array[U] = js.native
    /**
      * Maps all of the items in the enumeration to another value, returning
      * a new array. This method corresponds to `map()` defined in JavaScript 1.6.
      */
    def map[U](
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    /**
      * Similar to map, this specialized function returns the value of the named
      * property on all items in the enumeration.
      */
    def mapBy(key: String): js.Array[_] = js.native
    /**
      * This will combine the values of the enumerator into a single value. It
      * is a useful way to collect a summary value from an enumeration. This
      * corresponds to the `reduce()` method defined in JavaScript 1.8.
      */
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          T
        ]
    ): T = js.native
    /**
      * This will combine the values of the enumerator into a single value. It
      * is a useful way to collect a summary value from an enumeration. This
      * corresponds to the `reduce()` method defined in JavaScript 1.8.
      */
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          T
        ],
      initialValue: T
    ): T = js.native
    /**
      * This will combine the values of the enumerator into a single value. It
      * is a useful way to collect a summary value from an enumeration. This
      * corresponds to the `reduce()` method defined in JavaScript 1.8.
      */
    @JSName("reduce")
    def reduce_U_U[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ js.Array[T], 
          U
        ],
      initialValue: U
    ): U = js.native
    /**
      * Returns an array with all of the items in the enumeration where the passed
      * function returns false. This method is the inverse of filter().
      */
    def reject(callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _]): NativeArray[T] = js.native
    def reject(
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _],
      thisArg: js.Any
    ): NativeArray[T] = js.native
    /**
      * Returns an array with the items that do not have truthy values for
      * key.  You can pass an optional second argument with the target value.  Otherwise
      * this will match any property that evaluates to false.
      */
    def rejectBy(key: String): NativeArray[T] = js.native
    def rejectBy(key: String, value: js.Any): NativeArray[T] = js.native
    /**
      * Sets the value on the named property for each member. This is more
      * ergonomic than using other methods defined on this helper. If the object
      * implements Ember.Observable, the value will be changed to `set(),` otherwise
      * it will be set directly. `null` objects are skipped.
      */
    def setEach(key: String, value: js.Any): js.Any = js.native
    /**
      * Converts the enumerable into an array and sorts by the keys
      * specified in the argument.
      */
    def sortBy(properties: String*): NativeArray[T] = js.native
    /**
      * Simply converts the enumerable into a genuine array. The order is not
      * guaranteed. Corresponds to the method implemented by Prototype.
      */
    def toArray(): js.Array[T] = js.native
    /**
      * Returns a new enumerable that contains only unique values. The default
      * implementation returns an array regardless of the receiver type.
      */
    def uniq(): NativeArray[T] = js.native
    /**
      * Returns a new enumerable that contains only items containing a unique property value.
      * The default implementation returns an array regardless of the receiver type.
      */
    def uniqBy(property: String): NativeArray[T] = js.native
    /**
      * Returns a new enumerable that excludes the passed value. The default
      * implementation returns an array regardless of the receiver type.
      * If the receiver does not contain the value it returns the original enumerable.
      */
    def without(value: T): NativeArray[T] = js.native
  }
  
  val default: typings.atEmberObject.mixinMod.default[Enumerable[js.Any], typings.atEmberObject.atEmberObjectMod.default] = js.native
}

