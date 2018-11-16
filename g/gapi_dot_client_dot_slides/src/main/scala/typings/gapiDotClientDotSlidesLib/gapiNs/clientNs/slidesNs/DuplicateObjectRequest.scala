package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DuplicateObjectRequest extends js.Object {
  /** The ID of the object to duplicate. */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The object being duplicated may contain other objects, for example when
               * duplicating a slide or a group page element. This map defines how the IDs
               * of duplicated objects are generated: the keys are the IDs of the original
               * objects and its values are the IDs that will be assigned to the
               * corresponding duplicate object. The ID of the source object's duplicate
               * may be specified in this map as well, using the same value of the
               * `object_id` field as a key and the newly desired ID as the value.
               *
               * All keys must correspond to existing IDs in the presentation. All values
               * must be unique in the presentation and must start with an alphanumeric
               * character or an underscore (matches regex `[a-zA-Z0-9_]`); remaining
               * characters may include those as well as a hyphen or colon (matches regex
               * `[a-zA-Z0-9_-:]`). The length of the new ID must not be less than 5 or
               * greater than 50.
               *
               * If any IDs of source objects are omitted from the map, a new random ID will
               * be assigned. If the map is empty or unset, all duplicate objects will
               * receive a new random ID.
               */
  var objectIds: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

