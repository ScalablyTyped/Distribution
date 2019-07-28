package typings.extjs.ExtNs.viewNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IBase
import typings.extjs.ExtNs.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INodeCache extends IBase {
  /** [Method] Removes all elements from this NodeCache
  		* @param removeDom Boolean True to also remove the elements from the document.
  		*/
  var clear: js.UndefOr[js.Function1[/* removeDom */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Clears this NodeCache and adds the elements passed
  		* @param els HTMLElement[] An array of DOM elements from which to fill this NodeCache.
  		* @returns Ext.view.NodeCache this
  		*/
  var fill: js.UndefOr[js.Function1[/* els */ js.UndefOr[Array], this.type]] = js.undefined
  /** [Method] Find the index of the passed element within the composite collection
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.dom.Element, or an HtmlElement to find within the composite collection.
  		* @returns Number The index of the passed Ext.dom.Element in the composite collection, or -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], Double]] = js.undefined
  /** [Method] Removes the specified element s
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
  		* @param removeDom Boolean True to also remove the element from the document
  		*/
  var removeElement: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
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
  ] = js.undefined
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
  ] = js.undefined
}

object INodeCache {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clear: /* removeDom */ js.UndefOr[Boolean] => Unit = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    fill: /* els */ js.UndefOr[Array] => INodeCache = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    indexOf: /* el */ js.UndefOr[js.Any] => Double = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => INodeCache = null,
    mixins: js.Any = null,
    removeElement: (/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[Boolean]) => Unit = null,
    replaceElement: (/* el */ js.UndefOr[js.Any], /* replacement */ js.UndefOr[js.Any], /* domReplace */ js.UndefOr[Boolean]) => INodeCache = null,
    requires: Array = null,
    scroll: (/* newRecords */ js.UndefOr[Array], /* direction */ js.UndefOr[Double], /* removeCount */ js.UndefOr[Double]) => Unit = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): INodeCache = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction1(clear))
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fill != null) __obj.updateDynamic("fill")(js.Any.fromFunction1(fill))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1(indexOf))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (removeElement != null) __obj.updateDynamic("removeElement")(js.Any.fromFunction2(removeElement))
    if (replaceElement != null) __obj.updateDynamic("replaceElement")(js.Any.fromFunction3(replaceElement))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction3(scroll))
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[INodeCache]
  }
}

