package typings.dwt.addonOCRProMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OCRPro extends js.Object {
  
  /**
    * Download and install the OCR Professional add-on on the local system.
    * @param path The URL to download the add-on (typically a ZIP file).
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def Download(
    path: String,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  /**
    * Return whether the OCR Professional engine has been installed.
    */
  def IsModuleInstalled(): Boolean = js.native
  
  /**
    * Perform OCR on the specified image in the buffer.
    * @param index Specify the image.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument imageId The imageId of the image which can be used to find the index.
    * @argument result The OCR result.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def Recognize(
    index: Double,
    successCallback: js.Function2[/* imageId */ Double, /* result */ OCRProResult, Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  /**
    * Perform OCR on the specified local file.
    * @param path Specify a local file.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument path The file path.
    * @argument result The OCR result.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def RecognizeFile(
    path: String,
    successCallback: js.Function2[/* path */ String, /* result */ OCRProResult, Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  /**
    * Perform OCR on the specified rectangular area(s) on the image.
    * @param index Specify the image.
    * @param aryRects Specify the rectangle(s).
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument imageId The imageId of the image which can be used to find the index.
    * @argument result The OCR result.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def RecognizeRect(
    index: Double,
    aryRects: js.Array[Rect],
    successCallback: js.Function3[/* imageId */ Double, /* aryRects */ js.Array[Rect], /* result */ OCRProResult, Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  /**
    * Perform OCR on the selected images in the buffer.
    * @param index Specify the image.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument result The OCR result.
    * @argument errorCode The error code.
    * @argument errorString The error string.
    */
  def RecognizeSelectedImages(
    successCallback: js.Function1[/* result */ OCRProResult, Unit],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  /**
    * Return or set the current settings of the OCR engine.
    */
  var Settings: typings.dwt.addonOCRProMod.Settings | Boolean | Null = js.native
}
object OCRPro {
  
  @scala.inline
  def apply(
    Download: (String, js.Function0[Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit,
    IsModuleInstalled: () => Boolean,
    Recognize: (Double, js.Function2[/* imageId */ Double, /* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit,
    RecognizeFile: (String, js.Function2[/* path */ String, /* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit,
    RecognizeRect: (Double, js.Array[Rect], js.Function3[/* imageId */ Double, /* aryRects */ js.Array[Rect], /* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit,
    RecognizeSelectedImages: (js.Function1[/* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit
  ): OCRPro = {
    val __obj = js.Dynamic.literal(Download = js.Any.fromFunction3(Download), IsModuleInstalled = js.Any.fromFunction0(IsModuleInstalled), Recognize = js.Any.fromFunction3(Recognize), RecognizeFile = js.Any.fromFunction3(RecognizeFile), RecognizeRect = js.Any.fromFunction4(RecognizeRect), RecognizeSelectedImages = js.Any.fromFunction2(RecognizeSelectedImages))
    __obj.asInstanceOf[OCRPro]
  }
  
  @scala.inline
  implicit class OCRProOps[Self <: OCRPro] (val x: Self) extends AnyVal {
    
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
    def setDownload(
      value: (String, js.Function0[Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit
    ): Self = this.set("Download", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIsModuleInstalled(value: () => Boolean): Self = this.set("IsModuleInstalled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRecognize(
      value: (Double, js.Function2[/* imageId */ Double, /* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit
    ): Self = this.set("Recognize", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRecognizeFile(
      value: (String, js.Function2[/* path */ String, /* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit
    ): Self = this.set("RecognizeFile", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRecognizeRect(
      value: (Double, js.Array[Rect], js.Function3[/* imageId */ Double, /* aryRects */ js.Array[Rect], /* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit
    ): Self = this.set("RecognizeRect", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRecognizeSelectedImages(
      value: (js.Function1[/* result */ OCRProResult, Unit], js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]) => Unit
    ): Self = this.set("RecognizeSelectedImages", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSettings(value: Settings | Boolean): Self = this.set("Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsNull: Self = this.set("Settings", null)
  }
}
