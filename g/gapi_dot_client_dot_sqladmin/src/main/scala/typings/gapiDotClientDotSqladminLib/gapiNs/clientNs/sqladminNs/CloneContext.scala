package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CloneContext extends js.Object {
  /**
               * Binary log coordinates, if specified, indentify the the position up to which the source instance should be cloned. If not specified, the source
               * instance is cloned up to the most recent binary log coordintes.
               */
  var binLogCoordinates: js.UndefOr[BinLogCoordinates] = js.undefined
  /** Name of the Cloud SQL instance to be created as a clone. */
  var destinationInstanceName: js.UndefOr[java.lang.String] = js.undefined
  /** This is always sql#cloneContext. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

