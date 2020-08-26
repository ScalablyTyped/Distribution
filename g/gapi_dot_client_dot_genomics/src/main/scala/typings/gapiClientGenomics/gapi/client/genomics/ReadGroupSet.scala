package typings.gapiClientGenomics.gapi.client.genomics

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadGroupSet extends js.Object {
  /** The dataset to which this read group set belongs. */
  var datasetId: js.UndefOr[String] = js.native
  /** The filename of the original source file for this read group set, if any. */
  var filename: js.UndefOr[String] = js.native
  /** The server-generated read group set ID, unique for all read group sets. */
  var id: js.UndefOr[String] = js.native
  /** A map of additional read group set information. */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.native
  /**
    * The read group set name. By default this will be initialized to the sample
    * name of the sequenced data contained in this set.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The read groups in this set. There are typically 1-10 read groups in a read
    * group set.
    */
  var readGroups: js.UndefOr[js.Array[ReadGroup]] = js.native
  /** The reference set to which the reads in this read group set are aligned. */
  var referenceSetId: js.UndefOr[String] = js.native
}

object ReadGroupSet {
  @scala.inline
  def apply(): ReadGroupSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadGroupSet]
  }
  @scala.inline
  implicit class ReadGroupSetOps[Self <: ReadGroupSet] (val x: Self) extends AnyVal {
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
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
    def setReadGroupsVarargs(value: ReadGroup*): Self = this.set("readGroups", js.Array(value :_*))
    @scala.inline
    def setReadGroups(value: js.Array[ReadGroup]): Self = this.set("readGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadGroups: Self = this.set("readGroups", js.undefined)
    @scala.inline
    def setReferenceSetId(value: String): Self = this.set("referenceSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceSetId: Self = this.set("referenceSetId", js.undefined)
  }
  
}

