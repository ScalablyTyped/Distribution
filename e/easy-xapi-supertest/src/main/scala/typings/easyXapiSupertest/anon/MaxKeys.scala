package typings.easyXapiSupertest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxKeys extends js.Object {
  
  var maxKeys: js.UndefOr[Double] = js.native
}
object MaxKeys {
  
  @scala.inline
  def apply(): MaxKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxKeys]
  }
  
  @scala.inline
  implicit class MaxKeysOps[Self <: MaxKeys] (val x: Self) extends AnyVal {
    
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
    def setMaxKeys(value: Double): Self = this.set("maxKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxKeys: Self = this.set("maxKeys", js.undefined)
  }
}
