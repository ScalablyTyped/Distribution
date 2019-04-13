package typings
package fluentDashFfmpegLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fluentDashFfmpegMod {
  type Codecs = org.scalablytyped.runtime.StringDictionary[Codec]
  type CodecsCallback = js.Function2[/* err */ stdLib.Error, /* codecs */ Codecs, scala.Unit]
  type Encoders = org.scalablytyped.runtime.StringDictionary[Encoder]
  type EncodersCallback = js.Function2[/* err */ stdLib.Error, /* encoders */ Encoders, scala.Unit]
  type Filters = org.scalablytyped.runtime.StringDictionary[Filter]
  type FiltersCallback = js.Function2[/* err */ stdLib.Error, /* filters */ Filters, scala.Unit]
  type Formats = org.scalablytyped.runtime.StringDictionary[Format]
  type FormatsCallback = js.Function2[/* err */ stdLib.Error, /* formats */ Formats, scala.Unit]
  type GetPreset = js.Function1[/* command */ FfmpegCommand, java.lang.String]
}
