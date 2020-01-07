package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A location/region designation for language.
  */
@js.native
trait Schema$Locale extends js.Object {
  /**
    * The id for this locale. Example: &quot;en_US&quot;.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A human-friendly name for this language/locale. Example:
    * &quot;English&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A human-friendly string representing the region for this locale. Example:
    * &quot;United States&quot;. Not present for every locale.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Tags for this dimension. Example: &quot;default&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object Schema$Locale {
  @scala.inline
  def apply(id: String = null, name: String = null, region: String = null, tags: js.Array[String] = null): Schema$Locale = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Locale]
  }
}

