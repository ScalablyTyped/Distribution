package typings.electronJsonStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataOptions extends js.Object {
  
  var dataPath: String = js.native
}
object DataOptions {
  
  @scala.inline
  def apply(dataPath: String): DataOptions = {
    val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataOptions]
  }
  
  @scala.inline
  implicit class DataOptionsOps[Self <: DataOptions] (val x: Self) extends AnyVal {
    
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
    def setDataPath(value: String): Self = this.set("dataPath", value.asInstanceOf[js.Any])
  }
}
