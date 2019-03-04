package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs

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
  var entityMap: org.scalablytyped.runtime.StringDictionary[RawDraftEntity]
}

object RawDraftContentState {
  @scala.inline
  def apply(
    blocks: js.Array[RawDraftContentBlock],
    entityMap: org.scalablytyped.runtime.StringDictionary[RawDraftEntity]
  ): RawDraftContentState = {
    val __obj = js.Dynamic.literal(blocks = blocks, entityMap = entityMap)
  
    __obj.asInstanceOf[RawDraftContentState]
  }
}

