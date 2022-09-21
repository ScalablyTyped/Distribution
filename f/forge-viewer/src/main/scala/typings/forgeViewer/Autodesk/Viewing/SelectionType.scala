package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionType extends StObject
@JSGlobal("Autodesk.Viewing.SelectionType")
@js.native
object SelectionType extends StObject {
  
  @js.native
  sealed trait MIXED
    extends StObject
       with SelectionType
  
  @js.native
  sealed trait OVERLAYED
    extends StObject
       with SelectionType
  
  @js.native
  sealed trait REGULAR
    extends StObject
       with SelectionType
}
