package typings.fundamentalReact.anon

import typings.fundamentalReact.iconMod.IconGlyph
import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Tabs/Tab.TabProps> */
@js.native
trait WeakValidationMapTabProps extends js.Object {
  
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var glyph: js.UndefOr[Validator[js.UndefOr[IconGlyph | Null]]] = js.native
  
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
  
  var index: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.native
  
  var linkProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  
  var onClick: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]] = js.native
  
  var selected: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.native
  
  var tabContentProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  
  var title: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.native
}
object WeakValidationMapTabProps {
  
  @scala.inline
  def apply(): WeakValidationMapTabProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapTabProps]
  }
  
  @scala.inline
  implicit class WeakValidationMapTabPropsOps[Self <: WeakValidationMapTabProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: Validator[js.UndefOr[Null | String]]): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDisableStyles(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableStyles: Self = this.set("disableStyles", js.undefined)
    
    @scala.inline
    def setGlyph(value: Validator[js.UndefOr[IconGlyph | Null]]): Self = this.set("glyph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyph: Self = this.set("glyph", js.undefined)
    
    @scala.inline
    def setId(value: Validator[js.UndefOr[Null | String]]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIndex(value: Validator[js.UndefOr[Double | Null]]): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setLinkProps(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("linkProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkProps: Self = this.set("linkProps", js.undefined)
    
    @scala.inline
    def setOnClick(value: Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setSelected(value: Validator[js.UndefOr[Boolean | Null]]): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setTabContentProps(value: Validator[js.UndefOr[_ | Null]]): Self = this.set("tabContentProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabContentProps: Self = this.set("tabContentProps", js.undefined)
    
    @scala.inline
    def setTitle(value: Validator[js.UndefOr[Null | String]]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
