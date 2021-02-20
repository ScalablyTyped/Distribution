package typings.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ServiceLevel extends StObject
@JSImport("evernote", "Types.ServiceLevel")
@js.native
object ServiceLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ServiceLevel with Double] = js.native
  
  @js.native
  sealed trait BASIC extends ServiceLevel
  /* 1 */ val BASIC: typings.evernote.mod.Types.ServiceLevel.BASIC with Double = js.native
  
  @js.native
  sealed trait PLUS extends ServiceLevel
  /* 2 */ val PLUS: typings.evernote.mod.Types.ServiceLevel.PLUS with Double = js.native
  
  @js.native
  sealed trait PREMIUM extends ServiceLevel
  /* 3 */ val PREMIUM: typings.evernote.mod.Types.ServiceLevel.PREMIUM with Double = js.native
}
