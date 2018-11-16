package typings
package gapiDotClientDotClouderrorreportingLib.gapiNs.clientNs.clouderrorreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServiceContext extends js.Object {
  /**
               * Type of the MonitoredResource. List of possible values:
               * https://cloud.google.com/monitoring/api/resources
               *
               * Value is set automatically for incoming errors and must not be set when
               * reporting errors.
               */
  var resourceType: js.UndefOr[java.lang.String] = js.undefined
  /**
               * An identifier of the service, such as the name of the
               * executable, job, or Google App Engine service name. This field is expected
               * to have a low number of values that are relatively stable over time, as
               * opposed to `version`, which can be changed whenever new code is deployed.
               *
               * Contains the service name for error reports extracted from Google
               * App Engine logs or `default` if the App Engine default service is used.
               */
  var service: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Represents the source code version that the developer provided,
               * which could represent a version label or a Git SHA-1 hash, for example.
               * For App Engine standard environment, the version is set to the version of
               * the app.
               */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

