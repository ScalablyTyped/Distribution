package typings.ejDotWebDotAll.ej

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
  
  /* 0 */ val Contains: typings.ejDotWebDotAll.ej.FilterType.Contains with Double = js.native
  /* 1 */ val StartsWith: typings.ejDotWebDotAll.ej.FilterType.StartsWith with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterType with Double] = js.native
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
  
  /* 1 */ val Contains: typings.ejDotWebDotAll.ej.filterType.Contains with Double = js.native
  /* 2 */ val EndsWith: typings.ejDotWebDotAll.ej.filterType.EndsWith with Double = js.native
  /* 7 */ val Equal: typings.ejDotWebDotAll.ej.filterType.Equal with Double = js.native
  /* 4 */ val GreaterThan: typings.ejDotWebDotAll.ej.filterType.GreaterThan with Double = js.native
  /* 6 */ val GreaterThanOrEqual: typings.ejDotWebDotAll.ej.filterType.GreaterThanOrEqual with Double = js.native
  /* 3 */ val LessThan: typings.ejDotWebDotAll.ej.filterType.LessThan with Double = js.native
  /* 5 */ val LessThanOrEqual: typings.ejDotWebDotAll.ej.filterType.LessThanOrEqual with Double = js.native
  /* 8 */ val NotEqual: typings.ejDotWebDotAll.ej.filterType.NotEqual with Double = js.native
  /* 0 */ val StartsWith: typings.ejDotWebDotAll.ej.filterType.StartsWith with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[filterType with Double] = js.native
}

