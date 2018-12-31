package typings
package gapiDotClientDotAppstateLib.gapiNs.clientNs.appstateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResponse extends js.Object {
  /** The current app state version. */
  var currentStateVersion: js.UndefOr[java.lang.String] = js.undefined
  /** The requested data. */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string appstate#getResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The key for the data. */
  var stateKey: js.UndefOr[scala.Double] = js.undefined
}

