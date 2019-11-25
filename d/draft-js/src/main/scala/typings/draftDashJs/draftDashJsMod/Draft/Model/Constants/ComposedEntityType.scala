package typings.draftDashJs.draftDashJsMod.Draft.Model.Constants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default entity types.
  */
/* Rewritten from type alias, can be one of: 
  - typings.draftDashJs.draftDashJsStrings.LINK
  - typings.draftDashJs.draftDashJsStrings.TOKEN
  - typings.draftDashJs.draftDashJsStrings.PHOTO
  - typings.draftDashJs.draftDashJsStrings.IMAGE
*/
trait ComposedEntityType extends js.Object

object ComposedEntityType {
  @scala.inline
  def IMAGE: typings.draftDashJs.draftDashJsStrings.IMAGE = this.cast("IMAGE")
  @scala.inline
  def LINK: typings.draftDashJs.draftDashJsStrings.LINK = this.cast("LINK")
  @scala.inline
  def PHOTO: typings.draftDashJs.draftDashJsStrings.PHOTO = this.cast("PHOTO")
  @scala.inline
  def TOKEN: typings.draftDashJs.draftDashJsStrings.TOKEN = this.cast("TOKEN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

