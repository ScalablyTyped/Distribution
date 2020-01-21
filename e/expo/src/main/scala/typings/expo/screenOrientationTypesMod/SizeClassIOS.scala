package typings.expo.screenOrientationTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SizeClassIOS extends js.Object

@JSImport("expo/build/ScreenOrientation/ScreenOrientation.types", "SizeClassIOS")
@js.native
object SizeClassIOS extends js.Object {
  @js.native
  sealed trait COMPACT extends SizeClassIOS
  
  @js.native
  sealed trait REGULAR extends SizeClassIOS
  
  @js.native
  sealed trait UNKNOWN extends SizeClassIOS
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SizeClassIOS with String] = js.native
  /* "COMPACT" */ @js.native
  object COMPACT extends TopLevel[COMPACT with String]
  
  /* "REGULAR" */ @js.native
  object REGULAR extends TopLevel[REGULAR with String]
  
  /* "UNKNOWN" */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with String]
  
}

