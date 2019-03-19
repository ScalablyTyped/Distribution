package typings
package eggDashCoreLib.eggDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof egg-core.egg-core.FileLoaderOption ]:? egg-core.egg-core.FileLoaderOption[P]} */ trait ContextLoaderOption extends js.Object {
  /** directories to be loaded */
  var directory: java.lang.String | js.Array[java.lang.String]
  /** determine the field name of inject object. */
  var fieldClass: js.UndefOr[java.lang.String] = js.undefined
  /** required inject */
  var inject: js.Object
  /** property name defined to target */
  var property: java.lang.String
}

object ContextLoaderOption {
  @scala.inline
  def apply(
    directory: java.lang.String | js.Array[java.lang.String],
    inject: js.Object,
    property: java.lang.String,
    fieldClass: java.lang.String = null
  ): ContextLoaderOption = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], inject = inject, property = property)
    if (fieldClass != null) __obj.updateDynamic("fieldClass")(fieldClass)
    __obj.asInstanceOf[ContextLoaderOption]
  }
}

