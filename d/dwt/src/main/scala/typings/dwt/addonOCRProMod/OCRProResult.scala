package typings.dwt.addonOCRProMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OCRProResult extends js.Object {
  
  /**
    * Return a base64 string that contains the result of the OCR.
    */
  def Get(): String = js.native
  
  /**
    * Return the number of pages already OCR'd on the machine.
    */
  def GetAlreadyOCRCount(): String = js.native
  
  /**
    * Return the error code.
    */
  def GetErrorCode(): Double = js.native
  
  /**
    * Return an array which contains detailed error information for each page that was OCR'd
    */
  def GetErrorDetailList(): js.Array[Error] = js.native
  
  /**
    * Return the error string.
    */
  def GetErrorString(): String = js.native
  
  /**
    * Return the source information. It could be the index of the OCR'd image or the path of the OCR'd file.
    */
  def GetInput(): Double | String = js.native
  
  /**
    * Return the number of pages allowed by the current license.
    */
  def GetOCRTotalCount(): String = js.native
  
  /**
    * Return the content of a page.
    * @param index Specify the page
    */
  def GetPageContent(index: Double): Page = js.native
  
  /**
    * Return the number of pages in the OCR result.
    */
  def GetPageCount(): String = js.native
  
  /**
    * Save the OCR result as a file.
    * @param path The path to save the file.
    */
  def Save(path: String): Boolean = js.native
}
object OCRProResult {
  
  @scala.inline
  def apply(
    Get: () => String,
    GetAlreadyOCRCount: () => String,
    GetErrorCode: () => Double,
    GetErrorDetailList: () => js.Array[Error],
    GetErrorString: () => String,
    GetInput: () => Double | String,
    GetOCRTotalCount: () => String,
    GetPageContent: Double => Page,
    GetPageCount: () => String,
    Save: String => Boolean
  ): OCRProResult = {
    val __obj = js.Dynamic.literal(Get = js.Any.fromFunction0(Get), GetAlreadyOCRCount = js.Any.fromFunction0(GetAlreadyOCRCount), GetErrorCode = js.Any.fromFunction0(GetErrorCode), GetErrorDetailList = js.Any.fromFunction0(GetErrorDetailList), GetErrorString = js.Any.fromFunction0(GetErrorString), GetInput = js.Any.fromFunction0(GetInput), GetOCRTotalCount = js.Any.fromFunction0(GetOCRTotalCount), GetPageContent = js.Any.fromFunction1(GetPageContent), GetPageCount = js.Any.fromFunction0(GetPageCount), Save = js.Any.fromFunction1(Save))
    __obj.asInstanceOf[OCRProResult]
  }
  
  @scala.inline
  implicit class OCRProResultOps[Self <: OCRProResult] (val x: Self) extends AnyVal {
    
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
    def setGetAlreadyOCRCount(value: () => String): Self = this.set("GetAlreadyOCRCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorCode(value: () => Double): Self = this.set("GetErrorCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorDetailList(value: () => js.Array[Error]): Self = this.set("GetErrorDetailList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetErrorString(value: () => String): Self = this.set("GetErrorString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInput(value: () => Double | String): Self = this.set("GetInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOCRTotalCount(value: () => String): Self = this.set("GetOCRTotalCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPageContent(value: Double => Page): Self = this.set("GetPageContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPageCount(value: () => String): Self = this.set("GetPageCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: String => Boolean): Self = this.set("Save", js.Any.fromFunction1(value))
  }
}
