package typings.gapiClientFusiontables.gapi.client.fusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateList extends js.Object {
  /** List of all requested templates. */
  var items: js.UndefOr[js.Array[Template]] = js.native
  /** The kind of item this is. For a template list, this is always fusiontables#templateList . */
  var kind: js.UndefOr[String] = js.native
  /** Token used to access the next page of this result. No token is displayed if there are no more pages left. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Total number of templates for the table. */
  var totalItems: js.UndefOr[Double] = js.native
}

object TemplateList {
  @scala.inline
  def apply(): TemplateList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateList]
  }
  @scala.inline
  implicit class TemplateListOps[Self <: TemplateList] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Template*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Template]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setTotalItems(value: Double): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalItems: Self = this.set("totalItems", js.undefined)
  }
  
}

