package typings.gapiDotClientDotTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Orientation extends js.Object {
  /**
    * The id for this orientation.
    * Example: "portrait"
    * @OutputOnly
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * A human-friendly name for this orientation.
    * Example: "portrait"
    * @OutputOnly
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Tags for this dimension.
    * Examples: "default"
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object Orientation {
  @scala.inline
  def apply(id: String = null, name: String = null, tags: js.Array[String] = null): Orientation = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Orientation]
  }
}

