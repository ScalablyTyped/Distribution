package typings.draftJs.mod.Draft.Model.Constants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default entity types.
  */
/* Rewritten from type alias, can be one of: 
  - typings.draftJs.draftJsStrings.LINK
  - typings.draftJs.draftJsStrings.TOKEN
  - typings.draftJs.draftJsStrings.PHOTO
  - typings.draftJs.draftJsStrings.IMAGE
*/
trait ComposedEntityType extends js.Object

object ComposedEntityType {
  @scala.inline
  def IMAGE: typings.draftJs.draftJsStrings.IMAGE = this.cast("IMAGE")
  @scala.inline
  def LINK: typings.draftJs.draftJsStrings.LINK = this.cast("LINK")
  @scala.inline
  def PHOTO: typings.draftJs.draftJsStrings.PHOTO = this.cast("PHOTO")
  @scala.inline
  def TOKEN: typings.draftJs.draftJsStrings.TOKEN = this.cast("TOKEN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

