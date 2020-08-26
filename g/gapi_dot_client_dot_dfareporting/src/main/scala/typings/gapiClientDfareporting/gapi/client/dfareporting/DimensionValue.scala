package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DimensionValue extends js.Object {
  /** The name of the dimension. */
  var dimensionName: js.UndefOr[String] = js.native
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.native
  /** The ID associated with the value if available. */
  var id: js.UndefOr[String] = js.native
  /** The kind of resource this is, in this case dfareporting#dimensionValue. */
  var kind: js.UndefOr[String] = js.native
  /**
    * Determines how the 'value' field is matched when filtering. If not specified, defaults to EXACT. If set to WILDCARD_EXPRESSION, '&#42;' is allowed as a
    * placeholder for variable length character sequences, and it can be escaped with a backslash. Note, only paid search dimensions ('dfa:paidSearch&#42;')
    * allow a matchType other than EXACT.
    */
  var matchType: js.UndefOr[String] = js.native
  /** The value of the dimension. */
  var value: js.UndefOr[String] = js.native
}

object DimensionValue {
  @scala.inline
  def apply(): DimensionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionValue]
  }
  @scala.inline
  implicit class DimensionValueOps[Self <: DimensionValue] (val x: Self) extends AnyVal {
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
    def setDimensionName(value: String): Self = this.set("dimensionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionName: Self = this.set("dimensionName", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMatchType(value: String): Self = this.set("matchType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchType: Self = this.set("matchType", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

