package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportReadGroupSetsRequest extends js.Object {
  /**
    * Required. The ID of the dataset these read group sets will belong to. The
    * caller must have WRITE permissions to this dataset.
    */
  var datasetId: js.UndefOr[String] = js.native
  /**
    * The partition strategy describes how read groups are partitioned into read
    * group sets.
    */
  var partitionStrategy: js.UndefOr[String] = js.native
  /**
    * The reference set to which the imported read group sets are aligned to, if
    * any. The reference names of this reference set must be a superset of those
    * found in the imported file headers. If no reference set id is provided, a
    * best effort is made to associate with a matching reference set.
    */
  var referenceSetId: js.UndefOr[String] = js.native
  /**
    * A list of URIs pointing at [BAM
    * files](https://samtools.github.io/hts-specs/SAMv1.pdf)
    * in Google Cloud Storage.
    * Those URIs can include wildcards (&#42;), but do not add or remove
    * matching files before import has completed.
    *
    * Note that Google Cloud Storage object listing is only eventually
    * consistent: files added may be not be immediately visible to
    * everyone. Thus, if using a wildcard it is preferable not to start
    * the import immediately after the files are created.
    */
  var sourceUris: js.UndefOr[js.Array[String]] = js.native
}

object ImportReadGroupSetsRequest {
  @scala.inline
  def apply(): ImportReadGroupSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportReadGroupSetsRequest]
  }
  @scala.inline
  implicit class ImportReadGroupSetsRequestOps[Self <: ImportReadGroupSetsRequest] (val x: Self) extends AnyVal {
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
    def setPartitionStrategy(value: String): Self = this.set("partitionStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitionStrategy: Self = this.set("partitionStrategy", js.undefined)
    @scala.inline
    def setReferenceSetId(value: String): Self = this.set("referenceSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceSetId: Self = this.set("referenceSetId", js.undefined)
    @scala.inline
    def setSourceUrisVarargs(value: String*): Self = this.set("sourceUris", js.Array(value :_*))
    @scala.inline
    def setSourceUris(value: js.Array[String]): Self = this.set("sourceUris", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceUris: Self = this.set("sourceUris", js.undefined)
  }
  
}

