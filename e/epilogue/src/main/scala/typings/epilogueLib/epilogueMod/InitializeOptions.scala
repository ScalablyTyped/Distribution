package typings
package epilogueLib.epilogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializeOptions extends js.Object {
  var app: expressLib.expressMod.eNs.Express
  var base: js.UndefOr[java.lang.String] = js.undefined
  var sequelize: sequelizeLib.sequelizeMod.sequelizeNs.Sequelize
  var updateMethod: js.UndefOr[java.lang.String] = js.undefined
}

object InitializeOptions {
  @scala.inline
  def apply(
    app: expressLib.expressMod.eNs.Express,
    sequelize: sequelizeLib.sequelizeMod.sequelizeNs.Sequelize,
    base: java.lang.String = null,
    updateMethod: java.lang.String = null
  ): InitializeOptions = {
    val __obj = js.Dynamic.literal(app = app, sequelize = sequelize)
    if (base != null) __obj.updateDynamic("base")(base)
    if (updateMethod != null) __obj.updateDynamic("updateMethod")(updateMethod)
    __obj.asInstanceOf[InitializeOptions]
  }
}

