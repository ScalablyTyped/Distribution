package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchReferenceSetsRequest extends js.Object {
  /**
    * If present, return reference sets for which a prefix of any of
    * sourceAccessions
    * match any of these strings. Accession numbers typically have a main number
    * and a version, for example `NC_000001.11`.
    */
  var accessions: js.UndefOr[js.Array[String]] = js.native
  /**
    * If present, return reference sets for which a substring of their
    * `assemblyId` matches this string (case insensitive).
    */
  var assemblyId: js.UndefOr[String] = js.native
  /**
    * If present, return reference sets for which the
    * md5checksum matches exactly.
    */
  var md5checksums: js.UndefOr[js.Array[String]] = js.native
  /**
    * The maximum number of results to return in a single page. If unspecified,
    * defaults to 1024. The maximum value is 4096.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object SearchReferenceSetsRequest {
  @scala.inline
  def apply(): SearchReferenceSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchReferenceSetsRequest]
  }
  @scala.inline
  implicit class SearchReferenceSetsRequestOps[Self <: SearchReferenceSetsRequest] (val x: Self) extends AnyVal {
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
    def setAccessionsVarargs(value: String*): Self = this.set("accessions", js.Array(value :_*))
    @scala.inline
    def setAccessions(value: js.Array[String]): Self = this.set("accessions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessions: Self = this.set("accessions", js.undefined)
    @scala.inline
    def setAssemblyId(value: String): Self = this.set("assemblyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssemblyId: Self = this.set("assemblyId", js.undefined)
    @scala.inline
    def setMd5checksumsVarargs(value: String*): Self = this.set("md5checksums", js.Array(value :_*))
    @scala.inline
    def setMd5checksums(value: js.Array[String]): Self = this.set("md5checksums", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMd5checksums: Self = this.set("md5checksums", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
  
}

