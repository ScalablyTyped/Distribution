package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template for List Chrome OS Devices operation in Directory
  * API.
  */
@js.native
trait Schema$ChromeOsDevices extends js.Object {
  /**
    * List of Chrome OS Device objects.
    */
  var chromeosdevices: js.UndefOr[js.Array[Schema$ChromeOsDevice]] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token used to access next page of this result.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ChromeOsDevices {
  @scala.inline
  def apply(
    chromeosdevices: js.Array[Schema$ChromeOsDevice] = null,
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null
  ): Schema$ChromeOsDevices = {
    val __obj = js.Dynamic.literal()
    if (chromeosdevices != null) __obj.updateDynamic("chromeosdevices")(chromeosdevices.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChromeOsDevices]
  }
}

