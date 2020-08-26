package typings.gapiClientBooks.gapi.client.books

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBooks.anon.AllowWebDefinitions
import typings.gapiClientBooks.anon.AnnotationDataId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationDataResource extends js.Object {
  /** Gets the annotation data. */
  def get(request: AllowWebDefinitions): Request[Annotationdata] = js.native
  /** Gets the annotation data for a volume and layer. */
  def list(request: AnnotationDataId): Request[Annotationsdata] = js.native
}

object AnnotationDataResource {
  @scala.inline
  def apply(
    get: AllowWebDefinitions => Request[Annotationdata],
    list: AnnotationDataId => Request[Annotationsdata]
  ): AnnotationDataResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AnnotationDataResource]
  }
  @scala.inline
  implicit class AnnotationDataResourceOps[Self <: AnnotationDataResource] (val x: Self) extends AnyVal {
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
    def setGet(value: AllowWebDefinitions => Request[Annotationdata]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: AnnotationDataId => Request[Annotationsdata]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

