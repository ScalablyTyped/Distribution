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
  
  val contains: contains with java.lang.String = js.native
  val endsWith: endsWith with java.lang.String = js.native
  val equal: equal with java.lang.String = js.native
  val greaterThan: greaterThan with java.lang.String = js.native
  val greaterThanOrEqual: greaterThanOrEqual with java.lang.String = js.native
  val lessThan: lessThan with java.lang.String = js.native
  val lessThanOrEqual: lessThanOrEqual with java.lang.String = js.native
  val notEqual: notEqual with java.lang.String = js.native
  val startsWith: startsWith with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.FilterOperators with java.lang.String] = js.native
}

