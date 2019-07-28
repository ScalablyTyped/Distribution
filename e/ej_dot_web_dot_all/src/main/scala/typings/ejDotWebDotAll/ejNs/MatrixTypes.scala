package typings.ejDotWebDotAll.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MatrixTypes extends js.Object

@JSGlobal("ej.MatrixTypes")
@js.native
object MatrixTypes extends js.Object {
  @js.native
  sealed trait Identity extends MatrixTypes
  
  @js.native
  sealed trait Scaling extends MatrixTypes
  
  @js.native
  sealed trait Translation extends MatrixTypes
  
  @js.native
  sealed trait Unknown extends MatrixTypes
  
  /* 0 */ val Identity: typings.ejDotWebDotAll.ejNs.MatrixTypes.Identity with Double = js.native
  /* 1 */ val Scaling: typings.ejDotWebDotAll.ejNs.MatrixTypes.Scaling with Double = js.native
  /* 2 */ val Translation: typings.ejDotWebDotAll.ejNs.MatrixTypes.Translation with Double = js.native
  /* 3 */ val Unknown: typings.ejDotWebDotAll.ejNs.MatrixTypes.Unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MatrixTypes with Double] = js.native
}

