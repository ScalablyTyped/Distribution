package typings.draftJs.mod.Draft.Model.Encoding

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A type that represents a composed document as vanilla JavaScript objects,
  * with all styles and entities represented as ranges. Corresponding entity
  * objects are packaged as objects as well.
  *
  * This object is especially useful when sending the document state to the
  * server for storage, as its representation is more concise than our
  * immutable objects.
  */
@js.native
trait RawDraftContentState extends js.Object {
  
  var blocks: js.Array[RawDraftContentBlock] = js.native
  
  var entityMap: StringDictionary[RawDraftEntity[StringDictionary[_]]] = js.native
}
object RawDraftContentState {
  
  @scala.inline
  def apply(
    blocks: js.Array[RawDraftContentBlock],
    entityMap: StringDictionary[RawDraftEntity[StringDictionary[_]]]
  ): RawDraftContentState = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], entityMap = entityMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawDraftContentState]
  }
  
  @scala.inline
  implicit class RawDraftContentStateOps[Self <: RawDraftContentState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlocksVarargs(value: RawDraftContentBlock*): Self = this.set("blocks", js.Array(value :_*))
    
    @scala.inline
    def setBlocks(value: js.Array[RawDraftContentBlock]): Self = this.set("blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityMap(value: StringDictionary[RawDraftEntity[StringDictionary[_]]]): Self = this.set("entityMap", value.asInstanceOf[js.Any])
  }
}
