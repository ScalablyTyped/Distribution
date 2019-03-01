package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

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
  def create(request: gapiDotClientDotGenomicsLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[VariantSet]
  /**
    * Deletes a variant set including all variants, call sets, and calls within.
    * This is not reversible.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def delete(
    request: gapiDotClientDotGenomicsLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUploadTypeUploadprotocol
  ): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Exports variant set data to an external destination.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def export(
    request: gapiDotClientDotGenomicsLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUploadTypeUploadprotocol
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Gets a variant set by ID.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def get(
    request: gapiDotClientDotGenomicsLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUploadTypeUploadprotocol
  ): gapiDotClientLib.gapiNs.clientNs.Request[VariantSet]
  /**
    * Updates a variant set using patch semantics.
    *
    * For the definitions of variant sets and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    */
  def patch(
    request: gapiDotClientDotGenomicsLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUpdateMaskUploadType
  ): gapiDotClientLib.gapiNs.clientNs.Request[VariantSet]
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
  def search(request: gapiDotClientDotGenomicsLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[SearchVariantSetsResponse]
}

object VariantsetsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotGenomicsLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[VariantSet]
    ],
    delete: js.Function1[
      gapiDotClientDotGenomicsLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUploadTypeUploadprotocol, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    export: js.Function1[
      gapiDotClientDotGenomicsLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUploadTypeUploadprotocol, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotGenomicsLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUploadTypeUploadprotocol, 
      gapiDotClientLib.gapiNs.clientNs.Request[VariantSet]
    ],
    patch: js.Function1[
      gapiDotClientDotGenomicsLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPpPrettyPrintQuotaUserUpdateMaskUploadType, 
      gapiDotClientLib.gapiNs.clientNs.Request[VariantSet]
    ],
    search: js.Function1[
      gapiDotClientDotGenomicsLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[SearchVariantSetsResponse]
    ]
  ): VariantsetsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("export")(export)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[VariantsetsResource]
  }
}

