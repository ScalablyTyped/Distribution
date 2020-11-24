package typings.facebookJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object facebook {
  
  type CollectionAdsDialogResponse = typings.facebookJsSdk.facebook.InstantExperiencesAdsDialogResponse
  
  type FacebookEventCallback[TEvent /* <: typings.facebookJsSdk.facebook.FacebookEventType */] = (js.Function1[/* response */ typings.facebookJsSdk.facebook.StatusResponse, scala.Unit]) | js.Function0[scala.Unit]
}
