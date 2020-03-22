package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTextEditor extends Editor {
  /** Removes focus from the input element. */
  def blur(): Unit = js.native
  /** Gets an instance of a custom action button. */
  def getButton(name: String): js.UndefOr[dxButton] = js.native
}

