package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A BackendBucket resource. This resource defines a Cloud Storage bucket.
  */
@js.native
trait Schema$BackendBucket extends js.Object {
  /**
    * Cloud Storage bucket name.
    */
  var bucketName: js.UndefOr[String] = js.native
  /**
    * Cloud CDN configuration for this BackendBucket.
    */
  var cdnPolicy: js.UndefOr[Schema$BackendBucketCdnPolicy] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional textual description of the resource; provided by the client
    * when the resource is created.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * If true, enable Cloud CDN for this BackendBucket.
    */
  var enableCdn: js.UndefOr[Boolean] = js.native
  /**
    * [Output Only] Unique identifier for the resource; defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Type of the resource.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object Schema$BackendBucket {
  @scala.inline
  def apply(
    bucketName: String = null,
    cdnPolicy: Schema$BackendBucketCdnPolicy = null,
    creationTimestamp: String = null,
    description: String = null,
    enableCdn: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    name: String = null,
    selfLink: String = null
  ): Schema$BackendBucket = {
    val __obj = js.Dynamic.literal()
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    if (cdnPolicy != null) __obj.updateDynamic("cdnPolicy")(cdnPolicy.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCdn)) __obj.updateDynamic("enableCdn")(enableCdn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BackendBucket]
  }
}

