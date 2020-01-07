package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A sink that records can be encoded and written to.
  */
@js.native
trait Schema$Sink extends js.Object {
  /**
    * The codec to use to encode data written to the sink.
    */
  var codec: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The sink to write to, plus its parameters.
    */
  var spec: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object Schema$Sink {
  @scala.inline
  def apply(codec: StringDictionary[js.Any] = null, spec: StringDictionary[js.Any] = null): Schema$Sink = {
    val __obj = js.Dynamic.literal()
    if (codec != null) __obj.updateDynamic("codec")(codec.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Sink]
  }
}

