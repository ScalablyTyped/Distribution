package typings
package extjsLib.ExtNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IContext
  extends extjsLib.ExtNs.IBase {
  /** [Method] Flushes any pending writes to the DOM by calling each ContextItem in the flushQueue  */
  var flush: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the ContextItem for a component
  		* @param cmp Ext.Component
  		*/
  var getCmp: js.UndefOr[js.Function1[/* cmp */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Unit]] = js.undefined
  /** [Method] Returns the ContextItem for an element
  		* @param parent Ext.layout.ContextItem
  		* @param el Ext.dom.Element
  		*/
  var getEl: js.UndefOr[
    js.Function2[
      /* parent */ js.UndefOr[IContextItem], 
      /* el */ js.UndefOr[extjsLib.ExtNs.domNs.IElement], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Invalidates one or more components layouts component and container
  		* @param components Ext.Component/Array An array of Components or a single Component.
  		* @param full Boolean True if all properties should be invalidated, otherwise only those calculated by the component should be invalidated.
  		*/
  var invalidate: js.UndefOr[
    js.Function2[
      /* components */ js.UndefOr[js.Any], 
      /* full */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (Ext.util.Queue) */
  var layoutQueue: js.UndefOr[extjsLib.ExtNs.utilNs.IQueue] = js.undefined
  /** [Method] Removes the ContextItem for an element from the cache and from the parent s children array
  		* @param parent Ext.layout.ContextItem
  		* @param el Ext.dom.Element
  		*/
  var removeEl: js.UndefOr[
    js.Function2[
      /* parent */ js.UndefOr[IContextItem], 
      /* el */ js.UndefOr[extjsLib.ExtNs.domNs.IElement], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Resets the given layout object
  		* @param layout Object
  		* @param ownerContext Object
  		* @param firstTime Object
  		*/
  var resetLayout: js.UndefOr[
    js.Function3[
      /* layout */ js.UndefOr[js.Any], 
      /* ownerContext */ js.UndefOr[js.Any], 
      /* firstTime */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Runs the layout calculations
  		* @returns Boolean True if all layouts were completed, false if not.
  		*/
  var run: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Performs one layout cycle by calling each layout in the layout queue
  		* @returns Boolean True if some progress was made, false if not.
  		*/
  var runCycle: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Set the size of a component element or composite or an array of components or elements
  		* @param items Ext.Component/Ext.Component[]/Ext.dom.Element/Ext.dom.Element[]/Ext.dom.CompositeElement The item(s) to size.
  		* @param width Number The new width to set (ignored if undefined or NaN).
  		* @param height Number The new height to set (ignored if undefined or NaN).
  		*/
  var setItemSize: js.UndefOr[
    js.Function3[
      /* items */ js.UndefOr[js.Any], 
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (Number) */
  var state: js.UndefOr[scala.Double] = js.undefined
}

