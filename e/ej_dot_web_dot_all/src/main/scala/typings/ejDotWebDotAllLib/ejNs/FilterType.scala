package typings
package ejDotWebDotAllLib.ejNs

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
  sealed trait Contains
    extends ejDotWebDotAllLib.ejNs.FilterType
  
  //filter the data based on search key present at start position
  @js.native
  sealed trait StartsWith
    extends ejDotWebDotAllLib.ejNs.FilterType
  
  /* 0 */ val Contains: Contains with scala.Double = js.native
  /* 1 */ val StartsWith: StartsWith with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.FilterType with scala.Double] = js.native
}

@JSGlobal("ej.filterType")
@js.native
object filterType extends js.Object {
  @js.native
  sealed trait Contains
    extends ejDotWebDotAllLib.ejNs.filterType
  
  @js.native
  sealed trait EndsWith
    extends ejDotWebDotAllLib.ejNs.filterType
  
  @js.native
  sealed trait Equal
    extends ejDotWebDotAllLib.ejNs.filterType
  
  @js.native
  sealed trait GreaterThan
    extends ejDotWebDotAllLib.ejNs.filterType
  
  @js.native
  sealed trait GreaterThanOrEqual
    extends ejDotWebDotAllLib.ejNs.filterType
  
  @js.native
  sealed trait LessThan
    extends ejDotWebDotAllLib.ejNs.filterType
  
  @js.native
  sealed trait LessThanOrEqual
    extends ejDotWebDotAllLib.ejNs.filterType
  
  @js.native
  sealed trait NotEqual
    extends ejDotWebDotAllLib.ejNs.filterType
  
  @js.native
  sealed trait StartsWith
    extends ejDotWebDotAllLib.ejNs.filterType
  
  /* 1 */ val Contains: Contains with scala.Double = js.native
  /* 2 */ val EndsWith: EndsWith with scala.Double = js.native
  /* 7 */ val Equal: Equal with scala.Double = js.native
  /* 4 */ val GreaterThan: GreaterThan with scala.Double = js.native
  /* 6 */ val GreaterThanOrEqual: GreaterThanOrEqual with scala.Double = js.native
  /* 3 */ val LessThan: LessThan with scala.Double = js.native
  /* 5 */ val LessThanOrEqual: LessThanOrEqual with scala.Double = js.native
  /* 8 */ val NotEqual: NotEqual with scala.Double = js.native
  /* 0 */ val StartsWith: StartsWith with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.filterType with scala.Double] = js.native
}

