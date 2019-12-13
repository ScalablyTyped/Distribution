package typings.atFirebaseMessaging.distSrcInterfacesInternalDashServicesMod

import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseComponent.atFirebaseComponentMod.Provider
import typings.atFirebaseInstallationsDashTypes.atFirebaseInstallationsDashTypesMod.FirebaseInstallations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseInternalServices extends js.Object {
  var analyticsProvider: Provider[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ _
  ]
  var app: FirebaseApp
  var installations: FirebaseInstallations
}

object FirebaseInternalServices {
  @scala.inline
  def apply(
    analyticsProvider: Provider[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ _
    ],
    app: FirebaseApp,
    installations: FirebaseInstallations
  ): FirebaseInternalServices = {
    val __obj = js.Dynamic.literal(analyticsProvider = analyticsProvider.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], installations = installations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FirebaseInternalServices]
  }
}

