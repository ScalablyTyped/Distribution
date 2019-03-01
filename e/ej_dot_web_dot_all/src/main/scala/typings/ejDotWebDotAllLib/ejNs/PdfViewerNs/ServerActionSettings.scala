package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerActionSettings extends js.Object {
  /** Specifies the name of the action method used for downloading the PDF document from the PDF viewer control.
    */
  var download: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the name of the action method used for uploading the PDF document to the PDF viewer control.
    */
  var fileUpload: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the name of the action method used for loading the PDF document.
    */
  var load: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the name of the action method used for printing the PDF document in the PDF viewer control.
    */
  var print: js.UndefOr[java.lang.String] = js.undefined
}

object ServerActionSettings {
  @scala.inline
  def apply(
    download: java.lang.String = null,
    fileUpload: java.lang.String = null,
    load: java.lang.String = null,
    print: java.lang.String = null
  ): ServerActionSettings = {
    val __obj = js.Dynamic.literal()
    if (download != null) __obj.updateDynamic("download")(download)
    if (fileUpload != null) __obj.updateDynamic("fileUpload")(fileUpload)
    if (load != null) __obj.updateDynamic("load")(load)
    if (print != null) __obj.updateDynamic("print")(print)
    __obj.asInstanceOf[ServerActionSettings]
  }
}

