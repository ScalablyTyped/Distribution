package typings.gapiClientGenomics.gapi.client.genomics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGenomics.AnonAccesstoken
import typings.gapiClientGenomics.AnonCallSetId
import typings.gapiClientGenomics.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallsetsResource extends js.Object {
  /**
    * Creates a new call set.
    *
    * For the definitions of call sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def create(request: AnonAccesstoken): Request_[CallSet]
  /**
    * Deletes a call set.
    *
    * For the definitions of call sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def delete(request: AnonCallSetId): Request_[js.Object]
  /**
    * Gets a call set by ID.
    *
    * For the definitions of call sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(request: AnonCallSetId): Request_[CallSet]
  /**
    * Updates a call set.
    *
    * For the definitions of call sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This method supports patch semantics.
    */
  def patch(request: AnonCallback): Request_[CallSet]
  /**
    * Gets a list of call sets matching the criteria.
    *
    * For the definitions of call sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.searchCallSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L178).
    */
  def search(request: AnonAccesstoken): Request_[SearchCallSetsResponse]
}

object CallsetsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[CallSet],
    delete: AnonCallSetId => Request_[js.Object],
    get: AnonCallSetId => Request_[CallSet],
    patch: AnonCallback => Request_[CallSet],
    search: AnonAccesstoken => Request_[SearchCallSetsResponse]
  ): CallsetsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[CallsetsResource]
  }
}

