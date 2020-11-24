package typings.fineUploader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ShowConfirmFunction = js.Function1[
    /* message */ java.lang.String, 
    typings.fineUploader.coreMod.PromiseOptions | scala.Unit
  ]
  
  type ShowMessageFunction = js.Function1[
    /* message */ java.lang.String, 
    typings.fineUploader.coreMod.PromiseOptions | scala.Unit
  ]
  
  type ShowPromptFunction = js.Function2[
    /* message */ java.lang.String, 
    /* defaultValue */ java.lang.String, 
    typings.fineUploader.coreMod.PromiseOptions | scala.Unit
  ]
}
