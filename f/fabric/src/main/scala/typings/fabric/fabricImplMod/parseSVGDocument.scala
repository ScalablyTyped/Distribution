package typings.fabric.fabricImplMod

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "parseSVGDocument")
@js.native
object parseSVGDocument extends js.Object {
  def apply(
    doc: SVGElement,
    callback: js.Function2[/* results */ js.Array[Object], /* options */ js.Any, Unit]
  ): Unit = js.native
  def apply(
    doc: SVGElement,
    callback: js.Function2[/* results */ js.Array[Object], /* options */ js.Any, Unit],
    reviver: js.Function
  ): Unit = js.native
}

