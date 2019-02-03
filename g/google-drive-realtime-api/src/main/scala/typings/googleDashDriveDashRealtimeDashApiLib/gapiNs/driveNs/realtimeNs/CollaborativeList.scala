package typings
package googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.drive.realtime.CollaborativeList")
@js.native
class CollaborativeList[V] () extends CollaborativeObject {
  // The number of entries in the list. Assign to this field to reduce the size of the list.
  // Note that the length given must be less than or equal to the current size.
  // The length of a list cannot be extended in this way.
  var length: scala.Double = js.native
  // Returns a copy of the contents of this collaborative list as an array.
  // Changes to the returned object will not affect the original collaborative list.
  def asArray(): js.Array[V] = js.native
  // Removes all values from the list.
  def clear(): scala.Unit = js.native
  // Gets the value at the given index.
  def get(ind: scala.Double): V = js.native
  //Returns the first index of the given value, or -1 if it cannot be found.
  def indexOf(value: V): scala.Double = js.native
  def indexOf(value: V, opt_comparatorFn: js.Function2[/* x1 */ V, /* x2 */ V, scala.Boolean]): scala.Double = js.native
  //Inserts an item into the list at a given index.
  def insert(index: scala.Double, value: V): scala.Unit = js.native
  // Inserts a list of items into the list at a given index.
  def insertAll(index: scala.Double, values: js.Array[V]): scala.Unit = js.native
  // Returns the last index of the given value, or -1 if it cannot be found.
  def lastIndexOf(value: V): scala.Double = js.native
  def lastIndexOf(value: V, opt_comparatorFn: js.Function2[/* x1 */ V, /* x2 */ V, scala.Boolean]): scala.Double = js.native
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
  def move(index: scala.Double, destinationIndex: scala.Double): scala.Unit = js.native
  // Moves a single element in this list (at index) to immediately before destinationIndex in the list destination.
  // Both indices are with respect to the position of elements before the move.
  // If the provided destination is this list, this function is identical to move(index, destinationIndex).
  def moveToList(index: scala.Double, destination: CollaborativeList[V], destinationIndex: scala.Double): scala.Unit = js.native
  // Adds an item to the end of the list.
  // @return the new length of the list
  def push(value: V): scala.Double = js.native
  // Adds an array of values to the end of the list.
  def pushAll(values: js.Array[V]): scala.Unit = js.native
  // Creates an IndexReference at the given index. If canBeDeleted is true, then a delete over the index will delete
  // the reference. Otherwise the reference will shift to the beginning of the deleted range.
  def registerReference(index: scala.Double, canBeDeleted: scala.Boolean): IndexReference[CollaborativeList[V]] = js.native
  // Removes the item at the given index from the list.
  def remove(index: scala.Double): scala.Unit = js.native
  // Removes the items between startIndex (inclusive) and endIndex (exclusive).
  def removeRange(startIndex: scala.Double, endIndex: scala.Double): scala.Unit = js.native
  // Removes the first instance of the given value from the list.
  // @return whether the item was removed
  def removeValue(value: V): scala.Boolean = js.native
  // Replaces items in the list with the given items, starting at the given index.
  def replaceRange(index: scala.Double, values: js.Array[V]): scala.Unit = js.native
  // Sets the item at the given index
  def set(index: scala.Double, value: V): scala.Unit = js.native
}

/* static members */
@JSGlobal("gapi.drive.realtime.CollaborativeList")
@js.native
object CollaborativeList extends js.Object {
  var `type`: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.List = js.native
}

