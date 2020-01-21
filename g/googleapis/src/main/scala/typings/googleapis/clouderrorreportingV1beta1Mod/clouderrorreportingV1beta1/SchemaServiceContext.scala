package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(resourceType: String = null, service: String = null, version: String = null): SchemaServiceContext = {
    val __obj = js.Dynamic.literal()
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaServiceContext]
  }
}

