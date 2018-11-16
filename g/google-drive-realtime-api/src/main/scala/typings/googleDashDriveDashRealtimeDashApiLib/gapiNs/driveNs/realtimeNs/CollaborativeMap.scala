package typings
package googleDashDriveDashRealtimeDashApiLib.gapiNs.driveNs.realtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.drive.realtime.CollaborativeMap")
@js.native
class CollaborativeMap[V] () extends CollaborativeObject {
  var size: scala.Double = js.native
  // Removes all entries.
  def clear(): scala.Unit = js.native
  // Removes the entry for the given key (if such an entry exists).
  // @return the value that was mapped to this key, or null if there was no existing value.
  def delete(key: java.lang.String): V = js.native
  // Returns the value mapped to the given key.
  def get(key: java.lang.String): V = js.native
  // Checks if this map contains an entry for the given key.
  def has(key: java.lang.String): scala.Boolean = js.native
  // Returns whether this map is empty.
  def isEmpty(): scala.Boolean = js.native
  // Returns an array containing a copy of the items in this map. Modifications to the returned array do
  // not modify this collaborative map.
  // @return non-null Array of Arrays, where the inner arrays are tupples [string, V]
  def items(): js.Array[js.Tuple2[java.lang.String, V]] = js.native
  // Returns an array containing a copy of the keys in this map. Modifications to the returned array
  // do not modify this collaborative map.
  def keys(): js.Array[java.lang.String] = js.native
  // Put the value into the map with the given key, overwriting an existing value for that key.
  // @return the old map value, if any, that used to be mapped to the given key.
  def set(key: java.lang.String, value: V): V = js.native
  // Returns an array containing a copy of the values in this map. Modifications to the returned array
  // do not modify this collaborative map.
  def values(): js.Array[V] = js.native
}

@JSGlobal("gapi.drive.realtime.CollaborativeMap")
@js.native
object CollaborativeMap extends js.Object {
  var `type`: googleDashDriveDashRealtimeDashApiLib.googleDashDriveDashRealtimeDashApiLibStrings.Map = js.native
}

