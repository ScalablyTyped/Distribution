package typings.gapiClientGenomics.gapi.client.genomics

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationSet extends js.Object {
  /** The dataset to which this annotation set belongs. */
  var datasetId: js.UndefOr[String] = js.native
  /** The server-generated annotation set ID, unique across all annotation sets. */
  var id: js.UndefOr[String] = js.native
  /**
    * A map of additional read alignment information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.native
  /** The display name for this annotation set. */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the reference set that defines the coordinate space for this
    * set's annotations.
    */
  var referenceSetId: js.UndefOr[String] = js.native
  /**
    * The source URI describing the file from which this annotation set was
    * generated, if any.
    */
  var sourceUri: js.UndefOr[String] = js.native
  /** The type of annotations contained within this set. */
  var `type`: js.UndefOr[String] = js.native
}

object AnnotationSet {
  @scala.inline
  def apply(): AnnotationSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationSet]
  }
  @scala.inline
  implicit class AnnotationSetOps[Self <: AnnotationSet] (val x: Self) extends AnyVal {
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
    def setDatasetId(value: String): Self = this.set("datasetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetId: Self = this.set("datasetId", js.undefined)
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
    def setReferenceSetId(value: String): Self = this.set("referenceSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceSetId: Self = this.set("referenceSetId", js.undefined)
    @scala.inline
    def setSourceUri(value: String): Self = this.set("sourceUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceUri: Self = this.set("sourceUri", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

