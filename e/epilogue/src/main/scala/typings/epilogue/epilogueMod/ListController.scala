package typings.epilogue.epilogueMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.sequelize.sequelizeMod.DataTypeAbstract
import typings.sequelize.sequelizeMod.DataTypeArray
import typings.sequelize.sequelizeMod.DataTypeBigInt
import typings.sequelize.sequelizeMod.DataTypeBlob
import typings.sequelize.sequelizeMod.DataTypeBoolean
import typings.sequelize.sequelizeMod.DataTypeChar
import typings.sequelize.sequelizeMod.DataTypeDate
import typings.sequelize.sequelizeMod.DataTypeDateOnly
import typings.sequelize.sequelizeMod.DataTypeDecimal
import typings.sequelize.sequelizeMod.DataTypeDouble
import typings.sequelize.sequelizeMod.DataTypeEnum
import typings.sequelize.sequelizeMod.DataTypeFloat
import typings.sequelize.sequelizeMod.DataTypeGeometry
import typings.sequelize.sequelizeMod.DataTypeHStore
import typings.sequelize.sequelizeMod.DataTypeInteger
import typings.sequelize.sequelizeMod.DataTypeJSONB
import typings.sequelize.sequelizeMod.DataTypeJSONType
import typings.sequelize.sequelizeMod.DataTypeNow
import typings.sequelize.sequelizeMod.DataTypeNumber
import typings.sequelize.sequelizeMod.DataTypeRange
import typings.sequelize.sequelizeMod.DataTypeReal
import typings.sequelize.sequelizeMod.DataTypeString
import typings.sequelize.sequelizeMod.DataTypeText
import typings.sequelize.sequelizeMod.DataTypeTime
import typings.sequelize.sequelizeMod.DataTypeUUID
import typings.sequelize.sequelizeMod.DataTypeUUIDv1
import typings.sequelize.sequelizeMod.DataTypeUUIDv4
import typings.sequelize.sequelizeMod.DataTypeVirtual
import typings.sequelize.sequelizeMod.Sequelize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("epilogue", "ListController")
@js.native
class ListController () extends BaseController {
  def _safeishParse(
    value: js.Any,
    `type`: DataTypeAbstract | DataTypeString | DataTypeChar | DataTypeText | DataTypeNumber | DataTypeInteger | DataTypeBigInt | DataTypeFloat | DataTypeTime | DataTypeDate | DataTypeDateOnly | DataTypeBoolean | DataTypeNow | DataTypeBlob | DataTypeDecimal | DataTypeUUID | DataTypeUUIDv1 | DataTypeUUIDv4 | DataTypeHStore | DataTypeJSONType | DataTypeJSONB | DataTypeVirtual | DataTypeArray | DataTypeEnum | DataTypeRange | DataTypeReal | DataTypeDouble | DataTypeGeometry,
    sequelize: Sequelize
  ): js.Any = js.native
  def fetch(req: Request, res: Response, context: Context): js.Promise[js.Function0[Unit]] = js.native
}

