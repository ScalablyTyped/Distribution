package typings
package expressDashWinstonLib.expressDashWinstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseErrorLoggerOptions extends js.Object {
  var baseMeta: js.UndefOr[js.Object] = js.undefined
  var dynamicMeta: js.UndefOr[DynamicMetaFunction] = js.undefined
  var level: js.UndefOr[java.lang.String | DynamicLevelFunction] = js.undefined
  var metaField: js.UndefOr[java.lang.String] = js.undefined
  var msg: js.UndefOr[java.lang.String] = js.undefined
  var requestFilter: js.UndefOr[RequestFilter] = js.undefined
  var requestWhitelist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

