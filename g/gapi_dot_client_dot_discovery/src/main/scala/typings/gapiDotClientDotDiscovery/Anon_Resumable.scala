package typings.gapiDotClientDotDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Resumable extends js.Object {
  /** Supports the Resumable Media Upload protocol. */
  var resumable: js.UndefOr[Anon_Multipart] = js.undefined
  /** Supports uploading as a single HTTP request. */
  var simple: js.UndefOr[Anon_Multipart] = js.undefined
}

object Anon_Resumable {
  @scala.inline
  def apply(resumable: Anon_Multipart = null, simple: Anon_Multipart = null): Anon_Resumable = {
    val __obj = js.Dynamic.literal()
    if (resumable != null) __obj.updateDynamic("resumable")(resumable)
    if (simple != null) __obj.updateDynamic("simple")(simple)
    __obj.asInstanceOf[Anon_Resumable]
  }
}

