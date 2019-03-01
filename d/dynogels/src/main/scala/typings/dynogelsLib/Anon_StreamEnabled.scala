package typings
package dynogelsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StreamEnabled extends js.Object {
  var streamEnabled: scala.Boolean
  var streamViewType: java.lang.String
}

object Anon_StreamEnabled {
  @scala.inline
  def apply(streamEnabled: scala.Boolean, streamViewType: java.lang.String): Anon_StreamEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("streamEnabled")(streamEnabled)
    __obj.updateDynamic("streamViewType")(streamViewType)
    __obj.asInstanceOf[Anon_StreamEnabled]
  }
}

