package typings.dotenvSafe.mod

import typings.dotenv.mod.DotenvConfigOutput
import typings.dotenv.mod.DotenvParseOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DotenvSafeConfigOutput extends DotenvConfigOutput {
  
  /**
    * key-value pairs required by .env.example
    */
  var required: DotenvParseOutput = js.native
}
object DotenvSafeConfigOutput {
  
  @scala.inline
  def apply(required: DotenvParseOutput): DotenvSafeConfigOutput = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotenvSafeConfigOutput]
  }
  
  @scala.inline
  implicit class DotenvSafeConfigOutputOps[Self <: DotenvSafeConfigOutput] (val x: Self) extends AnyVal {
    
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
    def setRequired(value: DotenvParseOutput): Self = this.set("required", value.asInstanceOf[js.Any])
  }
}
