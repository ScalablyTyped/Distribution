package typings.draftDashJs.draftDashJsMod.Draft.Model.Encoding

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type that represents a composed document as vanilla JavaScript objects,
  * with all styles and entities represented as ranges. Corresponding entity
  * objects are packaged as objects as well.
  *
  * This object is especially useful when sending the document state to the
  * server for storage, as its representation is more concise than our
  * immutable objects.
  */
trait RawDraftContentState extends js.Object {
  var blocks: js.Array[RawDraftContentBlock]
  var entityMap: StringDictionary[RawDraftEntity[StringDictionary[_]]]
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
}

