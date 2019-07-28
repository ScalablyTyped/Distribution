package typings.gapiDotClientDotDatastore.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleDatastoreAdminV1beta1EntityFilter extends js.Object {
  /** If empty, then this represents all kinds. */
  var kinds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An empty list represents all namespaces. This is the preferred
    * usage for projects that don't use namespaces.
    *
    * An empty string element represents the default namespace. This should be
    * used if the project has data in non-default namespaces, but doesn't want to
    * include them.
    * Each namespace in this list must be unique.
    */
  var namespaceIds: js.UndefOr[js.Array[String]] = js.undefined
}

object GoogleDatastoreAdminV1beta1EntityFilter {
  @scala.inline
  def apply(kinds: js.Array[String] = null, namespaceIds: js.Array[String] = null): GoogleDatastoreAdminV1beta1EntityFilter = {
    val __obj = js.Dynamic.literal()
    if (kinds != null) __obj.updateDynamic("kinds")(kinds)
    if (namespaceIds != null) __obj.updateDynamic("namespaceIds")(namespaceIds)
    __obj.asInstanceOf[GoogleDatastoreAdminV1beta1EntityFilter]
  }
}

