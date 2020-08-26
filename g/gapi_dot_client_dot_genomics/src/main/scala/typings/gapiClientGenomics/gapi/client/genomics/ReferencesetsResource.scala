package typings.gapiClientGenomics.gapi.client.genomics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGenomics.anon.Accesstoken
import typings.gapiClientGenomics.anon.ReferenceSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferencesetsResource extends js.Object {
  /**
    * Gets a reference set.
    *
    * For the definitions of references and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.getReferenceSet](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L83).
    */
  def get(request: ReferenceSetId): Request[ReferenceSet] = js.native
  /**
    * Searches for reference sets which match the given criteria.
    *
    * For the definitions of references and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.searchReferenceSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L71)
    */
  def search(request: Accesstoken): Request[SearchReferenceSetsResponse] = js.native
}

object ReferencesetsResource {
  @scala.inline
  def apply(
    get: ReferenceSetId => Request[ReferenceSet],
    search: Accesstoken => Request[SearchReferenceSetsResponse]
  ): ReferencesetsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[ReferencesetsResource]
  }
  @scala.inline
  implicit class ReferencesetsResourceOps[Self <: ReferencesetsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: ReferenceSetId => Request[ReferenceSet]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setSearch(value: Accesstoken => Request[SearchReferenceSetsResponse]): Self = this.set("search", js.Any.fromFunction1(value))
  }
  
}

