package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Expand
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ODataStore
  extends StObject
     with Store {
  
  def byKey(key: String, extraOptions: Expand): Promise[js.Any] & JQueryPromise[js.Any] = js.native
  /**
    * [descr:ODataStore.byKey(key, extraOptions)]
    */
  def byKey(key: js.Any, extraOptions: Expand): Promise[js.Any] & JQueryPromise[js.Any] = js.native
  def byKey(key: Double, extraOptions: Expand): Promise[js.Any] & JQueryPromise[js.Any] = js.native
  
  /**
    * [descr:ODataStore.createQuery(loadOptions)]
    */
  def createQuery(loadOptions: js.Any): js.Any = js.native
}
