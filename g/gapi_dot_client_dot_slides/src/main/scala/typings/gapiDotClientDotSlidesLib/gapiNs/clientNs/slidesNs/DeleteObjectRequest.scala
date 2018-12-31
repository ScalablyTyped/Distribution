package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteObjectRequest extends js.Object {
  /**
    * The object ID of the page or page element to delete.
    *
    * If after a delete operation a group contains
    * only 1 or no page elements, the group is also deleted.
    *
    * If a placeholder is deleted on a layout, any empty inheriting shapes are
    * also deleted.
    */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
}

