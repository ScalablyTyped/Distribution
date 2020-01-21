package typings.dropboxChooser.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dropboxChooser.dropboxChooserStrings.fit
  - typings.dropboxChooser.dropboxChooserStrings.crop
  - typings.dropboxChooser.dropboxChooserStrings.fit_one_and_overflow
*/
trait ChooserFileMode extends js.Object

object ChooserFileMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def crop: typings.dropboxChooser.dropboxChooserStrings.crop = this.cast("crop")
  @scala.inline
  def fit: typings.dropboxChooser.dropboxChooserStrings.fit = this.cast("fit")
  @scala.inline
  def fit_one_and_overflow: typings.dropboxChooser.dropboxChooserStrings.fit_one_and_overflow = this.cast("fit_one_and_overflow")
}

