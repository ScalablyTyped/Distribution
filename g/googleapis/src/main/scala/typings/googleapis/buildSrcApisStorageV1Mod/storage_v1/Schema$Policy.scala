package typings.googleapis.buildSrcApisStorageV1Mod.storage_v1

import typings.googleapis.Anon_Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bucket/object IAM policy.
  */
@js.native
trait Schema$Policy extends js.Object {
  /**
    * An association between a role, which comes with a set of permissions, and
    * members who may assume that role.
    */
  var bindings: js.UndefOr[js.Array[Anon_Condition]] = js.native
  /**
    * HTTP 1.1  Entity tag for the policy.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The kind of item this is. For policies, this is always storage#policy.
    * This field is ignored on input.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The ID of the resource to which this policy belongs. Will be of the form
    * projects/_/buckets/bucket for buckets, and
    * projects/_/buckets/bucket/objects/object for objects. A specific
    * generation may be specified by appending #generationNumber to the end of
    * the object name, e.g. projects/_/buckets/my-bucket/objects/data.txt#17.
    * The current generation can be denoted with #0. This field is ignored on
    * input.
    */
  var resourceId: js.UndefOr[String] = js.native
}

object Schema$Policy {
  @scala.inline
  def apply(
    bindings: js.Array[Anon_Condition] = null,
    etag: String = null,
    kind: String = null,
    resourceId: String = null
  ): Schema$Policy = {
    val __obj = js.Dynamic.literal()
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Policy]
  }
}

