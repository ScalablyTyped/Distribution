package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `BasicLevel` is an `AccessLevel` using a set of recommended features.
  */
@js.native
trait SchemaBasicLevel extends js.Object {
  /**
    * How the `conditions` list should be combined to determine if a request is
    * granted this `AccessLevel`. If AND is used, each `Condition` in
    * `conditions` must be satisfied for the `AccessLevel` to be applied. If OR
    * is used, at least one `Condition` in `conditions` must be satisfied for
    * the `AccessLevel` to be applied. Default behavior is AND.
    */
  var combiningFunction: js.UndefOr[String] = js.native
  /**
    * Required. A list of requirements for the `AccessLevel` to be granted.
    */
  var conditions: js.UndefOr[js.Array[SchemaCondition]] = js.native
}

object SchemaBasicLevel {
  @scala.inline
  def apply(): SchemaBasicLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicLevel]
  }
  @scala.inline
  implicit class SchemaBasicLevelOps[Self <: SchemaBasicLevel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCombiningFunction(value: String): Self = this.set("combiningFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCombiningFunction: Self = this.set("combiningFunction", js.undefined)
    @scala.inline
    def setConditionsVarargs(value: SchemaCondition*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[SchemaCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
  }
  
}

