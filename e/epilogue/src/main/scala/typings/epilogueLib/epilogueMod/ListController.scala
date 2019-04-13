package typings
package epilogueLib.epilogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("epilogue", "ListController")
@js.native
class ListController () extends BaseController {
  def _safeishParse(
    value: js.Any,
    `type`: sequelizeLib.sequelizeMod.DataTypeAbstract | sequelizeLib.sequelizeMod.DataTypeString | sequelizeLib.sequelizeMod.DataTypeChar | sequelizeLib.sequelizeMod.DataTypeText | sequelizeLib.sequelizeMod.DataTypeNumber | sequelizeLib.sequelizeMod.DataTypeInteger | sequelizeLib.sequelizeMod.DataTypeBigInt | sequelizeLib.sequelizeMod.DataTypeFloat | sequelizeLib.sequelizeMod.DataTypeTime | sequelizeLib.sequelizeMod.DataTypeDate | sequelizeLib.sequelizeMod.DataTypeDateOnly | sequelizeLib.sequelizeMod.DataTypeBoolean | sequelizeLib.sequelizeMod.DataTypeNow | sequelizeLib.sequelizeMod.DataTypeBlob | sequelizeLib.sequelizeMod.DataTypeDecimal | sequelizeLib.sequelizeMod.DataTypeUUID | sequelizeLib.sequelizeMod.DataTypeUUIDv1 | sequelizeLib.sequelizeMod.DataTypeUUIDv4 | sequelizeLib.sequelizeMod.DataTypeHStore | sequelizeLib.sequelizeMod.DataTypeJSONType | sequelizeLib.sequelizeMod.DataTypeJSONB | sequelizeLib.sequelizeMod.DataTypeVirtual | sequelizeLib.sequelizeMod.DataTypeArray | sequelizeLib.sequelizeMod.DataTypeEnum | sequelizeLib.sequelizeMod.DataTypeRange | sequelizeLib.sequelizeMod.DataTypeReal | sequelizeLib.sequelizeMod.DataTypeDouble | sequelizeLib.sequelizeMod.DataTypeGeometry,
    sequelize: sequelizeLib.sequelizeMod.Sequelize
  ): js.Any = js.native
  def fetch(req: expressLib.expressMod.Request, res: expressLib.expressMod.Response, context: Context): js.Promise[js.Function0[scala.Unit]] = js.native
}

