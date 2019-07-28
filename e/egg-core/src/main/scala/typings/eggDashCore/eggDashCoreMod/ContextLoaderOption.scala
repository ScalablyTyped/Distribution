package typings.eggDashCore.eggDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof egg-core.egg-core.FileLoaderOption ]:? egg-core.egg-core.FileLoaderOption[P]} */ trait ContextLoaderOption extends js.Object {
  /** directories to be loaded */
  var directory: String | js.Array[String]
  /** determine the field name of inject object. */
  var fieldClass: js.UndefOr[String] = js.undefined
  /** required inject */
  var inject: js.Object
  /** property name defined to target */
  var property: String
}

object ContextLoaderOption {
  @scala.inline
  def apply(
    directory: String | js.Array[String],
    inject: js.Object,
    property: String,
    fieldClass: String = null
  ): ContextLoaderOption = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], inject = inject, property = property)
    if (fieldClass != null) __obj.updateDynamic("fieldClass")(fieldClass)
    __obj.asInstanceOf[ContextLoaderOption]
  }
}

