package typings.dotdotdot.JQueryDotDotDotNs

import typings.dotdotdot.JQuery
import typings.dotdotdot.dotdotdotStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDotDotDotOptions extends js.Object {
  /** jQuery-selector for the element to keep and put after the ellipsis.
    * Default: null
    */
  var after: js.UndefOr[String | JQuery] = js.undefined
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
  var callback: js.UndefOr[js.Function2[/* isTruncated */ Boolean, /* orgContent */ js.Any, Unit]] = js.undefined
  /**	The text to add as ellipsis.
    * Default: '... '
    */
  var ellipsis: js.UndefOr[String] = js.undefined
  /** Wrap-option fallback to 'letter' for long words
    * Default: true
    */
  var fallbackToLetter: js.UndefOr[Boolean] = js.undefined
  /** Optionally set a max-height, if null, the height will be measured.
    * Default: null
    */
  var height: js.UndefOr[Double] = js.undefined
  var lastCharacter: js.UndefOr[IDotDotDotOptionsLastCharacter] = js.undefined
  /** Deviation for the height-option.
    * Default: 0
    */
  var tolerance: js.UndefOr[Double] = js.undefined
  /** Whether to update the ellipsis: true/'window'
    * Default: false
    */
  var watch: js.UndefOr[Boolean | window] = js.undefined
  /** How to cut off the text/html: 'word'/'letter'/'children'
    * Default: 'word'
    */
  var wrap: js.UndefOr[String] = js.undefined
}

object IDotDotDotOptions {
  @scala.inline
  def apply(
    after: String | JQuery = null,
    callback: (/* isTruncated */ Boolean, /* orgContent */ js.Any) => Unit = null,
    ellipsis: String = null,
    fallbackToLetter: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    lastCharacter: IDotDotDotOptionsLastCharacter = null,
    tolerance: Int | Double = null,
    watch: Boolean | window = null,
    wrap: String = null
  ): IDotDotDotOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis)
    if (!js.isUndefined(fallbackToLetter)) __obj.updateDynamic("fallbackToLetter")(fallbackToLetter)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (lastCharacter != null) __obj.updateDynamic("lastCharacter")(lastCharacter)
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    if (wrap != null) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[IDotDotDotOptions]
  }
}

