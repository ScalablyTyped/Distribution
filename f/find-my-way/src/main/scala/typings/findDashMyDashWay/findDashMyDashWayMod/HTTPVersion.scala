package typings.findDashMyDashWay.findDashMyDashWayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HTTPVersion extends js.Object

@JSImport("find-my-way", "HTTPVersion")
@js.native
object HTTPVersion extends js.Object {
  @js.native
  sealed trait V1 extends HTTPVersion
  
  @js.native
  sealed trait V2 extends HTTPVersion
  
  /* "http1" */ val V1: typings.findDashMyDashWay.findDashMyDashWayMod.HTTPVersion.V1 with String = js.native
  /* "http2" */ val V2: typings.findDashMyDashWay.findDashMyDashWayMod.HTTPVersion.V2 with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HTTPVersion with String] = js.native
}

