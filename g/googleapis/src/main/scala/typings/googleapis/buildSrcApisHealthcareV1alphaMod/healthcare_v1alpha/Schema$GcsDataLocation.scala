package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Cloud Storage location.
  */
@js.native
trait Schema$GcsDataLocation extends js.Object {
  /**
    * The gcs_uri must be in the format &quot;gs://bucket/path/to/object&quot;.
    * The gcs_uri may include wildcards in the &quot;path/to/object&quot; part
    * to to indicate potential matching of multiple objects. Supported
    * wildcards:   &#39;*&#39; to match 0 or more non-separator characters
    * &#39;**&#39; to match 0 or more characters (including separators). Only
    * supported at the end of a path and with no other wildcards.   &#39;?&#39;
    * to match 1 character.
    */
  var gcsUri: js.UndefOr[String] = js.native
}

object Schema$GcsDataLocation {
  @scala.inline
  def apply(gcsUri: String = null): Schema$GcsDataLocation = {
    val __obj = js.Dynamic.literal()
    if (gcsUri != null) __obj.updateDynamic("gcsUri")(gcsUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GcsDataLocation]
  }
}

