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
@js.native
trait Options extends js.Object {
  var excludes: js.UndefOr[js.Array[String]] = js.native
  var format: js.UndefOr[String | FormatFunction] = js.native
  var genReqId: js.UndefOr[RequestIdGenFunction] = js.native
  var immediate: js.UndefOr[Boolean] = js.native
  var includesFn: js.UndefOr[IncludesFunction] = js.native
  var level: js.UndefOr[LogLevel] = js.native
  var levelFn: js.UndefOr[LevelFunction] = js.native
  var logger: js.UndefOr[typings.bunyan.mod.^] = js.native
  var name: js.UndefOr[String] = js.native
  var obfuscate: js.UndefOr[js.Array[String]] = js.native
  var obfuscatePlaceholder: js.UndefOr[String] = js.native
  var parseUA: js.UndefOr[Boolean] = js.native
  var serializers: js.UndefOr[Serializers] = js.native
  var src: js.UndefOr[Boolean] = js.native
  var stream: js.UndefOr[WritableStream] = js.native
  var streams: js.UndefOr[js.Array[Stream]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExcludesVarargs(value: String*): Self = this.set("excludes", js.Array(value :_*))
    @scala.inline
    def setExcludes(value: js.Array[String]): Self = this.set("excludes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludes: Self = this.set("excludes", js.undefined)
    @scala.inline
    def setFormatFunction1(value: /* meta */ js.Any => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setFormat(value: String | FormatFunction): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setGenReqId(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => String): Self = this.set("genReqId", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGenReqId: Self = this.set("genReqId", js.undefined)
    @scala.inline
    def setImmediate(value: Boolean): Self = this.set("immediate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmediate: Self = this.set("immediate", js.undefined)
    @scala.inline
    def setIncludesFn(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response_[js.Any]) => js.Any
    ): Self = this.set("includesFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteIncludesFn: Self = this.set("includesFn", js.undefined)
    @scala.inline
    def setLevel(value: LogLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setLevelFn(value: (/* status */ Double, /* err */ Error | Null, /* meta */ js.Any) => String): Self = this.set("levelFn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteLevelFn: Self = this.set("levelFn", js.undefined)
    @scala.inline
    def setLogger(value: typings.bunyan.mod.^): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setObfuscateVarargs(value: String*): Self = this.set("obfuscate", js.Array(value :_*))
    @scala.inline
    def setObfuscate(value: js.Array[String]): Self = this.set("obfuscate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObfuscate: Self = this.set("obfuscate", js.undefined)
    @scala.inline
    def setObfuscatePlaceholder(value: String): Self = this.set("obfuscatePlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObfuscatePlaceholder: Self = this.set("obfuscatePlaceholder", js.undefined)
    @scala.inline
    def setParseUA(value: Boolean): Self = this.set("parseUA", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParseUA: Self = this.set("parseUA", js.undefined)
    @scala.inline
    def setSerializers(value: Serializers): Self = this.set("serializers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerializers: Self = this.set("serializers", js.undefined)
    @scala.inline
    def setSrc(value: Boolean): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setStream(value: WritableStream): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    @scala.inline
    def setStreamsVarargs(value: Stream*): Self = this.set("streams", js.Array(value :_*))
    @scala.inline
    def setStreams(value: js.Array[Stream]): Self = this.set("streams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreams: Self = this.set("streams", js.undefined)
  }
  
}

