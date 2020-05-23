package typings.gapiClientGenomics.gapi.client.genomics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGenomics.anon.Accesstoken
import typings.gapiClientGenomics.anon.CallSetId
import typings.gapiClientGenomics.anon.Callback
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
  def create(request: Accesstoken): Request[CallSet]
  /**
    * Deletes a call set.
    *
    * For the definitions of call sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def delete(request: CallSetId): Request[js.Object]
  /**
    * Gets a call set by ID.
    *
    * For the definitions of call sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(request: CallSetId): Request[CallSet]
  /**
    * Updates a call set.
    *
    * For the definitions of call sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * This method supports patch semantics.
    */
  def patch(request: Callback): Request[CallSet]
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
  def search(request: Accesstoken): Request[SearchCallSetsResponse]
}

object CallsetsResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[CallSet],
    delete: CallSetId => Request[js.Object],
    get: CallSetId => Request[CallSet],
    patch: Callback => Request[CallSet],
    search: Accesstoken => Request[SearchCallSetsResponse]
  ): CallsetsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[CallsetsResource]
  }
}

