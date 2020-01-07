package typings.googleapis.buildSrcApisFirestoreV1beta1Mod.firestore_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A field of an index.
  */
@js.native
trait Schema$GoogleFirestoreAdminV1beta1IndexField extends js.Object {
  /**
    * The path of the field. Must match the field path specification described
    * by google.firestore.v1beta1.Document.fields. Special field path
    * `__name__` may be used by itself or at the end of a path. `__type__` may
    * be used only at the end of path.
    */
  var fieldPath: js.UndefOr[String] = js.native
  /**
    * The field&#39;s mode.
    */
  var mode: js.UndefOr[String] = js.native
}

object Schema$GoogleFirestoreAdminV1beta1IndexField {
  @scala.inline
  def apply(fieldPath: String = null, mode: String = null): Schema$GoogleFirestoreAdminV1beta1IndexField = {
    val __obj = js.Dynamic.literal()
    if (fieldPath != null) __obj.updateDynamic("fieldPath")(fieldPath.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFirestoreAdminV1beta1IndexField]
  }
}

