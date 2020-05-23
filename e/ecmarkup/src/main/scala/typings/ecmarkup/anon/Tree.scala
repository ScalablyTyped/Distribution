package typings.ecmarkup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tree extends js.Object {
  var element: typings.std.Element
  var tree: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_ecmarkdown.OpaqueTagNode */ js.Any
  ] = js.undefined
}

object Tree {
  @scala.inline
  def apply(
    element: typings.std.Element,
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_ecmarkdown.OpaqueTagNode */ js.Any = null
  ): Tree = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (tree != null) __obj.updateDynamic("tree")(tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tree]
  }
}

