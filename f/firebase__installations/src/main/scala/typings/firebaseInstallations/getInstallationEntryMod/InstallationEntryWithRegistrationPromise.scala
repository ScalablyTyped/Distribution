package typings.firebaseInstallations.getInstallationEntryMod

import typings.firebaseInstallations.installationEntryMod.InstallationEntry
import typings.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallationEntryWithRegistrationPromise extends js.Object {
  var installationEntry: InstallationEntry
  /** Exist iff the installationEntry is not registered. */
  var registrationPromise: js.UndefOr[js.Promise[RegisteredInstallationEntry]] = js.undefined
}

object InstallationEntryWithRegistrationPromise {
  @scala.inline
  def apply(
    installationEntry: InstallationEntry,
    registrationPromise: js.Promise[RegisteredInstallationEntry] = null
  ): InstallationEntryWithRegistrationPromise = {
    val __obj = js.Dynamic.literal(installationEntry = installationEntry.asInstanceOf[js.Any])
    if (registrationPromise != null) __obj.updateDynamic("registrationPromise")(registrationPromise.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationEntryWithRegistrationPromise]
  }
}

