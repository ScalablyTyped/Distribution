package typings.devtoolsProtocol.mod.Protocol.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheStorageContentUpdatedEvent extends js.Object {
  
  /**
    * Name of cache in origin.
    */
  var cacheName: String = js.native
  
  /**
    * Origin to update.
    */
  var origin: String = js.native
}
object CacheStorageContentUpdatedEvent {
  
  @scala.inline
  def apply(cacheName: String, origin: String): CacheStorageContentUpdatedEvent = {
    val __obj = js.Dynamic.literal(cacheName = cacheName.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheStorageContentUpdatedEvent]
  }
  
  @scala.inline
  implicit class CacheStorageContentUpdatedEventOps[Self <: CacheStorageContentUpdatedEvent] (val x: Self) extends AnyVal {
    
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
    def setCacheName(value: String): Self = this.set("cacheName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
  }
}
