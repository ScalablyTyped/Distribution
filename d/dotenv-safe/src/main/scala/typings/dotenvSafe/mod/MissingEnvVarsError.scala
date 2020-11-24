package typings.dotenvSafe.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MissingEnvVarsError extends Error {
  
  /**
    * Variables which existing in the sample file, but not in the loaded file.
    */
  var missing: js.Array[String] = js.native
  
  /**
    * Path to example environment file.
    */
  var sample: String = js.native
}
object MissingEnvVarsError {
  
  @scala.inline
  def apply(message: String, missing: js.Array[String], name: String, sample: String): MissingEnvVarsError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sample = sample.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingEnvVarsError]
  }
  
  @scala.inline
  implicit class MissingEnvVarsErrorOps[Self <: MissingEnvVarsError] (val x: Self) extends AnyVal {
    
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
    def setMissingVarargs(value: String*): Self = this.set("missing", js.Array(value :_*))
    
    @scala.inline
    def setMissing(value: js.Array[String]): Self = this.set("missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSample(value: String): Self = this.set("sample", value.asInstanceOf[js.Any])
  }
}
