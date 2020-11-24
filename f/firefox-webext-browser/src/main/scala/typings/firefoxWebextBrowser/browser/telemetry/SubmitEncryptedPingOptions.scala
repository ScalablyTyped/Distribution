package typings.firefoxWebextBrowser.browser.telemetry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options object. */
@js.native
trait SubmitEncryptedPingOptions extends js.Object {
  
  /** Schema name used for payload. */
  var schemaName: String = js.native
  
  /** Schema version used for payload. */
  var schemaVersion: Double = js.native
}
object SubmitEncryptedPingOptions {
  
  @scala.inline
  def apply(schemaName: String, schemaVersion: Double): SubmitEncryptedPingOptions = {
    val __obj = js.Dynamic.literal(schemaName = schemaName.asInstanceOf[js.Any], schemaVersion = schemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitEncryptedPingOptions]
  }
  
  @scala.inline
  implicit class SubmitEncryptedPingOptionsOps[Self <: SubmitEncryptedPingOptions] (val x: Self) extends AnyVal {
    
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
    def setSchemaName(value: String): Self = this.set("schemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersion(value: Double): Self = this.set("schemaVersion", value.asInstanceOf[js.Any])
  }
}
