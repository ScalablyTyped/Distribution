package typings.devextreme.mod.DevExpress.data

import typings.devextreme.anon.Filter
import typings.devextreme.anon.Index
import typings.devextreme.anon.keyinEventNameFunctionInserted
import typings.devextreme.mod.DevExpress.core.DeepPartial
import typings.devextreme.mod.DevExpress.core.utils.DxExtendedPromise
import typings.devextreme.mod.DevExpress.data.AbstractStore.EventName
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
