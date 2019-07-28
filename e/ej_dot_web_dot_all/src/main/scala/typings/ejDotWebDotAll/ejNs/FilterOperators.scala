package typings.ejDotWebDotAll.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterOperators extends js.Object

@JSGlobal("ej.FilterOperators")
@js.native
object FilterOperators extends js.Object {
  @js.native
  sealed trait contains extends FilterOperators
  
  @js.native
  sealed trait endsWith extends FilterOperators
  
  @js.native
  sealed trait equal extends FilterOperators
  
  @js.native
  sealed trait greaterThan extends FilterOperators
  
  @js.native
  sealed trait greaterThanOrEqual extends FilterOperators
  
  @js.native
  sealed trait lessThan extends FilterOperators
  
  @js.native
  sealed trait lessThanOrEqual extends FilterOperators
  
  @js.native
  sealed trait notEqual extends FilterOperators
  
  @js.native
  sealed trait startsWith extends FilterOperators
  
  /* 0 */ val contains: typings.ejDotWebDotAll.ejNs.FilterOperators.contains with Double = js.native
  /* 1 */ val endsWith: typings.ejDotWebDotAll.ejNs.FilterOperators.endsWith with Double = js.native
  /* 2 */ val equal: typings.ejDotWebDotAll.ejNs.FilterOperators.equal with Double = js.native
  /* 3 */ val greaterThan: typings.ejDotWebDotAll.ejNs.FilterOperators.greaterThan with Double = js.native
  /* 4 */ val greaterThanOrEqual: typings.ejDotWebDotAll.ejNs.FilterOperators.greaterThanOrEqual with Double = js.native
  /* 5 */ val lessThan: typings.ejDotWebDotAll.ejNs.FilterOperators.lessThan with Double = js.native
  /* 6 */ val lessThanOrEqual: typings.ejDotWebDotAll.ejNs.FilterOperators.lessThanOrEqual with Double = js.native
  /* 7 */ val notEqual: typings.ejDotWebDotAll.ejNs.FilterOperators.notEqual with Double = js.native
  /* 8 */ val startsWith: typings.ejDotWebDotAll.ejNs.FilterOperators.startsWith with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterOperators with Double] = js.native
}

