package typings.googleapis.buildSrcApisRunV1alpha1Mod.run_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTPHeader describes a custom header to be used in HTTP probes
  */
@js.native
trait Schema$HTTPHeader extends js.Object {
  /**
    * The header field name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The header field value
    */
  var value: js.UndefOr[String] = js.native
}

object Schema$HTTPHeader {
  @scala.inline
  def apply(name: String = null, value: String = null): Schema$HTTPHeader = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HTTPHeader]
  }
}

