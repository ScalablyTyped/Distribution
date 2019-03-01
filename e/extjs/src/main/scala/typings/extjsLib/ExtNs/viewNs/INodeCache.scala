package typings
package extjsLib.ExtNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INodeCache
  extends extjsLib.ExtNs.IBase {
  /** [Method] Removes all elements from this NodeCache
  		* @param removeDom Boolean True to also remove the elements from the document.
  		*/
  var clear: js.UndefOr[js.Function1[/* removeDom */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Clears this NodeCache and adds the elements passed
  		* @param els HTMLElement[] An array of DOM elements from which to fill this NodeCache.
  		* @returns Ext.view.NodeCache this
  		*/
  var fill: js.UndefOr[js.Function1[/* els */ js.UndefOr[extjsLib.ExtNs.Array], this.type]] = js.undefined
  /** [Method] Find the index of the passed element within the composite collection
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.dom.Element, or an HtmlElement to find within the composite collection.
  		* @returns Number The index of the passed Ext.dom.Element in the composite collection, or -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], scala.Double]] = js.undefined
  /** [Method] Removes the specified element s
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
  		* @param removeDom Boolean True to also remove the element from the document
  		*/
  var removeElement: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[scala.Boolean], scala.Unit]
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
      /* domReplace */ js.UndefOr[scala.Boolean], 
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
      /* newRecords */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* direction */ js.UndefOr[scala.Double], 
      /* removeCount */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
}

object INodeCache {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clear: js.Function1[/* removeDom */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    fill: js.Function1[/* els */ js.UndefOr[extjsLib.ExtNs.Array], INodeCache] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    indexOf: js.Function1[/* el */ js.UndefOr[js.Any], scala.Double] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], INodeCache] = null,
    mixins: js.Any = null,
    removeElement: js.Function2[/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    replaceElement: js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* replacement */ js.UndefOr[js.Any], 
      /* domReplace */ js.UndefOr[scala.Boolean], 
      INodeCache
    ] = null,
    requires: extjsLib.ExtNs.Array = null,
    scroll: js.Function3[
      /* newRecords */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* direction */ js.UndefOr[scala.Double], 
      /* removeCount */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): INodeCache = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (indexOf != null) __obj.updateDynamic("indexOf")(indexOf)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (removeElement != null) __obj.updateDynamic("removeElement")(removeElement)
    if (replaceElement != null) __obj.updateDynamic("replaceElement")(replaceElement)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[INodeCache]
  }
}

