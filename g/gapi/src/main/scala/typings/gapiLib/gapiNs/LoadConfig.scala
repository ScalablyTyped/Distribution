package typings
package gapiLib.gapiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LoadConfig extends js.Object {
  var callback: LoadCallback
  var onerror: js.UndefOr[js.Function] = js.undefined
  var ontimeout: js.UndefOr[js.Function] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

