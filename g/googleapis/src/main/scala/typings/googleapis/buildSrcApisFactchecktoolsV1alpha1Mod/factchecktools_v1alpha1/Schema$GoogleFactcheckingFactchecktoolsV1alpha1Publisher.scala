package typings.googleapis.buildSrcApisFactchecktoolsV1alpha1Mod.factchecktools_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the publisher.
  */
@js.native
trait Schema$GoogleFactcheckingFactchecktoolsV1alpha1Publisher extends js.Object {
  /**
    * The name of this publisher. For instance, &quot;Awesome Fact
    * Checks&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Host-level site name, without the protocol or &quot;www&quot; prefix. For
    * instance, &quot;awesomefactchecks.com&quot;. This value of this field is
    * based purely on the claim review URL.
    */
  var site: js.UndefOr[String] = js.native
}

object Schema$GoogleFactcheckingFactchecktoolsV1alpha1Publisher {
  @scala.inline
  def apply(name: String = null, site: String = null): Schema$GoogleFactcheckingFactchecktoolsV1alpha1Publisher = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFactcheckingFactchecktoolsV1alpha1Publisher]
  }
}

