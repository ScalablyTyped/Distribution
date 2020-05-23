package typings.estree.mod

import typings.estree.estreeStrings.constructor
import typings.estree.estreeStrings.get
import typings.estree.estreeStrings.method
import typings.estree.estreeStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodDefinition
  extends BaseNode
     with Node {
  var computed: Boolean
  var key: Expression
  var kind: constructor | method | get | set
  var static: Boolean
  @JSName("type")
  var type_MethodDefinition: typings.estree.estreeStrings.MethodDefinition
  var value: FunctionExpression
}

object MethodDefinition {
  @scala.inline
  def apply(
    computed: Boolean,
    key: Expression,
    kind: constructor | method | get | set,
    static: Boolean,
    `type`: typings.estree.estreeStrings.MethodDefinition,
    value: FunctionExpression,
    leadingComments: js.Array[Comment] = null,
    loc: js.UndefOr[Null | SourceLocation] = js.undefined,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): MethodDefinition = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodDefinition]
  }
}

