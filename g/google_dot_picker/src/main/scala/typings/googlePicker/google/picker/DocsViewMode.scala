package typings.googlePicker.google.picker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DocsViewMode extends StObject
@JSGlobal("google.picker.DocsViewMode")
@js.native
object DocsViewMode extends StObject {
  
  // Display documents in a thumbnail grid.
  @js.native
  sealed trait GRID
    extends StObject
       with DocsViewMode
  
  // Display documents in a detailed list.
  @js.native
  sealed trait LIST
    extends StObject
       with DocsViewMode
}
