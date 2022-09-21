package typings.forgeViewer.Autodesk.Viewing.Private

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VIEW_TYPES extends StObject
@JSGlobal("Autodesk.Viewing.Private.VIEW_TYPES")
@js.native
object VIEW_TYPES extends StObject {
  
  @js.native
  sealed trait DEFAULT
    extends StObject
       with VIEW_TYPES
  
  @js.native
  sealed trait ORTHOGRAPHIC
    extends StObject
       with VIEW_TYPES
  
  @js.native
  sealed trait PERSPECTIVE
    extends StObject
       with VIEW_TYPES
  
  @js.native
  sealed trait PERSPECTIVE_ORTHO_FACES
    extends StObject
       with VIEW_TYPES
}
