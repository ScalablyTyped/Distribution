package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.contains
import typings.devextreme.devextremeStrings.equals
import typings.devextreme.devextremeStrings.startswith
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBoxMixinOptions[T] extends js.Object {
  
  /**
    * [descr:SearchBoxMixin.Options.searchEditorOptions]
    */
  var searchEditorOptions: js.UndefOr[dxTextBoxOptions[dxTextBox]] = js.native
  
  /**
    * [descr:SearchBoxMixin.Options.searchEnabled]
    */
  var searchEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:SearchBoxMixin.Options.searchExpr]
    */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.native
  
  /**
    * [descr:SearchBoxMixin.Options.searchMode]
    */
  var searchMode: js.UndefOr[contains | startswith | equals] = js.native
  
  /**
    * [descr:SearchBoxMixin.Options.searchTimeout]
    */
  var searchTimeout: js.UndefOr[Double] = js.native
  
  /**
    * [descr:SearchBoxMixin.Options.searchValue]
    */
  var searchValue: js.UndefOr[String] = js.native
}
object SearchBoxMixinOptions {
  
  @scala.inline
  def apply[T](): SearchBoxMixinOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBoxMixinOptions[T]]
  }
  
  @scala.inline
  implicit class SearchBoxMixinOptionsOps[Self <: SearchBoxMixinOptions[_], T] (val x: Self with SearchBoxMixinOptions[T]) extends AnyVal {
    
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
    def setSearchEditorOptions(value: dxTextBoxOptions[dxTextBox]): Self = this.set("searchEditorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchEditorOptions: Self = this.set("searchEditorOptions", js.undefined)
    
    @scala.inline
    def setSearchEnabled(value: Boolean): Self = this.set("searchEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchEnabled: Self = this.set("searchEnabled", js.undefined)
    
    @scala.inline
    def setSearchExprVarargs(value: (String | js.Function)*): Self = this.set("searchExpr", js.Array(value :_*))
    
    @scala.inline
    def setSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self = this.set("searchExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchExpr: Self = this.set("searchExpr", js.undefined)
    
    @scala.inline
    def setSearchMode(value: contains | startswith | equals): Self = this.set("searchMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchMode: Self = this.set("searchMode", js.undefined)
    
    @scala.inline
    def setSearchTimeout(value: Double): Self = this.set("searchTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchTimeout: Self = this.set("searchTimeout", js.undefined)
    
    @scala.inline
    def setSearchValue(value: String): Self = this.set("searchValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchValue: Self = this.set("searchValue", js.undefined)
  }
}
