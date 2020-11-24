package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudStorageProviders extends js.Object {
  
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
  implicit class CloudStorageProvidersOps[Self <: CloudStorageProviders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStorageProvidersVarargs(value: (/* Contains details about a specific cloud storage provider. */ CloudStorageProvider)*): Self = this.set("storageProviders", js.Array(value :_*))
    
    @scala.inline
    def setStorageProviders(
      value: js.Array[
          /* Contains details about a specific cloud storage provider. */ CloudStorageProvider
        ]
    ): Self = this.set("storageProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageProviders: Self = this.set("storageProviders", js.undefined)
  }
}
