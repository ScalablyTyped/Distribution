package typings.gcsResumableUpload

import typings.gcsResumableUpload.mod.PredefinedAcl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object gcsResumableUploadStrings {
  @js.native
  sealed trait Asterisk extends js.Object
  
  @js.native
  sealed trait authenticatedRead extends PredefinedAcl
  
  @js.native
  sealed trait bucketOwnerFullControl extends PredefinedAcl
  
  @js.native
  sealed trait bucketOwnerRead extends PredefinedAcl
  
  @js.native
  sealed trait full extends js.Object
  
  @js.native
  sealed trait noAcl extends js.Object
  
  @js.native
  sealed trait `private` extends PredefinedAcl
  
  @js.native
  sealed trait projectPrivate extends PredefinedAcl
  
  @js.native
  sealed trait publicRead extends PredefinedAcl
  
  @scala.inline
  def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  @scala.inline
  def authenticatedRead: authenticatedRead = "authenticatedRead".asInstanceOf[authenticatedRead]
  @scala.inline
  def bucketOwnerFullControl: bucketOwnerFullControl = "bucketOwnerFullControl".asInstanceOf[bucketOwnerFullControl]
  @scala.inline
  def bucketOwnerRead: bucketOwnerRead = "bucketOwnerRead".asInstanceOf[bucketOwnerRead]
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  @scala.inline
  def noAcl: noAcl = "noAcl".asInstanceOf[noAcl]
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  @scala.inline
  def projectPrivate: projectPrivate = "projectPrivate".asInstanceOf[projectPrivate]
  @scala.inline
  def publicRead: publicRead = "publicRead".asInstanceOf[publicRead]
}

