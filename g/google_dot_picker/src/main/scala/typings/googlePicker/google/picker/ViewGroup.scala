package typings.googlePicker.google.picker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewGroup extends StObject {
  
  // Add a label to this ViewGroup.
  def addLabel(label: String): ViewGroup = js.native
  
  // Add a view to the ViewGroup. The View can be represented by a view-derived object, or simply by ViewId.
  def addView(viewOrId: DocsView): ViewGroup = js.native
  def addView(viewOrId: ViewId): ViewGroup = js.native
  
  // Nest a ViewGroup within the current ViewGroup.
  def addViewGroup(viewGroup: ViewGroup): ViewGroup = js.native
}
