package typings.gapiClientDiscovery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resumable extends js.Object {
  /** Supports the Resumable Media Upload protocol. */
  var resumable: js.UndefOr[Multipart] = js.undefined
  /** Supports uploading as a single HTTP request. */
  var simple: js.UndefOr[Multipart] = js.undefined
}

object Resumable {
  @scala.inline
  def apply(resumable: Multipart = null, simple: Multipart = null): Resumable = {
    val __obj = js.Dynamic.literal()
    if (resumable != null) __obj.updateDynamic("resumable")(resumable.asInstanceOf[js.Any])
    if (simple != null) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resumable]
  }
}

