package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppManifestError extends js.Object {
  
  /**
    * Error column.
    */
  var column: integer = js.native
  
  /**
    * If criticial, this is a non-recoverable parse error.
    */
  var critical: integer = js.native
  
  /**
    * Error line.
    */
  var line: integer = js.native
  
  /**
    * Error message.
    */
  var message: String = js.native
}
object AppManifestError {
  
  @scala.inline
  def apply(column: integer, critical: integer, line: integer, message: String): AppManifestError = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppManifestError]
  }
  
  @scala.inline
  implicit class AppManifestErrorOps[Self <: AppManifestError] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: integer): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCritical(value: integer): Self = this.set("critical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: integer): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
