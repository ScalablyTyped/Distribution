package typings.expressBunyanLogger.mod

import typings.bunyan.mod.LogLevel
import typings.bunyan.mod.Serializers
import typings.bunyan.mod.Stream
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.NodeJS.WritableStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<bunyan.bunyan.LoggerOptions> */
trait Options extends js.Object {
  var excludes: js.UndefOr[js.Array[String]] = js.undefined
  var format: js.UndefOr[String | FormatFunction] = js.undefined
  var genReqId: js.UndefOr[RequestIdGenFunction] = js.undefined
  var immediate: js.UndefOr[Boolean] = js.undefined
  var includesFn: js.UndefOr[IncludesFunction] = js.undefined
  var level: js.UndefOr[LogLevel] = js.undefined
  var levelFn: js.UndefOr[LevelFunction] = js.undefined
  var logger: js.UndefOr[typings.bunyan.mod.^] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var obfuscate: js.UndefOr[js.Array[String]] = js.undefined
  var obfuscatePlaceholder: js.UndefOr[String] = js.undefined
  var parseUA: js.UndefOr[Boolean] = js.undefined
  var serializers: js.UndefOr[Serializers] = js.undefined
  var src: js.UndefOr[Boolean] = js.undefined
  var stream: js.UndefOr[WritableStream] = js.undefined
  var streams: js.UndefOr[js.Array[Stream]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    excludes: js.Array[String] = null,
    format: String | FormatFunction = null,
    genReqId: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => String = null,
    immediate: js.UndefOr[Boolean] = js.undefined,
    includesFn: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => js.Any = null,
    level: LogLevel = null,
    levelFn: (/* status */ Double, /* err */ Error | Null, /* meta */ js.Any) => String = null,
    logger: typings.bunyan.mod.^ = null,
    name: String = null,
    obfuscate: js.Array[String] = null,
    obfuscatePlaceholder: String = null,
    parseUA: js.UndefOr[Boolean] = js.undefined,
    serializers: Serializers = null,
    src: js.UndefOr[Boolean] = js.undefined,
    stream: WritableStream = null,
    streams: js.Array[Stream] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (excludes != null) __obj.updateDynamic("excludes")(excludes.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (genReqId != null) __obj.updateDynamic("genReqId")(js.Any.fromFunction1(genReqId))
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.get.asInstanceOf[js.Any])
    if (includesFn != null) __obj.updateDynamic("includesFn")(js.Any.fromFunction2(includesFn))
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (levelFn != null) __obj.updateDynamic("levelFn")(js.Any.fromFunction3(levelFn))
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (obfuscate != null) __obj.updateDynamic("obfuscate")(obfuscate.asInstanceOf[js.Any])
    if (obfuscatePlaceholder != null) __obj.updateDynamic("obfuscatePlaceholder")(obfuscatePlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(parseUA)) __obj.updateDynamic("parseUA")(parseUA.get.asInstanceOf[js.Any])
    if (serializers != null) __obj.updateDynamic("serializers")(serializers.asInstanceOf[js.Any])
    if (!js.isUndefined(src)) __obj.updateDynamic("src")(src.get.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (streams != null) __obj.updateDynamic("streams")(streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

