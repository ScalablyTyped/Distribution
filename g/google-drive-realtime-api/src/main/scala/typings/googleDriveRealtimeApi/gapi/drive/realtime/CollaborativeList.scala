package typings.googleDriveRealtimeApi.gapi.drive.realtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollaborativeList[V] extends CollaborativeObject {
  // The number of entries in the list. Assign to this field to reduce the size of the list.
  // Note that the length given must be less than or equal to the current size.
  // The length of a list cannot be extended in this way.
  var length: Double = js.native
  // Returns a copy of the contents of this collaborative list as an array.
  // Changes to the returned object will not affect the original collaborative list.
  def asArray(): js.Array[V] = js.native
  // Removes all values from the list.
  def clear(): Unit = js.native
  // Gets the value at the given index.
  def get(ind: Double): V = js.native
  //Returns the first index of the given value, or -1 if it cannot be found.
  def indexOf(value: V): Double = js.native
  def indexOf(value: V, opt_comparatorFn: js.Function2[/* x1 */ V, /* x2 */ V, Boolean]): Double = js.native
  //Inserts an item into the list at a given index.
  def insert(index: Double, value: V): Unit = js.native
  // Inserts a list of items into the list at a given index.
  def insertAll(index: Double, values: js.Array[V]): Unit = js.native
  // Returns the last index of the given value, or -1 if it cannot be found.
  def lastIndexOf(value: V): Double = js.native
  def lastIndexOf(value: V, opt_comparatorFn: js.Function2[/* x1 */ V, /* x2 */ V, Boolean]): Double = js.native
  //Moves a single element in this list (at index) to immediately before destinationIndex.
  //Both indices are with respect to the position of elements before the move.
  //For example, given the list: ['A', 'B', 'C']
  //move(0, 0) is a no-op
  //move(0, 1) is a no-op
  //move(0, 2) yields ['B', 'A', 'C'] ('A' is moved to immediately before 'C')
  //move(0, 3) yields ['B', 'C', 'A'] ('A' is moved to immediately before an imaginary element after the list end)
  //move(1, 0) yields ['B', 'A', 'C'] ('B' is moved to immediately before 'A')
  //move(1, 1) is a no-op
  //move(1, 2) is a no-op
  //move(1, 3) yields ['A', 'C', 'B'] ('B' is moved to immediately before an imaginary element after the list end)
  def move(index: Double, destinationIndex: Double): Unit = js.native
  // Moves a single element in this list (at index) to immediately before destinationIndex in the list destination.
  // Both indices are with respect to the position of elements before the move.
  // If the provided destination is this list, this function is identical to move(index, destinationIndex).
  def moveToList(index: Double, destination: CollaborativeList[V], destinationIndex: Double): Unit = js.native
  // Adds an item to the end of the list.
  // @return the new length of the list
  def push(value: V): Double = js.native
  // Adds an array of values to the end of the list.
  def pushAll(values: js.Array[V]): Unit = js.native
  // Creates an IndexReference at the given index. If canBeDeleted is true, then a delete over the index will delete
  // the reference. Otherwise the reference will shift to the beginning of the deleted range.
  def registerReference(index: Double, canBeDeleted: Boolean): IndexReference[CollaborativeList[V]] = js.native
  // Removes the item at the given index from the list.
  def remove(index: Double): Unit = js.native
  // Removes the items between startIndex (inclusive) and endIndex (exclusive).
  def removeRange(startIndex: Double, endIndex: Double): Unit = js.native
  // Removes the first instance of the given value from the list.
  // @return whether the item was removed
  def removeValue(value: V): Boolean = js.native
  // Replaces items in the list with the given items, starting at the given index.
  def replaceRange(index: Double, values: js.Array[V]): Unit = js.native
  // Sets the item at the given index
  def set(index: Double, value: V): Unit = js.native
}

