package typings
package findDashMyDashWayLib.findDashMyDashWayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HTTPVersion extends js.Object

@JSImport("find-my-way", "HTTPVersion")
@js.native
object HTTPVersion extends js.Object {
  @js.native
  sealed trait V1
    extends findDashMyDashWayLib.findDashMyDashWayMod.HTTPVersion
  
  @js.native
  sealed trait V2
    extends findDashMyDashWayLib.findDashMyDashWayMod.HTTPVersion
  
  /* "http1" */ val V1: V1 with java.lang.String = js.native
  /* "http2" */ val V2: V2 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[findDashMyDashWayLib.findDashMyDashWayMod.HTTPVersion with java.lang.String] = js.native
}

