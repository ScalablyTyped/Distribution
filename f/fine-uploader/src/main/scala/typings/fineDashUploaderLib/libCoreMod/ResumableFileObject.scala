package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResumableFileObject extends js.Object {
  /**
    * an object containing any custom resume data for the file
    */
  var customResumeData: js.UndefOr[js.Any] = js.undefined
  /**
    * filename
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * number of bytes to be uploaded
    */
  var remaining: js.UndefOr[scala.Double] = js.undefined
  /**
    * total file size in bytes
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * the unique id
    */
  var uuid: js.UndefOr[scala.Double] = js.undefined
}

object ResumableFileObject {
  @scala.inline
  def apply(
    customResumeData: js.Any = null,
    name: java.lang.String = null,
    remaining: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    uuid: scala.Int | scala.Double = null
  ): ResumableFileObject = {
    val __obj = js.Dynamic.literal()
    if (customResumeData != null) __obj.updateDynamic("customResumeData")(customResumeData)
    if (name != null) __obj.updateDynamic("name")(name)
    if (remaining != null) __obj.updateDynamic("remaining")(remaining.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumableFileObject]
  }
}

