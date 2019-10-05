package typings.gapiDotClientDotGenomics.gapi.client.genomics

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGenomics.Anon_AccesstokenAltBearertokenCallbackEndFields
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
  def list(request: Anon_AccesstokenAltBearertokenCallbackEndFields): Request[ListBasesResponse]
}

object BasesResource {
  @scala.inline
  def apply(list: Anon_AccesstokenAltBearertokenCallbackEndFields => Request[ListBasesResponse]): BasesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[BasesResource]
  }
}

