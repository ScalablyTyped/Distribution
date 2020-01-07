package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s name.
  */
@js.native
trait Schema$Name extends js.Object {
  /**
    * The read-only display name formatted according to the locale specified by
    * the viewer&#39;s account or the &lt;code&gt;Accept-Language&lt;/code&gt;
    * HTTP header.
    */
  var displayName: js.UndefOr[String] = js.native
}

object Schema$Name {
  @scala.inline
  def apply(displayName: String = null): Schema$Name = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Name]
  }
}

