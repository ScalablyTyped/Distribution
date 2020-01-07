package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a side input of a DoFn or an input of a SeqDoFn.
  */
@js.native
trait Schema$SideInputInfo extends js.Object {
  /**
    * How to interpret the source element(s) as a side input value.
    */
  var kind: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The source(s) to read element(s) from to get the value of this side
    * input. If more than one source, then the elements are taken from the
    * sources, in the specified order if order matters. At least one source is
    * required.
    */
  var sources: js.UndefOr[js.Array[Schema$Source]] = js.native
  /**
    * The id of the tag the user code will access this side input by; this
    * should correspond to the tag of some MultiOutputInfo.
    */
  var tag: js.UndefOr[String] = js.native
}

object Schema$SideInputInfo {
  @scala.inline
  def apply(kind: StringDictionary[js.Any] = null, sources: js.Array[Schema$Source] = null, tag: String = null): Schema$SideInputInfo = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SideInputInfo]
  }
}

