package typings.dotenvDefaults.mod.dotenvAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DotenvConfigOptions extends js.Object {
  
  /**
    * @default '.env.defaults'
    */
  var defaults: js.UndefOr[String] = js.native
}
object DotenvConfigOptions {
  
  @scala.inline
  def apply(): DotenvConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotenvConfigOptions]
  }
  
  @scala.inline
  implicit class DotenvConfigOptionsOps[Self <: DotenvConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaults(value: String): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
  }
}
