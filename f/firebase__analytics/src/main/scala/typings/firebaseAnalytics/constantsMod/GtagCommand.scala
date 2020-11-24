package typings.firebaseAnalytics.constantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GtagCommand extends js.Object
@JSImport("@firebase/analytics/dist/src/constants", "GtagCommand")
@js.native
object GtagCommand extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GtagCommand with String] = js.native
  
  @js.native
  sealed trait CONFIG extends GtagCommand
  /* "config" */ @js.native
  object CONFIG extends TopLevel[CONFIG with String]
  
  @js.native
  sealed trait EVENT extends GtagCommand
  /* "event" */ @js.native
  object EVENT extends TopLevel[EVENT with String]
  
  @js.native
  sealed trait SET extends GtagCommand
  /* "set" */ @js.native
  object SET extends TopLevel[SET with String]
}
