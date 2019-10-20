package typings.dwt.dynamsoft

import typings.dwt.RunTimeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dynamsoft.BarcodeReader")
@js.native
/**
  * Constructs a new KPainter
  */
class BarcodeReader_ () extends js.Object {
  def this(dbrKey: String) = this()
  /** 
    * Append a new template string to current runtime settings.
    * @method BarcodeReader#decode
    * @param {string} content	A JSON string that represents the content of the settings.
    * @param {number} emSettingPriority	The parameter setting mode, which decides to inherit parameters from previous template setting or overwrite previous settings and replace by new template.
    * @return {void}
    */
  def appendTplStringToRuntimeSettings(content: String, emSettingPriority: Double): Unit = js.native
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
  def decode(source: String): js.Promise[_] = js.native
  /**
    * Read barcode from base64 string
    */
  def decodeBase64String(base64String: String): js.Promise[_] = js.native
  def getAllLocalizationResults(): js.Any = js.native
  def getAllParameterTemplateNames(): js.Any = js.native
  def getRuntimeSettings(): RunTimeSetting = js.native
  def initRuntimeSettingsWithString(): js.Any = js.native
  def outputSettingsToString(): js.Any = js.native
  def resetRuntimeSettings(): Unit = js.native
  def updateRuntimeSettings(setting: RunTimeSetting): Unit = js.native
}

