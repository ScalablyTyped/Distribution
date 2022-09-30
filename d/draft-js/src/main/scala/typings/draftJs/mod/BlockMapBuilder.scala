package typings.draftJs.mod

import typings.draftJs.mod.Draft.Model.ImmutableData.BlockMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draft-js", "BlockMapBuilder")
@js.native
open class BlockMapBuilder ()
  extends StObject
     with typings.draftJs.mod.Draft.Model.ImmutableData.BlockMapBuilder
object BlockMapBuilder {
  
  @JSImport("draft-js", "BlockMapBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createFromArray(blocks: js.Array[typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock]): BlockMap = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromArray")(blocks.asInstanceOf[js.Any]).asInstanceOf[BlockMap]
}
