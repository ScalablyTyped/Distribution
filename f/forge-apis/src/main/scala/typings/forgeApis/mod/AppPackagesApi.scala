package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-apis", "AppPackagesApi")
@js.native
class AppPackagesApi () extends js.Object {
  /**
    * Creates an AppPackage module.
    */
  def createAppPackage(appPackage: AppPackage, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  /**
    * Removes a specific AppPackage.
    */
  def deleteAppPackage(id: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  /**
    * Removes the version history of the specified AppPackage.
    */
  def deleteAppPackageHistory(id: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  /**
    * Returns the details of all AppPackages.
    */
  def getAllAppPackages(oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  /**
    * Returns the details of a specific AppPackage.
    */
  def getAppPackage(id: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  /**
    * Returns all old versions of a specified AppPackage.
    */
  def getAppPackageVersions(id: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  /**
    * Requests a pre-signed URL for uploading a zip file that contains the binaries for this AppPackage.
    */
  def getUploadUrl(oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  /**
    * Requests a pre-signed URL for uploading a zip file that contains the binaries for this AppPackage.
    * Unlike the GetUploadUrl method that takes no parameters, this method allows the client to request
    * that the pre-signed URL to be issued so that the subsequent HTTP PUT operation will require
    * Content-Type=binary/octet-stream.
    */
  def getUploadUrlWithRequireContentType(require: Boolean, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  /**
    * Updates an AppPackage by specifying only the changed attributes.
    */
  def patchAppPackage(id: String, appPackage: AppPackageOptional, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  /**
    * Sets the AppPackage to the specified version.
    */
  def setAppPackageVersion(id: String, appPackageVersion: AppPackageVersion, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  /**
    * Updates an AppPackage by redefining the entire Activity object.
    */
  def updateAppPackage(id: String, appPackage: AppPackage, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
}

