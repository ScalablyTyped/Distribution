package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetadataEntry extends js.Object {
  /** The metadata entry key. For JSON requests, the key is base64-encoded. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The metadata entry value. For JSON requests, the value is base64-encoded. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object MetadataEntry {
  @scala.inline
  def apply(key: java.lang.String = null, value: java.lang.String = null): MetadataEntry = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MetadataEntry]
  }
}

