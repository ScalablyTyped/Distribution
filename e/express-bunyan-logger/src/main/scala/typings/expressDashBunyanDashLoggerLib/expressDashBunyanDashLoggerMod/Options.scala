package typings
package expressDashBunyanDashLoggerLib.expressDashBunyanDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof bunyan.bunyan.LoggerOptions ]:? bunyan.bunyan.LoggerOptions[P]} */ trait Options extends js.Object {
  var excludes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var format: js.UndefOr[java.lang.String | FormatFunction] = js.undefined
  var genReqId: js.UndefOr[RequestIdGenFunction] = js.undefined
  var immediate: js.UndefOr[scala.Boolean] = js.undefined
  var includesFn: js.UndefOr[IncludesFunction] = js.undefined
  var levelFn: js.UndefOr[LevelFunction] = js.undefined
  var logger: js.UndefOr[bunyanLib.bunyanMod.^] = js.undefined
  var obfuscate: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var obfuscatePlaceholder: js.UndefOr[java.lang.String] = js.undefined
  var parseUA: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    excludes: js.Array[java.lang.String] = null,
    format: java.lang.String | FormatFunction = null,
    genReqId: RequestIdGenFunction = null,
    immediate: js.UndefOr[scala.Boolean] = js.undefined,
    includesFn: IncludesFunction = null,
    levelFn: LevelFunction = null,
    logger: bunyanLib.bunyanMod.^ = null,
    obfuscate: js.Array[java.lang.String] = null,
    obfuscatePlaceholder: java.lang.String = null,
    parseUA: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (excludes != null) __obj.updateDynamic("excludes")(excludes)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (genReqId != null) __obj.updateDynamic("genReqId")(genReqId)
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    if (includesFn != null) __obj.updateDynamic("includesFn")(includesFn)
    if (levelFn != null) __obj.updateDynamic("levelFn")(levelFn)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (obfuscate != null) __obj.updateDynamic("obfuscate")(obfuscate)
    if (obfuscatePlaceholder != null) __obj.updateDynamic("obfuscatePlaceholder")(obfuscatePlaceholder)
    if (!js.isUndefined(parseUA)) __obj.updateDynamic("parseUA")(parseUA)
    __obj.asInstanceOf[Options]
  }
}

