package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeAnnotationsResource extends js.Object {
  /** Gets the volume annotation. */
  def get(request: gapiDotClientDotBooksLib.Anon_AltAnnotationId): gapiDotClientLib.gapiNs.clientNs.Request[Volumeannotation]
  /** Gets the volume annotations for a volume and layer. */
  def list(request: gapiDotClientDotBooksLib.Anon_AltContentVersion): gapiDotClientLib.gapiNs.clientNs.Request[Volumeannotations]
}

object VolumeAnnotationsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltAnnotationId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Volumeannotation]
    ],
    list: js.Function1[
      gapiDotClientDotBooksLib.Anon_AltContentVersion, 
      gapiDotClientLib.gapiNs.clientNs.Request[Volumeannotations]
    ]
  ): VolumeAnnotationsResource = {
    val __obj = js.Dynamic.literal(get = get, list = list)
  
    __obj.asInstanceOf[VolumeAnnotationsResource]
  }
}

