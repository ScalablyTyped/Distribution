package typings.ecmarkup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var element: typings.std.Element
  var tree: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EcmarkdownNode */ js.Any
  ] = js.undefined
}

object Element {
  @scala.inline
  def apply(
    element: typings.std.Element,
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EcmarkdownNode */ js.Any = null
  ): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    if (tree != null) __obj.updateDynamic("tree")(tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
}

