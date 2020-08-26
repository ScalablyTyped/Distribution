package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.AnnotationId
import typings.gapiClientBooks.anon.EndOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeAnnotationsResource extends js.Object {
  /** Gets the volume annotation. */
  def get(request: AnnotationId): Request[Volumeannotation] = js.native
  /** Gets the volume annotations for a volume and layer. */
  def list(request: EndOffset): Request[Volumeannotations] = js.native
}

object VolumeAnnotationsResource {
  @scala.inline
  def apply(get: AnnotationId => Request[Volumeannotation], list: EndOffset => Request[Volumeannotations]): VolumeAnnotationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[VolumeAnnotationsResource]
  }
  @scala.inline
  implicit class VolumeAnnotationsResourceOps[Self <: VolumeAnnotationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: AnnotationId => Request[Volumeannotation]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: EndOffset => Request[Volumeannotations]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

