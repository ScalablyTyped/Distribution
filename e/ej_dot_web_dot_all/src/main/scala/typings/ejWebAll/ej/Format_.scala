package typings.ejWebAll.ej

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Format_ extends js.Object

@JSGlobal("ej.Format")
@js.native
object Format_ extends js.Object {
  //To render the TagCloud items in cloud format
  @js.native
  sealed trait Cloud extends Format_
  
  //To render the TagCloud items in list format
  @js.native
  sealed trait List extends Format_
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Format_ with Double] = js.native
  /* 0 */ @js.native
  object Cloud extends TopLevel[Cloud with Double]
  
  /* 1 */ @js.native
  object List extends TopLevel[List with Double]
  
}

