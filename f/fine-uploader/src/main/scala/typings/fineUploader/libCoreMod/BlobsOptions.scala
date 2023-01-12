package typings.fineUploader.libCoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlobsOptions extends StObject {
  
  /**
    * The default name to be used for nameless `Blob`s
    *
    * @default `Misc data`
    */
  var defaultName: js.UndefOr[String] = js.undefined
}
object BlobsOptions {
  
  inline def apply(): BlobsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlobsOptions] (val x: Self) extends AnyVal {
    
    inline def setDefaultName(value: String): Self = StObject.set(x, "defaultName", value.asInstanceOf[js.Any])
    
    inline def setDefaultNameUndefined: Self = StObject.set(x, "defaultName", js.undefined)
  }
}
