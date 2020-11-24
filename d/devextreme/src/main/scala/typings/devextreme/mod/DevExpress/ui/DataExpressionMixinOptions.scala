package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataExpressionMixinOptions[T] extends js.Object {
  
  /**
    * [descr:DataExpressionMixin.Options.dataSource]
    */
  var dataSource: js.UndefOr[String | (js.Array[CollectionWidgetItem | _]) | DataSource | DataSourceOptions] = js.native
  
  /**
    * [descr:DataExpressionMixin.Options.displayExpr]
    */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String])] = js.native
  
  /**
    * [descr:DataExpressionMixin.Options.itemTemplate]
    */
  var itemTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  
  /**
    * [descr:DataExpressionMixin.Options.items]
    */
  var items: js.UndefOr[js.Array[CollectionWidgetItem | _]] = js.native
  
  /**
    * [descr:DataExpressionMixin.Options.value]
    */
  var value: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:DataExpressionMixin.Options.valueExpr]
    */
  var valueExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String | Double | Boolean])] = js.native
}
object DataExpressionMixinOptions {
  
  @scala.inline
  def apply[T](): DataExpressionMixinOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataExpressionMixinOptions[T]]
  }
  
  @scala.inline
  implicit class DataExpressionMixinOptionsOps[Self <: DataExpressionMixinOptions[_], T] (val x: Self with DataExpressionMixinOptions[T]) extends AnyVal {
    
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
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueExprFunction1(value: /* item */ js.Any => String | Double | Boolean): Self = this.set("valueExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValueExpr(value: String | (js.Function1[/* item */ js.Any, String | Double | Boolean])): Self = this.set("valueExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueExpr: Self = this.set("valueExpr", js.undefined)
  }
}
