package typings.devtoolsProtocol.mod.Protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DOMStorage {
  
  trait ClearRequest extends StObject {
    
    var storageId: StorageId
  }
  object ClearRequest {
    
    @scala.inline
    def apply(storageId: StorageId): ClearRequest = {
      val __obj = js.Dynamic.literal(storageId = storageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClearRequest]
    }
    
    @scala.inline
    implicit class ClearRequestMutableBuilder[Self <: ClearRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStorageId(value: StorageId): Self = StObject.set(x, "storageId", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomStorageItemAddedEvent extends StObject {
    
    var key: String
    
    var newValue: String
    
    var storageId: StorageId
  }
  object DomStorageItemAddedEvent {
    
    @scala.inline
    def apply(key: String, newValue: String, storageId: StorageId): DomStorageItemAddedEvent = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], storageId = storageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomStorageItemAddedEvent]
    }
    
    @scala.inline
    implicit class DomStorageItemAddedEventMutableBuilder[Self <: DomStorageItemAddedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageId(value: StorageId): Self = StObject.set(x, "storageId", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomStorageItemRemovedEvent extends StObject {
    
    var key: String
    
    var storageId: StorageId
  }
  object DomStorageItemRemovedEvent {
    
    @scala.inline
    def apply(key: String, storageId: StorageId): DomStorageItemRemovedEvent = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], storageId = storageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomStorageItemRemovedEvent]
    }
    
    @scala.inline
    implicit class DomStorageItemRemovedEventMutableBuilder[Self <: DomStorageItemRemovedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageId(value: StorageId): Self = StObject.set(x, "storageId", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomStorageItemUpdatedEvent extends StObject {
    
    var key: String
    
    var newValue: String
    
    var oldValue: String
    
    var storageId: StorageId
  }
  object DomStorageItemUpdatedEvent {
    
    @scala.inline
    def apply(key: String, newValue: String, oldValue: String, storageId: StorageId): DomStorageItemUpdatedEvent = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], storageId = storageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomStorageItemUpdatedEvent]
    }
    
    @scala.inline
    implicit class DomStorageItemUpdatedEventMutableBuilder[Self <: DomStorageItemUpdatedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValue(value: String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageId(value: StorageId): Self = StObject.set(x, "storageId", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomStorageItemsClearedEvent extends StObject {
    
    var storageId: StorageId
  }
  object DomStorageItemsClearedEvent {
    
    @scala.inline
    def apply(storageId: StorageId): DomStorageItemsClearedEvent = {
      val __obj = js.Dynamic.literal(storageId = storageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomStorageItemsClearedEvent]
    }
    
    @scala.inline
    implicit class DomStorageItemsClearedEventMutableBuilder[Self <: DomStorageItemsClearedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStorageId(value: StorageId): Self = StObject.set(x, "storageId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetDOMStorageItemsRequest extends StObject {
    
    var storageId: StorageId
  }
  object GetDOMStorageItemsRequest {
    
    @scala.inline
    def apply(storageId: StorageId): GetDOMStorageItemsRequest = {
      val __obj = js.Dynamic.literal(storageId = storageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDOMStorageItemsRequest]
    }
    
    @scala.inline
    implicit class GetDOMStorageItemsRequestMutableBuilder[Self <: GetDOMStorageItemsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStorageId(value: StorageId): Self = StObject.set(x, "storageId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetDOMStorageItemsResponse extends StObject {
    
    var entries: js.Array[Item]
  }
  object GetDOMStorageItemsResponse {
    
    @scala.inline
    def apply(entries: js.Array[Item]): GetDOMStorageItemsResponse = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDOMStorageItemsResponse]
    }
    
    @scala.inline
    implicit class GetDOMStorageItemsResponseMutableBuilder[Self <: GetDOMStorageItemsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntries(value: js.Array[Item]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntriesVarargs(value: Item*): Self = StObject.set(x, "entries", js.Array(value :_*))
    }
  }
  
  type Item = js.Array[String]
  
  trait RemoveDOMStorageItemRequest extends StObject {
    
    var key: String
    
    var storageId: StorageId
  }
  object RemoveDOMStorageItemRequest {
    
    @scala.inline
    def apply(key: String, storageId: StorageId): RemoveDOMStorageItemRequest = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], storageId = storageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveDOMStorageItemRequest]
    }
    
    @scala.inline
    implicit class RemoveDOMStorageItemRequestMutableBuilder[Self <: RemoveDOMStorageItemRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageId(value: StorageId): Self = StObject.set(x, "storageId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetDOMStorageItemRequest extends StObject {
    
    var key: String
    
    var storageId: StorageId
    
    var value: String
  }
  object SetDOMStorageItemRequest {
    
    @scala.inline
    def apply(key: String, storageId: StorageId, value: String): SetDOMStorageItemRequest = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], storageId = storageId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetDOMStorageItemRequest]
    }
    
    @scala.inline
    implicit class SetDOMStorageItemRequestMutableBuilder[Self <: SetDOMStorageItemRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageId(value: StorageId): Self = StObject.set(x, "storageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait StorageId extends StObject {
    
    /**
      * Whether the storage is local storage (not session storage).
      */
    var isLocalStorage: Boolean
    
    /**
      * Security origin for the storage.
      */
    var securityOrigin: String
  }
  object StorageId {
    
    @scala.inline
    def apply(isLocalStorage: Boolean, securityOrigin: String): StorageId = {
      val __obj = js.Dynamic.literal(isLocalStorage = isLocalStorage.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageId]
    }
    
    @scala.inline
    implicit class StorageIdMutableBuilder[Self <: StorageId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsLocalStorage(value: Boolean): Self = StObject.set(x, "isLocalStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
    }
  }
}
