package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /** The accuracy of the location fix in meters. */
  var accuracy: js.UndefOr[scala.Double] = js.undefined
  /** The full address of the location. */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /** The name to be displayed. This may be a business name or a user-defined place, such as "Home". */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the location. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The type of resource. This is always mirror#location. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The latitude, in degrees. */
  var latitude: js.UndefOr[scala.Double] = js.undefined
  /** The longitude, in degrees. */
  var longitude: js.UndefOr[scala.Double] = js.undefined
  /** The time at which this location was captured, formatted according to RFC 3339. */
  var timestamp: js.UndefOr[java.lang.String] = js.undefined
}

