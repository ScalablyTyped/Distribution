package typings.gapiDotClientDotDiscovery.gapiNs.clientNs.discoveryNs

import typings.gapiDotClientDotDiscovery.Anon_Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryList extends js.Object {
  /** Indicate the version of the Discovery API used to generate this doc. */
  var discoveryVersion: js.UndefOr[String] = js.undefined
  /** The individual directory entries. One entry per api/version pair. */
  var items: js.UndefOr[js.Array[Anon_Description]] = js.undefined
  /** The kind for this response. */
  var kind: js.UndefOr[String] = js.undefined
}

object DirectoryList {
  @scala.inline
  def apply(discoveryVersion: String = null, items: js.Array[Anon_Description] = null, kind: String = null): DirectoryList = {
    val __obj = js.Dynamic.literal()
    if (discoveryVersion != null) __obj.updateDynamic("discoveryVersion")(discoveryVersion)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[DirectoryList]
  }
}

