package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.devextreme.mod.DevExpress.ui.DataExpressionMixinOptions because var conflicts: value. Inlined dataSource, displayExpr, itemTemplate, items, valueExpr */ @js.native
trait dxRadioGroupOptions extends EditorOptions[dxRadioGroup] {
  /** @name DataExpressionMixin.Options.dataSource */
  var dataSource: js.UndefOr[String | (js.Array[CollectionWidgetItem | _]) | DataSource | DataSourceOptions] = js.native
  /** @name DataExpressionMixin.Options.displayExpr */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String])] = js.native
  /** @name DataExpressionMixin.Options.itemTemplate */
  var itemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** @name DataExpressionMixin.Options.items */
  var items: js.UndefOr[js.Array[CollectionWidgetItem | _]] = js.native
  /** @name dxRadioGroup.Options.layout */
  var layout: js.UndefOr[horizontal | vertical] = js.native
  /** @name dxRadioGroup.Options.name */
  var name: js.UndefOr[String] = js.native
  /** @name DataExpressionMixin.Options.valueExpr */
  var valueExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String | Double | Boolean])] = js.native
}

object dxRadioGroupOptions {
  @scala.inline
  def apply(): dxRadioGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxRadioGroupOptions]
  }
  @scala.inline
  implicit class dxRadioGroupOptionsOps[Self <: dxRadioGroupOptions] (val x: Self) extends AnyVal {
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
    def setDataSourceVarargs(value: (CollectionWidgetItem | js.Any)*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: String | (js.Array[CollectionWidgetItem | _]) | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDisplayExprFunction1(value: /* item */ js.Any => String): Self = this.set("displayExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setDisplayExpr(value: String | (js.Function1[/* item */ js.Any, String])): Self = this.set("displayExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayExpr: Self = this.set("displayExpr", js.undefined)
    @scala.inline
    def setItemTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("itemTemplate", js.Any.fromFunction3(value))
    @scala.inline
    def setItemTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("itemTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    @scala.inline
    def setItemsVarargs(value: (CollectionWidgetItem | js.Any)*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[CollectionWidgetItem | _]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setLayout(value: horizontal | vertical): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValueExprFunction1(value: /* item */ js.Any => String | Double | Boolean): Self = this.set("valueExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setValueExpr(value: String | (js.Function1[/* item */ js.Any, String | Double | Boolean])): Self = this.set("valueExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueExpr: Self = this.set("valueExpr", js.undefined)
  }
  
}

