package typings.dwt.dynamsoft

import typings.dwt.RunTimeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarcodeReader_ extends js.Object {
  /** 
    * Append a new template string to current runtime settings.
    * @method BarcodeReader#decode
    * @param {string} content    A JSON string that represents the content of the settings.
    * @param {number} emSettingPriority    The parameter setting mode, which decides to inherit parameters from previous template setting or overwrite previous settings and replace by new template.
    * @return {void}
    */
  def appendTplStringToRuntimeSettings(content: String, emSettingPriority: Double): Unit
  /** 
    * Read barcode from the source image.
    * @method BarcodeReader#decode
    * @param {string} source specifies the image to read on
    * @return {Promise}
    * @example
    ```javascript
    // dwtUrl: HTML5 Edition only
    reader.decode('dwt://dwt_trial_13000404/img?id=306159652&index=0&t=1502184632022').then(
    results=>{
    for(var i = 0; i < results.length; ++i){
    console.log(results[i].BarcodeText);
    // Confidence >= 30 is reliable
    console.log(results[i].LocalizationResult.ExtendedResultArray[0].Confidence);
    }
    });
    // dcsUrl
    reader.decode('dcs://dcs_trial_6110531/img?id=306159652&index=0&t=1502184632022').then(
    function(results){
    // ie6-7 does not support console.log
    var messageArr = [];
    for(var i = 0; i < results.length; ++i){
    messageArr.push(results[i].BarcodeText);
    // Confidence >= 30 is reliable
    messageArr.push(results[i].LocalizationResult.ExtendedResultArray[0].Confidence);
    }
    alert(messageArr.join(''));
    })['catch'](function(ex){
    // ie6-9 does not support '.catch(function(ex){...})'
    if(ex){alert(ex.message||ex);}
    });
    ```
    
    */
  def decode(source: String): js.Promise[_]
  /**
    * Read barcode from base64 string
    */
  def decodeBase64String(base64String: String): js.Promise[_]
  def getAllLocalizationResults(): js.Any
  def getAllParameterTemplateNames(): js.Any
  def getRuntimeSettings(): RunTimeSetting
  def initRuntimeSettingsWithString(): js.Any
  def outputSettingsToString(): js.Any
  def resetRuntimeSettings(): Unit
  def updateRuntimeSettings(setting: RunTimeSetting): Unit
}

object BarcodeReader_ {
  @scala.inline
  def apply(
    appendTplStringToRuntimeSettings: (String, Double) => Unit,
    decode: String => js.Promise[_],
    decodeBase64String: String => js.Promise[_],
    getAllLocalizationResults: () => js.Any,
    getAllParameterTemplateNames: () => js.Any,
    getRuntimeSettings: () => RunTimeSetting,
    initRuntimeSettingsWithString: () => js.Any,
    outputSettingsToString: () => js.Any,
    resetRuntimeSettings: () => Unit,
    updateRuntimeSettings: RunTimeSetting => Unit
  ): BarcodeReader_ = {
    val __obj = js.Dynamic.literal(appendTplStringToRuntimeSettings = js.Any.fromFunction2(appendTplStringToRuntimeSettings), decode = js.Any.fromFunction1(decode), decodeBase64String = js.Any.fromFunction1(decodeBase64String), getAllLocalizationResults = js.Any.fromFunction0(getAllLocalizationResults), getAllParameterTemplateNames = js.Any.fromFunction0(getAllParameterTemplateNames), getRuntimeSettings = js.Any.fromFunction0(getRuntimeSettings), initRuntimeSettingsWithString = js.Any.fromFunction0(initRuntimeSettingsWithString), outputSettingsToString = js.Any.fromFunction0(outputSettingsToString), resetRuntimeSettings = js.Any.fromFunction0(resetRuntimeSettings), updateRuntimeSettings = js.Any.fromFunction1(updateRuntimeSettings))
    __obj.asInstanceOf[BarcodeReader_]
  }
}

