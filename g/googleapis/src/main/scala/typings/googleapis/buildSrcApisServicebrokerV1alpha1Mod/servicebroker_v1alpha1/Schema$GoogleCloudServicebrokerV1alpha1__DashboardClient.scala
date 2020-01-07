package typings.googleapis.buildSrcApisServicebrokerV1alpha1Mod.servicebroker_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message containing information required to activate Dashboard SSO feature.
  */
@js.native
trait Schema$GoogleCloudServicebrokerV1alpha1__DashboardClient extends js.Object {
  /**
    * The id of the Oauth client that the dashboard will use.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * A URI for the service dashboard. Validated by the OAuth token server when
    * the dashboard requests a token.
    */
  var redirect_uri: js.UndefOr[String] = js.native
  /**
    * A secret for the dashboard client.
    */
  var secret: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudServicebrokerV1alpha1__DashboardClient {
  @scala.inline
  def apply(id: String = null, redirect_uri: String = null, secret: String = null): Schema$GoogleCloudServicebrokerV1alpha1__DashboardClient = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudServicebrokerV1alpha1__DashboardClient]
  }
}

