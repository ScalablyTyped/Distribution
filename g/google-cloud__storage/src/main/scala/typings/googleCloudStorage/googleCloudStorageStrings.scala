package typings.googleCloudStorage

import typings.googleCloudStorage.fileMod.PredefinedAcl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object googleCloudStorageStrings {
  @js.native
  sealed trait ACTIVE extends js.Object
  
  @js.native
  sealed trait INACTIVE extends js.Object
  
  @js.native
  sealed trait authenticatedRead extends PredefinedAcl
  
  @js.native
  sealed trait bucketOwnerFullControl extends PredefinedAcl
  
  @js.native
  sealed trait bucketOwnerRead extends PredefinedAcl
  
  @js.native
  sealed trait crc32c extends js.Object
  
  @js.native
  sealed trait delete extends js.Object
  
  @js.native
  sealed trait md5 extends js.Object
  
  @js.native
  sealed trait `private` extends PredefinedAcl
  
  @js.native
  sealed trait projectPrivate extends PredefinedAcl
  
  @js.native
  sealed trait publicRead extends PredefinedAcl
  
  @js.native
  sealed trait read extends js.Object
  
  @js.native
  sealed trait resumable extends js.Object
  
  @js.native
  sealed trait v2 extends js.Object
  
  @js.native
  sealed trait v4 extends js.Object
  
  @js.native
  sealed trait write extends js.Object
  
  @scala.inline
  def ACTIVE: ACTIVE = "ACTIVE".asInstanceOf[ACTIVE]
  @scala.inline
  def INACTIVE: INACTIVE = "INACTIVE".asInstanceOf[INACTIVE]
  @scala.inline
  def authenticatedRead: authenticatedRead = "authenticatedRead".asInstanceOf[authenticatedRead]
  @scala.inline
  def bucketOwnerFullControl: bucketOwnerFullControl = "bucketOwnerFullControl".asInstanceOf[bucketOwnerFullControl]
  @scala.inline
  def bucketOwnerRead: bucketOwnerRead = "bucketOwnerRead".asInstanceOf[bucketOwnerRead]
  @scala.inline
  def crc32c: crc32c = "crc32c".asInstanceOf[crc32c]
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  @scala.inline
  def md5: md5 = "md5".asInstanceOf[md5]
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  @scala.inline
  def projectPrivate: projectPrivate = "projectPrivate".asInstanceOf[projectPrivate]
  @scala.inline
  def publicRead: publicRead = "publicRead".asInstanceOf[publicRead]
  @scala.inline
  def read: read = "read".asInstanceOf[read]
  @scala.inline
  def resumable: resumable = "resumable".asInstanceOf[resumable]
  @scala.inline
  def v2: v2 = "v2".asInstanceOf[v2]
  @scala.inline
  def v4: v4 = "v4".asInstanceOf[v4]
  @scala.inline
  def write: write = "write".asInstanceOf[write]
}

