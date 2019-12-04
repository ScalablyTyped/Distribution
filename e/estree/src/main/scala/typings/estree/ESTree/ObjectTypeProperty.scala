package typings.estree.ESTree

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectTypeProperty extends Node {
  var key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Expression */ js.Any = js.native
  var optional: Boolean = js.native
  var static: Boolean = js.native
  var value: FlowTypeAnnotation = js.native
}

