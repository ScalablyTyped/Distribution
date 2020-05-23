package typings.estree.ESTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassProperty extends js.Object {
  var computed: Boolean
  var key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Expression */ js.Any
  var static: Boolean
  var typeAnnotation: js.UndefOr[TypeAnnotation | Null] = js.undefined
  var value: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Expression */ js.Any) | Null
  ] = js.undefined
}

object ClassProperty {
  @scala.inline
  def apply(
    computed: Boolean,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Expression */ js.Any,
    static: Boolean,
    typeAnnotation: js.UndefOr[Null | TypeAnnotation] = js.undefined,
    value: js.UndefOr[
      Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Expression */ js.Any)
    ] = js.undefined
  ): ClassProperty = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    if (!js.isUndefined(typeAnnotation)) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassProperty]
  }
}

