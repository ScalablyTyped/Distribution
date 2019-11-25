package typings.fineDashUploader.libS3Mod.s3

import typings.fineDashUploader.libCoreMod.ResumableFileObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3ResumableFileObject extends ResumableFileObject {
  /**
    * The associated object's S3 key
    */
  var key: js.UndefOr[String] = js.undefined
}

object S3ResumableFileObject {
  @scala.inline
  def apply(
    customResumeData: js.Any = null,
    key: String = null,
    name: String = null,
    remaining: Int | Double = null,
    size: Int | Double = null,
    uuid: Int | Double = null
  ): S3ResumableFileObject = {
    val __obj = js.Dynamic.literal()
    if (customResumeData != null) __obj.updateDynamic("customResumeData")(customResumeData.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (remaining != null) __obj.updateDynamic("remaining")(remaining.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ResumableFileObject]
  }
}

