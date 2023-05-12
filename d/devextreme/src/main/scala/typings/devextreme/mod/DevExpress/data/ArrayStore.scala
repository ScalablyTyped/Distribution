package typings.devextreme.mod.DevExpress.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayStore[TItem, TKey]
  extends StObject
     with AbstractStore[TItem, TKey]
     with typings.devextreme.mod.DevExpress.data.utils.Store[TItem, TKey] {
  
  /**
    * Clears all the ArrayStore&apos;s associated data.
    */
  def clear(): Unit = js.native
  
  /**
    * Creates a Query for the underlying array.
    */
  def createQuery(): Query = js.native
}
object ArrayStore {
  
  type Options[TItem, TKey] = ArrayStoreOptions[TItem, TKey]
}
