package typings
package epilogueLib.epilogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceAssociationOptions
  extends sequelizeLib.sequelizeMod.AssociationOptions {
  var removeForeignKeys: scala.Boolean
}

object ResourceAssociationOptions {
  @scala.inline
  def apply(
    removeForeignKeys: scala.Boolean,
    as: java.lang.String | sequelizeLib.Anon_Plural = null,
    constraints: js.UndefOr[scala.Boolean] = js.undefined,
    foreignKey: java.lang.String | sequelizeLib.sequelizeMod.AssociationForeignKeyOptions = null,
    foreignKeyConstraint: js.UndefOr[scala.Boolean] = js.undefined,
    hooks: js.UndefOr[scala.Boolean] = js.undefined,
    onDelete: java.lang.String = null,
    onUpdate: java.lang.String = null,
    scope: sequelizeLib.sequelizeMod.AssociationScope = null
  ): ResourceAssociationOptions = {
    val __obj = js.Dynamic.literal(removeForeignKeys = removeForeignKeys)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(constraints)) __obj.updateDynamic("constraints")(constraints)
    if (foreignKey != null) __obj.updateDynamic("foreignKey")(foreignKey.asInstanceOf[js.Any])
    if (!js.isUndefined(foreignKeyConstraint)) __obj.updateDynamic("foreignKeyConstraint")(foreignKeyConstraint)
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks)
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[ResourceAssociationOptions]
  }
}

