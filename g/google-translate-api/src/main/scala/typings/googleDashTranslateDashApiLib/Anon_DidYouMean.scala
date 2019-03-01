package typings
package googleDashTranslateDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DidYouMean extends js.Object {
  var didYouMean: scala.Boolean
  var iso: java.lang.String
}

object Anon_DidYouMean {
  @scala.inline
  def apply(didYouMean: scala.Boolean, iso: java.lang.String): Anon_DidYouMean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("didYouMean")(didYouMean)
    __obj.updateDynamic("iso")(iso)
    __obj.asInstanceOf[Anon_DidYouMean]
  }
}

