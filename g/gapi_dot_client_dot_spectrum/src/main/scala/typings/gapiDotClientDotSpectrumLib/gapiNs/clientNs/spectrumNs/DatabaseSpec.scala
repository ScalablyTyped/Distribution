package typings
package gapiDotClientDotSpectrumLib.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseSpec extends js.Object {
  /** The display name for a database. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The corresponding URI of the database. */
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object DatabaseSpec {
  @scala.inline
  def apply(name: java.lang.String = null, uri: java.lang.String = null): DatabaseSpec = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[DatabaseSpec]
  }
}

