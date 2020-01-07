package typings.googleapis.buildSrcApisDatastoreV1Mod.datastore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A minimal index definition.
  */
@js.native
trait Schema$GoogleDatastoreAdminV1Index extends js.Object {
  /**
    * The index&#39;s ancestor mode.  Must not be ANCESTOR_MODE_UNSPECIFIED.
    * Required.
    */
  var ancestor: js.UndefOr[String] = js.native
  /**
    * The resource ID of the index. Output only.
    */
  var indexId: js.UndefOr[String] = js.native
  /**
    * The entity kind to which this index applies. Required.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Project ID. Output only.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * An ordered sequence of property names and their index attributes.
    * Required.
    */
  var properties: js.UndefOr[js.Array[Schema$GoogleDatastoreAdminV1IndexedProperty]] = js.native
  /**
    * The state of the index. Output only.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$GoogleDatastoreAdminV1Index {
  @scala.inline
  def apply(
    ancestor: String = null,
    indexId: String = null,
    kind: String = null,
    projectId: String = null,
    properties: js.Array[Schema$GoogleDatastoreAdminV1IndexedProperty] = null,
    state: String = null
  ): Schema$GoogleDatastoreAdminV1Index = {
    val __obj = js.Dynamic.literal()
    if (ancestor != null) __obj.updateDynamic("ancestor")(ancestor.asInstanceOf[js.Any])
    if (indexId != null) __obj.updateDynamic("indexId")(indexId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDatastoreAdminV1Index]
  }
}

