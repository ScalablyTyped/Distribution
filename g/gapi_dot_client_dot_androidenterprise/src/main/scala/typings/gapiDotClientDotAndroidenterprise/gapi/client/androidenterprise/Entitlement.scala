package typings.gapiDotClientDotAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entitlement extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#entitlement". */
  var kind: js.UndefOr[String] = js.undefined
  /** The ID of the product that the entitlement is for. For example, "app:com.google.android.gm". */
  var productId: js.UndefOr[String] = js.undefined
  /**
    * The reason for the entitlement. For example, "free" for free apps. This property is temporary: it will be replaced by the acquisition kind field of
    * group licenses.
    */
  var reason: js.UndefOr[String] = js.undefined
}

object Entitlement {
  @scala.inline
  def apply(kind: String = null, productId: String = null, reason: String = null): Entitlement = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entitlement]
  }
}

