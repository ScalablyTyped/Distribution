package typings.extjs.Ext.dom

import typings.extjs.Ext.ITemplate
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHelper extends IAbstractHelper {
  
  /** [Method] Creates new DOM element s without inserting them to the document
    * @param o Object/String The DOM object spec (and children) or raw HTML blob
    * @returns HTMLElement The new uninserted node
    */
  var createDom: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], HTMLElement]] = js.native
  
  /** [Method] Alias for markup
    * @param spec Object The DOM object spec (and children)
    * @returns String
    */
  var createHtml: js.UndefOr[js.Function1[/* spec */ js.UndefOr[js.Any], String]] = js.native
  
  /** [Method] Creates a new Ext Template from the DOM object spec
    * @param o Object The DOM object spec (and children)
    * @returns Ext.Template The new template
    */
  var createTemplate: js.UndefOr[js.Function1[/* o */ js.UndefOr[js.Any], ITemplate]] = js.native
  
  /** [Property] (Boolean) */
  var useDom: js.UndefOr[Boolean] = js.native
}
object IHelper {
  
  @scala.inline
  def apply(): IHelper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHelper]
  }
  
  @scala.inline
  implicit class IHelperOps[Self <: IHelper] (val x: Self) extends AnyVal {
    
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
    def setCreateDom(value: /* o */ js.UndefOr[js.Any] => HTMLElement): Self = this.set("createDom", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreateDom: Self = this.set("createDom", js.undefined)
    
    @scala.inline
    def setCreateHtml(value: /* spec */ js.UndefOr[js.Any] => String): Self = this.set("createHtml", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreateHtml: Self = this.set("createHtml", js.undefined)
    
    @scala.inline
    def setCreateTemplate(value: /* o */ js.UndefOr[js.Any] => ITemplate): Self = this.set("createTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreateTemplate: Self = this.set("createTemplate", js.undefined)
    
    @scala.inline
    def setUseDom(value: Boolean): Self = this.set("useDom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDom: Self = this.set("useDom", js.undefined)
  }
}
