package typings.googleCloudStorage.fileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleCloudStorage.googleCloudStorageStrings.authenticatedRead
  - typings.googleCloudStorage.googleCloudStorageStrings.bucketOwnerFullControl
  - typings.googleCloudStorage.googleCloudStorageStrings.bucketOwnerRead
  - typings.googleCloudStorage.googleCloudStorageStrings.`private`
  - typings.googleCloudStorage.googleCloudStorageStrings.projectPrivate
  - typings.googleCloudStorage.googleCloudStorageStrings.publicRead
*/
trait PredefinedAcl extends js.Object

object PredefinedAcl {
  @scala.inline
  def authenticatedRead: typings.googleCloudStorage.googleCloudStorageStrings.authenticatedRead = this.cast("authenticatedRead")
  @scala.inline
  def bucketOwnerFullControl: typings.googleCloudStorage.googleCloudStorageStrings.bucketOwnerFullControl = this.cast("bucketOwnerFullControl")
  @scala.inline
  def bucketOwnerRead: typings.googleCloudStorage.googleCloudStorageStrings.bucketOwnerRead = this.cast("bucketOwnerRead")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typings.googleCloudStorage.googleCloudStorageStrings.`private` = this.cast("private")
  @scala.inline
  def projectPrivate: typings.googleCloudStorage.googleCloudStorageStrings.projectPrivate = this.cast("projectPrivate")
  @scala.inline
  def publicRead: typings.googleCloudStorage.googleCloudStorageStrings.publicRead = this.cast("publicRead")
}

