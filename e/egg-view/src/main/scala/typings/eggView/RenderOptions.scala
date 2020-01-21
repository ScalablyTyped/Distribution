package typings.eggView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PlainObject * / any */ trait RenderOptions extends js.Object {
  var locals: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PlainObject */ js.Any
  ] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var viewEngine: js.UndefOr[String] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply(
    locals: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PlainObject */ js.Any = null,
    name: String = null,
    root: String = null,
    viewEngine: String = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal()
    if (locals != null) __obj.updateDynamic("locals")(locals.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (viewEngine != null) __obj.updateDynamic("viewEngine")(viewEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
}

