package typings.draftJs.mod

import typings.draftJs.mod.Draft.Component.Selection.FakeClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draft-js", "getVisibleSelectionRect")
@js.native
object getVisibleSelectionRect extends js.Object {
  
  /**
    * Return the bounding ClientRect for the visible DOM selection, if any.
    * In cases where there are no selected ranges or the bounding rect is
    * temporarily invalid, return null.
    */
  def apply(global: js.Any): FakeClientRect = js.native
}
