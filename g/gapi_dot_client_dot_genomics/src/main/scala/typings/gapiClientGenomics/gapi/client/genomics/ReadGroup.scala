package typings.gapiClientGenomics.gapi.client.genomics

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadGroup extends js.Object {
  /** The dataset to which this read group belongs. */
  var datasetId: js.UndefOr[String] = js.native
  /** A free-form text description of this read group. */
  var description: js.UndefOr[String] = js.native
  /** The experiment used to generate this read group. */
  var experiment: js.UndefOr[Experiment] = js.native
  /**
    * The server-generated read group ID, unique for all read groups.
    * Note: This is different than the @RG ID field in the SAM spec. For that
    * value, see name.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A map of additional read group information. This must be of the form
    * map<string, string[]> (string key mapping to a list of string values).
    */
  var info: js.UndefOr[Record[String, js.Array[_]]] = js.native
  /** The read group name. This corresponds to the @RG ID field in the SAM spec. */
  var name: js.UndefOr[String] = js.native
  /**
    * The predicted insert size of this read group. The insert size is the length
    * the sequenced DNA fragment from end-to-end, not including the adapters.
    */
  var predictedInsertSize: js.UndefOr[Double] = js.native
  /**
    * The programs used to generate this read group. Programs are always
    * identical for all read groups within a read group set. For this reason,
    * only the first read group in a returned set will have this field
    * populated.
    */
  var programs: js.UndefOr[js.Array[Program]] = js.native
  /** The reference set the reads in this read group are aligned to. */
  var referenceSetId: js.UndefOr[String] = js.native
  /** A client-supplied sample identifier for the reads in this read group. */
  var sampleId: js.UndefOr[String] = js.native
}

object ReadGroup {
  @scala.inline
  def apply(): ReadGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadGroup]
  }
  @scala.inline
  implicit class ReadGroupOps[Self <: ReadGroup] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExperiment(value: Experiment): Self = this.set("experiment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperiment: Self = this.set("experiment", js.undefined)
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
    def setPredictedInsertSize(value: Double): Self = this.set("predictedInsertSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredictedInsertSize: Self = this.set("predictedInsertSize", js.undefined)
    @scala.inline
    def setProgramsVarargs(value: Program*): Self = this.set("programs", js.Array(value :_*))
    @scala.inline
    def setPrograms(value: js.Array[Program]): Self = this.set("programs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrograms: Self = this.set("programs", js.undefined)
    @scala.inline
    def setReferenceSetId(value: String): Self = this.set("referenceSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceSetId: Self = this.set("referenceSetId", js.undefined)
    @scala.inline
    def setSampleId(value: String): Self = this.set("sampleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleId: Self = this.set("sampleId", js.undefined)
  }
  
}

