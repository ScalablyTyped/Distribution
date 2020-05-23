package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait filterType extends js.Object

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
  
}

