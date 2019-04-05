package typings
package elasticDashApmDashNodeLib.elasticDashApmDashNodeMod.AwsLambdaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientContextClient extends js.Object {
  var appPackageName: java.lang.String
  var appTitle: java.lang.String
  var appVersionCode: java.lang.String
  var appVersionName: java.lang.String
  var installationId: java.lang.String
}

object ClientContextClient {
  @scala.inline
  def apply(
    appPackageName: java.lang.String,
    appTitle: java.lang.String,
    appVersionCode: java.lang.String,
    appVersionName: java.lang.String,
    installationId: java.lang.String
  ): ClientContextClient = {
    val __obj = js.Dynamic.literal(appPackageName = appPackageName, appTitle = appTitle, appVersionCode = appVersionCode, appVersionName = appVersionName, installationId = installationId)
  
    __obj.asInstanceOf[ClientContextClient]
  }
}

