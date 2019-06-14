package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterOperators extends js.Object

@JSGlobal("ej.FilterOperators")
@js.native
object FilterOperators extends js.Object {
  @js.native
  sealed trait contains
    extends ejDotWebDotAllLib.ejNs.FilterOperators
  
  @js.native
  sealed trait endsWith
    extends ejDotWebDotAllLib.ejNs.FilterOperators
  
  @js.native
  sealed trait equal
    extends ejDotWebDotAllLib.ejNs.FilterOperators
  
  @js.native
  sealed trait greaterThan
    extends ejDotWebDotAllLib.ejNs.FilterOperators
  
  @js.native
  sealed trait greaterThanOrEqual
    extends ejDotWebDotAllLib.ejNs.FilterOperators
  
  @js.native
  sealed trait lessThan
    extends ejDotWebDotAllLib.ejNs.FilterOperators
  
  @js.native
  sealed trait lessThanOrEqual
    extends ejDotWebDotAllLib.ejNs.FilterOperators
  
  @js.native
  sealed trait notEqual
    extends ejDotWebDotAllLib.ejNs.FilterOperators
  
  @js.native
  sealed trait startsWith
    extends ejDotWebDotAllLib.ejNs.FilterOperators
  
  /* 0 */ val contains: contains with scala.Double = js.native
  /* 1 */ val endsWith: endsWith with scala.Double = js.native
  /* 2 */ val equal: equal with scala.Double = js.native
  /* 3 */ val greaterThan: greaterThan with scala.Double = js.native
  /* 4 */ val greaterThanOrEqual: greaterThanOrEqual with scala.Double = js.native
  /* 5 */ val lessThan: lessThan with scala.Double = js.native
  /* 6 */ val lessThanOrEqual: lessThanOrEqual with scala.Double = js.native
  /* 7 */ val notEqual: notEqual with scala.Double = js.native
  /* 8 */ val startsWith: startsWith with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.FilterOperators with scala.Double] = js.native
}

