package typings.gapiDotClientDotSpectrum.gapiNs.clientNs.spectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbUpdateSpec extends js.Object {
  /**
    * A required list of one or more databases. A device should update its preconfigured list of databases to replace (only) the database that provided the
    * response with the specified entries.
    */
  var databases: js.UndefOr[js.Array[DatabaseSpec]] = js.undefined
}

object DbUpdateSpec {
  @scala.inline
  def apply(databases: js.Array[DatabaseSpec] = null): DbUpdateSpec = {
    val __obj = js.Dynamic.literal()
    if (databases != null) __obj.updateDynamic("databases")(databases)
    __obj.asInstanceOf[DbUpdateSpec]
  }
}

