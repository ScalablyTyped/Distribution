package typings.domHelpers

import typings.domHelpers.anon.FnCall
import typings.domHelpers.domHelpersStrings.pageXOffset
import typings.domHelpers.domHelpersStrings.pageYOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-helpers/cjs/getScrollAccessor", JSImport.Namespace)
@js.native
object getScrollAccessorMod extends js.Object {
  @JSName("default")
  def default_pageXOffset(offset: pageXOffset): FnCall = js.native
  @JSName("default")
  def default_pageYOffset(offset: pageYOffset): FnCall = js.native
}

