package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

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
  def create(request: gapiDotClientDotGenomicsLib.Anon_AccesstokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[CallSet]
  /**
               * Deletes a call set.
               *
               * For the definitions of call sets and other genomics resources, see
               * [Fundamentals of Google
               * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
               */
  def delete(request: gapiDotClientDotGenomicsLib.Anon_AccesstokenCallSetId): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
               * Gets a call set by ID.
               *
               * For the definitions of call sets and other genomics resources, see
               * [Fundamentals of Google
               * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
               */
  def get(request: gapiDotClientDotGenomicsLib.Anon_AccesstokenCallSetId): gapiDotClientLib.gapiNs.clientNs.Request[CallSet]
  /**
               * Updates a call set.
               *
               * For the definitions of call sets and other genomics resources, see
               * [Fundamentals of Google
               * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
               *
               * This method supports patch semantics.
               */
  def patch(request: gapiDotClientDotGenomicsLib.Anon_AccesstokenCallSetIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[CallSet]
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
  def search(request: gapiDotClientDotGenomicsLib.Anon_AccesstokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[SearchCallSetsResponse]
}

