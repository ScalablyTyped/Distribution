package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.layered
import typings.devextreme.devextremeStrings.off
import typings.devextreme.devextremeStrings.tree
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoLayout extends js.Object {
  
  var autoLayout: js.UndefOr[auto | off | tree | layered | Orientation] = js.native
  
  var autoSizeEnabled: js.UndefOr[Boolean] = js.native
  
  var containerChildrenExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  
  var containerKeyExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  
  var customDataExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  
  var dataSource: js.UndefOr[
    js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.native
  
  var heightExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  
  var imageUrlExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  
  var itemsExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  
  var keyExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  
  var leftExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  
  var lockedExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  
  var parentKeyExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  
  var styleExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  
  var textExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  
  var textStyleExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  
  var topExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  
  var typeExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  
  var widthExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
  
  var zIndexExpr: js.UndefOr[String | (js.Function1[/* data */ js.Any, _])] = js.native
}
object AutoLayout {
  
  @scala.inline
  def apply(): AutoLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoLayout]
  }
  
  @scala.inline
  implicit class AutoLayoutOps[Self <: AutoLayout] (val x: Self) extends AnyVal {
    
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
    def setAutoLayout(value: auto | off | tree | layered | Orientation): Self = this.set("autoLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoLayout: Self = this.set("autoLayout", js.undefined)
    
    @scala.inline
    def setAutoSizeEnabled(value: Boolean): Self = this.set("autoSizeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSizeEnabled: Self = this.set("autoSizeEnabled", js.undefined)
    
    @scala.inline
    def setContainerChildrenExprFunction1(value: /* data */ js.Any => _): Self = this.set("containerChildrenExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainerChildrenExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("containerChildrenExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerChildrenExpr: Self = this.set("containerChildrenExpr", js.undefined)
    
    @scala.inline
    def setContainerKeyExprFunction1(value: /* data */ js.Any => _): Self = this.set("containerKeyExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainerKeyExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("containerKeyExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerKeyExpr: Self = this.set("containerKeyExpr", js.undefined)
    
    @scala.inline
    def setCustomDataExprFunction1(value: /* data */ js.Any => _): Self = this.set("customDataExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomDataExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("customDataExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDataExpr: Self = this.set("customDataExpr", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: js.Array[_] | typings.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setHeightExprFunction1(value: /* data */ js.Any => _): Self = this.set("heightExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeightExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("heightExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightExpr: Self = this.set("heightExpr", js.undefined)
    
    @scala.inline
    def setImageUrlExprFunction1(value: /* data */ js.Any => _): Self = this.set("imageUrlExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImageUrlExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("imageUrlExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrlExpr: Self = this.set("imageUrlExpr", js.undefined)
    
    @scala.inline
    def setItemsExprFunction1(value: /* data */ js.Any => _): Self = this.set("itemsExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemsExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("itemsExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemsExpr: Self = this.set("itemsExpr", js.undefined)
    
    @scala.inline
    def setKeyExprFunction1(value: /* data */ js.Any => _): Self = this.set("keyExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("keyExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyExpr: Self = this.set("keyExpr", js.undefined)
    
    @scala.inline
    def setLeftExprFunction1(value: /* data */ js.Any => _): Self = this.set("leftExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLeftExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("leftExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftExpr: Self = this.set("leftExpr", js.undefined)
    
    @scala.inline
    def setLockedExprFunction1(value: /* data */ js.Any => _): Self = this.set("lockedExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLockedExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("lockedExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockedExpr: Self = this.set("lockedExpr", js.undefined)
    
    @scala.inline
    def setParentKeyExprFunction1(value: /* data */ js.Any => _): Self = this.set("parentKeyExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParentKeyExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("parentKeyExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentKeyExpr: Self = this.set("parentKeyExpr", js.undefined)
    
    @scala.inline
    def setStyleExprFunction1(value: /* data */ js.Any => _): Self = this.set("styleExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyleExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("styleExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleExpr: Self = this.set("styleExpr", js.undefined)
    
    @scala.inline
    def setTextExprFunction1(value: /* data */ js.Any => _): Self = this.set("textExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTextExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("textExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextExpr: Self = this.set("textExpr", js.undefined)
    
    @scala.inline
    def setTextStyleExprFunction1(value: /* data */ js.Any => _): Self = this.set("textStyleExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTextStyleExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("textStyleExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyleExpr: Self = this.set("textStyleExpr", js.undefined)
    
    @scala.inline
    def setTopExprFunction1(value: /* data */ js.Any => _): Self = this.set("topExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTopExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("topExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopExpr: Self = this.set("topExpr", js.undefined)
    
    @scala.inline
    def setTypeExprFunction1(value: /* data */ js.Any => _): Self = this.set("typeExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTypeExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("typeExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeExpr: Self = this.set("typeExpr", js.undefined)
    
    @scala.inline
    def setWidthExprFunction1(value: /* data */ js.Any => _): Self = this.set("widthExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWidthExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("widthExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthExpr: Self = this.set("widthExpr", js.undefined)
    
    @scala.inline
    def setZIndexExprFunction1(value: /* data */ js.Any => _): Self = this.set("zIndexExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZIndexExpr(value: String | (js.Function1[/* data */ js.Any, _])): Self = this.set("zIndexExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndexExpr: Self = this.set("zIndexExpr", js.undefined)
  }
}
