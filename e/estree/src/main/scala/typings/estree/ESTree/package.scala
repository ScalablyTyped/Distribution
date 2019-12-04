package typings.estree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ESTree {
  import typings.std.Node

  type AnyTypeAnnotation = FlowBaseTypeAnnotation
  type BooleanTypeAnnotation = FlowBaseTypeAnnotation
  type FlowBaseTypeAnnotation = FlowTypeAnnotation
  type FlowDeclaration = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Declaration */ js.Any
  type FlowTypeAnnotation = Node
  type MixedTypeAnnotation = FlowBaseTypeAnnotation
  type NumberTypeAnnotation = FlowBaseTypeAnnotation
  type StringTypeAnnotation = FlowBaseTypeAnnotation
  type VoidTypeAnnotation = FlowBaseTypeAnnotation
}
