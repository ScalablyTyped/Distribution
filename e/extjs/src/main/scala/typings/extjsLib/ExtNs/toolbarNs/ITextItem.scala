package typings
package extjsLib.ExtNs.toolbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITextItem extends IItem {
  /** [Method] Updates this item s text setting the text to be used as innerHTML
  		* @param text String The text to display (html accepted).
  		*/
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

