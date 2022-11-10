package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.CustomQueryParams
import typings.devextreme.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODataStore[TItem, TKey]
  extends StObject
     with Store[TItem, TKey]
     with typings.devextreme.mod.DevExpress.data.utils.Store[TItem, TKey] {
  
  /**
    * Gets an entity with a specific key.
    */
  def byKey(key: TKey, extraOptions: Expand): js.Promise[TItem] = js.native
  
  /**
    * Creates a Query for the OData endpoint.
    */
  def createQuery(): Query = js.native
  def createQuery(loadOptions: CustomQueryParams): Query = js.native
}
object ODataStore {
  
  type Options[TItem, TKey] = ODataStoreOptions[TItem, TKey]
}
