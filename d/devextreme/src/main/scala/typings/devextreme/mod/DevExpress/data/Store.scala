package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Filter
import typings.devextreme.anon.Index
import typings.devextreme.anon.keyinEventNameFunctionInserted
import typings.devextreme.mod.DevExpress.core.DeepPartial
import typings.devextreme.mod.DevExpress.core.utils.DxExtendedPromise
import typings.devextreme.mod.DevExpress.data.Store.EventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store[TItem, TKey] extends StObject {
  
  /**
    * Gets a data item with a specific key.
    */
  def byKey(key: TKey): js.Promise[TItem] = js.native
  def byKey(key: TKey, extraOptions: LoadOptions[TItem]): js.Promise[TItem] = js.native
  
  /**
    * Adds a data item to the store.
    */
  def insert(values: TItem): DxExtendedPromise[TItem] = js.native
  
  /**
    * Gets the key property (or properties) as specified in the key property.
    */
  def key(): String | js.Array[String] = js.native
  
  /**
    * Gets a data item&apos;s key value.
    */
  def keyOf(obj: TItem): TKey = js.native
  
  /**
    * Starts loading data.
    */
  def load(): DxExtendedPromise[js.Array[TItem]] = js.native
  /**
    * Starts loading data.
    */
  def load(options: LoadOptions[TItem]): DxExtendedPromise[js.Array[TItem]] = js.native
  
  /**
    * Detaches all event handlers from a single event.
    */
  def off(eventName: EventName): this.type = js.native
  /**
    * Detaches a particular event handler from a single event.
    */
  def off(eventName: EventName, eventHandler: js.Function): this.type = js.native
  
  /**
    * Subscribes to an event.
    */
  def on(eventName: EventName, eventHandler: js.Function): this.type = js.native
  /**
    * Subscribes to events.
    */
  def on(events: keyinEventNameFunctionInserted): this.type = js.native
  
  /**
    * Pushes data changes to the store and notifies the DataSource.
    */
  def push(changes: js.Array[Index[TItem, TKey]]): Unit = js.native
  
  /**
    * Removes a data item with a specific key from the store.
    */
  def remove(key: TKey): js.Promise[Unit] = js.native
  
  /**
    * Gets the total count of items the load() function returns.
    */
  def totalCount(obj: Filter[TItem]): js.Promise[Double] = js.native
  
  /**
    * Updates a data item with a specific key.
    */
  def update(key: TKey, values: DeepPartial[TItem]): DxExtendedPromise[TItem] = js.native
}
object Store {
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.loaded
    - typings.devextreme.devextremeStrings.loading
    - typings.devextreme.devextremeStrings.inserted
    - typings.devextreme.devextremeStrings.inserting
    - typings.devextreme.devextremeStrings.updated
    - typings.devextreme.devextremeStrings.updating
    - typings.devextreme.devextremeStrings.push
    - typings.devextreme.devextremeStrings.removed
    - typings.devextreme.devextremeStrings.removing
    - typings.devextreme.devextremeStrings.modified
    - typings.devextreme.devextremeStrings.modifying
  */
  trait EventName extends StObject
  object EventName {
    
    inline def inserted: typings.devextreme.devextremeStrings.inserted = "inserted".asInstanceOf[typings.devextreme.devextremeStrings.inserted]
    
    inline def inserting: typings.devextreme.devextremeStrings.inserting = "inserting".asInstanceOf[typings.devextreme.devextremeStrings.inserting]
    
    inline def loaded: typings.devextreme.devextremeStrings.loaded = "loaded".asInstanceOf[typings.devextreme.devextremeStrings.loaded]
    
    inline def loading: typings.devextreme.devextremeStrings.loading = "loading".asInstanceOf[typings.devextreme.devextremeStrings.loading]
    
    inline def modified: typings.devextreme.devextremeStrings.modified = "modified".asInstanceOf[typings.devextreme.devextremeStrings.modified]
    
    inline def modifying: typings.devextreme.devextremeStrings.modifying = "modifying".asInstanceOf[typings.devextreme.devextremeStrings.modifying]
    
    inline def push: typings.devextreme.devextremeStrings.push = "push".asInstanceOf[typings.devextreme.devextremeStrings.push]
    
    inline def removed: typings.devextreme.devextremeStrings.removed = "removed".asInstanceOf[typings.devextreme.devextremeStrings.removed]
    
    inline def removing: typings.devextreme.devextremeStrings.removing = "removing".asInstanceOf[typings.devextreme.devextremeStrings.removing]
    
    inline def updated: typings.devextreme.devextremeStrings.updated = "updated".asInstanceOf[typings.devextreme.devextremeStrings.updated]
    
    inline def updating: typings.devextreme.devextremeStrings.updating = "updating".asInstanceOf[typings.devextreme.devextremeStrings.updating]
  }
  
  type Options[TItem, TKey] = StoreOptions[TItem, TKey]
}
