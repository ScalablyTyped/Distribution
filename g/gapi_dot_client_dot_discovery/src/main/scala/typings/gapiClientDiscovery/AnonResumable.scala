package typings.gapiClientDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResumable extends js.Object {
  /** Supports the Resumable Media Upload protocol. */
  var resumable: js.UndefOr[AnonMultipart] = js.undefined
  /** Supports uploading as a single HTTP request. */
  var simple: js.UndefOr[AnonMultipart] = js.undefined
}

object AnonResumable {
  @scala.inline
  def apply(resumable: AnonMultipart = null, simple: AnonMultipart = null): AnonResumable = {
    val __obj = js.Dynamic.literal()
    if (resumable != null) __obj.updateDynamic("resumable")(resumable.asInstanceOf[js.Any])
    if (simple != null) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResumable]
  }
}

