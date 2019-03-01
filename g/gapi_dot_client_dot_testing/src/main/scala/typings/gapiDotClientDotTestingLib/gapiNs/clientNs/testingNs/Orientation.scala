package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Orientation extends js.Object {
  /**
    * The id for this orientation.
    * Example: "portrait"
    * @OutputOnly
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A human-friendly name for this orientation.
    * Example: "portrait"
    * @OutputOnly
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Tags for this dimension.
    * Examples: "default"
    */
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Orientation {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    name: java.lang.String = null,
    tags: js.Array[java.lang.String] = null
  ): Orientation = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Orientation]
  }
}

