package typings.atFirebasePerformance.distSrcUtilsAttributesUnderscoreUtilsMod

import org.scalablytyped.runtime.TopLevel
import typings.atFirebasePerformance.distSrcUtilsAttributesUnderscoreUtilsMod.VisibilityState.HIDDEN
import typings.atFirebasePerformance.distSrcUtilsAttributesUnderscoreUtilsMod.VisibilityState.UNKNOWN
import typings.atFirebasePerformance.distSrcUtilsAttributesUnderscoreUtilsMod.VisibilityState.VISIBLE
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VisibilityState with Double] = js.native
  /* 2 */ @js.native
  object HIDDEN extends TopLevel[HIDDEN with Double]
  
  /* 0 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
  
  /* 1 */ @js.native
  object VISIBLE extends TopLevel[VISIBLE with Double]
  
}

