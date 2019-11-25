package typings.gapiDotClientDotAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EffectiveLocal extends js.Object {
  /**
    * Effective permissions represent all the permissions that a user has for this entity. These include any implied permissions (e.g., EDIT implies VIEW) or
    * inherited permissions from the parent entity. Effective permissions are read-only.
    */
  var effective: js.UndefOr[js.Array[String]] = js.undefined
  /** Permissions that a user has been assigned at this very level. Does not include any implied or inherited permissions. Local permissions are modifiable. */
  var local: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_EffectiveLocal {
  @scala.inline
  def apply(effective: js.Array[String] = null, local: js.Array[String] = null): Anon_EffectiveLocal = {
    val __obj = js.Dynamic.literal()
    if (effective != null) __obj.updateDynamic("effective")(effective.asInstanceOf[js.Any])
    if (local != null) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EffectiveLocal]
  }
}

