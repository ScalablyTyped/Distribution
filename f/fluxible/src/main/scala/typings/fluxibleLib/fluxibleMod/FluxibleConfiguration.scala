package typings
package fluxibleLib.fluxibleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluxibleConfiguration extends js.Object {
  /**
    * Stores your top level React component for access using `getComponent()`
    */
  var component: js.Any
  /**
    * App level component action handler
    */
  var componentActionHandler: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

