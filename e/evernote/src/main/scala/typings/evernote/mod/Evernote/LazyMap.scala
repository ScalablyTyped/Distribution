package typings.evernote.mod.Evernote

import org.scalablytyped.runtime.StringDictionary
import typings.evernote.AnonFullMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structure that wraps a map of name/value pairs whose values are not
  * always present in the structure in order to reduce space when obtaining
  * batches of entities that contain the map.
  *
  * When the server provides the client with a LazyMap, it will fill in either
  * the keysOnly field or the fullMap field, but never both, based on the API
  * and parameters.
  *
  * When a client provides a LazyMap to the server as part of an update to
  * an object, the server will only update the LazyMap if the fullMap field is
  * set. If the fullMap field is not set, the server will not make any changes
  * to the map.
  *
  * Check the API documentation of the individual calls involving the LazyMap
  * for full details including the constraints of the names and values of the
  * map.
  *
  * <dl>
  * <dt>keysOnly</dt>
  *     <dd>The set of keys for the map.    This field is ignored by the
  *             server when set.
  *     </dd>
  *
  * <dt>fullMap</dt>
  *     <dd>The complete map, including all keys and values.
  *     </dd>
  * </dl>
  */
@JSImport("evernote", "Evernote.LazyMap")
@js.native
class LazyMap () extends js.Object {
  def this(args: AnonFullMap) = this()
  var fullMap: StringDictionary[String] = js.native
  var keysOnly: js.Array[String] = js.native
}

