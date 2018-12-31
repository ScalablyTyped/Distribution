package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application extends js.Object {
  /** An optional URI that can be used to link back to the application. */
  var detailsUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of this application. This is required for REST clients, but we do not enforce uniqueness of this name. It is provided as a matter of
    * convenience for other developers who would like to identify which REST created an Application or Data Source.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Package name for this application. This is used as a unique identifier when created by Android applications, but cannot be specified by REST clients.
    * REST clients will have their developer project number reflected into the Data Source data stream IDs, instead of the packageName.
    */
  var packageName: js.UndefOr[java.lang.String] = js.undefined
  /** Version of the application. You should update this field whenever the application changes in a way that affects the computation of the data. */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

