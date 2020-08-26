package typings.extjs.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompositeElementLite extends IBase {
  /** [Method] Adds elements to this Composite object
    * @param els HTMLElement[]/Ext.dom.CompositeElement Either an Array of DOM elements to add, or another Composite object who's elements should be added.
    * @returns Ext.dom.CompositeElement This Composite object.
    */
  var add: js.UndefOr[
    js.Function1[/* els */ js.UndefOr[js.Any], typings.extjs.Ext.dom.ICompositeElement]
  ] = js.native
  /** [Method] Removes all elements from this Composite
    * @param removeDom Boolean True to also remove the elements from the document.
    */
  var clear: js.UndefOr[js.Function1[/* removeDom */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Returns true if this composite contains the passed element
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.Element, or an HtmlElement to find within the composite collection.
    * @returns Boolean
    */
  var contains: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Method] Calls the passed function for each element in this composite
    * @param fn Function The function to call.
    * @param scope Object The scope (this reference) in which the function is executed. Defaults to the Element.
    * @returns Ext.dom.CompositeElement this
    */
  var each: js.UndefOr[
    js.Function2[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      typings.extjs.Ext.dom.ICompositeElement
    ]
  ] = js.native
  /** [Property] (HTMLElement[]) */
  var elements: js.UndefOr[Array] = js.native
  /** [Method] Clears this Composite and adds the elements passed
    * @param els HTMLElement[]/Ext.dom.CompositeElement Either an array of DOM elements, or another Composite from which to fill this Composite.
    * @returns Ext.dom.CompositeElement this
    */
  var fill: js.UndefOr[
    js.Function1[/* els */ js.UndefOr[js.Any], typings.extjs.Ext.dom.ICompositeElement]
  ] = js.native
  /** [Method] Filters this composite to only elements that match the passed selector
    * @param selector String/Function A string CSS selector or a comparison function. The comparison function will be called with the following arguments:
    * @returns Ext.dom.CompositeElement this
    */
  var filter: js.UndefOr[
    js.Function1[/* selector */ js.UndefOr[js.Any], typings.extjs.Ext.dom.ICompositeElement]
  ] = js.native
  /** [Method] Returns the first Element
    * @returns Ext.dom.Element
    */
  var first: js.UndefOr[js.Function0[typings.extjs.Ext.dom.IElement]] = js.native
  /** [Method] Returns the number of elements in this Composite
    * @returns Number
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Find the index of the passed element within the composite collection
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.dom.Element, or an HtmlElement to find within the composite collection.
    * @returns Number The index of the passed Ext.dom.Element in the composite collection, or -1 if not found.
    */
  var indexOf: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Double]] = js.native
  /** [Property] (Boolean) */
  var isComposite: js.UndefOr[Boolean] = js.native
  /** [Method] Returns a flyweight Element of the dom element object at the specified index
    * @param index Number
    * @returns Ext.dom.Element
    */
  var item: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], typings.extjs.Ext.dom.IElement]] = js.native
  /** [Method] Returns the last Element
    * @returns Ext.dom.Element
    */
  var last: js.UndefOr[js.Function0[typings.extjs.Ext.dom.IElement]] = js.native
  /** [Method] Removes the specified element s
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
    * @param removeDom Boolean True to also remove the element from the document.
    * @returns Ext.dom.CompositeElement this
    */
  var removeElement: js.UndefOr[
    js.Function2[
      /* el */ js.UndefOr[js.Any], 
      /* removeDom */ js.UndefOr[Boolean], 
      typings.extjs.Ext.dom.ICompositeElement
    ]
  ] = js.native
  /** [Method] Replaces the specified element with the passed element
    * @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite to replace.
    * @param replacement String/Ext.Element The id of an element or the Element itself.
    * @param domReplace Boolean True to remove and replace the element in the document too.
    * @returns Ext.dom.CompositeElement this
    */
  var replaceElement: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* replacement */ js.UndefOr[js.Any], 
      /* domReplace */ js.UndefOr[Boolean], 
      typings.extjs.Ext.dom.ICompositeElement
    ]
  ] = js.native
  /** [Method] Gets a range nodes
    * @param start Number The index of the first node in the range
    * @param end Number The index of the last node in the range
    * @returns HTMLElement[] An array of nodes
    */
  var slice: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], Array]
  ] = js.native
}

object ICompositeElementLite {
  @scala.inline
  def apply(): ICompositeElementLite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICompositeElementLite]
  }
  @scala.inline
  implicit class ICompositeElementLiteOps[Self <: ICompositeElementLite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdd(value: /* els */ js.UndefOr[js.Any] => typings.extjs.Ext.dom.ICompositeElement): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setClear(value: /* removeDom */ js.UndefOr[Boolean] => Unit): Self = this.set("clear", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setContains(value: /* el */ js.UndefOr[js.Any] => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    @scala.inline
    def setEach(
      value: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => typings.extjs.Ext.dom.ICompositeElement
    ): Self = this.set("each", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEach: Self = this.set("each", js.undefined)
    @scala.inline
    def setElements(value: Array): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    @scala.inline
    def setFill(value: /* els */ js.UndefOr[js.Any] => typings.extjs.Ext.dom.ICompositeElement): Self = this.set("fill", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFilter(value: /* selector */ js.UndefOr[js.Any] => typings.extjs.Ext.dom.ICompositeElement): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFirst(value: () => typings.extjs.Ext.dom.IElement): Self = this.set("first", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    @scala.inline
    def setGetCount(value: () => Double): Self = this.set("getCount", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCount: Self = this.set("getCount", js.undefined)
    @scala.inline
    def setIndexOf(value: /* el */ js.UndefOr[js.Any] => Double): Self = this.set("indexOf", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIndexOf: Self = this.set("indexOf", js.undefined)
    @scala.inline
    def setIsComposite(value: Boolean): Self = this.set("isComposite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsComposite: Self = this.set("isComposite", js.undefined)
    @scala.inline
    def setItem(value: /* index */ js.UndefOr[Double] => typings.extjs.Ext.dom.IElement): Self = this.set("item", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setLast(value: () => typings.extjs.Ext.dom.IElement): Self = this.set("last", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    @scala.inline
    def setRemoveElement(
      value: (/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean]) => typings.extjs.Ext.dom.ICompositeElement
    ): Self = this.set("removeElement", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRemoveElement: Self = this.set("removeElement", js.undefined)
    @scala.inline
    def setReplaceElement(
      value: (/* el */ js.UndefOr[js.Any], /* replacement */ js.UndefOr[js.Any], /* domReplace */ js.UndefOr[Boolean]) => typings.extjs.Ext.dom.ICompositeElement
    ): Self = this.set("replaceElement", js.Any.fromFunction3(value))
    @scala.inline
    def deleteReplaceElement: Self = this.set("replaceElement", js.undefined)
    @scala.inline
    def setSlice(value: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Array): Self = this.set("slice", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSlice: Self = this.set("slice", js.undefined)
  }
  
}

