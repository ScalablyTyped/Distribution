package typings.ejDotWebDotAll.ejNs

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
  
  /* 0 */ val Contains: typings.ejDotWebDotAll.ejNs.FilterType.Contains with Double = js.native
  /* 1 */ val StartsWith: typings.ejDotWebDotAll.ejNs.FilterType.StartsWith with Double = js.native
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
  
  /* 1 */ val Contains: typings.ejDotWebDotAll.ejNs.filterType.Contains with Double = js.native
  /* 2 */ val EndsWith: typings.ejDotWebDotAll.ejNs.filterType.EndsWith with Double = js.native
  /* 7 */ val Equal: typings.ejDotWebDotAll.ejNs.filterType.Equal with Double = js.native
  /* 4 */ val GreaterThan: typings.ejDotWebDotAll.ejNs.filterType.GreaterThan with Double = js.native
  /* 6 */ val GreaterThanOrEqual: typings.ejDotWebDotAll.ejNs.filterType.GreaterThanOrEqual with Double = js.native
  /* 3 */ val LessThan: typings.ejDotWebDotAll.ejNs.filterType.LessThan with Double = js.native
  /* 5 */ val LessThanOrEqual: typings.ejDotWebDotAll.ejNs.filterType.LessThanOrEqual with Double = js.native
  /* 8 */ val NotEqual: typings.ejDotWebDotAll.ejNs.filterType.NotEqual with Double = js.native
  /* 0 */ val StartsWith: typings.ejDotWebDotAll.ejNs.filterType.StartsWith with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[filterType with Double] = js.native
}

