package typings.gapiClientDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideInputInfo extends js.Object {
  /** How to interpret the source element(s) as a side input value. */
  var kind: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * The source(s) to read element(s) from to get the value of this side input.
    * If more than one source, then the elements are taken from the
    * sources, in the specified order if order matters.
    * At least one source is required.
    */
  var sources: js.UndefOr[js.Array[Source]] = js.undefined
  /**
    * The id of the tag the user code will access this side input by;
    * this should correspond to the tag of some MultiOutputInfo.
    */
  var tag: js.UndefOr[String] = js.undefined
}

object SideInputInfo {
  @scala.inline
  def apply(kind: Record[String, _] = null, sources: js.Array[Source] = null, tag: String = null): SideInputInfo = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (sources != null) __obj.updateDynamic("sources")(sources.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideInputInfo]
  }
}

