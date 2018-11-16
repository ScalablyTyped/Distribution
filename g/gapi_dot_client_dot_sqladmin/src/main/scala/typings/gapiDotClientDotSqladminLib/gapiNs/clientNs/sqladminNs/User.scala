package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait User extends js.Object {
  /** HTTP 1.1 Entity tag for the resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The host name from which the user can connect. For insert operations, host defaults to an empty string. For update operations, host is specified as
               * part of the request URL. The host name cannot be updated after insertion.
               */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the Cloud SQL instance. This does not include the project ID. Can be omitted for update since it is already specified on the URL. */
  var instance: js.UndefOr[java.lang.String] = js.undefined
  /** This is always sql#user. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the user in the Cloud SQL instance. Can be omitted for update since it is already specified on the URL. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The password for the user. */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The project ID of the project containing the Cloud SQL database. The Google apps domain is prefixed if applicable. Can be omitted for update since it
               * is already specified on the URL.
               */
  var project: js.UndefOr[java.lang.String] = js.undefined
}

