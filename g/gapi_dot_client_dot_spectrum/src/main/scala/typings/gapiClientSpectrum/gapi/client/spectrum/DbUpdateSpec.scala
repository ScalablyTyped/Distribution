package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DbUpdateSpec extends js.Object {
  /**
    * A required list of one or more databases. A device should update its preconfigured list of databases to replace (only) the database that provided the
    * response with the specified entries.
    */
  var databases: js.UndefOr[js.Array[DatabaseSpec]] = js.native
}

object DbUpdateSpec {
  @scala.inline
  def apply(): DbUpdateSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbUpdateSpec]
  }
  @scala.inline
  implicit class DbUpdateSpecOps[Self <: DbUpdateSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDatabasesVarargs(value: DatabaseSpec*): Self = this.set("databases", js.Array(value :_*))
    @scala.inline
    def setDatabases(value: js.Array[DatabaseSpec]): Self = this.set("databases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabases: Self = this.set("databases", js.undefined)
  }
  
}

