package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasesResource extends js.Object {
  /**
    * Lists the bases in a reference, optionally restricted to a range.
    *
    * For the definitions of references and other genomics resources, see
    * [Fundamentals of Google
    * Genomics](https://cloud.google.com/genomics/fundamentals-of-google-genomics)
    *
    * Implements
    * [GlobalAllianceApi.getReferenceBases](https://github.com/ga4gh/schemas/blob/v0.5.1/src/main/resources/avro/referencemethods.avdl#L221).
    */
  def list(request: gapiDotClientDotGenomicsLib.Anon_AccesstokenAltBearertokenCallbackEndFields): gapiDotClientLib.gapiNs.clientNs.Request[ListBasesResponse]
}

object BasesResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotGenomicsLib.Anon_AccesstokenAltBearertokenCallbackEndFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListBasesResponse]
    ]
  ): BasesResource = {
    val __obj = js.Dynamic.literal(list = list)
  
    __obj.asInstanceOf[BasesResource]
  }
}

