package typings.estree.ESTree

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnionTypeAnnotation extends Node {
  var types: js.Array[FlowTypeAnnotation] = js.native
}

