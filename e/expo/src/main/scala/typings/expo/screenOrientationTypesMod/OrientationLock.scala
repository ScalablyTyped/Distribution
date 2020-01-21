package typings.expo.screenOrientationTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OrientationLock extends js.Object

@JSImport("expo/build/ScreenOrientation/ScreenOrientation.types", "OrientationLock")
@js.native
object OrientationLock extends js.Object {
  @js.native
  sealed trait ALL extends OrientationLock
  
  @js.native
  sealed trait ALL_BUT_UPSIDE_DOWN extends OrientationLock
  
  @js.native
  sealed trait DEFAULT extends OrientationLock
  
  @js.native
  sealed trait LANDSCAPE extends OrientationLock
  
  @js.native
  sealed trait LANDSCAPE_LEFT extends OrientationLock
  
  @js.native
  sealed trait LANDSCAPE_RIGHT extends OrientationLock
  
  @js.native
  sealed trait OTHER extends OrientationLock
  
  @js.native
  sealed trait PORTRAIT extends OrientationLock
  
  @js.native
  sealed trait PORTRAIT_DOWN extends OrientationLock
  
  @js.native
  sealed trait PORTRAIT_UP extends OrientationLock
  
  @js.native
  sealed trait UNKNOWN extends OrientationLock
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[OrientationLock with String] = js.native
  /* "ALL" */ @js.native
  object ALL extends TopLevel[ALL with String]
  
  /* "ALL_BUT_UPSIDE_DOWN" */ @js.native
  object ALL_BUT_UPSIDE_DOWN extends TopLevel[ALL_BUT_UPSIDE_DOWN with String]
  
  /* "DEFAULT" */ @js.native
  object DEFAULT extends TopLevel[DEFAULT with String]
  
  /* "LANDSCAPE" */ @js.native
  object LANDSCAPE extends TopLevel[LANDSCAPE with String]
  
  /* "LANDSCAPE_LEFT" */ @js.native
  object LANDSCAPE_LEFT extends TopLevel[LANDSCAPE_LEFT with String]
  
  /* "LANDSCAPE_RIGHT" */ @js.native
  object LANDSCAPE_RIGHT extends TopLevel[LANDSCAPE_RIGHT with String]
  
  /* "OTHER" */ @js.native
  object OTHER extends TopLevel[OTHER with String]
  
  /* "PORTRAIT" */ @js.native
  object PORTRAIT extends TopLevel[PORTRAIT with String]
  
  /* "PORTRAIT_DOWN" */ @js.native
  object PORTRAIT_DOWN extends TopLevel[PORTRAIT_DOWN with String]
  
  /* "PORTRAIT_UP" */ @js.native
  object PORTRAIT_UP extends TopLevel[PORTRAIT_UP with String]
  
  /* "UNKNOWN" */ @js.native
  object UNKNOWN extends TopLevel[UNKNOWN with String]
  
}

