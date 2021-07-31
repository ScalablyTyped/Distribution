package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait filterType extends StObject
@JSGlobal("ej.filterType")
@js.native
object filterType extends StObject {
  
  @js.native
  sealed trait Contains
    extends StObject
       with filterType
  
  @js.native
  sealed trait EndsWith
    extends StObject
       with filterType
  
  @js.native
  sealed trait Equal
    extends StObject
       with filterType
  
  @js.native
  sealed trait GreaterThan
    extends StObject
       with filterType
  
  @js.native
  sealed trait GreaterThanOrEqual
    extends StObject
       with filterType
  
  @js.native
  sealed trait LessThan
    extends StObject
       with filterType
  
  @js.native
  sealed trait LessThanOrEqual
    extends StObject
       with filterType
  
  @js.native
  sealed trait NotEqual
    extends StObject
       with filterType
  
  @js.native
  sealed trait StartsWith
    extends StObject
       with filterType
}
