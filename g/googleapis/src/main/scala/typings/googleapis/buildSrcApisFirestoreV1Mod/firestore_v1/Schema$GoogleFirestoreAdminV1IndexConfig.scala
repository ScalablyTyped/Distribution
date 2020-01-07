package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The index configuration for this field.
  */
@js.native
trait Schema$GoogleFirestoreAdminV1IndexConfig extends js.Object {
  /**
    * Output only. Specifies the resource name of the `Field` from which this
    * field&#39;s index configuration is set (when `uses_ancestor_config` is
    * true), or from which it *would* be set if this field had no index
    * configuration (when `uses_ancestor_config` is false).
    */
  var ancestorField: js.UndefOr[String] = js.native
  /**
    * The indexes supported for this field.
    */
  var indexes: js.UndefOr[js.Array[Schema$GoogleFirestoreAdminV1Index]] = js.native
  /**
    * Output only When true, the `Field`&#39;s index configuration is in the
    * process of being reverted. Once complete, the index config will
    * transition to the same state as the field specified by `ancestor_field`,
    * at which point `uses_ancestor_config` will be `true` and `reverting` will
    * be `false`.
    */
  var reverting: js.UndefOr[Boolean] = js.native
  /**
    * Output only. When true, the `Field`&#39;s index configuration is set from
    * the configuration specified by the `ancestor_field`. When false, the
    * `Field`&#39;s index configuration is defined explicitly.
    */
  var usesAncestorConfig: js.UndefOr[Boolean] = js.native
}

object Schema$GoogleFirestoreAdminV1IndexConfig {
  @scala.inline
  def apply(
    ancestorField: String = null,
    indexes: js.Array[Schema$GoogleFirestoreAdminV1Index] = null,
    reverting: js.UndefOr[Boolean] = js.undefined,
    usesAncestorConfig: js.UndefOr[Boolean] = js.undefined
  ): Schema$GoogleFirestoreAdminV1IndexConfig = {
    val __obj = js.Dynamic.literal()
    if (ancestorField != null) __obj.updateDynamic("ancestorField")(ancestorField.asInstanceOf[js.Any])
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (!js.isUndefined(reverting)) __obj.updateDynamic("reverting")(reverting.asInstanceOf[js.Any])
    if (!js.isUndefined(usesAncestorConfig)) __obj.updateDynamic("usesAncestorConfig")(usesAncestorConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFirestoreAdminV1IndexConfig]
  }
}

