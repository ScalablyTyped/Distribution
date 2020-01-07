package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a domain.
  */
@js.native
trait Schema$Domain extends js.Object {
  /**
    * An opaque string used to identify this domain.
    */
  var legacyId: js.UndefOr[String] = js.native
  /**
    * The name of the domain, e.g. &quot;google.com&quot;.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$Domain {
  @scala.inline
  def apply(legacyId: String = null, name: String = null): Schema$Domain = {
    val __obj = js.Dynamic.literal()
    if (legacyId != null) __obj.updateDynamic("legacyId")(legacyId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Domain]
  }
}

