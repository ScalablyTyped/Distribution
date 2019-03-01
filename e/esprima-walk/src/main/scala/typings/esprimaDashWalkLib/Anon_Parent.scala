package typings
package esprimaDashWalkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Parent extends js.Object {
  var parent: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ESTree.Node */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ESTree.Node */ js.Any
  ] = js.undefined
}

object Anon_Parent {
  @scala.inline
  def apply(
    parent: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ESTree.Node */ js.Any = null
  ): Anon_Parent = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Anon_Parent]
  }
}

