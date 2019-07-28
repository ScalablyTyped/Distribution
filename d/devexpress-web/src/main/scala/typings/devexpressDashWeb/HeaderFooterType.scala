package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeaderFooterType extends js.Object

@JSGlobal("HeaderFooterType")
@js.native
object HeaderFooterType extends js.Object {
  @js.native
  sealed trait Even extends HeaderFooterType
  
  @js.native
  sealed trait First extends HeaderFooterType
  
  @js.native
  sealed trait Odd extends HeaderFooterType
  
  @js.native
  sealed trait Primary extends HeaderFooterType
  
  /* 2 */ val Even: typings.devexpressDashWeb.HeaderFooterType.Even with Double = js.native
  /* 0 */ val First: typings.devexpressDashWeb.HeaderFooterType.First with Double = js.native
  /* 1 */ val Odd: typings.devexpressDashWeb.HeaderFooterType.Odd with Double = js.native
  /* 1 */ val Primary: typings.devexpressDashWeb.HeaderFooterType.Primary with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeaderFooterType with Double] = js.native
}

