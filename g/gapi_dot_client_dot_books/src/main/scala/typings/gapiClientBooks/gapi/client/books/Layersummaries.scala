package typings.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layersummaries extends js.Object {
  /** A list of layer summary items. */
  var items: js.UndefOr[js.Array[Layersummary]] = js.native
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  /** The total number of layer summaries found. */
  var totalItems: js.UndefOr[Double] = js.native
}

object Layersummaries {
  @scala.inline
  def apply(): Layersummaries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Layersummaries]
  }
  @scala.inline
  implicit class LayersummariesOps[Self <: Layersummaries] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Layersummary*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Layersummary]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setTotalItems(value: Double): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalItems: Self = this.set("totalItems", js.undefined)
  }
  
}

