package typings.estree.ESTree

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypeAnnotation extends Node {
  var callProperties: js.Array[ObjectTypeCallProperty] = js.native
  var indexers: js.Array[ObjectTypeIndexer] = js.native
  var properties: js.Array[ObjectTypeProperty] = js.native
}

