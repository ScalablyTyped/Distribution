package typings
package atGoogleDashCloudDatastoreLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var consistency: js.UndefOr[
    atGoogleDashCloudDatastoreLib.atGoogleDashCloudDatastoreLibStrings.strong | atGoogleDashCloudDatastoreLib.atGoogleDashCloudDatastoreLibStrings.eventual
  ] = js.undefined
  var maxApiCalls: js.UndefOr[scala.Double] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(
    consistency: atGoogleDashCloudDatastoreLib.atGoogleDashCloudDatastoreLibStrings.strong | atGoogleDashCloudDatastoreLib.atGoogleDashCloudDatastoreLibStrings.eventual = null,
    maxApiCalls: scala.Int | scala.Double = null
  ): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (consistency != null) __obj.updateDynamic("consistency")(consistency.asInstanceOf[js.Any])
    if (maxApiCalls != null) __obj.updateDynamic("maxApiCalls")(maxApiCalls.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

