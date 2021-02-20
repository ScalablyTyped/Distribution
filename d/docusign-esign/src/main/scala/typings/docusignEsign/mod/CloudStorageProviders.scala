package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudStorageProviders extends StObject {
  
  /**
    * An Array containing the storage providers associated with the user.
    */
  var storageProviders: js.UndefOr[
    js.Array[
      /* Contains details about a specific cloud storage provider. */ CloudStorageProvider
    ]
  ] = js.native
}
object CloudStorageProviders {
  
  @scala.inline
  def apply(): CloudStorageProviders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudStorageProviders]
  }
  
  @scala.inline
  implicit class CloudStorageProvidersMutableBuilder[Self <: CloudStorageProviders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStorageProviders(
      value: js.Array[
          /* Contains details about a specific cloud storage provider. */ CloudStorageProvider
        ]
    ): Self = StObject.set(x, "storageProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageProvidersUndefined: Self = StObject.set(x, "storageProviders", js.undefined)
    
    @scala.inline
    def setStorageProvidersVarargs(value: (/* Contains details about a specific cloud storage provider. */ CloudStorageProvider)*): Self = StObject.set(x, "storageProviders", js.Array(value :_*))
  }
}
