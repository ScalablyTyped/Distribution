package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a running service that sends errors. Its version changes over
  * time and multiple versions can run in parallel.
  */
@js.native
trait SchemaServiceContext extends js.Object {
  
  /**
    * Type of the MonitoredResource. List of possible values:
    * https://cloud.google.com/monitoring/api/resources  Value is set
    * automatically for incoming errors and must not be set when reporting
    * errors.
    */
  var resourceType: js.UndefOr[String] = js.native
  
  /**
    * An identifier of the service, such as the name of the executable, job, or
    * Google App Engine service name. This field is expected to have a low
    * number of values that are relatively stable over time, as opposed to
    * `version`, which can be changed whenever new code is deployed.  Contains
    * the service name for error reports extracted from Google App Engine logs
    * or `default` if the App Engine default service is used.
    */
  var service: js.UndefOr[String] = js.native
  
  /**
    * Represents the source code version that the developer provided, which
    * could represent a version label or a Git SHA-1 hash, for example. For App
    * Engine standard environment, the version is set to the version of the
    * app.
    */
  var version: js.UndefOr[String] = js.native
}
object SchemaServiceContext {
  
  @scala.inline
  def apply(): SchemaServiceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceContext]
  }
  
  @scala.inline
  implicit class SchemaServiceContextOps[Self <: SchemaServiceContext] (val x: Self) extends AnyVal {
    
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
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
