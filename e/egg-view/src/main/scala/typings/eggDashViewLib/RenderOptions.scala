package typings
package eggDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait RenderOptions extends js.Object {
  var locals: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PlainObject */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PlainObject */ js.Any
  ] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var viewEngine: js.UndefOr[java.lang.String] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply(
    locals: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PlainObject */ js.Any = null,
    name: java.lang.String = null,
    root: java.lang.String = null,
    viewEngine: java.lang.String = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal()
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (name != null) __obj.updateDynamic("name")(name)
    if (root != null) __obj.updateDynamic("root")(root)
    if (viewEngine != null) __obj.updateDynamic("viewEngine")(viewEngine)
    __obj.asInstanceOf[RenderOptions]
  }
}

