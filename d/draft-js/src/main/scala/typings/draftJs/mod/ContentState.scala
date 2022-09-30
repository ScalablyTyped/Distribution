package typings.draftJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draft-js", "ContentState")
@js.native
open class ContentState ()
  extends StObject
     with typings.draftJs.mod.Draft.Model.ImmutableData.ContentState
object ContentState {
  
  @JSImport("draft-js", "ContentState")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createFromBlockArray(blocks: js.Array[typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock]): typings.draftJs.mod.Draft.Model.ImmutableData.ContentState = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromBlockArray")(blocks.asInstanceOf[js.Any]).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.ContentState]
  inline def createFromBlockArray(blocks: js.Array[typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock], entityMap: Any): typings.draftJs.mod.Draft.Model.ImmutableData.ContentState = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromBlockArray")(blocks.asInstanceOf[js.Any], entityMap.asInstanceOf[js.Any])).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.ContentState]
  
  /* static member */
  inline def createFromText(text: String): typings.draftJs.mod.Draft.Model.ImmutableData.ContentState = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromText")(text.asInstanceOf[js.Any]).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.ContentState]
  inline def createFromText(text: String, delimiter: String): typings.draftJs.mod.Draft.Model.ImmutableData.ContentState = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromText")(text.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[typings.draftJs.mod.Draft.Model.ImmutableData.ContentState]
}
