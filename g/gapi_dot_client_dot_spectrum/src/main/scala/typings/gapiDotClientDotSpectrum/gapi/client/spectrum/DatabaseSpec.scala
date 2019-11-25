package typings.gapiDotClientDotSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseSpec extends js.Object {
  /** The display name for a database. */
  var name: js.UndefOr[String] = js.undefined
  /** The corresponding URI of the database. */
  var uri: js.UndefOr[String] = js.undefined
}

object DatabaseSpec {
  @scala.inline
  def apply(name: String = null, uri: String = null): DatabaseSpec = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseSpec]
  }
}

