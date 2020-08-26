package typings.dwt.addonOCRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OCRResult extends js.Object {
  /**
    * Return a base64 string that contains the result of the OCR.
    * Newlines are represented by the newline character: '\n'.
    */
  def Get(): String = js.native
  /**
    * Return the error code.
    */
  def GetErrorCode(): Double = js.native
  /**
    * Return the error string.
    */
  def GetErrorString(): String = js.native
  /**
    * Return the output format.
    */
  def GetFormat(): Double = js.native
  /**
    * Return the source information. It could be the index of the OCR'd image or the path of the OCR'd file.
    */
  def GetInput(): Double | String = js.native
  /**
    * Return the content of a pageset.
    * @param index Specify the pageset
    */
  def GetPageSetContent(index: Double): PageSet = js.native
  /**
    * Return the number of pagesets in the OCR result.
    */
  def GetPageSetCount(): Double = js.native
  /**
    * Save the OCR result as a file.
    * @param path The path to save the file.
    */
  def Save(path: String): Boolean = js.native
}

object OCRResult {
  @scala.inline
  def apply(
    Get: () => String,
    GetErrorCode: () => Double,
    GetErrorString: () => String,
    GetFormat: () => Double,
    GetInput: () => Double | String,
    GetPageSetContent: Double => PageSet,
    GetPageSetCount: () => Double,
    Save: String => Boolean
  ): OCRResult = {
    val __obj = js.Dynamic.literal(Get = js.Any.fromFunction0(Get), GetErrorCode = js.Any.fromFunction0(GetErrorCode), GetErrorString = js.Any.fromFunction0(GetErrorString), GetFormat = js.Any.fromFunction0(GetFormat), GetInput = js.Any.fromFunction0(GetInput), GetPageSetContent = js.Any.fromFunction1(GetPageSetContent), GetPageSetCount = js.Any.fromFunction0(GetPageSetCount), Save = js.Any.fromFunction1(Save))
    __obj.asInstanceOf[OCRResult]
  }
  @scala.inline
  implicit class OCRResultOps[Self <: OCRResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: () => String): Self = this.set("Get", js.Any.fromFunction0(value))
    @scala.inline
    def setGetErrorCode(value: () => Double): Self = this.set("GetErrorCode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetErrorString(value: () => String): Self = this.set("GetErrorString", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFormat(value: () => Double): Self = this.set("GetFormat", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInput(value: () => Double | String): Self = this.set("GetInput", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPageSetContent(value: Double => PageSet): Self = this.set("GetPageSetContent", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPageSetCount(value: () => Double): Self = this.set("GetPageSetCount", js.Any.fromFunction0(value))
    @scala.inline
    def setSave(value: String => Boolean): Self = this.set("Save", js.Any.fromFunction1(value))
  }
  
}

