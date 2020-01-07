package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s locale preference.
  */
@js.native
trait Schema$Locale extends js.Object {
  /**
    * Metadata about the locale.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
  /**
    * The well-formed [IETF BCP 47](https://tools.ietf.org/html/bcp47) language
    * tag representing the locale.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$Locale {
  @scala.inline
  def apply(metadata: Schema$FieldMetadata = null, value: String = null): Schema$Locale = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Locale]
  }
}

