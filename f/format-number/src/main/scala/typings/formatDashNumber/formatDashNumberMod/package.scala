package typings.formatDashNumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formatDashNumberMod {
  type format = js.Function2[
    /* number */ Double, 
    /* overrideOptions */ js.UndefOr[IFormatNumberOverrideOptions], 
    String
  ]
}
