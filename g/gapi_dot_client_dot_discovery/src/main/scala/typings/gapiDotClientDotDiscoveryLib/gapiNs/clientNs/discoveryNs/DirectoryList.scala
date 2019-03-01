package typings
package gapiDotClientDotDiscoveryLib.gapiNs.clientNs.discoveryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryList extends js.Object {
  /** Indicate the version of the Discovery API used to generate this doc. */
  var discoveryVersion: js.UndefOr[java.lang.String] = js.undefined
  /** The individual directory entries. One entry per api/version pair. */
  var items: js.UndefOr[js.Array[gapiDotClientDotDiscoveryLib.Anon_Description]] = js.undefined
  /** The kind for this response. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object DirectoryList {
  @scala.inline
  def apply(
    discoveryVersion: java.lang.String = null,
    items: js.Array[gapiDotClientDotDiscoveryLib.Anon_Description] = null,
    kind: java.lang.String = null
  ): DirectoryList = {
    val __obj = js.Dynamic.literal()
    if (discoveryVersion != null) __obj.updateDynamic("discoveryVersion")(discoveryVersion)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[DirectoryList]
  }
}

