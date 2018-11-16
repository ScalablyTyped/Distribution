package typings
package extjsLib.ExtNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICompositeElementLite
  extends extjsLib.ExtNs.IBase {
  /** [Method] Adds elements to this Composite object
  		* @param els HTMLElement[]/Ext.dom.CompositeElement Either an Array of DOM elements to add, or another Composite object who's elements should be added.
  		* @returns Ext.dom.CompositeElement This Composite object.
  		*/
  var add: js.UndefOr[js.Function1[/* els */ js.UndefOr[js.Any], ICompositeElement]] = js.undefined
  /** [Method] Removes all elements from this Composite
  		* @param removeDom Boolean True to also remove the elements from the document.
  		*/
  var clear: js.UndefOr[js.Function1[/* removeDom */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Returns true if this composite contains the passed element
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.Element, or an HtmlElement to find within the composite collection.
  		* @returns Boolean
  		*/
  var contains: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Calls the passed function for each element in this composite
  		* @param fn Function The function to call.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Element.
  		* @returns Ext.dom.CompositeElement this
  		*/
  var each: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], ICompositeElement]
  ] = js.undefined
  /** [Property] (HTMLElement[]) */
  var elements: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Method] Clears this Composite and adds the elements passed
  		* @param els HTMLElement[]/Ext.dom.CompositeElement Either an array of DOM elements, or another Composite from which to fill this Composite.
  		* @returns Ext.dom.CompositeElement this
  		*/
  var fill: js.UndefOr[js.Function1[/* els */ js.UndefOr[js.Any], ICompositeElement]] = js.undefined
  /** [Method] Filters this composite to only elements that match the passed selector
  		* @param selector String/Function A string CSS selector or a comparison function. The comparison function will be called with the following arguments:
  		* @returns Ext.dom.CompositeElement this
  		*/
  var filter: js.UndefOr[js.Function1[/* selector */ js.UndefOr[js.Any], ICompositeElement]] = js.undefined
  /** [Method] Returns the first Element
  		* @returns Ext.dom.Element
  		*/
  var first: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Method] Returns the number of elements in this Composite
  		* @returns Number
  		*/
  var getCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Find the index of the passed element within the composite collection
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.dom.Element, or an HtmlElement to find within the composite collection.
  		* @returns Number The index of the passed Ext.dom.Element in the composite collection, or -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], scala.Double]] = js.undefined
  /** [Property] (Boolean) */
  var isComposite: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns a flyweight Element of the dom element object at the specified index
  		* @param index Number
  		* @returns Ext.dom.Element
  		*/
  var item: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], IElement]] = js.undefined
  /** [Method] Returns the last Element
  		* @returns Ext.dom.Element
  		*/
  var last: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Method] Removes the specified element s
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
  		* @param removeDom Boolean True to also remove the element from the document.
  		* @returns Ext.dom.CompositeElement this
  		*/
  var removeElement: js.UndefOr[
    js.Function2[
      /* el */ js.UndefOr[js.Any], 
      /* removeDom */ js.UndefOr[scala.Boolean], 
      ICompositeElement
    ]
  ] = js.undefined
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
      /* domReplace */ js.UndefOr[scala.Boolean], 
      ICompositeElement
    ]
  ] = js.undefined
  /** [Method] Gets a range nodes
  		* @param start Number The index of the first node in the range
  		* @param end Number The index of the last node in the range
  		* @returns HTMLElement[] An array of nodes
  		*/
  var slice: js.UndefOr[
    js.Function2[
      /* start */ js.UndefOr[scala.Double], 
      /* end */ js.UndefOr[scala.Double], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
}

