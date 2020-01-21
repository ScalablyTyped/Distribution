package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientBooks.AnonAltContentVersionFields
import typings.gapiClientBooks.AnonAltContentVersionFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersResource extends js.Object {
  var annotationData: AnnotationDataResource
  var volumeAnnotations: VolumeAnnotationsResource
  /** Gets the layer summary for a volume. */
  def get(request: AnonAltContentVersionFields): Request_[Layersummary]
  /** List the layer summaries for a volume. */
  def list(request: AnonAltContentVersionFieldsKey): Request_[Layersummaries]
}

object LayersResource {
  @scala.inline
  def apply(
    annotationData: AnnotationDataResource,
    get: AnonAltContentVersionFields => Request_[Layersummary],
    list: AnonAltContentVersionFieldsKey => Request_[Layersummaries],
    volumeAnnotations: VolumeAnnotationsResource
  ): LayersResource = {
    val __obj = js.Dynamic.literal(annotationData = annotationData.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), volumeAnnotations = volumeAnnotations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LayersResource]
  }
}

