package typings.expressBunyanLogger.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof bunyan.bunyan.LoggerOptions ]:? bunyan.bunyan.LoggerOptions[P]} */ trait Options extends js.Object {
  var excludes: js.UndefOr[js.Array[String]] = js.undefined
  var format: js.UndefOr[String | FormatFunction] = js.undefined
  var genReqId: js.UndefOr[RequestIdGenFunction] = js.undefined
  var immediate: js.UndefOr[Boolean] = js.undefined
  var includesFn: js.UndefOr[IncludesFunction] = js.undefined
  var levelFn: js.UndefOr[LevelFunction] = js.undefined
  var logger: js.UndefOr[typings.bunyan.mod.^] = js.undefined
  var obfuscate: js.UndefOr[js.Array[String]] = js.undefined
  var obfuscatePlaceholder: js.UndefOr[String] = js.undefined
  var parseUA: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    excludes: js.Array[String] = null,
    format: String | FormatFunction = null,
    genReqId: /* req */ Request_[ParamsDictionary] => String = null,
    immediate: js.UndefOr[Boolean] = js.undefined,
    includesFn: (/* req */ Request_[ParamsDictionary], /* res */ Response_) => js.Any = null,
    levelFn: (/* status */ Double, /* err */ Error | Null, /* meta */ js.Any) => String = null,
    logger: typings.bunyan.mod.^ = null,
    obfuscate: js.Array[String] = null,
    obfuscatePlaceholder: String = null,
    parseUA: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (excludes != null) __obj.updateDynamic("excludes")(excludes.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (genReqId != null) __obj.updateDynamic("genReqId")(js.Any.fromFunction1(genReqId))
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.asInstanceOf[js.Any])
    if (includesFn != null) __obj.updateDynamic("includesFn")(js.Any.fromFunction2(includesFn))
    if (levelFn != null) __obj.updateDynamic("levelFn")(js.Any.fromFunction3(levelFn))
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (obfuscate != null) __obj.updateDynamic("obfuscate")(obfuscate.asInstanceOf[js.Any])
    if (obfuscatePlaceholder != null) __obj.updateDynamic("obfuscatePlaceholder")(obfuscatePlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(parseUA)) __obj.updateDynamic("parseUA")(parseUA.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

