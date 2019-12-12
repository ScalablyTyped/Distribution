package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.FilterOperators.contains
import typings.ejDotWebDotAll.ej.FilterOperators.endsWith
import typings.ejDotWebDotAll.ej.FilterOperators.equal
import typings.ejDotWebDotAll.ej.FilterOperators.greaterThan
import typings.ejDotWebDotAll.ej.FilterOperators.greaterThanOrEqual
import typings.ejDotWebDotAll.ej.FilterOperators.lessThan
import typings.ejDotWebDotAll.ej.FilterOperators.lessThanOrEqual
import typings.ejDotWebDotAll.ej.FilterOperators.notEqual
import typings.ejDotWebDotAll.ej.FilterOperators.startsWith
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterOperators with Double] = js.native
  /* 0 */ @js.native
  object contains extends TopLevel[contains with Double]
  
  /* 1 */ @js.native
  object endsWith extends TopLevel[endsWith with Double]
  
  /* 2 */ @js.native
  object equal extends TopLevel[equal with Double]
  
  /* 3 */ @js.native
  object greaterThan extends TopLevel[greaterThan with Double]
  
  /* 4 */ @js.native
  object greaterThanOrEqual extends TopLevel[greaterThanOrEqual with Double]
  
  /* 5 */ @js.native
  object lessThan extends TopLevel[lessThan with Double]
  
  /* 6 */ @js.native
  object lessThanOrEqual extends TopLevel[lessThanOrEqual with Double]
  
  /* 7 */ @js.native
  object notEqual extends TopLevel[notEqual with Double]
  
  /* 8 */ @js.native
  object startsWith extends TopLevel[startsWith with Double]
  
}

