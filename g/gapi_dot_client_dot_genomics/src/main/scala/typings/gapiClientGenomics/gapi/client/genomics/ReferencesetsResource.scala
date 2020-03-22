package typings.gapiClientGenomics.gapi.client.genomics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGenomics.AnonAccesstoken
import typings.gapiClientGenomics.AnonReferenceSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def get(request: AnonReferenceSetId): Request_[ReferenceSet]
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
  def search(request: AnonAccesstoken): Request_[SearchReferenceSetsResponse]
}

object ReferencesetsResource {
  @scala.inline
  def apply(
    get: AnonReferenceSetId => Request_[ReferenceSet],
    search: AnonAccesstoken => Request_[SearchReferenceSetsResponse]
  ): ReferencesetsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[ReferencesetsResource]
  }
}

