package typings.extjs.Ext.view

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INodeCache extends IBase {
  
  /** [Method] Removes all elements from this NodeCache
    * @param removeDom Boolean True to also remove the elements from the document.
    */
  var clear: js.UndefOr[js.Function1[/* removeDom */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Clears this NodeCache and adds the elements passed
    * @param els HTMLElement[] An array of DOM elements from which to fill this NodeCache.
    * @returns Ext.view.NodeCache this
    */
  var fill: js.UndefOr[js.Function1[/* els */ js.UndefOr[Array], this.type]] = js.native
  
  /** [Method] Find the index of the passed element within the composite collection
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.dom.Element, or an HtmlElement to find within the composite collection.
    * @returns Number The index of the passed Ext.dom.Element in the composite collection, or -1 if not found.
    */
  var indexOf: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Double]] = js.native
  
  /** [Method] Removes the specified element s
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
    * @param removeDom Boolean True to also remove the element from the document
    */
  var removeElement: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /** [Method] Replaces the specified element with the passed element
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite to replace.
    * @param replacement String/Ext.Element The id of an element or the Element itself.
    * @param domReplace Boolean True to remove and replace the element in the document too.
    * @returns Ext.view.NodeCache this
    */
  var replaceElement: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* replacement */ js.UndefOr[js.Any], 
      /* domReplace */ js.UndefOr[Boolean], 
      this.type
    ]
  ] = js.native
  
  /** [Method] Appends prepends records depending on direction flag
    * @param newRecords Ext.data.Model[] Items to append/prepend
    * @param direction Number -1' = scroll up,0` = scroll down.
    * @param removeCount Number The number of records to remove from the end. if scrolling down, rows are removed from the top and the new rows are added at the bottom.
    */
  var scroll: js.UndefOr[
    js.Function3[
      /* newRecords */ js.UndefOr[Array], 
      /* direction */ js.UndefOr[Double], 
      /* removeCount */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
}
object INodeCache {
  
  @scala.inline
  def apply(): INodeCache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeCache]
  }
  
  @scala.inline
  implicit class INodeCacheOps[Self <: INodeCache] (val x: Self) extends AnyVal {
    
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
    def setClear(value: /* removeDom */ js.UndefOr[Boolean] => Unit): Self = this.set("clear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    
    @scala.inline
    def setFill(value: /* els */ js.UndefOr[Array] => INodeCache): Self = this.set("fill", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setIndexOf(value: /* el */ js.UndefOr[js.Any] => Double): Self = this.set("indexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIndexOf: Self = this.set("indexOf", js.undefined)
    
    @scala.inline
    def setRemoveElement(value: (/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean]) => Unit): Self = this.set("removeElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemoveElement: Self = this.set("removeElement", js.undefined)
    
    @scala.inline
    def setReplaceElement(
      value: (/* el */ js.UndefOr[js.Any], /* replacement */ js.UndefOr[js.Any], /* domReplace */ js.UndefOr[Boolean]) => INodeCache
    ): Self = this.set("replaceElement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteReplaceElement: Self = this.set("replaceElement", js.undefined)
    
    @scala.inline
    def setScroll(
      value: (/* newRecords */ js.UndefOr[Array], /* direction */ js.UndefOr[Double], /* removeCount */ js.UndefOr[Double]) => Unit
    ): Self = this.set("scroll", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
  }
}
