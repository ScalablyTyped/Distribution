package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait sortOrder extends StObject
@JSGlobal("ej.sortOrder")
@js.native
object sortOrder extends StObject {
  
  //Enum for Ascending sort order
  @js.native
  sealed trait Ascending
    extends StObject
       with sortOrder
  
  //Enum for Descending sort order
  @js.native
  sealed trait Descending
    extends StObject
       with sortOrder
}
