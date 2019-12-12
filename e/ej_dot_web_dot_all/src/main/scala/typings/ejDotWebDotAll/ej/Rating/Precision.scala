package typings.ejDotWebDotAll.ej.Rating

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Rating.Precision.Exact
import typings.ejDotWebDotAll.ej.Rating.Precision.Full
import typings.ejDotWebDotAll.ej.Rating.Precision.Half
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Precision extends js.Object

@JSGlobal("ej.Rating.Precision")
@js.native
object Precision extends js.Object {
  ///string
  @js.native
  sealed trait Exact extends Precision
  
  ///string
  @js.native
  sealed trait Full extends Precision
  
  ///string
  @js.native
  sealed trait Half extends Precision
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Precision with Double] = js.native
  /* 0 */ @js.native
  object Exact extends TopLevel[Exact with Double]
  
  /* 1 */ @js.native
  object Full extends TopLevel[Full with Double]
  
  /* 2 */ @js.native
  object Half extends TopLevel[Half with Double]
  
}

