package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Placeholder extends js.Object {
  /**
    * The index of the placeholder. If the same placeholder types are present in
    * the same page, they would have different index values.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * The object ID of this shape's parent placeholder.
    * If unset, the parent placeholder shape does not exist, so the shape does
    * not inherit properties from any other shape.
    */
  var parentObjectId: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the placeholder. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

