package typings.firebaseMessaging.internalDependenciesMod

import typings.firebaseComponent.mod.Provider
import typings.firebaseInstallationsTypes.mod.FirebaseInstallations
import typings.firebaseMessaging.appConfigMod.AppConfig
import typings.firebaseMessaging.mod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseInternalDependencies extends js.Object {
  var analyticsProvider: Provider[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ _
  ] = js.native
  var app: FirebaseApp = js.native
  var appConfig: AppConfig = js.native
  var installations: FirebaseInstallations = js.native
}

object FirebaseInternalDependencies {
  @scala.inline
  def apply(
    analyticsProvider: Provider[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ _
    ],
    app: FirebaseApp,
    appConfig: AppConfig,
    installations: FirebaseInstallations
  ): FirebaseInternalDependencies = {
    val __obj = js.Dynamic.literal(analyticsProvider = analyticsProvider.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], appConfig = appConfig.asInstanceOf[js.Any], installations = installations.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseInternalDependencies]
  }
  @scala.inline
  implicit class FirebaseInternalDependenciesOps[Self <: FirebaseInternalDependencies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnalyticsProvider(
      value: Provider[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ _
        ]
    ): Self = this.set("analyticsProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setApp(value: FirebaseApp): Self = this.set("app", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppConfig(value: AppConfig): Self = this.set("appConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstallations(value: FirebaseInstallations): Self = this.set("installations", value.asInstanceOf[js.Any])
  }
  
}

