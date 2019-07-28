package typings.ejDotWebDotAll.ejNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontWeight extends js.Object

@JSGlobal("ej.Sunburst.FontWeight")
@js.native
object FontWeight extends js.Object {
  //string
  @js.native
  sealed trait Bold extends FontWeight
  
  //string
  @js.native
  sealed trait Lighter extends FontWeight
  
  //string
  @js.native
  sealed trait Regular extends FontWeight
  
  /* 1 */ val Bold: typings.ejDotWebDotAll.ejNs.SunburstNs.FontWeight.Bold with Double = js.native
  /* 2 */ val Lighter: typings.ejDotWebDotAll.ejNs.SunburstNs.FontWeight.Lighter with Double = js.native
  /* 0 */ val Regular: typings.ejDotWebDotAll.ejNs.SunburstNs.FontWeight.Regular with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontWeight with Double] = js.native
}

