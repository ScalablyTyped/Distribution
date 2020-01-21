package typings.gcsResumableUpload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gcsResumableUpload.gcsResumableUploadStrings.authenticatedRead
  - typings.gcsResumableUpload.gcsResumableUploadStrings.bucketOwnerFullControl
  - typings.gcsResumableUpload.gcsResumableUploadStrings.bucketOwnerRead
  - typings.gcsResumableUpload.gcsResumableUploadStrings.`private`
  - typings.gcsResumableUpload.gcsResumableUploadStrings.projectPrivate
  - typings.gcsResumableUpload.gcsResumableUploadStrings.publicRead
*/
trait PredefinedAcl extends js.Object

object PredefinedAcl {
  @scala.inline
  def authenticatedRead: typings.gcsResumableUpload.gcsResumableUploadStrings.authenticatedRead = this.cast("authenticatedRead")
  @scala.inline
  def bucketOwnerFullControl: typings.gcsResumableUpload.gcsResumableUploadStrings.bucketOwnerFullControl = this.cast("bucketOwnerFullControl")
  @scala.inline
  def bucketOwnerRead: typings.gcsResumableUpload.gcsResumableUploadStrings.bucketOwnerRead = this.cast("bucketOwnerRead")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typings.gcsResumableUpload.gcsResumableUploadStrings.`private` = this.cast("private")
  @scala.inline
  def projectPrivate: typings.gcsResumableUpload.gcsResumableUploadStrings.projectPrivate = this.cast("projectPrivate")
  @scala.inline
  def publicRead: typings.gcsResumableUpload.gcsResumableUploadStrings.publicRead = this.cast("publicRead")
}

