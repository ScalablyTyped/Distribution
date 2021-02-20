package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlaStoreOptions extends StObject {
  
  /**
    * [descr:XmlaStore.Options.beforeSend]
    */
  var beforeSend: js.UndefOr[js.Function1[/* options */ Data, _]] = js.native
  
  /**
    * [descr:XmlaStore.Options.catalog]
    */
  var catalog: js.UndefOr[String] = js.native
  
  /**
    * [descr:XmlaStore.Options.cube]
    */
  var cube: js.UndefOr[String] = js.native
  
  /**
    * [descr:XmlaStore.Options.url]
    */
  var url: js.UndefOr[String] = js.native
}
object XmlaStoreOptions {
  
  @scala.inline
  def apply(): XmlaStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlaStoreOptions]
  }
  
  @scala.inline
  implicit class XmlaStoreOptionsMutableBuilder[Self <: XmlaStoreOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeSend(value: /* options */ Data => _): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    @scala.inline
    def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
    
    @scala.inline
    def setCube(value: String): Self = StObject.set(x, "cube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCubeUndefined: Self = StObject.set(x, "cube", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
