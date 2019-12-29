package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterType extends js.Object

@js.native
sealed trait filterType extends js.Object

@JSGlobal("ej.FilterType")
@js.native
object FilterType extends js.Object {
  //filter the data wherever contains search key
  @js.native
  sealed trait Contains extends FilterType
  
  //filter the data based on search key present at start position
  @js.native
  sealed trait StartsWith extends FilterType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterType with Double] = js.native
  /* 0 */ @js.native
  object Contains extends TopLevel[Contains with Double]
  
  /* 1 */ @js.native
  object StartsWith extends TopLevel[StartsWith with Double]
  
}

@JSGlobal("ej.filterType")
@js.native
object filterType extends js.Object {
  @js.native
  sealed trait Contains extends filterType
  
  @js.native
  sealed trait EndsWith extends filterType
  
  @js.native
  sealed trait Equal extends filterType
  
  @js.native
  sealed trait GreaterThan extends filterType
  
  @js.native
  sealed trait GreaterThanOrEqual extends filterType
  
  @js.native
  sealed trait LessThan extends filterType
  
  @js.native
  sealed trait LessThanOrEqual extends filterType
  
  @js.native
  sealed trait NotEqual extends filterType
  
  @js.native
  sealed trait StartsWith extends filterType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[filterType with Double] = js.native
  /* 1 */ @js.native
  object Contains extends TopLevel[Contains with Double]
  
  /* 2 */ @js.native
  object EndsWith extends TopLevel[EndsWith with Double]
  
  /* 7 */ @js.native
  object Equal extends TopLevel[Equal with Double]
  
  /* 4 */ @js.native
  object GreaterThan extends TopLevel[GreaterThan with Double]
  
  /* 6 */ @js.native
  object GreaterThanOrEqual extends TopLevel[GreaterThanOrEqual with Double]
  
  /* 3 */ @js.native
  object LessThan extends TopLevel[LessThan with Double]
  
  /* 5 */ @js.native
  object LessThanOrEqual extends TopLevel[LessThanOrEqual with Double]
  
  /* 8 */ @js.native
  object NotEqual extends TopLevel[NotEqual with Double]
  
  /* 0 */ @js.native
  object StartsWith extends TopLevel[StartsWith with Double]
  
}

