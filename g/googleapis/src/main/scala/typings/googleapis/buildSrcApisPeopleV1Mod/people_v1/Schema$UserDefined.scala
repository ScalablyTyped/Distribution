package typings.googleapis.buildSrcApisPeopleV1Mod.people_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Arbitrary user data that is populated by the end users.
  */
@js.native
trait Schema$UserDefined extends js.Object {
  /**
    * The end user specified key of the user defined data.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Metadata about the user defined data.
    */
  var metadata: js.UndefOr[Schema$FieldMetadata] = js.native
  /**
    * The end user specified value of the user defined data.
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$UserDefined {
  @scala.inline
  def apply(key: String = null, metadata: Schema$FieldMetadata = null, value: String = null): Schema$UserDefined = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserDefined]
  }
}

