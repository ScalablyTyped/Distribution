package typings.gm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelInfo[T] extends js.Object {
  
  var Blue: T = js.native
  
  var Green: T = js.native
  
  var Red: T = js.native
}
object ChannelInfo {
  
  @scala.inline
  def apply[T](Blue: T, Green: T, Red: T): ChannelInfo[T] = {
    val __obj = js.Dynamic.literal(Blue = Blue.asInstanceOf[js.Any], Green = Green.asInstanceOf[js.Any], Red = Red.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelInfo[T]]
  }
  
  @scala.inline
  implicit class ChannelInfoOps[Self <: ChannelInfo[_], T] (val x: Self with ChannelInfo[T]) extends AnyVal {
    
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
    def setBlue(value: T): Self = this.set("Blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreen(value: T): Self = this.set("Green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRed(value: T): Self = this.set("Red", value.asInstanceOf[js.Any])
  }
}
