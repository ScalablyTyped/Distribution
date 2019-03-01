package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InteractionType extends js.Object {
  /** Type of an interaction on conversion path. Such as CLICK, IMPRESSION etc. */
  var interactionType: js.UndefOr[java.lang.String] = js.undefined
  /** Node value of an interaction on conversion path. Such as source, medium etc. */
  var nodeValue: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_InteractionType {
  @scala.inline
  def apply(interactionType: java.lang.String = null, nodeValue: java.lang.String = null): Anon_InteractionType = {
    val __obj = js.Dynamic.literal()
    if (interactionType != null) __obj.updateDynamic("interactionType")(interactionType)
    if (nodeValue != null) __obj.updateDynamic("nodeValue")(nodeValue)
    __obj.asInstanceOf[Anon_InteractionType]
  }
}

