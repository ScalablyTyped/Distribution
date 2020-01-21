package typings.googleImages.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleImages.googleImagesStrings.clipart
  - typings.googleImages.googleImagesStrings.face
  - typings.googleImages.googleImagesStrings.lineart
  - typings.googleImages.googleImagesStrings.news
  - typings.googleImages.googleImagesStrings.photo
*/
trait SearchImageType extends js.Object

object SearchImageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clipart: typings.googleImages.googleImagesStrings.clipart = this.cast("clipart")
  @scala.inline
  def face: typings.googleImages.googleImagesStrings.face = this.cast("face")
  @scala.inline
  def lineart: typings.googleImages.googleImagesStrings.lineart = this.cast("lineart")
  @scala.inline
  def news: typings.googleImages.googleImagesStrings.news = this.cast("news")
  @scala.inline
  def photo: typings.googleImages.googleImagesStrings.photo = this.cast("photo")
}

