package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.MaxResults
import typings.gapiClientBooks.anon.SummaryId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersResource extends js.Object {
  var annotationData: AnnotationDataResource
  var volumeAnnotations: VolumeAnnotationsResource
  /** Gets the layer summary for a volume. */
  def get(request: SummaryId): Request[Layersummary]
  /** List the layer summaries for a volume. */
  def list(request: MaxResults): Request[Layersummaries]
}

object LayersResource {
  @scala.inline
  def apply(
    annotationData: AnnotationDataResource,
    get: SummaryId => Request[Layersummary],
    list: MaxResults => Request[Layersummaries],
    volumeAnnotations: VolumeAnnotationsResource
  ): LayersResource = {
    val __obj = js.Dynamic.literal(annotationData = annotationData.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), volumeAnnotations = volumeAnnotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersResource]
  }
}

