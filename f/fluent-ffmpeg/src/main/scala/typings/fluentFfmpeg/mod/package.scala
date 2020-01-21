package typings.fluentFfmpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Codecs = org.scalablytyped.runtime.StringDictionary[typings.fluentFfmpeg.mod.Codec]
  type CodecsCallback = js.Function2[
    /* err */ typings.std.Error, 
    /* codecs */ typings.fluentFfmpeg.mod.Codecs, 
    scala.Unit
  ]
  type Encoders = org.scalablytyped.runtime.StringDictionary[typings.fluentFfmpeg.mod.Encoder]
  type EncodersCallback = js.Function2[
    /* err */ typings.std.Error, 
    /* encoders */ typings.fluentFfmpeg.mod.Encoders, 
    scala.Unit
  ]
  type Filters = org.scalablytyped.runtime.StringDictionary[typings.fluentFfmpeg.mod.Filter]
  type FiltersCallback = js.Function2[
    /* err */ typings.std.Error, 
    /* filters */ typings.fluentFfmpeg.mod.Filters, 
    scala.Unit
  ]
  type Formats = org.scalablytyped.runtime.StringDictionary[typings.fluentFfmpeg.mod.Format]
  type FormatsCallback = js.Function2[
    /* err */ typings.std.Error, 
    /* formats */ typings.fluentFfmpeg.mod.Formats, 
    scala.Unit
  ]
  type GetPreset = js.Function1[/* command */ typings.fluentFfmpeg.mod.FfmpegCommand, java.lang.String]
}
