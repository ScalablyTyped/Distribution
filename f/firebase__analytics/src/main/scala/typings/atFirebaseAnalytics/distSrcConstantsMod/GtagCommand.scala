package typings.atFirebaseAnalytics.distSrcConstantsMod

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
  
  /* "config" */ val CONFIG: typings.atFirebaseAnalytics.distSrcConstantsMod.GtagCommand.CONFIG with String = js.native
  /* "event" */ val EVENT: typings.atFirebaseAnalytics.distSrcConstantsMod.GtagCommand.EVENT with String = js.native
  /* "set" */ val SET: typings.atFirebaseAnalytics.distSrcConstantsMod.GtagCommand.SET with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[GtagCommand with String] = js.native
}

