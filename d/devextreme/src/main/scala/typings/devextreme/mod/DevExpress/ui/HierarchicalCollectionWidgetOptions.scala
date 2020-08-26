package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchicalCollectionWidgetOptions[T] extends CollectionWidgetOptions[T] {
  /** @name HierarchicalCollectionWidget.Options.disabledExpr */
  var disabledExpr: js.UndefOr[String | js.Function] = js.native
  /** @name HierarchicalCollectionWidget.Options.displayExpr */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String])] = js.native
  /** @name HierarchicalCollectionWidget.Options.itemsExpr */
  var itemsExpr: js.UndefOr[String | js.Function] = js.native
  /** @name HierarchicalCollectionWidget.Options.selectedExpr */
  var selectedExpr: js.UndefOr[String | js.Function] = js.native
}

object HierarchicalCollectionWidgetOptions {
  @scala.inline
  def apply[T](): HierarchicalCollectionWidgetOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchicalCollectionWidgetOptions[T]]
  }
  @scala.inline
  implicit class HierarchicalCollectionWidgetOptionsOps[Self <: HierarchicalCollectionWidgetOptions[_], T] (val x: Self with HierarchicalCollectionWidgetOptions[T]) extends AnyVal {
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
    def setDisabledExpr(value: String | js.Function): Self = this.set("disabledExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledExpr: Self = this.set("disabledExpr", js.undefined)
    @scala.inline
    def setDisplayExprFunction1(value: /* item */ js.Any => String): Self = this.set("displayExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setDisplayExpr(value: String | (js.Function1[/* item */ js.Any, String])): Self = this.set("displayExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayExpr: Self = this.set("displayExpr", js.undefined)
    @scala.inline
    def setItemsExpr(value: String | js.Function): Self = this.set("itemsExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsExpr: Self = this.set("itemsExpr", js.undefined)
    @scala.inline
    def setSelectedExpr(value: String | js.Function): Self = this.set("selectedExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedExpr: Self = this.set("selectedExpr", js.undefined)
  }
  
}

