package typings
package extjsLib.ExtNs.ddNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDD extends IDragDrop {
  /** [Method] Sets the element to the location of the mousedown or click event maintaining the cursor location relative to the loc
  		* @param el HTMLElement the element to move
  		* @param iPageX Number the X coordinate of the mousedown or drag event
  		* @param iPageY Number the Y coordinate of the mousedown or drag event
  		*/
  var alignElWithMouse: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[stdLib.HTMLElement], 
      /* iPageX */ js.UndefOr[scala.Double], 
      /* iPageY */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the pointer offset to the distance between the linked element s top left corner and the location the element was
  		* @param iPageX Number the X coordinate of the click
  		* @param iPageY Number the Y coordinate of the click
  		*/
  var autoOffset: js.UndefOr[
    js.Function2[
      /* iPageX */ js.UndefOr[scala.Double], 
      /* iPageY */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Event that fires prior to the onDrag event
  		* @param e Object
  		*/
  var b4Drag: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Event that fires prior to the onMouseDown event
  		* @param e Object
  		*/
  var b4MouseDown: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Saves the most recent position so that we can reset the constraints and tick marks on demand
  		* @param iPageX Number the current x position (this just makes it so we don't have to look it up again)
  		* @param iPageY Number the current y position (this just makes it so we don't have to look it up again)
  		*/
  var cachePosition: js.UndefOr[
    js.Function2[
      /* iPageX */ js.UndefOr[scala.Double], 
      /* iPageY */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (Boolean) */
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the pointer offset
  		* @param iDeltaX Number the distance from the left
  		* @param iDeltaY Number the distance from the top
  		*/
  var setDelta: js.UndefOr[
    js.Function2[
      /* iDeltaX */ js.UndefOr[scala.Double], 
      /* iDeltaY */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the drag element to the location of the mousedown or click event maintaining the cursor location relative to th
  		* @param iPageX Number the X coordinate of the mousedown or drag event
  		* @param iPageY Number the Y coordinate of the mousedown or drag event
  		*/
  var setDragElPos: js.UndefOr[
    js.Function2[
      /* iPageX */ js.UndefOr[scala.Double], 
      /* iPageY */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] toString method
  		* @returns String string representation of the dd obj
  		*/
  @JSName("toString")
  var toString_FIDD: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

