package typings.findDashMyDashWay.findDashMyDashWayMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HTTPVersion with String] = js.native
  /* "http1" */ @js.native
  object V1 extends TopLevel[V1 with String]
  
  /* "http2" */ @js.native
  object V2 extends TopLevel[V2 with String]
  
}

