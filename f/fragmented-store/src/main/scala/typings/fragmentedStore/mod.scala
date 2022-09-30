package typings.fragmentedStore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.fragmentedStore.anon.Provider
import typings.fragmentedStore.fragmentedStoreStrings.useStore
import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[Store /* <: StringDictionary[Any] */](store: Store): StoreUtils[Store] = ^.asInstanceOf[js.Dynamic].apply(store.asInstanceOf[js.Any]).asInstanceOf[StoreUtils[Store]]
  
  @JSImport("fragmented-store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type StateHook[S] = js.Function0[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  
  type StoreUtils[Store /* <: StringDictionary[Any] */] = (Omit[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Store as / * template literal string: use${Capitalize<string&K>} * / string ]: fragmented-store.fragmented-store.StateHook<Store[K]>}
    */ typings.fragmentedStore.fragmentedStoreStrings.StoreUtils & TopLevel[Store], 
    useStore
  ]) & Provider[Store]
}
