package typings.fflate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncInflateOptions extends AsyncOptions {
  
  /**
    * The original size of the data. Currently, the asynchronous API disallows
    * writing into a buffer you provide; the best you can do is provide the
    * size in bytes and be given back a new typed array.
    */
  var size: js.UndefOr[Double] = js.native
}
object AsyncInflateOptions {
  
  @scala.inline
  def apply(): AsyncInflateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncInflateOptions]
  }
  
  @scala.inline
  implicit class AsyncInflateOptionsOps[Self <: AsyncInflateOptions] (val x: Self) extends AnyVal {
    
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
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
