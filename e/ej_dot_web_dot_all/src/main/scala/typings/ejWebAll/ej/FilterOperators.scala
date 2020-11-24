package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
