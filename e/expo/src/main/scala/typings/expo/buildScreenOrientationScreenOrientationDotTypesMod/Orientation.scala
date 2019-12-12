package typings.expo.buildScreenOrientationScreenOrientationDotTypesMod

import org.scalablytyped.runtime.TopLevel
import typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.LANDSCAPE
import typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.LANDSCAPE_LEFT
import typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.LANDSCAPE_RIGHT
import typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.PORTRAIT
import typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.PORTRAIT_DOWN
import typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.PORTRAIT_UP
import typings.expo.buildScreenOrientationScreenOrientationDotTypesMod.Orientation.UNKNOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSImport("expo/build/ScreenOrientation/ScreenOrientation.types", "Orientation")
@js.native
object Orientation extends js.Object {
  @js.native
  sealed trait LANDSCAPE extends Orientation
  
  @js.native
  sealed trait LANDSCAPE_LEFT extends Orientation
  
  @js.native
  sealed trait LANDSCAPE_RIGHT extends Orientation
  
  @js.native
  sealed trait PORTRAIT extends Orientation
  
  @js.native
  sealed trait PORTRAIT_DOWN extends Orientation
  
  @js.native
  sealed trait PORTRAIT_UP extends Orientation
  
  @js.native
  sealed trait UNKNOWN extends Orientation
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Orientation with String] = js.native
  /* "LANDSCAPE" */ @js.native
  object LANDSCAPE extends TopLevel[LANDSCAPE with String]
  
  /* "LANDSCAPE_LEFT" */ @js.native
  object LANDSCAPE_LEFT extends TopLevel[LANDSCAPE_LEFT with String]
  
  /* "LANDSCAPE_RIGHT" */ @js.native
  object LANDSCAPE_RIGHT extends TopLevel[LANDSCAPE_RIGHT with String]
  
  /* "PORTRAIT" */ @js.native
  object PORTRAIT extends TopLevel[PORTRAIT with String]
  
  /* "PORTRAIT_DOWN" */ @js.native
  object PORTRAIT_DOWN extends TopLevel[PORTRAIT_DOWN with String]
  
  /* "PORTRAIT_UP" */ @js.native
  object PORTRAIT_UP extends TopLevel[PORTRAIT_UP with String]
  
  /* "UNKNOWN" */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with String]
  
}

