package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeParameter extends _Type {
  var baseType: js.UndefOr[ObjectTypeReference | TypeParameter] = js.undefined
  var defaultType: js.UndefOr[Type] = js.undefined
  var kind: dtsDashDomLib.dtsDashDomLibStrings.`type-parameter`
  var name: java.lang.String
}

object TypeParameter {
  @scala.inline
  def apply(
    kind: dtsDashDomLib.dtsDashDomLibStrings.`type-parameter`,
    name: java.lang.String,
    baseType: ObjectTypeReference | TypeParameter = null,
    defaultType: Type = null
  ): TypeParameter = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (baseType != null) __obj.updateDynamic("baseType")(baseType.asInstanceOf[js.Any])
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameter]
  }
}

