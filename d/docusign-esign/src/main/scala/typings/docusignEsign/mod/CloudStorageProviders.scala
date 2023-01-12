package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudStorageProviders extends StObject {
  
  /**
    * An Array containing the storage providers associated with the user.
    */
  var storageProviders: js.UndefOr[
    js.Array[
      /* Contains details about a specific cloud storage provider. */ CloudStorageProvider
    ]
  ] = js.undefined
}
object CloudStorageProviders {
  
  inline def apply(): CloudStorageProviders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudStorageProviders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudStorageProviders] (val x: Self) extends AnyVal {
    
    inline def setStorageProviders(
      value: js.Array[
          /* Contains details about a specific cloud storage provider. */ CloudStorageProvider
        ]
    ): Self = StObject.set(x, "storageProviders", value.asInstanceOf[js.Any])
    
    inline def setStorageProvidersUndefined: Self = StObject.set(x, "storageProviders", js.undefined)
    
    inline def setStorageProvidersVarargs(value: (/* Contains details about a specific cloud storage provider. */ CloudStorageProvider)*): Self = StObject.set(x, "storageProviders", js.Array(value*))
  }
}
