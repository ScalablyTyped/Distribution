package typings
package extjsLib.ExtNs.directNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IProvider
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Abstract method for subclasses to implement  */
  var connect: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Abstract method for subclasses to implement  */
  var disconnect: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns whether or not the server side is currently connected  */
  var isConnected: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (String[]) */
  var relayedEvents: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
}

