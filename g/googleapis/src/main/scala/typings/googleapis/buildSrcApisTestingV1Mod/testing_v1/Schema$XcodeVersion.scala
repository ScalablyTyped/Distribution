package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Xcode version that an iOS version is compatible with.
  */
@js.native
trait Schema$XcodeVersion extends js.Object {
  /**
    * Tags for this Xcode version. Example: &quot;default&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
  /**
    * The id for this version. Example: &quot;9.2&quot;.
    */
  var version: js.UndefOr[String] = js.native
}

object Schema$XcodeVersion {
  @scala.inline
  def apply(tags: js.Array[String] = null, version: String = null): Schema$XcodeVersion = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$XcodeVersion]
  }
}

