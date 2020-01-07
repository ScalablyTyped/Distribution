package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Guest OS features.
  */
@js.native
trait Schema$GuestOsFeature extends js.Object {
  /**
    * The ID of a supported feature. Read  Enabling guest operating system
    * features to see a list of available options.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$GuestOsFeature {
  @scala.inline
  def apply(`type`: String = null): Schema$GuestOsFeature = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GuestOsFeature]
  }
}

