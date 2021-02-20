package typings.draftJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draft-js", "ContentState")
@js.native
class ContentState ()
  extends typings.draftJs.mod.Draft.Model.ImmutableData.ContentState
object ContentState {
  
  /* static member */
  @JSImport("draft-js", "ContentState.createFromBlockArray")
  @js.native
  def createFromBlockArray(blocks: js.Array[typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock]): typings.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
  @JSImport("draft-js", "ContentState.createFromBlockArray")
  @js.native
  def createFromBlockArray(blocks: js.Array[typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock], entityMap: js.Any): typings.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
  
  /* static member */
  @JSImport("draft-js", "ContentState.createFromText")
  @js.native
  def createFromText(text: String): typings.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
  @JSImport("draft-js", "ContentState.createFromText")
  @js.native
  def createFromText(text: String, delimiter: String): typings.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
}
