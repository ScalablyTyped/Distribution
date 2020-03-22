package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ServiceLevel extends js.Object

@JSImport("evernote", "Types.ServiceLevel")
@js.native
object ServiceLevel extends js.Object {
  @js.native
  sealed trait BASIC extends ServiceLevel
  
  @js.native
  sealed trait PLUS extends ServiceLevel
  
  @js.native
  sealed trait PREMIUM extends ServiceLevel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ServiceLevel with Double] = js.native
  /* 1 */ @js.native
  object BASIC extends TopLevel[BASIC with Double]
  
  /* 2 */ @js.native
  object PLUS extends TopLevel[PLUS with Double]
  
  /* 3 */ @js.native
  object PREMIUM extends TopLevel[PREMIUM with Double]
  
}

