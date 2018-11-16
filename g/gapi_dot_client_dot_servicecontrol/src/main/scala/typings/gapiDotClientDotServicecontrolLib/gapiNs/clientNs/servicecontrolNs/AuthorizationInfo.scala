package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AuthorizationInfo extends js.Object {
  /**
               * Whether or not authorization for `resource` and `permission`
               * was granted.
               */
  var granted: js.UndefOr[scala.Boolean] = js.undefined
  /** The required IAM permission. */
  var permission: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The resource being accessed, as a REST-style string. For example:
               *
               * bigquery.googleapis.com/projects/PROJECTID/datasets/DATASETID
               */
  var resource: js.UndefOr[java.lang.String] = js.undefined
}

