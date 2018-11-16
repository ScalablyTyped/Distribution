package typings
package fbDashWatchmanLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fbDashWatchmanMod {
  type UnilateralTags = fbDashWatchmanLib.fbDashWatchmanLibStrings.unilateralTags | fbDashWatchmanLib.fbDashWatchmanLibStrings.log
  type doneCallback = js.Function2[
    /* error */ js.UndefOr[nodeLib.Error | scala.Null], 
    /* resp */ js.UndefOr[js.Any], 
    js.Any
  ]
}
