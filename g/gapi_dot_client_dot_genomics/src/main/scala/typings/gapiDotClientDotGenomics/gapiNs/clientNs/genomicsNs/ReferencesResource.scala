package typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGenomics.Anon_Accesstoken
import typings.gapiDotClientDotGenomics.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferencesResource extends js.Object {
  var bases: BasesResource
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
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrint): Request[Reference]
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
  def search(request: Anon_Accesstoken): Request[SearchReferencesResponse]
}

object ReferencesResource {
  @scala.inline
  def apply(
    bases: BasesResource,
    get: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrint => Request[Reference],
    search: Anon_Accesstoken => Request[SearchReferencesResponse]
  ): ReferencesResource = {
    val __obj = js.Dynamic.literal(bases = bases, get = js.Any.fromFunction1(get), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[ReferencesResource]
  }
}

