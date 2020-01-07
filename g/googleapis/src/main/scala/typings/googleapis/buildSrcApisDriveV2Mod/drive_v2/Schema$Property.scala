package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A key-value pair attached to a file that is either public or private to an
  * application. The following limits apply to file properties:   - Maximum of
  * 100 properties total per file - Maximum of 30 private properties per app -
  * Maximum of 30 public properties - Maximum of 124 bytes size limit on (key +
  * value) string in UTF-8 encoding for a single property.
  */
@js.native
trait Schema$Property extends js.Object {
  /**
    * ETag of the property.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The key of this property.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * This is always drive#property.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The link back to this property.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The value of this property.
    */
  var value: js.UndefOr[String] = js.native
  /**
    * The visibility of this property. Allowed values are PRIVATE and PUBLIC.
    * (Default: PRIVATE)
    */
  var visibility: js.UndefOr[String] = js.native
}

object Schema$Property {
  @scala.inline
  def apply(
    etag: String = null,
    key: String = null,
    kind: String = null,
    selfLink: String = null,
    value: String = null,
    visibility: String = null
  ): Schema$Property = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Property]
  }
}

