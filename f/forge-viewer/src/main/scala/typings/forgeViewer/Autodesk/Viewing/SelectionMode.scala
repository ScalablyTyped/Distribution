package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionMode extends StObject
@JSGlobal("Autodesk.Viewing.SelectionMode")
@js.native
object SelectionMode extends StObject {
  
  @js.native
  sealed trait FIRST_OBJECT
    extends StObject
       with SelectionMode
  
  @js.native
  sealed trait LAST_OBJECT
    extends StObject
       with SelectionMode
  
  @js.native
  sealed trait LEAF_OBJECT
    extends StObject
       with SelectionMode
  
  @js.native
  sealed trait MIXED
    extends StObject
       with SelectionMode
  
  @js.native
  sealed trait OVERLAYED
    extends StObject
       with SelectionMode
  
  @js.native
  sealed trait REGULAR
    extends StObject
       with SelectionMode
}
