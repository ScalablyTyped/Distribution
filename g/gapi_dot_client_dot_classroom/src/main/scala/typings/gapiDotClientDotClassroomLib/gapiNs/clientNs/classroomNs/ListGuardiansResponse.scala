package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListGuardiansResponse extends js.Object {
  /**
               * Guardians on this page of results that met the criteria specified in
               * the request.
               */
  var guardians: js.UndefOr[js.Array[Guardian]] = js.undefined
  /**
               * Token identifying the next page of results to return. If empty, no further
               * results are available.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

