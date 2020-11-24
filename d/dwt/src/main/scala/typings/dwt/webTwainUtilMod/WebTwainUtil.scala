package typings.dwt.webTwainUtilMod

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTImageType
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebTwainUtil extends js.Object {
  
  /**
    * Return the error code.
    */
  val ErrorCode: Double = js.native
  
  /**
    * Return the error string.
    */
  val ErrorString: String = js.native
  
  def GenerateURLForUploadData(
    indices: js.Array[Double],
    `type`: Double,
    successCallback: js.Function3[
      /* resultURL */ String, 
      /* indices */ js.Array[Double], 
      /* type */ EnumDWTImageType | Double, 
      Unit
    ],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  /**
    * Generate a URL to be used by a FileUpoader instance to fetch the data to upload.
    * @param indices Specify the images to upload.
    * @param type Specify the file type.
    * @param successCallback A callback function that is executed if the request succeeds.
    * @param failureCallback A callback function that is executed if the request fails.
    * @argument resultURL The generated URL.
    * @argument indices The indices of the images.
    * @argument type The file type.
    */
  def GenerateURLForUploadData(
    indices: js.Array[Double],
    `type`: EnumDWTImageType,
    successCallback: js.Function3[
      /* resultURL */ String, 
      /* indices */ js.Array[Double], 
      /* type */ EnumDWTImageType | Double, 
      Unit
    ],
    failureCallback: js.Function2[/* errorCode */ Double, /* errorString */ String, Unit]
  ): Unit = js.native
  
  /**
    * Return or set the log level for debugging.
    */
  var LogLevel: Double = js.native
  
  /**
    * Manufacturer in the identity string of the Dynamic Web TWAIN library.
    */
  val Manufacturer: String = js.native
  
  /**
    * ProductFamily in the identity string of the Dynamic Web TWAIN library.
    */
  val ProductFamily: String = js.native
  
  /**
    * Return or set the ProductKey.
    */
  var ProductKey: String = js.native
  
  /**
    * ProductName in the identity string of the Dynamic Web TWAIN library.
    */
  val ProductName: String = js.native
  
  /**
    * Specify an event listener for the specified built-in event.
    * @param name Specify the event
    * @param callback The event listener
    */
  def RegisterEvent(name: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Boolean = js.native
  
  def SetLanguage(language: Double): Boolean = js.native
  /**
    * Set the language for the authorization dialogs.
    * @param language Specify the language.
    */
  def SetLanguage(language: EnumDWTLanguage): Boolean = js.native
  
  /**
    * Update / set the ProductKey.
    * @param productKey the ProductKey.
    */
  def SetProductKeyAsync(productKey: String): js.Promise[Authorization] = js.native
  
  /**
    * Remove an event listener from the specified built-in event.
    * @param name Specify the event
    * @param callback The event listener
    */
  def UnregisterEvent(name: String, callback: js.Function0[Unit]): Boolean = js.native
  
  /**
    * VersionInfo in the identity string of the Dynamic Web TWAIN library.
    */
  val VersionInfo: String = js.native
}
