package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait filterType extends StObject
@JSGlobal("ej.filterType")
@js.native
object filterType extends StObject {
  
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
