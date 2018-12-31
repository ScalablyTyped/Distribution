package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextMetrics
  extends extjsLib.ExtNs.IBase {
  /** [Method] Binds this TextMetrics instance to a new element
  		* @param el String/HTMLElement/Ext.Element The element or its ID.
  		*/
  var bind: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Destroy this instance */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns the measured height of the specified text
  		* @param text String The text to measure
  		* @returns Number height The height in pixels
  		*/
  var getHeight: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Double]] = js.undefined
  /** [Method] Returns the size of the specified text based on the internal element s style and width properties
  		* @param text String The text to measure
  		* @returns Object An object containing the text's size {width: (width), height: (height)}
  		*/
  var getSize: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], _]] = js.undefined
  /** [Method] Returns the measured width of the specified text
  		* @param text String The text to measure
  		* @returns Number width The width in pixels
  		*/
  var getWidth: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Double]] = js.undefined
  /** [Method] Sets a fixed width on the internal measurement element
  		* @param width Number The width to set on the element
  		*/
  var setFixedWidth: js.UndefOr[js.Function1[/* width */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
}

