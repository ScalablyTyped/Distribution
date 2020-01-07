package typings.googleapis.buildSrcApisReplicapoolV1beta1Mod.replicapool_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Compute Engine metadata entry. Identical to the metadata on the
  * corresponding Compute Engine resource.
  */
@js.native
trait Schema$Metadata extends js.Object {
  /**
    * The fingerprint of the metadata. Required for updating the metadata
    * entries for this instance.
    */
  var fingerPrint: js.UndefOr[String] = js.native
  /**
    * A list of metadata items.
    */
  var items: js.UndefOr[js.Array[Schema$MetadataItem]] = js.native
}

object Schema$Metadata {
  @scala.inline
  def apply(fingerPrint: String = null, items: js.Array[Schema$MetadataItem] = null): Schema$Metadata = {
    val __obj = js.Dynamic.literal()
    if (fingerPrint != null) __obj.updateDynamic("fingerPrint")(fingerPrint.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Metadata]
  }
}

