package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Format.Cloud
import typings.ejDotWebDotAll.ej.Format.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Format extends js.Object

@JSGlobal("ej.Format")
@js.native
object Format extends js.Object {
  //To render the TagCloud items in cloud format
  @js.native
  sealed trait Cloud extends Format
  
  //To render the TagCloud items in list format
  @js.native
  sealed trait List extends Format
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Format with Double] = js.native
  /* 0 */ @js.native
  object Cloud extends TopLevel[Cloud with Double]
  
  /* 1 */ @js.native
  object List extends TopLevel[List with Double]
  
}

@JSGlobal("ej.format")
@js.native
object format extends js.Object {
  def apply(value: js.Any, format: String): String = js.native
  def apply(value: js.Any, format: String, culture: String): String = js.native
}

