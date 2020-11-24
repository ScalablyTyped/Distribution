package typings.fileSaver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileSaverOptions extends js.Object {
  
  /**
    * Automatically provide Unicode text encoding hints
    * @default false
    */
  var autoBom: Boolean = js.native
}
object FileSaverOptions {
  
  @scala.inline
  def apply(autoBom: Boolean): FileSaverOptions = {
    val __obj = js.Dynamic.literal(autoBom = autoBom.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSaverOptions]
  }
  
  @scala.inline
  implicit class FileSaverOptionsOps[Self <: FileSaverOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoBom(value: Boolean): Self = this.set("autoBom", value.asInstanceOf[js.Any])
  }
}
