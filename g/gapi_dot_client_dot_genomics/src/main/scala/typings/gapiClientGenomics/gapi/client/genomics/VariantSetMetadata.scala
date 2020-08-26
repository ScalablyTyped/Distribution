package typings.gapiClientGenomics.gapi.client.genomics

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariantSetMetadata extends js.Object {
  /** A textual description of this metadata. */
  var description: js.UndefOr[String] = js.native
  /**
    * User-provided ID field, not enforced by this API.
    * Two or more pieces of structured metadata with identical
    * id and key fields are considered equivalent.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Remaining structured metadata key-value pairs. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.native
  /** The top-level key. */
  var key: js.UndefOr[String] = js.native
  /**
    * The number of values that can be included in a field described by this
    * metadata.
    */
  var number: js.UndefOr[String] = js.native
  /**
    * The type of data. Possible types include: Integer, Float,
    * Flag, Character, and String.
    */
  var `type`: js.UndefOr[String] = js.native
  /** The value field for simple metadata */
  var value: js.UndefOr[String] = js.native
}

object VariantSetMetadata {
  @scala.inline
  def apply(): VariantSetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariantSetMetadata]
  }
  @scala.inline
  implicit class VariantSetMetadataOps[Self <: VariantSetMetadata] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInfo(value: Record[String, js.Array[_]]): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

