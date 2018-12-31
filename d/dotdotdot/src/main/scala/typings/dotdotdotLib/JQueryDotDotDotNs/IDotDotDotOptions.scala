package typings
package dotdotdotLib.JQueryDotDotDotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDotDotDotOptions extends js.Object {
  /** jQuery-selector for the element to keep and put after the ellipsis.
    * Default: null
    */
  var after: js.UndefOr[java.lang.String | dotdotdotLib.JQuery] = js.undefined
   //
  /** Callback function that is fired after the ellipsis is added,
    * receives two parameters:
    * @param isTruncated (boolean)
    * @param orgContent (string) Documentation says it is string but it is object
    *        which has e.g.
    *                 context: HTMLHtmlElement;
    *                 length: number; // seems to be always 1
    *                 [index] // this contains the text: orgContent[0].data
    */
  var callback: js.UndefOr[
    js.Function2[/* isTruncated */ scala.Boolean, /* orgContent */ js.Any, scala.Unit]
  ] = js.undefined
  /**	The text to add as ellipsis.
    * Default: '... '
    */
  var ellipsis: js.UndefOr[java.lang.String] = js.undefined
  /** Wrap-option fallback to 'letter' for long words
    * Default: true
    */
  var fallbackToLetter: js.UndefOr[scala.Boolean] = js.undefined
  /** Optionally set a max-height, if null, the height will be measured.
    * Default: null
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  var lastCharacter: js.UndefOr[IDotDotDotOptionsLastCharacter] = js.undefined
  /** Deviation for the height-option.
    * Default: 0
    */
  var tolerance: js.UndefOr[scala.Double] = js.undefined
  /** Whether to update the ellipsis: true/'window'
    * Default: false
    */
  var watch: js.UndefOr[scala.Boolean | dotdotdotLib.dotdotdotLibStrings.window] = js.undefined
  /** How to cut off the text/html: 'word'/'letter'/'children'
    * Default: 'word'
    */
  var wrap: js.UndefOr[java.lang.String] = js.undefined
}

