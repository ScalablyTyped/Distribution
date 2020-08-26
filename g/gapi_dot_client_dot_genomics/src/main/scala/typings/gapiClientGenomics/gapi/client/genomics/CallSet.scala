package typings.gapiClientGenomics.gapi.client.genomics

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallSet extends js.Object {
  /** The date this call set was created in milliseconds from the epoch. */
  var created: js.UndefOr[String] = js.native
  /** The server-generated call set ID, unique across all call sets. */
  var id: js.UndefOr[String] = js.native
  /**
    * A map of additional call set information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.native
  /** The call set name. */
  var name: js.UndefOr[String] = js.native
  /** The sample ID this call set corresponds to. */
  var sampleId: js.UndefOr[String] = js.native
  /**
    * The IDs of the variant sets this call set belongs to. This field must
    * have exactly length one, as a call set belongs to a single variant set.
    * This field is repeated for compatibility with the
    * [GA4GH 0.5.1
    * API](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variants.avdl#L76).
    */
  var variantSetIds: js.UndefOr[js.Array[String]] = js.native
}

object CallSet {
  @scala.inline
  def apply(): CallSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallSet]
  }
  @scala.inline
  implicit class CallSetOps[Self <: CallSet] (val x: Self) extends AnyVal {
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
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInfo(value: Record[String, js.Array[_]]): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSampleId(value: String): Self = this.set("sampleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleId: Self = this.set("sampleId", js.undefined)
    @scala.inline
    def setVariantSetIdsVarargs(value: String*): Self = this.set("variantSetIds", js.Array(value :_*))
    @scala.inline
    def setVariantSetIds(value: js.Array[String]): Self = this.set("variantSetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariantSetIds: Self = this.set("variantSetIds", js.undefined)
  }
  
}

