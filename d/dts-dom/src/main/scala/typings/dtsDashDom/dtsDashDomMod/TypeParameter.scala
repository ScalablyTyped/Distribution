package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.`type-parameter`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeParameter extends _Type {
  var baseType: js.UndefOr[ObjectTypeReference | TypeParameter] = js.undefined
  var defaultType: js.UndefOr[Type] = js.undefined
  var kind: `type-parameter`
  var name: String
}

object TypeParameter {
  @scala.inline
  def apply(
    kind: `type-parameter`,
    name: String,
    baseType: ObjectTypeReference | TypeParameter = null,
    defaultType: Type = null
  ): TypeParameter = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
    if (baseType != null) __obj.updateDynamic("baseType")(baseType.asInstanceOf[js.Any])
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeParameter]
  }
}

