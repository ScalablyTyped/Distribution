package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersResource extends js.Object {
  var annotationData: AnnotationDataResource
  var volumeAnnotations: VolumeAnnotationsResource
  /** Gets the layer summary for a volume. */
  def get(request: gapiDotClientDotBooksLib.Anon_AltContentVersionFields): gapiDotClientLib.gapiNs.clientNs.Request[Layersummary]
  /** List the layer summaries for a volume. */
  def list(request: gapiDotClientDotBooksLib.Anon_AltContentVersionFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Layersummaries]
}

object LayersResource {
  @scala.inline
  def apply(
    annotationData: AnnotationDataResource,
    get: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltContentVersionFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Layersummary]
    ],
    list: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltContentVersionFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Layersummaries]
    ],
    volumeAnnotations: VolumeAnnotationsResource
  ): LayersResource = {
    val __obj = js.Dynamic.literal(annotationData = annotationData, get = get, list = list, volumeAnnotations = volumeAnnotations)
  
    __obj.asInstanceOf[LayersResource]
  }
}

