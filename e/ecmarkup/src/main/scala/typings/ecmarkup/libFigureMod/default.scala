package typings.ecmarkup.libFigureMod

import typings.ecmarkup.libContextMod.Context
import typings.ecmarkup.libSpecMod.Spec
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ecmarkup/lib/Figure", JSImport.Default)
@js.native
class default protected () extends Figure {
  def this(spec: Spec, node: HTMLElement) = this()
  /* CompleteClass */
  override var caption: String = js.native
  /* CompleteClass */
  override var captionElem: HTMLElement | Null = js.native
  /* CompleteClass */
  override var id: String | Null = js.native
  /* CompleteClass */
  override var isInformative: Boolean = js.native
  /* CompleteClass */
  override var number: Double = js.native
  /* CompleteClass */
  override var `type`: String = js.native
}

/* static members */
@JSImport("ecmarkup/lib/Figure", JSImport.Default)
@js.native
object default extends js.Object {
  var elements: js.Array[String] = js.native
  def enter(hasSpecNodeClauseStack: Context): Unit = js.native
}

