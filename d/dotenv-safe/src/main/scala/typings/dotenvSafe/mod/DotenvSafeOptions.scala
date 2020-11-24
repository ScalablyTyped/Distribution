package typings.dotenvSafe.mod

import typings.dotenv.mod.DotenvConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DotenvSafeOptions extends DotenvConfigOptions {
  
  /**
    * Enabling this option will not throw an error after loading.
    * @default false
    */
  var allowEmptyValues: js.UndefOr[Boolean] = js.native
  
  /**
    * Path to example environment file. (Option 1)
    * @default ".env.example"
    */
  var example: js.UndefOr[String] = js.native
  
  /**
    * Path to example environment file. (Option 2 -- example takes precedence)
    * @default ".env.example"
    */
  var sample: js.UndefOr[String] = js.native
}
object DotenvSafeOptions {
  
  @scala.inline
  def apply(): DotenvSafeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotenvSafeOptions]
  }
  
  @scala.inline
  implicit class DotenvSafeOptionsOps[Self <: DotenvSafeOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowEmptyValues(value: Boolean): Self = this.set("allowEmptyValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEmptyValues: Self = this.set("allowEmptyValues", js.undefined)
    
    @scala.inline
    def setExample(value: String): Self = this.set("example", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExample: Self = this.set("example", js.undefined)
    
    @scala.inline
    def setSample(value: String): Self = this.set("sample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSample: Self = this.set("sample", js.undefined)
  }
}
