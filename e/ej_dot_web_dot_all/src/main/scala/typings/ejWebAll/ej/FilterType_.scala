package typings.ejWebAll.ej

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterType_ extends js.Object

@JSGlobal("ej.FilterType")
@js.native
object FilterType_ extends js.Object {
  //filter the data wherever contains search key
  @js.native
  sealed trait Contains extends FilterType_
  
  //filter the data based on search key present at start position
  @js.native
  sealed trait StartsWith extends FilterType_
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterType_ with Double] = js.native
  /* 0 */ @js.native
  object Contains extends TopLevel[Contains with Double]
  
  /* 1 */ @js.native
  object StartsWith extends TopLevel[StartsWith with Double]
  
}

