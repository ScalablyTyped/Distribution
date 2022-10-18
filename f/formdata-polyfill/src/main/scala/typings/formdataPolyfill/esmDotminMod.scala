package typings.formdataPolyfill

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmDotminMod {
  
  @JSImport("formdata-polyfill/esm.min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("formdata-polyfill/esm.min", "FormData")
  @js.native
  open class FormData ()
    extends StObject
       with typings.std.FormData
  
  inline def formDataToBlob(formData: typings.std.FormData): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("formDataToBlob")(formData.asInstanceOf[js.Any]).asInstanceOf[Blob]
}
