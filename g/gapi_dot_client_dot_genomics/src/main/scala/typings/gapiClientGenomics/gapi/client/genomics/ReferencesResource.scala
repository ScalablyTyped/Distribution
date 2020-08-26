package typings.gapiClientGenomics.gapi.client.genomics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGenomics.anon.Accesstoken
import typings.gapiClientGenomics.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferencesResource extends js.Object {
  var bases: BasesResource = js.native
  /**
    * Gets a reference.
    *
    * For the definitions of references and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.getReference](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L158).
    */
  def get(request: QuotaUser): Request[Reference] = js.native
  /**
    * Searches for references which match the given criteria.
    *
    * For the definitions of references and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.searchReferences](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L146).
    */
  def search(request: Accesstoken): Request[SearchReferencesResponse] = js.native
}

object ReferencesResource {
  @scala.inline
  def apply(
    bases: BasesResource,
    get: QuotaUser => Request[Reference],
    search: Accesstoken => Request[SearchReferencesResponse]
  ): ReferencesResource = {
    val __obj = js.Dynamic.literal(bases = bases.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[ReferencesResource]
  }
  @scala.inline
  implicit class ReferencesResourceOps[Self <: ReferencesResource] (val x: Self) extends AnyVal {
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
    def setBases(value: BasesResource): Self = this.set("bases", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: QuotaUser => Request[Reference]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setSearch(value: Accesstoken => Request[SearchReferencesResponse]): Self = this.set("search", js.Any.fromFunction1(value))
  }
  
}

