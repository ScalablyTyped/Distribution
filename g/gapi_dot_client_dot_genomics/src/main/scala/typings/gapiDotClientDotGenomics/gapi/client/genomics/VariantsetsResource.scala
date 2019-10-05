package typings.gapiDotClientDotGenomics.gapi.client.genomics

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGenomics.Anon_Accesstoken
import typings.gapiDotClientDotGenomics.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUpdateMaskUploadType
import typings.gapiDotClientDotGenomics.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUploadTypeUploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariantsetsResource extends js.Object {
  /**
    * Creates a new variant set.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * The provided variant set must have a valid `datasetId` set - all other
    * fields are optional. Note that the `id` field will be ignored, as this is
    * assigned by the server.
    */
  def create(request: Anon_Accesstoken): Request[VariantSet]
  /**
    * Deletes a variant set including all variants, call sets, and calls within.
    * This is not reversible.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def delete(
    request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUploadTypeUploadprotocol
  ): Request[js.Object]
  /**
    * Exports variant set data to an external destination.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def export(
    request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUploadTypeUploadprotocol
  ): Request[Operation]
  /**
    * Gets a variant set by ID.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(
    request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUploadTypeUploadprotocol
  ): Request[VariantSet]
  /**
    * Updates a variant set using patch semantics.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def patch(
    request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUpdateMaskUploadType
  ): Request[VariantSet]
  /**
    * Returns a list of all variant sets matching search criteria.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.searchVariantSets](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/variantmethods.avdl#L49).
    */
  def search(request: Anon_Accesstoken): Request[SearchVariantSetsResponse]
}

object VariantsetsResource {
  @scala.inline
  def apply(
    create: Anon_Accesstoken => Request[VariantSet],
    delete: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUploadTypeUploadprotocol => Request[js.Object],
    export: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUploadTypeUploadprotocol => Request[Operation],
    get: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUploadTypeUploadprotocol => Request[VariantSet],
    patch: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUpdateMaskUploadType => Request[VariantSet],
    search: Anon_Accesstoken => Request[SearchVariantSetsResponse]
  ): VariantsetsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), export = js.Any.fromFunction1(export), get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[VariantsetsResource]
  }
}

