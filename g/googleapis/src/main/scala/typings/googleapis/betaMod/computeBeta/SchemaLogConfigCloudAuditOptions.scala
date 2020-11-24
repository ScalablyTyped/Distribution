package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Write a Cloud Audit log
  */
@js.native
trait SchemaLogConfigCloudAuditOptions extends js.Object {
  
  /**
    * Information used by the Cloud Audit Logging pipeline.
    */
  var authorizationLoggingOptions: js.UndefOr[SchemaAuthorizationLoggingOptions] = js.native
  
  /**
    * The log_name to populate in the Cloud Audit Record.
    */
  var logName: js.UndefOr[String] = js.native
}
object SchemaLogConfigCloudAuditOptions {
  
  @scala.inline
  def apply(): SchemaLogConfigCloudAuditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogConfigCloudAuditOptions]
  }
  
  @scala.inline
  implicit class SchemaLogConfigCloudAuditOptionsOps[Self <: SchemaLogConfigCloudAuditOptions] (val x: Self) extends AnyVal {
    
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
    def setAuthorizationLoggingOptions(value: SchemaAuthorizationLoggingOptions): Self = this.set("authorizationLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationLoggingOptions: Self = this.set("authorizationLoggingOptions", js.undefined)
    
    @scala.inline
    def setLogName(value: String): Self = this.set("logName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogName: Self = this.set("logName", js.undefined)
  }
}
