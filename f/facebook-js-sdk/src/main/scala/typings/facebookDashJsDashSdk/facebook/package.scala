package typings.facebookDashJsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object facebook {
  type CollectionAdsDialogResponse = InstantExperiencesAdsDialogResponse
  type FacebookEventCallback[TEvent /* <: FacebookEventType */] = (js.Function1[/* response */ StatusResponse, Unit]) | js.Function0[Unit]
}
