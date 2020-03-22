package typings.epilogue.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.sequelize.mod.DataTypeAbstract
import typings.sequelize.mod.DataTypeArray
import typings.sequelize.mod.DataTypeBigInt
import typings.sequelize.mod.DataTypeBlob
import typings.sequelize.mod.DataTypeBoolean
import typings.sequelize.mod.DataTypeChar
import typings.sequelize.mod.DataTypeDate
import typings.sequelize.mod.DataTypeDateOnly
import typings.sequelize.mod.DataTypeDecimal
import typings.sequelize.mod.DataTypeDouble
import typings.sequelize.mod.DataTypeEnum
import typings.sequelize.mod.DataTypeFloat
import typings.sequelize.mod.DataTypeGeometry
import typings.sequelize.mod.DataTypeHStore
import typings.sequelize.mod.DataTypeInteger
import typings.sequelize.mod.DataTypeJSONB
import typings.sequelize.mod.DataTypeJSONType
import typings.sequelize.mod.DataTypeNow
import typings.sequelize.mod.DataTypeNumber
import typings.sequelize.mod.DataTypeRange
import typings.sequelize.mod.DataTypeReal
import typings.sequelize.mod.DataTypeString
import typings.sequelize.mod.DataTypeText
import typings.sequelize.mod.DataTypeTime
import typings.sequelize.mod.DataTypeUUID
import typings.sequelize.mod.DataTypeUUIDv1
import typings.sequelize.mod.DataTypeUUIDv4
import typings.sequelize.mod.DataTypeVirtual
import typings.sequelize.mod.Sequelize
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
  def fetch(req: Request_[ParamsDictionary], res: Response_[_], context: Context): js.Promise[js.Function0[Unit]] = js.native
}

