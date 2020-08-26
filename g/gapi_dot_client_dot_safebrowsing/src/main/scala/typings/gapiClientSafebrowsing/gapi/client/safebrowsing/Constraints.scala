package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constraints extends js.Object {
  /**
    * Sets the maximum number of entries that the client is willing to have
    * in the local database. This should be a power of 2 between 2&#42;&#42;10 and
    * 2&#42;&#42;20. If zero, no database size limit is set.
    */
  var maxDatabaseEntries: js.UndefOr[Double] = js.native
  /**
    * The maximum size in number of entries. The update will not contain more
    * entries than this value.  This should be a power of 2 between 2&#42;&#42;10 and
    * 2&#42;&#42;20.  If zero, no update size limit is set.
    */
  var maxUpdateEntries: js.UndefOr[Double] = js.native
  /**
    * Requests the list for a specific geographic location. If not set the
    * server may pick that value based on the user's IP address. Expects ISO
    * 3166-1 alpha-2 format.
    */
  var region: js.UndefOr[String] = js.native
  /** The compression types supported by the client. */
  var supportedCompressions: js.UndefOr[js.Array[String]] = js.native
}

object Constraints {
  @scala.inline
  def apply(): Constraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Constraints]
  }
  @scala.inline
  implicit class ConstraintsOps[Self <: Constraints] (val x: Self) extends AnyVal {
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
    def setMaxDatabaseEntries(value: Double): Self = this.set("maxDatabaseEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDatabaseEntries: Self = this.set("maxDatabaseEntries", js.undefined)
    @scala.inline
    def setMaxUpdateEntries(value: Double): Self = this.set("maxUpdateEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxUpdateEntries: Self = this.set("maxUpdateEntries", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setSupportedCompressionsVarargs(value: String*): Self = this.set("supportedCompressions", js.Array(value :_*))
    @scala.inline
    def setSupportedCompressions(value: js.Array[String]): Self = this.set("supportedCompressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedCompressions: Self = this.set("supportedCompressions", js.undefined)
  }
  
}

