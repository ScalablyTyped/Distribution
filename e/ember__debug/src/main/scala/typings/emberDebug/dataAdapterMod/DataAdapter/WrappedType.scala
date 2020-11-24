package typings.emberDebug.dataAdapterMod.DataAdapter

import typings.emberDebug.anon.Columns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrappedType extends js.Object {
  
  def release(): Unit = js.native
  
  var `type`: Columns = js.native
}
object WrappedType {
  
  @scala.inline
  def apply(release: () => Unit, `type`: Columns): WrappedType = {
    val __obj = js.Dynamic.literal(release = js.Any.fromFunction0(release))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedType]
  }
  
  @scala.inline
  implicit class WrappedTypeOps[Self <: WrappedType] (val x: Self) extends AnyVal {
    
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
    def setRelease(value: () => Unit): Self = this.set("release", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: Columns): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
