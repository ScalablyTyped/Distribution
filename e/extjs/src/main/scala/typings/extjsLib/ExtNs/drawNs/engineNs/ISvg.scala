package typings
package extjsLib.ExtNs.drawNs.engineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISvg
  extends extjsLib.ExtNs.drawNs.ISurface {
  /** [Method] Insert or move a given sprite s element to the correct place in the DOM list for its zIndex
  		* @param sprite Ext.draw.Sprite
  		*/
  var applyZIndex: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[extjsLib.ExtNs.drawNs.ISprite], scala.Unit]] = js.undefined
  /** [Method] Get the region for the surface s canvas area
  		* @returns Ext.util.Region
  		*/
  var getRegion: js.UndefOr[js.Function0[extjsLib.ExtNs.utilNs.IRegion]] = js.undefined
  /** [Method] Checks if the specified CSS class exists on this element s DOM node
  		* @param sprite Ext.draw.Sprite The sprite to look into.
  		* @param className String The CSS class to check for
  		* @returns Boolean True if the class exists, else false
  		*/
  var hasCls: js.UndefOr[
    js.Function2[
      /* sprite */ js.UndefOr[extjsLib.ExtNs.drawNs.ISprite], 
      /* className */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] Sets the size of the surface
  		* @param width Object
  		* @param height Object
  		*/
  @JSName("setSize")
  var setSize_ISvg: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Changes the text in the sprite element
  		* @param sprite Object
  		* @param textString Object
  		*/
  @JSName("setText")
  var setText_ISvg: js.UndefOr[
    js.Function2[/* sprite */ js.UndefOr[js.Any], /* textString */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
}

