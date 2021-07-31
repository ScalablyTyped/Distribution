package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Write a Cloud Audit log
  */
trait SchemaLogConfigCloudAuditOptions extends StObject {
  
  /**
    * Information used by the Cloud Audit Logging pipeline.
    */
  var authorizationLoggingOptions: js.UndefOr[SchemaAuthorizationLoggingOptions] = js.undefined
  
  /**
    * The log_name to populate in the Cloud Audit Record.
    */
  var logName: js.UndefOr[String] = js.undefined
}
object SchemaLogConfigCloudAuditOptions {
  
  @scala.inline
  def apply(): SchemaLogConfigCloudAuditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogConfigCloudAuditOptions]
  }
  
  @scala.inline
  implicit class SchemaLogConfigCloudAuditOptionsMutableBuilder[Self <: SchemaLogConfigCloudAuditOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationLoggingOptions(value: SchemaAuthorizationLoggingOptions): Self = StObject.set(x, "authorizationLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationLoggingOptionsUndefined: Self = StObject.set(x, "authorizationLoggingOptions", js.undefined)
    
    @scala.inline
    def setLogName(value: String): Self = StObject.set(x, "logName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogNameUndefined: Self = StObject.set(x, "logName", js.undefined)
  }
}
