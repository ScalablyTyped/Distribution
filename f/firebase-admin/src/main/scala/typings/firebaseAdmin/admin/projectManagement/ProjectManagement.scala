package typings.firebaseAdmin.admin.projectManagement

import typings.firebaseAdmin.admin.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Firebase ProjectManagement service interface.
  *
  * Do not call this constructor directly. Instead, use
  * [`admin.projectManagement()`](admin.projectManagement#projectManagement).
  */
@js.native
trait ProjectManagement extends js.Object {
  var app: App = js.native
  /**
    * Creates an `AndroidApp` object, referencing the specified Android app within
    * this Firebase project.
    *
    * This method does not perform an RPC.
    *
    * @param appId The `appId` of the Android app to reference.
    *
    * @return An `AndroidApp` object that references the specified Firebase Android app.
    */
  def androidApp(appId: String): AndroidApp = js.native
  /**
    * Creates a new Firebase Android app associated with this Firebase project.
    *
    * @param packageName The canonical package name of the Android App,
    *     as would appear in the Google Play Developer Console.
    * @param displayName An optional user-assigned display name for this
    *     new app.
    *
    * @return A promise that resolves to the newly created Android app.
    */
  def createAndroidApp(packageName: String): js.Promise[AndroidApp] = js.native
  def createAndroidApp(packageName: String, displayName: String): js.Promise[AndroidApp] = js.native
  /**
    * Creates a new Firebase iOS app associated with this Firebase project.
    *
    * @param bundleId The iOS app bundle ID to use for this new app.
    * @param displayName An optional user-assigned display name for this
    *     new app.
    *
    * @return A promise that resolves to the newly created iOS app.
    */
  def createIosApp(bundleId: String): js.Promise[IosApp] = js.native
  def createIosApp(bundleId: String, displayName: String): js.Promise[IosApp] = js.native
  /**
    * Creates an `iOSApp` object, referencing the specified iOS app within
    * this Firebase project.
    *
    * This method does not perform an RPC.
    *
    * @param appId The `appId` of the iOS app to reference.
    *
    * @return An `iOSApp` object that references the specified Firebase iOS app.
    */
  def iosApp(appId: String): IosApp = js.native
  /**
    * Lists up to 100 Firebase Android apps associated with this Firebase project.
    *
    * @return The list of Android apps.
    */
  def listAndroidApps(): js.Promise[js.Array[AndroidApp]] = js.native
  /**
    * Lists up to 100 Firebase apps associated with this Firebase project.
    *
    * @return A promise that resolves to the metadata list of the apps.
    */
  def listAppMetadata(): js.Promise[js.Array[AppMetadata]] = js.native
  /**
    * Lists up to 100 Firebase iOS apps associated with this Firebase project.
    *
    * @return The list of iOS apps.
    */
  def listIosApps(): js.Promise[js.Array[IosApp]] = js.native
  /**
    * Update the display name of this Firebase project.
    *
    * @param newDisplayName The new display name to be updated.
    *
    * @return A promise that resolves when the project display name has been updated.
    */
  def setDisplayName(newDisplayName: String): js.Promise[Unit] = js.native
  /**
    * Creates a `ShaCertificate` object.
    *
    * This method does not perform an RPC.
    *
    * @param shaHash The SHA-1 or SHA-256 hash for this certificate.
    *
    * @return A `ShaCertificate` object contains the specified SHA hash.
    */
  def shaCertificate(shaHash: String): ShaCertificate = js.native
}

