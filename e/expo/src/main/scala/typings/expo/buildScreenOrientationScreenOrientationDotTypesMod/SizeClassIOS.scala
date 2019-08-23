package typings.expo.buildScreenOrientationScreenOrientationDotTypesMod

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
  
  /* "COMPACT" */ val COMPACT: typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.SizeClassIOS.COMPACT with String = js.native
  /* "REGULAR" */ val REGULAR: typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.SizeClassIOS.REGULAR with String = js.native
  /* "UNKNOWN" */ val UNKNOWN: typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.SizeClassIOS.UNKNOWN with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SizeClassIOS with String] = js.native
}

