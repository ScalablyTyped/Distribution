package typings
package flushDashWriteDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object flushDashWriteDashStreamMod {
  type Callback = js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  type Flush = js.Function1[/* callback */ Callback, scala.Unit]
  type Write = js.Function3[
    /* chunk */ js.Any, 
    /* encoding */ java.lang.String, 
    /* callback */ Callback, 
    scala.Unit
  ]
}
