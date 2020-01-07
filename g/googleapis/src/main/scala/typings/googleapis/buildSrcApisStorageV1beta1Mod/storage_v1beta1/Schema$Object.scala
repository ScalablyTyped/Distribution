package typings.googleapis.buildSrcApisStorageV1beta1Mod.storage_v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.googleapis.Anon_Algorithm
import typings.googleapis.Anon_Entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object.
  */
@js.native
trait Schema$Object extends js.Object {
  /**
    * Access controls on the object.
    */
  var acl: js.UndefOr[js.Array[Schema$ObjectAccessControl]] = js.native
  /**
    * The bucket containing this object.
    */
  var bucket: js.UndefOr[String] = js.native
  /**
    * Cache-Control directive for the object data.
    */
  var cacheControl: js.UndefOr[String] = js.native
  /**
    * Content-Disposition of the object data.
    */
  var contentDisposition: js.UndefOr[String] = js.native
  /**
    * Content-Encoding of the object data.
    */
  var contentEncoding: js.UndefOr[String] = js.native
  /**
    * Content-Language of the object data.
    */
  var contentLanguage: js.UndefOr[String] = js.native
  /**
    * The ID of the object.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of item this is. For objects, this is always storage#object.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Object media data. Provided on your behalf when uploading raw media or
    * multipart/related with an auxiliary media part.
    */
  var media: js.UndefOr[Anon_Algorithm] = js.native
  /**
    * User-provided metadata, in key/value pairs.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The name of this object. Required if not specified by URL parameter.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The owner of the object. This will always be the uploader of the object.
    */
  var owner: js.UndefOr[Anon_Entity] = js.native
  /**
    * The link to this object.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object Schema$Object {
  @scala.inline
  def apply(
    acl: js.Array[Schema$ObjectAccessControl] = null,
    bucket: String = null,
    cacheControl: String = null,
    contentDisposition: String = null,
    contentEncoding: String = null,
    contentLanguage: String = null,
    id: String = null,
    kind: String = null,
    media: Anon_Algorithm = null,
    metadata: StringDictionary[String] = null,
    name: String = null,
    owner: Anon_Entity = null,
    selfLink: String = null
  ): Schema$Object = {
    val __obj = js.Dynamic.literal()
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (contentDisposition != null) __obj.updateDynamic("contentDisposition")(contentDisposition.asInstanceOf[js.Any])
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Object]
  }
}

