package typings
package extjsLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(extjsLib.ExtNs.utilNs.IAnimate because Would inherit conflicting mutable fields List(alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses))*/
trait ISprite
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Adds one or more CSS classes to the element
  		* @param className String/String[] The CSS class to add, or an array of classes
  		* @returns Ext.draw.Sprite this
  		*/
  var addCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Performs custom animation on this object
  		* @param config Object Configuration for Ext.fx.Anim. Note that the to config is required.
  		* @returns Object this
  		*/
  var animate: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Property] (Ext.dd.DragSource) */
  var dd: js.UndefOr[extjsLib.ExtNs.ddNs.IDragSource] = js.undefined
  /** [Method] Removes the sprite and clears all listeners  */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var font: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var getActiveAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Retrieves the bounding box of the sprite
  		* @returns Object bbox
  		*/
  var getBBox: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String/String[]) */
  var group: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var hasActiveFx: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Number) */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Hides the sprite
  		* @param redraw Boolean Flag to immediately draw the change.
  		* @returns Ext.draw.Sprite this
  		*/
  var hide: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[scala.Boolean], this.type]] = js.undefined
  /** [Property] (Boolean) */
  var isSprite: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var radiusX: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var radiusY: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Redraws the sprite
  		* @returns Ext.draw.Sprite this
  		*/
  var redraw: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Removes the sprite
  		* @returns Boolean True if sprite was successfully removed. False when there was no surface to remove it from.
  		*/
  var remove: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Removes one or more CSS classes from the element
  		* @param className String/String[] The CSS class to remove, or an array of classes. Note this method is severly limited in VML.
  		* @returns Ext.draw.Sprite this
  		*/
  var removeCls: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
  		* @returns Object this
  		*/
  var sequenceFx: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Change the attributes of the sprite
  		* @param attrs Object attributes to be changed on the sprite.
  		* @param redraw Boolean Flag to immediately draw the change.
  		* @returns Ext.draw.Sprite this
  		*/
  var setAttributes: js.UndefOr[
    js.Function2[/* attrs */ js.UndefOr[js.Any], /* redraw */ js.UndefOr[scala.Boolean], this.type]
  ] = js.undefined
  /** [Method] Wrapper for setting style properties also takes single object parameter of multiple styles
  		* @param property String/Object The style property to be set, or an object of multiple styles.
  		* @param value String The value to apply to the given property, or null if an object was passed.
  		* @returns Ext.draw.Sprite this
  		*/
  var setStyle: js.UndefOr[
    js.Function2[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[java.lang.String], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Shows the sprite
  		* @param redraw Boolean Flag to immediately draw the change.
  		* @returns Ext.draw.Sprite this
  		*/
  var show: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[scala.Boolean], this.type]] = js.undefined
  /** [Config Option] (String) */
  var src: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopAnimation: js.UndefOr[js.Function0[extjsLib.ExtNs.IElement]] = js.undefined
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopFx: js.UndefOr[js.Function0[extjsLib.ExtNs.IElement]] = js.undefined
  /** [Config Option] (String) */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var strokewidth: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
  		* @returns Object this
  		*/
  var syncFx: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var x: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var y: js.UndefOr[scala.Double] = js.undefined
}

