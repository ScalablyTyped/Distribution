package typings
package extjsLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- extjsLib.ExtNs.utilNs.IAnimate because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined animate, getActiveAnimation, hasActiveFx, sequenceFx, stopAnimation, stopFx, syncFx */ trait ICompositeSprite
  extends extjsLib.ExtNs.utilNs.IMixedCollection {
  /** [Method] Adds class to all sprites
  		* @param cls String CSS class name
  		*/
  var addCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Performs custom animation on this object
  		* @param config Object Configuration for Ext.fx.Anim. Note that the to config is required.
  		* @returns Object this
  		*/
  var animate: js.UndefOr[js.Any | (js.Function1[/* config */ js.UndefOr[js.Any], _])] = js.undefined
  /** [Method] Destroys this CompositeSprite  */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var getActiveAnimation: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the group bounding box
  		* @returns Object an object with x, y, width, and height properties.
  		*/
  var getBBox: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
  		* @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
  		*/
  var hasActiveFx: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Hides all sprites
  		* @param redraw Boolean Flag to immediately draw the change.
  		* @returns Ext.draw.CompositeSprite this
  		*/
  var hide: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[scala.Boolean], this.type]] = js.undefined
  /** [Method] Inserts an item at the specified index in the collection
  		* @param index Object
  		* @param key Object
  		* @param o Object
  		* @returns Object The item inserted or an array of items inserted.
  		*/
  @JSName("insert")
  var insert_ICompositeSprite: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[js.Any], 
      /* key */ js.UndefOr[js.Any], 
      /* o */ js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Force redraw of all sprites  */
  var redraw: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Removes class from all sprites
  		* @param cls String CSS class name
  		*/
  var removeCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
  		* @returns Object this
  		*/
  var sequenceFx: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Iterates through all sprites calling setAttributes on each one
  		* @param attrs Object Attributes to be changed on the sprite.
  		* @param redraw Boolean Flag to immediately draw the change.
  		* @returns Ext.draw.CompositeSprite this
  		*/
  var setAttributes: js.UndefOr[
    js.Function2[/* attrs */ js.UndefOr[js.Any], /* redraw */ js.UndefOr[scala.Boolean], this.type]
  ] = js.undefined
  /** [Method] Sets style for all sprites
  		* @param style String CSS Style definition.
  		*/
  var setStyle: js.UndefOr[js.Function1[/* style */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Shows all sprites
  		* @param redraw Boolean Flag to immediately draw the change.
  		* @returns Ext.draw.CompositeSprite this
  		*/
  var show: js.UndefOr[js.Function1[/* redraw */ js.UndefOr[scala.Boolean], this.type]] = js.undefined
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopAnimation: js.UndefOr[js.Function0[extjsLib.ExtNs.IElement]] = js.undefined
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
  		* @returns Ext.Element The Element
  		*/
  var stopFx: js.UndefOr[js.Function0[extjsLib.ExtNs.IElement]] = js.undefined
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
  		* @returns Object this
  		*/
  var syncFx: js.UndefOr[js.Function0[_]] = js.undefined
}

