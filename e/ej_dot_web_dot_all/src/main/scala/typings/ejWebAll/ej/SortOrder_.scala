package typings.ejWebAll.ej

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortOrder_ extends js.Object

@JSGlobal("ej.SortOrder")
@js.native
object SortOrder_ extends js.Object {
  @js.native
  sealed trait Ascending extends SortOrder_
  
  @js.native
  sealed trait Descending extends SortOrder_
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SortOrder_ with Double] = js.native
  /* 0 */ @js.native
  object Ascending extends TopLevel[Ascending with Double]
  
  /* 1 */ @js.native
  object Descending extends TopLevel[Descending with Double]
  
}

