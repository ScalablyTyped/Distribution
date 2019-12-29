package typings.extjs.Ext.dom

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompositeElementLite extends IBase {
  /** [Method] Adds elements to this Composite object
  		* @param els HTMLElement[]/Ext.dom.CompositeElement Either an Array of DOM elements to add, or another Composite object who's elements should be added.
  		* @returns Ext.dom.CompositeElement This Composite object.
  		*/
  var add: js.UndefOr[js.Function1[/* els */ js.UndefOr[js.Any], ICompositeElement]] = js.undefined
  /** [Method] Removes all elements from this Composite
  		* @param removeDom Boolean True to also remove the elements from the document.
  		*/
  var clear: js.UndefOr[js.Function1[/* removeDom */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Returns true if this composite contains the passed element
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.Element, or an HtmlElement to find within the composite collection.
  		* @returns Boolean
  		*/
  var contains: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Boolean]] = js.undefined
  /** [Method] Calls the passed function for each element in this composite
  		* @param fn Function The function to call.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Element.
  		* @returns Ext.dom.CompositeElement this
  		*/
  var each: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], ICompositeElement]
  ] = js.undefined
  /** [Property] (HTMLElement[]) */
  var elements: js.UndefOr[Array] = js.undefined
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
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Find the index of the passed element within the composite collection
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.dom.Element, or an HtmlElement to find within the composite collection.
  		* @returns Number The index of the passed Ext.dom.Element in the composite collection, or -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Double]] = js.undefined
  /** [Property] (Boolean) */
  var isComposite: js.UndefOr[Boolean] = js.undefined
  /** [Method] Returns a flyweight Element of the dom element object at the specified index
  		* @param index Number
  		* @returns Ext.dom.Element
  		*/
  var item: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], IElement]] = js.undefined
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
    js.Function2[/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean], ICompositeElement]
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
      /* domReplace */ js.UndefOr[Boolean], 
      ICompositeElement
    ]
  ] = js.undefined
  /** [Method] Gets a range nodes
  		* @param start Number The index of the first node in the range
  		* @param end Number The index of the last node in the range
  		* @returns HTMLElement[] An array of nodes
  		*/
  var slice: js.UndefOr[
    js.Function2[/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double], Array]
  ] = js.undefined
}

object ICompositeElementLite {
  @scala.inline
  def apply(
    add: /* els */ js.UndefOr[js.Any] => ICompositeElement = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clear: /* removeDom */ js.UndefOr[Boolean] => Unit = null,
    config: js.Any = null,
    contains: /* el */ js.UndefOr[js.Any] => Boolean = null,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => ICompositeElement = null,
    elements: Array = null,
    extend: String = null,
    fill: /* els */ js.UndefOr[js.Any] => ICompositeElement = null,
    filter: /* selector */ js.UndefOr[js.Any] => ICompositeElement = null,
    first: () => IElement = null,
    getCount: () => Double = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    indexOf: /* el */ js.UndefOr[js.Any] => Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => ICompositeElementLite = null,
    isComposite: js.UndefOr[Boolean] = js.undefined,
    item: /* index */ js.UndefOr[Double] => IElement = null,
    last: () => IElement = null,
    mixins: js.Any = null,
    removeElement: (/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean]) => ICompositeElement = null,
    replaceElement: (/* el */ js.UndefOr[js.Any], /* replacement */ js.UndefOr[js.Any], /* domReplace */ js.UndefOr[Boolean]) => ICompositeElement = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    slice: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Array = null,
    statics: js.Any = null,
    uses: Array = null
  ): ICompositeElementLite = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1(add))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction1(clear))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1(contains))
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2(each))
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(js.Any.fromFunction1(fill))
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction0(first))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1(indexOf))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isComposite)) __obj.updateDynamic("isComposite")(isComposite.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(js.Any.fromFunction1(item))
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction0(last))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (removeElement != null) __obj.updateDynamic("removeElement")(js.Any.fromFunction2(removeElement))
    if (replaceElement != null) __obj.updateDynamic("replaceElement")(js.Any.fromFunction3(replaceElement))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (slice != null) __obj.updateDynamic("slice")(js.Any.fromFunction2(slice))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompositeElementLite]
  }
}

