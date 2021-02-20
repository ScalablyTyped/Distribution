package typings.fineUploader.coreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlobsOptions extends StObject {
  
  /**
    * The default name to be used for nameless `Blob`s
    *
    * @default `Misc data`
    */
  var defaultName: js.UndefOr[String] = js.native
}
object BlobsOptions {
  
  @scala.inline
  def apply(): BlobsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlobsOptions]
  }
  
  @scala.inline
  implicit class BlobsOptionsMutableBuilder[Self <: BlobsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultName(value: String): Self = StObject.set(x, "defaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNameUndefined: Self = StObject.set(x, "defaultName", js.undefined)
  }
}
