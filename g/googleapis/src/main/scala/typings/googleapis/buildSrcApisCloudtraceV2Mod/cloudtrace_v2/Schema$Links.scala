package typings.googleapis.buildSrcApisCloudtraceV2Mod.cloudtrace_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of links, which are references from this span to a span in the
  * same or different trace.
  */
@js.native
trait Schema$Links extends js.Object {
  /**
    * The number of dropped links after the maximum size was enforced. If this
    * value is 0, then no links were dropped.
    */
  var droppedLinksCount: js.UndefOr[Double] = js.native
  /**
    * A collection of links.
    */
  var link: js.UndefOr[js.Array[Schema$Link]] = js.native
}

object Schema$Links {
  @scala.inline
  def apply(droppedLinksCount: Int | Double = null, link: js.Array[Schema$Link] = null): Schema$Links = {
    val __obj = js.Dynamic.literal()
    if (droppedLinksCount != null) __obj.updateDynamic("droppedLinksCount")(droppedLinksCount.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Links]
  }
}

