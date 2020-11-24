package typings.giphyApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseOptions extends js.Object {
  
  var fmt: js.UndefOr[Format] = js.native
  
  var rating: Rating = js.native
}
object BaseOptions {
  
  @scala.inline
  def apply(rating: Rating): BaseOptions = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
  
  @scala.inline
  implicit class BaseOptionsOps[Self <: BaseOptions] (val x: Self) extends AnyVal {
    
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
    def setRating(value: Rating): Self = this.set("rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFmt(value: Format): Self = this.set("fmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFmt: Self = this.set("fmt", js.undefined)
  }
}
