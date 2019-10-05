package typings.gapiDotClientDotSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataEntry extends js.Object {
  /** The metadata entry key. For JSON requests, the key is base64-encoded. */
  var key: js.UndefOr[String] = js.undefined
  /** The metadata entry value. For JSON requests, the value is base64-encoded. */
  var value: js.UndefOr[String] = js.undefined
}

object MetadataEntry {
  @scala.inline
  def apply(key: String = null, value: String = null): MetadataEntry = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MetadataEntry]
  }
}

