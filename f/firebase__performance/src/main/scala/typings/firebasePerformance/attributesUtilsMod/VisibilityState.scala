package typings.firebasePerformance.attributesUtilsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VisibilityState extends js.Object
@JSImport("@firebase/performance/dist/src/utils/attributes_utils", "VisibilityState")
@js.native
object VisibilityState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VisibilityState with Double] = js.native
  
  @js.native
  sealed trait HIDDEN extends VisibilityState
  /* 2 */ @js.native
  object HIDDEN extends TopLevel[HIDDEN with Double]
  
  @js.native
  sealed trait UNKNOWN extends VisibilityState
  /* 0 */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with Double]
  
  @js.native
  sealed trait VISIBLE extends VisibilityState
  /* 1 */ @js.native
  object VISIBLE extends TopLevel[VISIBLE with Double]
}
