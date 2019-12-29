package typings.googleDashAppsDashScript.GoogleAppsScript.Maps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

/**
  * An enum representing the type of map to render.
  * See also
  *
  * Google Static Maps API
  */
@JSGlobal("GoogleAppsScript.Maps.Type")
@js.native
object Type extends js.Object {
  @js.native
  sealed trait HYBRID extends Type
  
  @js.native
  sealed trait ROADMAP extends Type
  
  @js.native
  sealed trait SATELLITE extends Type
  
  @js.native
  sealed trait TERRAIN extends Type
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
  /* 3 */ @js.native
  object HYBRID extends TopLevel[HYBRID with Double]
  
  /* 0 */ @js.native
  object ROADMAP extends TopLevel[ROADMAP with Double]
  
  /* 1 */ @js.native
  object SATELLITE extends TopLevel[SATELLITE with Double]
  
  /* 2 */ @js.native
  object TERRAIN extends TopLevel[TERRAIN with Double]
  
}

