package typings.atFirebaseAnalytics.distSrcConstantsMod

import org.scalablytyped.runtime.TopLevel
import typings.atFirebaseAnalytics.distSrcConstantsMod.GtagCommand.CONFIG
import typings.atFirebaseAnalytics.distSrcConstantsMod.GtagCommand.EVENT
import typings.atFirebaseAnalytics.distSrcConstantsMod.GtagCommand.SET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GtagCommand extends js.Object

@JSImport("@firebase/analytics/dist/src/constants", "GtagCommand")
@js.native
object GtagCommand extends js.Object {
  @js.native
  sealed trait CONFIG extends GtagCommand
  
  @js.native
  sealed trait EVENT extends GtagCommand
  
  @js.native
  sealed trait SET extends GtagCommand
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GtagCommand with String] = js.native
  /* "config" */ @js.native
  object CONFIG extends TopLevel[CONFIG with String]
  
  /* "event" */ @js.native
  object EVENT extends TopLevel[EVENT with String]
  
  /* "set" */ @js.native
  object SET extends TopLevel[SET with String]
  
}

