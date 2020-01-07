package typings.googleapis.buildSrcApisDiscoveryV1Mod.discovery_v1

import typings.googleapis.Anon_DescriptionDiscoveryLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DirectoryList extends js.Object {
  /**
    * Indicate the version of the Discovery API used to generate this doc.
    */
  var discoveryVersion: js.UndefOr[String] = js.native
  /**
    * The individual directory entries. One entry per api/version pair.
    */
  var items: js.UndefOr[js.Array[Anon_DescriptionDiscoveryLink]] = js.native
  /**
    * The kind for this response.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$DirectoryList {
  @scala.inline
  def apply(
    discoveryVersion: String = null,
    items: js.Array[Anon_DescriptionDiscoveryLink] = null,
    kind: String = null
  ): Schema$DirectoryList = {
    val __obj = js.Dynamic.literal()
    if (discoveryVersion != null) __obj.updateDynamic("discoveryVersion")(discoveryVersion.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DirectoryList]
  }
}

