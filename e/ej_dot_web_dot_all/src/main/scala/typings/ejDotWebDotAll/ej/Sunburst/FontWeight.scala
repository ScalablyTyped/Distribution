package typings.ejDotWebDotAll.ej.Sunburst

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Sunburst.FontWeight.Bold
import typings.ejDotWebDotAll.ej.Sunburst.FontWeight.Lighter
import typings.ejDotWebDotAll.ej.Sunburst.FontWeight.Regular
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontWeight with Double] = js.native
  /* 1 */ @js.native
  object Bold extends TopLevel[Bold with Double]
  
  /* 2 */ @js.native
  object Lighter extends TopLevel[Lighter with Double]
  
  /* 0 */ @js.native
  object Regular extends TopLevel[Regular with Double]
  
}

