package typings.epcis2Js

import typings.epcis2Js.settingsMod.Settings_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestCaptureMod {
  
  @JSImport("epcis2.js/request/capture", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Make capture request to provided Url. Custom user options are merged with
    * the globally defined settings and request defaults.
    * If the EPCISDocument provided isn't valid and the `documentValidation` field of settings is true,
    * the functions throws an Error.
    *
    * @param epcisDocument - The url of the request
    * @param [customOptions] - User options for this single request
    * @returns Response promise
    */
  inline def default(epcisDocument: typings.epcis2Js.entityEpcisEpcisdocumentMod.default): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(epcisDocument.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def default(epcisDocument: typings.epcis2Js.entityEpcisEpcisdocumentMod.default, customOptions: Settings_): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(epcisDocument.asInstanceOf[js.Any], customOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
