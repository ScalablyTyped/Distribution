package typings.gapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchReferenceSetsRequest extends js.Object {
  /**
    * If present, return reference sets for which a prefix of any of
    * sourceAccessions
    * match any of these strings. Accession numbers typically have a main number
    * and a version, for example `NC_000001.11`.
    */
  var accessions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If present, return reference sets for which a substring of their
    * `assemblyId` matches this string (case insensitive).
    */
  var assemblyId: js.UndefOr[String] = js.undefined
  /**
    * If present, return reference sets for which the
    * md5checksum matches exactly.
    */
  var md5checksums: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The maximum number of results to return in a single page. If unspecified,
    * defaults to 1024. The maximum value is 4096.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * The continuation token, which is used to page through large result sets.
    * To get the next page of results, set this parameter to the value of
    * `nextPageToken` from the previous response.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}

object SearchReferenceSetsRequest {
  @scala.inline
  def apply(
    accessions: js.Array[String] = null,
    assemblyId: String = null,
    md5checksums: js.Array[String] = null,
    pageSize: Int | Double = null,
    pageToken: String = null
  ): SearchReferenceSetsRequest = {
    val __obj = js.Dynamic.literal()
    if (accessions != null) __obj.updateDynamic("accessions")(accessions.asInstanceOf[js.Any])
    if (assemblyId != null) __obj.updateDynamic("assemblyId")(assemblyId.asInstanceOf[js.Any])
    if (md5checksums != null) __obj.updateDynamic("md5checksums")(md5checksums.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchReferenceSetsRequest]
  }
}

