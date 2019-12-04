package typings.ecmarkup.libContextMod

import typings.ecmarkup.libSpecMod.Spec
import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var clauseNumberer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClauseNumberIterator */ js.Any
  var clauseStack: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ _
  ]
  var currentId: String | Null
  var importStack: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Import */ _
  ]
  var inAlg: Boolean
  var inNoAutolink: Boolean
  var inNoEmd: Boolean
  var node: HTMLElement
  var spec: Spec
  var startEmd: Node | Null
  var tagStack: js.Array[HTMLElement]
}

object Context {
  @scala.inline
  def apply(
    clauseNumberer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClauseNumberIterator */ js.Any,
    clauseStack: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Clause */ _
    ],
    importStack: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Import */ _
    ],
    inAlg: Boolean,
    inNoAutolink: Boolean,
    inNoEmd: Boolean,
    node: HTMLElement,
    spec: Spec,
    tagStack: js.Array[HTMLElement],
    currentId: String = null,
    startEmd: Node = null
  ): Context = {
    val __obj = js.Dynamic.literal(clauseNumberer = clauseNumberer.asInstanceOf[js.Any], clauseStack = clauseStack.asInstanceOf[js.Any], importStack = importStack.asInstanceOf[js.Any], inAlg = inAlg.asInstanceOf[js.Any], inNoAutolink = inNoAutolink.asInstanceOf[js.Any], inNoEmd = inNoEmd.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], tagStack = tagStack.asInstanceOf[js.Any])
    if (currentId != null) __obj.updateDynamic("currentId")(currentId.asInstanceOf[js.Any])
    if (startEmd != null) __obj.updateDynamic("startEmd")(startEmd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

