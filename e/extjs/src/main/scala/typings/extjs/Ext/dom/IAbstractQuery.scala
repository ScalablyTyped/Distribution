package typings.extjs.Ext.dom

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAbstractQuery extends IBase {
  
  /** [Method] Returns true if the passed element s match the passed simple selector e g
    * @param el String/HTMLElement/Array An element id, element or array of elements
    * @param selector String The simple selector to test
    * @returns Boolean
    */
  var is: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* selector */ js.UndefOr[String], Boolean]
  ] = js.native
  
  /** [Method] Selects a group of elements
    * @param selector String The selector/xpath query (can be a comma separated list of selectors)
    * @param root HTMLElement/String The start of the query (defaults to document).
    * @returns HTMLElement[] An Array of DOM elements which match the selector. If there are no matches, and empty Array is returned.
    */
  var select: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* root */ js.UndefOr[js.Any], Array]
  ] = js.native
  
  /** [Method] Selects a single element
    * @param selector String The selector/xpath query
    * @param root HTMLElement/String The start of the query (defaults to document).
    * @returns HTMLElement The DOM element which matched the selector.
    */
  var selectNode: js.UndefOr[
    js.Function2[/* selector */ js.UndefOr[String], /* root */ js.UndefOr[js.Any], HTMLElement]
  ] = js.native
}
object IAbstractQuery {
  
  @scala.inline
  def apply(): IAbstractQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractQuery]
  }
  
  @scala.inline
  implicit class IAbstractQueryOps[Self <: IAbstractQuery] (val x: Self) extends AnyVal {
    
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
    def setIs(value: (/* el */ js.UndefOr[js.Any], /* selector */ js.UndefOr[String]) => Boolean): Self = this.set("is", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIs: Self = this.set("is", js.undefined)
    
    @scala.inline
    def setSelect(value: (/* selector */ js.UndefOr[String], /* root */ js.UndefOr[js.Any]) => Array): Self = this.set("select", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSelectNode(value: (/* selector */ js.UndefOr[String], /* root */ js.UndefOr[js.Any]) => HTMLElement): Self = this.set("selectNode", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSelectNode: Self = this.set("selectNode", js.undefined)
  }
}
