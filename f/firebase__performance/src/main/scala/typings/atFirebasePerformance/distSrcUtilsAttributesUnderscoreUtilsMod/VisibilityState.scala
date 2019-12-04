package typings.atFirebasePerformance.distSrcUtilsAttributesUnderscoreUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VisibilityState extends js.Object

@JSImport("@firebase/performance/dist/src/utils/attributes_utils", "VisibilityState")
@js.native
object VisibilityState extends js.Object {
  @js.native
  sealed trait HIDDEN extends VisibilityState
  
  @js.native
  sealed trait UNKNOWN extends VisibilityState
  
  @js.native
  sealed trait VISIBLE extends VisibilityState
  
  /* 2 */ val HIDDEN: typings.atFirebasePerformance.distSrcUtilsAttributesUnderscoreUtilsMod.VisibilityState.HIDDEN with Double = js.native
  /* 0 */ val UNKNOWN: typings.atFirebasePerformance.distSrcUtilsAttributesUnderscoreUtilsMod.VisibilityState.UNKNOWN with Double = js.native
  /* 1 */ val VISIBLE: typings.atFirebasePerformance.distSrcUtilsAttributesUnderscoreUtilsMod.VisibilityState.VISIBLE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VisibilityState with Double] = js.native
}

