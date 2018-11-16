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
  
  val Contains: Contains with java.lang.String = js.native
  val StartsWith: StartsWith with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.FilterType with java.lang.String] = js.native
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
  
  val Contains: Contains with java.lang.String = js.native
  val EndsWith: EndsWith with java.lang.String = js.native
  val Equal: Equal with java.lang.String = js.native
  val GreaterThan: GreaterThan with java.lang.String = js.native
  val GreaterThanOrEqual: GreaterThanOrEqual with java.lang.String = js.native
  val LessThan: LessThan with java.lang.String = js.native
  val LessThanOrEqual: LessThanOrEqual with java.lang.String = js.native
  val NotEqual: NotEqual with java.lang.String = js.native
  val StartsWith: StartsWith with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.filterType with java.lang.String] = js.native
}

