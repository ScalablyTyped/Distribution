package typings.externalEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("external-editor", "editAsync")
@js.native
object editAsync extends js.Object {
  def apply(text: String, callback: StringCallback): Unit = js.native
  def apply(text: String, callback: StringCallback, fileOptions: IFileOptions): Unit = js.native
}

