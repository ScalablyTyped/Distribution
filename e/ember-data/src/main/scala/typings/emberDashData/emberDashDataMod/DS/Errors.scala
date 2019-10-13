package typings.emberDashData.emberDashDataMod.DS

import typings.atEmberArray.dashPrivateNativeDashArrayMod.NativeArray
import typings.atEmberObject.eventedMod.Evented
import typings.ember.emberMod.Ember.Enumerable
import typings.ember.emberMod.default.ComputedProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds validation errors for a given record, organized by attribute names.
  */
@JSImport("ember-data", "DS.Errors")
@js.native
class Errors ()
  extends typings.atEmberObject.atEmberObjectMod.default
     with Enumerable[js.Any]
     with Evented {
  var isEmpty: ComputedProperty[Boolean, Boolean] = js.native
  /**
    * Total number of errors.
    */
  var length: ComputedProperty[Double, Double] = js.native
  /**
    * An array containing all of the error messages for this
    * record. This is useful for displaying all errors to the user.
    */
  var messages: ComputedProperty[js.Array[_], js.Array[_]] = js.native
  def add(attribute: String, messages: String): js.Any = js.native
  /**
    * DEPRECATED:
    * Adds error messages to a given attribute and sends
    * `becameInvalid` event to the record.
    */
  def add(attribute: String, messages: js.Array[_]): js.Any = js.native
  /**
    * Returns `true` if the passed function returns true for any item in the
    * enumeration.
    */
  /* InferMemberOverrides */
  override def any(callback: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], Boolean]): Boolean = js.native
  /* InferMemberOverrides */
  override def any(
    callback: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], Boolean],
    target: js.Object
  ): Boolean = js.native
  /**
    * DEPRECATED:
    * Removes all error messages and sends `becameValid` event
    * to the record.
    */
  def clear(): js.Any = js.native
  /**
    * Returns a copy of the array with all `null` and `undefined` elements removed.
    */
  /* InferMemberOverrides */
  override def compact(): NativeArray[js.Any] = js.native
  /**
    * @deprecated Use `Enumerable#includes` instead.
    */
  /* InferMemberOverrides */
  override def contains(obj: js.Any): Boolean = js.native
  /**
    * Returns errors for a given attribute
    */
  def errorsFor(attribute: String): js.Array[_] = js.native
  /**
    * Returns `true` if the passed function returns true for every item in the
    * enumeration. This corresponds with the `every()` method in JavaScript 1.6.
    */
  /* InferMemberOverrides */
  override def every(callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], _]): Boolean = js.native
  /**
    * Returns `true` if the passed function returns true for every item in the
    * enumeration. This corresponds with the `every()` method in JavaScript 1.6.
    */
  /* InferMemberOverrides */
  override def every(
    callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], _],
    thisArg: js.Any
  ): Boolean = js.native
  /**
    * Returns an array with all of the items in the enumeration that the passed
    * function returns true for. This method corresponds to `filter()` defined in
    * JavaScript 1.6.
    */
  /* InferMemberOverrides */
  override def filter(callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], _]): js.Array[js.Any] = js.native
  /**
    * Returns an array with all of the items in the enumeration that the passed
    * function returns true for. This method corresponds to `filter()` defined in
    * JavaScript 1.6.
    */
  /* InferMemberOverrides */
  override def filter(
    callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], _],
    thisArg: js.Any
  ): js.Array[js.Any] = js.native
  /**
    * Returns an array with just the items with the matched property. You
    * can pass an optional second argument with the target value. Otherwise
    * this will match any property that evaluates to `true`.
    */
  /* InferMemberOverrides */
  override def filterBy(key: String): NativeArray[js.Any] = js.native
  /* InferMemberOverrides */
  override def filterBy(key: String, value: js.Any): NativeArray[js.Any] = js.native
  /**
    * Returns an array with all of the items in the enumeration that the passed
    * function returns true for. This method corresponds to `filter()` defined in
    * JavaScript 1.6.
    */
  /* InferMemberOverrides */
  @JSName("filter")
  override def filter_S_T[S /* <: js.Any */](
    callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], /* is S */ Boolean]
  ): js.Array[S] = js.native
  /**
    * Returns an array with all of the items in the enumeration that the passed
    * function returns true for. This method corresponds to `filter()` defined in
    * JavaScript 1.6.
    */
  /* InferMemberOverrides */
  @JSName("filter")
  override def filter_S_T[S /* <: js.Any */](
    callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], /* is S */ Boolean],
    thisArg: js.Any
  ): js.Array[S] = js.native
  /**
    * Returns the first item in the array for which the callback returns true.
    * This method works similar to the `filter()` method defined in JavaScript 1.6
    * except that it will stop working on the array once a match is found.
    */
  /* InferMemberOverrides */
  override def find(predicate: js.Function3[js.Any, /* index */ Double, /* obj */ js.Array[js.Any], _]): js.UndefOr[js.Any] = js.native
  /**
    * Returns the first item in the array for which the callback returns true.
    * This method works similar to the `filter()` method defined in JavaScript 1.6
    * except that it will stop working on the array once a match is found.
    */
  /* InferMemberOverrides */
  override def find(
    predicate: js.Function3[js.Any, /* index */ Double, /* obj */ js.Array[js.Any], _],
    thisArg: js.Any
  ): js.UndefOr[js.Any] = js.native
  /**
    * Returns the first item in the array for which the callback returns true.
    * This method works similar to the `filter()` method defined in JavaScript 1.6
    * except that it will stop working on the array once a match is found.
    */
  /* InferMemberOverrides */
  override def find[S /* <: js.Any */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      js.Any, 
      /* index */ Double, 
      /* obj */ js.Array[js.Any], 
      /* is S */ Boolean
    ]
  ): js.UndefOr[S] = js.native
  /**
    * Returns the first item in the array for which the callback returns true.
    * This method works similar to the `filter()` method defined in JavaScript 1.6
    * except that it will stop working on the array once a match is found.
    */
  /* InferMemberOverrides */
  override def find[S /* <: js.Any */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      js.Any, 
      /* index */ Double, 
      /* obj */ js.Array[js.Any], 
      /* is S */ Boolean
    ],
    thisArg: js.Any
  ): js.UndefOr[S] = js.native
  /**
    * Returns the first item with a property matching the passed value. You
    * can pass an optional second argument with the target value. Otherwise
    * this will match any property that evaluates to `true`.
    */
  /* InferMemberOverrides */
  override def findBy(key: String): js.UndefOr[js.Any] = js.native
  /* InferMemberOverrides */
  override def findBy(key: String, value: js.Any): js.UndefOr[js.Any] = js.native
  /**
    * Iterates through the enumerable, calling the passed function on each
    * item. This method corresponds to the `forEach()` method defined in
    * JavaScript 1.6.
    */
  /* InferMemberOverrides */
  override def forEach(callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], Unit]): Unit = js.native
  /**
    * Iterates through the enumerable, calling the passed function on each
    * item. This method corresponds to the `forEach()` method defined in
    * JavaScript 1.6.
    */
  /* InferMemberOverrides */
  override def forEach(
    callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], Unit],
    thisArg: js.Any
  ): Unit = js.native
  /**
    * Alias for `mapBy`
    */
  /* InferMemberOverrides */
  override def getEach(key: String): js.Array[_] = js.native
  /**
    * Returns `true` if the passed object can be found in the enumerable.
    */
  /* InferMemberOverrides */
  override def includes(searchElement: js.Any): Boolean = js.native
  /* InferMemberOverrides */
  override def includes(searchElement: js.Any, fromIndex: Double): Boolean = js.native
  /**
    * Invokes the named method on every object in the receiver that
    * implements it. This method corresponds to the implementation in
    * Prototype 1.6.
    */
  /* InferMemberOverrides */
  override def invoke(methodName: String, args: js.Any*): js.Array[_] = js.native
  /**
    * Returns `true` if the passed property resolves to the value of the second
    * argument for any item in the enumerable. This method is often simpler/faster
    * than using a callback.
    */
  /* InferMemberOverrides */
  override def isAny(key: String): Boolean = js.native
  /* InferMemberOverrides */
  override def isAny(key: String, value: js.Any): Boolean = js.native
  /**
    * Returns `true` if the passed property resolves to the value of the second
    * argument for all items in the enumerable. This method is often simpler/faster
    * than using a callback.
    */
  /* InferMemberOverrides */
  override def isEvery(key: String): Boolean = js.native
  /* InferMemberOverrides */
  override def isEvery(key: String, value: js.Any): Boolean = js.native
  /**
    * Maps all of the items in the enumeration to another value, returning
    * a new array. This method corresponds to `map()` defined in JavaScript 1.6.
    */
  /* InferMemberOverrides */
  override def map[U](callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], U]): js.Array[U] = js.native
  /**
    * Maps all of the items in the enumeration to another value, returning
    * a new array. This method corresponds to `map()` defined in JavaScript 1.6.
    */
  /* InferMemberOverrides */
  override def map[U](
    callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], U],
    thisArg: js.Any
  ): js.Array[U] = js.native
  /**
    * Similar to map, this specialized function returns the value of the named
    * property on all items in the enumeration.
    */
  /* InferMemberOverrides */
  override def mapBy(key: String): js.Array[_] = js.native
  /**
    * This will combine the values of the enumerator into a single value. It
    * is a useful way to collect a summary value from an enumeration. This
    * corresponds to the `reduce()` method defined in JavaScript 1.8.
    */
  /* InferMemberOverrides */
  override def reduce(
    callbackfn: js.Function4[js.Any, js.Any, /* currentIndex */ Double, /* array */ js.Array[js.Any], js.Any]
  ): js.Any = js.native
  /**
    * This will combine the values of the enumerator into a single value. It
    * is a useful way to collect a summary value from an enumeration. This
    * corresponds to the `reduce()` method defined in JavaScript 1.8.
    */
  /* InferMemberOverrides */
  override def reduce(
    callbackfn: js.Function4[js.Any, js.Any, /* currentIndex */ Double, /* array */ js.Array[js.Any], js.Any],
    initialValue: js.Any
  ): js.Any = js.native
  /**
    * This will combine the values of the enumerator into a single value. It
    * is a useful way to collect a summary value from an enumeration. This
    * corresponds to the `reduce()` method defined in JavaScript 1.8.
    */
  /* InferMemberOverrides */
  @JSName("reduce")
  override def reduce_U_U[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      js.Any, 
      /* currentIndex */ Double, 
      /* array */ js.Array[js.Any], 
      U
    ],
    initialValue: U
  ): U = js.native
  /**
    * DEPRECATED:
    * Register with target handler
    */
  def registerHandlers(target: js.Object, becameInvalid: js.Function, becameValid: js.Function): js.Any = js.native
  /**
    * Returns an array with all of the items in the enumeration where the passed
    * function returns false. This method is the inverse of filter().
    */
  /* InferMemberOverrides */
  override def reject(callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], _]): NativeArray[js.Any] = js.native
  /* InferMemberOverrides */
  override def reject(
    callbackfn: js.Function3[js.Any, /* index */ Double, /* array */ js.Array[js.Any], _],
    thisArg: js.Any
  ): NativeArray[js.Any] = js.native
  /**
    * Returns an array with the items that do not have truthy values for
    * key.  You can pass an optional second argument with the target value.  Otherwise
    * this will match any property that evaluates to false.
    */
  /* InferMemberOverrides */
  override def rejectBy(key: String): NativeArray[js.Any] = js.native
  /* InferMemberOverrides */
  override def rejectBy(key: String, value: js.Any): NativeArray[js.Any] = js.native
  /**
    * DEPRECATED:
    * Removes all error messages from the given attribute and sends
    * `becameValid` event to the record if there no more errors left.
    */
  def remove(attribute: String): js.Any = js.native
  /**
    * Sets the value on the named property for each member. This is more
    * ergonomic than using other methods defined on this helper. If the object
    * implements Ember.Observable, the value will be changed to `set(),` otherwise
    * it will be set directly. `null` objects are skipped.
    */
  /* InferMemberOverrides */
  override def setEach(key: String, value: js.Any): js.Any = js.native
  /**
    * Converts the enumerable into an array and sorts by the keys
    * specified in the argument.
    */
  /* InferMemberOverrides */
  override def sortBy(properties: String*): NativeArray[js.Any] = js.native
  /**
    * Simply converts the enumerable into a genuine array. The order is not
    * guaranteed. Corresponds to the method implemented by Prototype.
    */
  /* InferMemberOverrides */
  override def toArray(): js.Array[js.Any] = js.native
  /**
    * Returns a new enumerable that contains only unique values. The default
    * implementation returns an array regardless of the receiver type.
    */
  /* InferMemberOverrides */
  override def uniq(): NativeArray[js.Any] = js.native
  /**
    * Returns a new enumerable that contains only items containing a unique property value.
    * The default implementation returns an array regardless of the receiver type.
    */
  /* InferMemberOverrides */
  override def uniqBy(property: String): NativeArray[js.Any] = js.native
  /**
    * Returns a new enumerable that excludes the passed value. The default
    * implementation returns an array regardless of the receiver type.
    * If the receiver does not contain the value it returns the original enumerable.
    */
  /* InferMemberOverrides */
  override def without(value: js.Any): NativeArray[js.Any] = js.native
}

