package typings.dropboxDashChooser.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dropboxDashChooser.dropboxDashChooserStrings.fit
  - typings.dropboxDashChooser.dropboxDashChooserStrings.crop
  - typings.dropboxDashChooser.dropboxDashChooserStrings.fit_one_and_overflow
*/
trait ChooserFileMode extends js.Object

object ChooserFileMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def crop: typings.dropboxDashChooser.dropboxDashChooserStrings.crop = this.cast("crop")
  @scala.inline
  def fit: typings.dropboxDashChooser.dropboxDashChooserStrings.fit = this.cast("fit")
  @scala.inline
  def fit_one_and_overflow: typings.dropboxDashChooser.dropboxDashChooserStrings.fit_one_and_overflow = this.cast("fit_one_and_overflow")
}

