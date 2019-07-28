package typings.gapiDotClientDotBooks.gapiNs.clientNs.booksNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotBooks.Anon_AltContentVersionFields
import typings.gapiDotClientDotBooks.Anon_AltContentVersionFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersResource extends js.Object {
  var annotationData: AnnotationDataResource
  var volumeAnnotations: VolumeAnnotationsResource
  /** Gets the layer summary for a volume. */
  def get(request: Anon_AltContentVersionFields): Request[Layersummary]
  /** List the layer summaries for a volume. */
  def list(request: Anon_AltContentVersionFieldsKey): Request[Layersummaries]
}

object LayersResource {
  @scala.inline
  def apply(
    annotationData: AnnotationDataResource,
    get: Anon_AltContentVersionFields => Request[Layersummary],
    list: Anon_AltContentVersionFieldsKey => Request[Layersummaries],
    volumeAnnotations: VolumeAnnotationsResource
  ): LayersResource = {
    val __obj = js.Dynamic.literal(annotationData = annotationData, get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), volumeAnnotations = volumeAnnotations)
  
    __obj.asInstanceOf[LayersResource]
  }
}

