package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MBC extends js.Object {
  /**
    * Tell this painter the directory where you place`cv-wasm.js` and`cv-wasm.wasm`.
    
    * Syntax:* `MBC.cvFolder = 'js';`
    */
  var cvFolder: String
  /**
    * You should call`MBC.loadCvScriptAsync()` first before use`Free Transform` and`Brush` module.
    
    * Syntax:* `MBC.loadCvScriptAsync(callback)`
    
    | parameter | type | description |
    |  |  |  |
    | callback | `function(boolean bSuccess)` | |
    
    @example
  ```javascript
  MBC.loadCvScriptAsync(function(bSuccess){
    if(bSuccess){
    console.log('load cv script success.');
    painter.enterFreeTransformModeAsync();
    }else{
    console.log('load cv script fail.');
    }
  });
  ```
    */
  def loadCvScriptAsync(): Unit
}

object MBC {
  @scala.inline
  def apply(cvFolder: String, loadCvScriptAsync: () => Unit): MBC = {
    val __obj = js.Dynamic.literal(cvFolder = cvFolder.asInstanceOf[js.Any], loadCvScriptAsync = js.Any.fromFunction0(loadCvScriptAsync))
    __obj.asInstanceOf[MBC]
  }
}

