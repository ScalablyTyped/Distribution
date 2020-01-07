package typings.googleapis.buildSrcApisStreetviewpublishV1Mod.streetviewpublish_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Place metadata for an entity.
  */
@js.native
trait Schema$Place extends js.Object {
  /**
    * Output-only. The language_code that the name is localized with. This
    * should be the language_code specified in the request, but may be a
    * fallback.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Output-only. The name of the place, localized to the language_code.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Place identifier, as described in
    * https://developers.google.com/places/place-id.
    */
  var placeId: js.UndefOr[String] = js.native
}

object Schema$Place {
  @scala.inline
  def apply(languageCode: String = null, name: String = null, placeId: String = null): Schema$Place = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (placeId != null) __obj.updateDynamic("placeId")(placeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Place]
  }
}

