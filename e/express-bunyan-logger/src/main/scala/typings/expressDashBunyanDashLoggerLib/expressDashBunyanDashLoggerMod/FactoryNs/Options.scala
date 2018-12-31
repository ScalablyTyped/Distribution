package typings
package expressDashBunyanDashLoggerLib.expressDashBunyanDashLoggerMod.FactoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var excludes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var format: js.UndefOr[java.lang.String | FormatFunction] = js.undefined
  var genReqId: js.UndefOr[RequestIdGenFunction] = js.undefined
  var immediate: js.UndefOr[scala.Boolean] = js.undefined
  var includesFn: js.UndefOr[IncludesFunction] = js.undefined
  var levelFn: js.UndefOr[LevelFunction] = js.undefined
  var logger: js.UndefOr[bunyanLib.bunyanMod.namespaced] = js.undefined
  var obfuscate: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var obfuscatePlaceholder: js.UndefOr[java.lang.String] = js.undefined
  var parseUA: js.UndefOr[scala.Boolean] = js.undefined
  var serializers: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[bunyanLib.bunyanMod.LoggerNs.Serializer]
  ] = js.undefined
}

