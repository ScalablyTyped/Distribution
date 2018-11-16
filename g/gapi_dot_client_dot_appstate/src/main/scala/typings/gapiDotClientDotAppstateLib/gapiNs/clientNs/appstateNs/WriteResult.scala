package typings
package gapiDotClientDotAppstateLib.gapiNs.clientNs.appstateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WriteResult extends js.Object {
  /** The version of the data for this key on the server. */
  var currentStateVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string appstate#writeResult. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The written key. */
  var stateKey: js.UndefOr[scala.Double] = js.undefined
}

