package typings.expo.creatorWebMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/takeSnapshotAsync/Creator.web", "createSVGAsync")
@js.native
object createSVGAsync extends js.Object {
  def apply(element: Element): js.Promise[String] = js.native
  def apply(element: Element, options: SVGOptions): js.Promise[String] = js.native
}

