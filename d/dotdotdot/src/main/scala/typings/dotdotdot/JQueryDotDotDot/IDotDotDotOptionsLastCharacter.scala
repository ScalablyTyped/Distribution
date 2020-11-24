package typings.dotdotdot.JQueryDotDotDot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDotDotDotOptionsLastCharacter extends js.Object {
  
  /** Don't add an ellipsis if this array contains
    * the last character of the truncated text.
    * Default:  []
    */
  var noEllipsis: js.UndefOr[js.Array[String]] = js.native
  
  /** Remove these characters from the end of the truncated text.
    * Default: [' ', ',', ';', '.', '!', '?']
    */
  var remove: js.UndefOr[js.Array[String]] = js.native
}
object IDotDotDotOptionsLastCharacter {
  
  @scala.inline
  def apply(): IDotDotDotOptionsLastCharacter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDotDotDotOptionsLastCharacter]
  }
  
  @scala.inline
  implicit class IDotDotDotOptionsLastCharacterOps[Self <: IDotDotDotOptionsLastCharacter] (val x: Self) extends AnyVal {
    
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
    def setNoEllipsisVarargs(value: String*): Self = this.set("noEllipsis", js.Array(value :_*))
    
    @scala.inline
    def setNoEllipsis(value: js.Array[String]): Self = this.set("noEllipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoEllipsis: Self = this.set("noEllipsis", js.undefined)
    
    @scala.inline
    def setRemoveVarargs(value: String*): Self = this.set("remove", js.Array(value :_*))
    
    @scala.inline
    def setRemove(value: js.Array[String]): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
  }
}
