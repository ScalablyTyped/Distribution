package typings
package extjsLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISurface
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Adds a Sprite to the surface
  		* @param args Ext.draw.Sprite[]/Ext.draw.Sprite... One or more Sprite objects or configs.
  		* @returns Ext.draw.Sprite[]/Ext.draw.Sprite The sprites added.
  		*/
  var add: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Adds one or more CSS classes to the element
  		* @param sprite Object The sprite to add the class to.
  		* @param className String/String[] The CSS class to add, or an array of classes
  		*/
  var addCls: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* className */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Adds a gradient definition to the Surface
  		* @param gradient Object A gradient config.
  		*/
  var addGradient: js.UndefOr[js.Function1[/* gradient */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Destroys the surface  */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns a new group or an existent group associated with the current surface
  		* @param id String The unique identifier of the group.
  		* @returns Object The Ext.draw.CompositeSprite.
  		*/
  var getGroup: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Retrieves the id of this component  */
  var getId: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Ext.draw.Sprite[]) */
  var items: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Method] Removes a given sprite from the surface optionally destroying the sprite in the process
  		* @param sprite Ext.draw.Sprite
  		* @param destroySprite Boolean
  		*/
  var remove: js.UndefOr[
    js.Function2[
      /* sprite */ js.UndefOr[ISprite], 
      /* destroySprite */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Removes all sprites from the surface optionally destroying the sprites in the process
  		* @param destroySprites Boolean Whether to destroy all sprites when removing them.
  		*/
  var removeAll: js.UndefOr[js.Function1[/* destroySprites */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Removes one or more CSS classes from the element
  		* @param sprite Object The sprite to remove the class from.
  		* @param className String/String[] The CSS class to remove, or an array of classes
  		*/
  var removeCls: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* className */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the size of the surface
  		* @param w Number The new width of the canvas.
  		* @param h Number The new height of the canvas.
  		*/
  var setSize: js.UndefOr[
    js.Function2[/* w */ js.UndefOr[scala.Double], /* h */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  /** [Method] Sets CSS style attributes to an element
  		* @param sprite Object The sprite to add, or an array of classes to
  		* @param styles Object An Object with CSS styles.
  		*/
  var setStyle: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* styles */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Changes the text in the sprite element
  		* @param sprite Object The Sprite to change the text.
  		* @param text String The new text to be set.
  		*/
  var setText: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* text */ js.UndefOr[java.lang.String], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Number) */
  var width: js.UndefOr[scala.Double] = js.undefined
}

