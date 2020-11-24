package typings.evernote.mod.Types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ServiceLevel extends js.Object
@JSImport("evernote", "Types.ServiceLevel")
@js.native
object ServiceLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ServiceLevel with Double] = js.native
  
  @js.native
  sealed trait BASIC extends ServiceLevel
  /* 1 */ @js.native
  object BASIC extends TopLevel[BASIC with Double]
  
  @js.native
  sealed trait PLUS extends ServiceLevel
  /* 2 */ @js.native
  object PLUS extends TopLevel[PLUS with Double]
  
  @js.native
  sealed trait PREMIUM extends ServiceLevel
  /* 3 */ @js.native
  object PREMIUM extends TopLevel[PREMIUM with Double]
}
