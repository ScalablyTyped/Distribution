package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentValue
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
trait dxDropDownBoxOptions extends dxDropDownEditorOptions[dxDropDownBox] {
  /** @name dxDropDownBox.Options.contentTemplate */
  var contentTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* templateData */ ComponentValue, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** @name DataExpressionMixin.Options.dataSource */
  var dataSource: js.UndefOr[String | (js.Array[CollectionWidgetItem | _]) | DataSource | DataSourceOptions] = js.native
  /** @name DataExpressionMixin.Options.displayExpr */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String])] = js.native
  /** @name dxDropDownBox.Options.displayValueFormatter */
  var displayValueFormatter: js.UndefOr[js.Function1[/* value */ String | js.Array[_], String]] = js.native
  /** @name dxDropDownBox.Options.fieldTemplate */
  var fieldTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* value */ js.Any, /* fieldElement */ dxElement, String | Element | JQuery])
  ] = js.native
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
  /** @name DataExpressionMixin.Options.valueExpr */
  var valueExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String | Double | Boolean])] = js.native
}

object dxDropDownBoxOptions {
  @scala.inline
  def apply(): dxDropDownBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDropDownBoxOptions]
  }
  @scala.inline
  implicit class dxDropDownBoxOptionsOps[Self <: dxDropDownBoxOptions] (val x: Self) extends AnyVal {
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
    def setContentTemplateFunction2(
      value: (/* templateData */ ComponentValue, /* contentElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("contentTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setContentTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[
          /* templateData */ ComponentValue, 
          /* contentElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("contentTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentTemplate: Self = this.set("contentTemplate", js.undefined)
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
    def setDisplayValueFormatter(value: /* value */ String | js.Array[_] => String): Self = this.set("displayValueFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisplayValueFormatter: Self = this.set("displayValueFormatter", js.undefined)
    @scala.inline
    def setFieldTemplateFunction2(value: (/* value */ js.Any, /* fieldElement */ dxElement) => String | Element | JQuery): Self = this.set("fieldTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setFieldTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* value */ js.Any, /* fieldElement */ dxElement, String | Element | JQuery])
    ): Self = this.set("fieldTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldTemplate: Self = this.set("fieldTemplate", js.undefined)
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
    def setValueExprFunction1(value: /* item */ js.Any => String | Double | Boolean): Self = this.set("valueExpr", js.Any.fromFunction1(value))
    @scala.inline
    def setValueExpr(value: String | (js.Function1[/* item */ js.Any, String | Double | Boolean])): Self = this.set("valueExpr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueExpr: Self = this.set("valueExpr", js.undefined)
  }
  
}

