package typings.flatpickr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shorthand extends js.Object {
  
  var longhand: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
  
  var shorthand: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String] = js.native
}
object Shorthand {
  
  @scala.inline
  def apply(
    longhand: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String],
    shorthand: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
  ): Shorthand = {
    val __obj = js.Dynamic.literal(longhand = longhand.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shorthand]
  }
  
  @scala.inline
  implicit class ShorthandOps[Self <: Shorthand] (val x: Self) extends AnyVal {
    
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
    def setLonghand(
      value: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
    ): Self = this.set("longhand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShorthand(
      value: js.Tuple12[String, String, String, String, String, String, String, String, String, String, String, String]
    ): Self = this.set("shorthand", value.asInstanceOf[js.Any])
  }
}
