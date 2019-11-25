package typings.atGoogleDashCloudStorage.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atGoogleDashCloudStorage.atGoogleDashCloudStorageStrings.authenticatedRead
  - typings.atGoogleDashCloudStorage.atGoogleDashCloudStorageStrings.bucketOwnerFullControl
  - typings.atGoogleDashCloudStorage.atGoogleDashCloudStorageStrings.bucketOwnerRead
  - typings.atGoogleDashCloudStorage.atGoogleDashCloudStorageStrings.`private`
  - typings.atGoogleDashCloudStorage.atGoogleDashCloudStorageStrings.projectPrivate
  - typings.atGoogleDashCloudStorage.atGoogleDashCloudStorageStrings.publicRead
*/
trait PredefinedAcl extends js.Object

object PredefinedAcl {
  @scala.inline
  def authenticatedRead: typings.atGoogleDashCloudStorage.atGoogleDashCloudStorageStrings.authenticatedRead = this.cast("authenticatedRead")
  @scala.inline
  def bucketOwnerFullControl: typings.atGoogleDashCloudStorage.atGoogleDashCloudStorageStrings.bucketOwnerFullControl = this.cast("bucketOwnerFullControl")
  @scala.inline
  def bucketOwnerRead: typings.atGoogleDashCloudStorage.atGoogleDashCloudStorageStrings.bucketOwnerRead = this.cast("bucketOwnerRead")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typings.atGoogleDashCloudStorage.atGoogleDashCloudStorageStrings.`private` = this.cast("private")
  @scala.inline
  def projectPrivate: typings.atGoogleDashCloudStorage.atGoogleDashCloudStorageStrings.projectPrivate = this.cast("projectPrivate")
  @scala.inline
  def publicRead: typings.atGoogleDashCloudStorage.atGoogleDashCloudStorageStrings.publicRead = this.cast("publicRead")
}

