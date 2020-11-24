package typings.dotdotdot.JQueryDotDotDot

import typings.dotdotdot.JQuery
import typings.dotdotdot.dotdotdotStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDotDotDotOptions extends js.Object {
  
  /** jQuery-selector for the element to keep and put after the ellipsis.
    * Default: null
    */
  var after: js.UndefOr[String | JQuery] = js.native
  
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
  var callback: js.UndefOr[js.Function2[/* isTruncated */ Boolean, /* orgContent */ js.Any, Unit]] = js.native
  
  /**    The text to add as ellipsis.
    * Default: '... '
    */
  var ellipsis: js.UndefOr[String] = js.native
  
  /** Wrap-option fallback to 'letter' for long words
    * Default: true
    */
  var fallbackToLetter: js.UndefOr[Boolean] = js.native
  
  /** Optionally set a max-height, if null, the height will be measured.
    * Default: null
    */
  var height: js.UndefOr[Double] = js.native
  
  var lastCharacter: js.UndefOr[IDotDotDotOptionsLastCharacter] = js.native
  
  /** Deviation for the height-option.
    * Default: 0
    */
  var tolerance: js.UndefOr[Double] = js.native
  
  /** Whether to update the ellipsis: true/'window'
    * Default: false
    */
  var watch: js.UndefOr[Boolean | window] = js.native
  
  /** How to cut off the text/html: 'word'/'letter'/'children'
    * Default: 'word'
    */
  var wrap: js.UndefOr[String] = js.native
}
object IDotDotDotOptions {
  
  @scala.inline
  def apply(): IDotDotDotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDotDotDotOptions]
  }
  
  @scala.inline
  implicit class IDotDotDotOptionsOps[Self <: IDotDotDotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfter(value: String | JQuery): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setCallback(value: (/* isTruncated */ Boolean, /* orgContent */ js.Any) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setEllipsis(value: String): Self = this.set("ellipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEllipsis: Self = this.set("ellipsis", js.undefined)
    
    @scala.inline
    def setFallbackToLetter(value: Boolean): Self = this.set("fallbackToLetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackToLetter: Self = this.set("fallbackToLetter", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLastCharacter(value: IDotDotDotOptionsLastCharacter): Self = this.set("lastCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastCharacter: Self = this.set("lastCharacter", js.undefined)
    
    @scala.inline
    def setTolerance(value: Double): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
    
    @scala.inline
    def setWatch(value: Boolean | window): Self = this.set("watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
    
    @scala.inline
    def setWrap(value: String): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
