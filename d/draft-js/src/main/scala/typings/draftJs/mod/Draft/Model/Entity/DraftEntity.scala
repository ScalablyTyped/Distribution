package typings.draftJs.mod.Draft.Model.Entity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A "document entity" is an object containing metadata associated with a
  * piece of text in a ContentBlock.
  *
  * For example, a `link` entity might include a `uri` property. When a
  * ContentBlock is rendered in the browser, text that refers to that link
  * entity may be rendered as an anchor, with the `uri` as the href value.
  *
  * In a ContentBlock, every position in the text may correspond to zero
  * or one entities. This correspondence is tracked using a key string,
  * generated via DraftEntity.create() and used to obtain entity metadata
  * via DraftEntity.get().
  */
trait DraftEntity extends js.Object

