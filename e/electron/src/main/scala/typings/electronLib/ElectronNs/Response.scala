package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Response extends js.Object {
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The original request is prevented from being sent or completed and is instead
       * redirected to the given URL.
       */
  var redirectURL: js.UndefOr[java.lang.String] = js.undefined
}

