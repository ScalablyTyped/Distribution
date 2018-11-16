package typings
package extjsLib.ExtNs.layoutNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICard extends IFit {
  /** [Config Option] (Boolean) */
  var deferredRender: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Return the active visible component in the layout
  		* @returns Ext.Component
  		*/
  var getActiveItem: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Return the active visible component in the layout to the next card
  		* @returns Ext.Component The next component or false.
  		*/
  var getNext: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Return the active visible component in the layout to the previous card
  		* @returns Ext.Component The previous component or false.
  		*/
  var getPrev: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Sets the active visible component in the layout to the next card
  		* @returns Ext.Component the activated component or false when nothing activated.
  		*/
  var next: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Sets the active visible component in the layout to the previous card
  		* @returns Ext.Component the activated component or false when nothing activated.
  		*/
  var prev: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Makes the given card active
  		* @param newCard Ext.Component/Number/String The component, component id, itemId, or index of component.
  		* @returns Ext.Component the activated component or false when nothing activated. False is returned also when trying to activate an already active card.
  		*/
  var setActiveItem: js.UndefOr[js.Function1[/* newCard */ js.UndefOr[js.Any], extjsLib.ExtNs.IComponent]] = js.undefined
}

