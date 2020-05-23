package typings.gapiClientDiscovery.gapi.client.discovery

import typings.gapiClientDiscovery.anon.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryList extends js.Object {
  /** Indicate the version of the Discovery API used to generate this doc. */
  var discoveryVersion: js.UndefOr[String] = js.undefined
  /** The individual directory entries. One entry per api/version pair. */
  var items: js.UndefOr[js.Array[Description]] = js.undefined
  /** The kind for this response. */
  var kind: js.UndefOr[String] = js.undefined
}

object DirectoryList {
  @scala.inline
  def apply(discoveryVersion: String = null, items: js.Array[Description] = null, kind: String = null): DirectoryList = {
    val __obj = js.Dynamic.literal()
    if (discoveryVersion != null) __obj.updateDynamic("discoveryVersion")(discoveryVersion.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryList]
  }
}

