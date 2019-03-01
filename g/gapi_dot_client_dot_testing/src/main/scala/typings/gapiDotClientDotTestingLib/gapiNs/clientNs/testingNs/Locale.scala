package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  /**
    * The id for this locale.
    * Example: "en_US"
    * @OutputOnly
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A human-friendly name for this language/locale.
    * Example: "English"
    * @OutputOnly
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A human-friendy string representing the region for this locale.
    * Example: "United States"
    * Not present for every locale.
    * @OutputOnly
    */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Tags for this dimension.
    * Examples: "default"
    */
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Locale {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    name: java.lang.String = null,
    region: java.lang.String = null,
    tags: js.Array[java.lang.String] = null
  ): Locale = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (region != null) __obj.updateDynamic("region")(region)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[Locale]
  }
}

