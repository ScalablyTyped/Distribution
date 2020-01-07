package typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Change indicates the most recent state of an element.
  */
@js.native
trait Schema$GoogleWatcherV1Change extends js.Object {
  /**
    * If true, this Change is followed by more Changes that are in the same
    * group as this Change.
    */
  var continued: js.UndefOr[Boolean] = js.native
  /**
    * The actual change data. This field is present only when `state() ==
    * EXISTS` or `state() == ERROR`. Please see google.protobuf.Any about how
    * to use the Any type.
    */
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Name of the element, interpreted relative to the entity&#39;s actual
    * name. &quot;&quot; refers to the entity itself. The element name is a
    * valid UTF-8 string.
    */
  var element: js.UndefOr[String] = js.native
  /**
    * If present, provides a compact representation of all the messages that
    * have been received by the caller for the given entity, e.g., it could be
    * a sequence number or a multi-part timestamp/version vector. This marker
    * can be provided in the Request message, allowing the caller to resume the
    * stream watching at a specific point without fetching the initial state.
    */
  var resumeMarker: js.UndefOr[String] = js.native
  /**
    * The state of the `element`.
    */
  var state: js.UndefOr[String] = js.native
}

object Schema$GoogleWatcherV1Change {
  @scala.inline
  def apply(
    continued: js.UndefOr[Boolean] = js.undefined,
    data: StringDictionary[js.Any] = null,
    element: String = null,
    resumeMarker: String = null,
    state: String = null
  ): Schema$GoogleWatcherV1Change = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(continued)) __obj.updateDynamic("continued")(continued.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (resumeMarker != null) __obj.updateDynamic("resumeMarker")(resumeMarker.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleWatcherV1Change]
  }
}

