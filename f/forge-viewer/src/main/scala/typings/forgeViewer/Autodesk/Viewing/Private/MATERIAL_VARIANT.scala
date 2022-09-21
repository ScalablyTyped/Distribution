package typings.forgeViewer.Autodesk.Viewing.Private

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MATERIAL_VARIANT extends StObject
@JSGlobal("Autodesk.Viewing.Private.MATERIAL_VARIANT")
@js.native
object MATERIAL_VARIANT extends StObject {
  
  @js.native
  sealed trait INSTANCED
    extends StObject
       with MATERIAL_VARIANT
  
  @js.native
  sealed trait VERTEX_IDS
    extends StObject
       with MATERIAL_VARIANT
}
