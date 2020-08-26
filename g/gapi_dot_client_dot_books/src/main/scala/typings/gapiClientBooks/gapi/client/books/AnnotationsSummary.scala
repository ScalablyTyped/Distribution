package typings.gapiClientBooks.gapi.client.books

import typings.gapiClientBooks.anon.LayerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationsSummary extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var layers: js.UndefOr[js.Array[LayerId]] = js.native
}

object AnnotationsSummary {
  @scala.inline
  def apply(): AnnotationsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationsSummary]
  }
  @scala.inline
  implicit class AnnotationsSummaryOps[Self <: AnnotationsSummary] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLayersVarargs(value: LayerId*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[LayerId]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
  }
  
}

