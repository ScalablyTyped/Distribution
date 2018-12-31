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

