package typings
package extjsLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpriteDD
  extends extjsLib.ExtNs.ddNs.IDragSource {
  /** [Method] Returns a reference to the actual element to drag
  		* @param e Object
  		* @returns HTMLElement the html element
  		*/
  @JSName("getDragEl")
  var getDragEl_ISpriteDD: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], stdLib.HTMLElement]] = js.undefined
  /** [Method] Abstract method called during the onMouseMove event while dragging an object
  		* @param e Object
  		*/
  @JSName("onDrag")
  var onDrag_ISpriteDD: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the drag element to the location of the mousedown or click event maintaining the cursor location relative to th  */
  @JSName("setDragElPos")
  var setDragElPos_ISpriteDD: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

