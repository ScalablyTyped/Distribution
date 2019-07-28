package typings.fluentDashFfmpeg

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fluentDashFfmpegMod {
  type Codecs = StringDictionary[Codec]
  type CodecsCallback = js.Function2[/* err */ Error, /* codecs */ Codecs, Unit]
  type Encoders = StringDictionary[Encoder]
  type EncodersCallback = js.Function2[/* err */ Error, /* encoders */ Encoders, Unit]
  type Filters = StringDictionary[Filter]
  type FiltersCallback = js.Function2[/* err */ Error, /* filters */ Filters, Unit]
  type Formats = StringDictionary[Format]
  type FormatsCallback = js.Function2[/* err */ Error, /* formats */ Formats, Unit]
  type GetPreset = js.Function1[/* command */ FfmpegCommand, String]
}
