package typings.devtoolsProtocol.mod.Protocol.CacheStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cache extends js.Object {
  
  /**
    * An opaque unique id of the cache.
    */
  var cacheId: CacheId = js.native
  
  /**
    * The name of the cache.
    */
  var cacheName: String = js.native
  
  /**
    * Security origin of the cache.
    */
  var securityOrigin: String = js.native
}
object Cache {
  
  @scala.inline
  def apply(cacheId: CacheId, cacheName: String, securityOrigin: String): Cache = {
    val __obj = js.Dynamic.literal(cacheId = cacheId.asInstanceOf[js.Any], cacheName = cacheName.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
  
  @scala.inline
  implicit class CacheOps[Self <: Cache] (val x: Self) extends AnyVal {
    
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
    def setCacheId(value: CacheId): Self = this.set("cacheId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheName(value: String): Self = this.set("cacheName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityOrigin(value: String): Self = this.set("securityOrigin", value.asInstanceOf[js.Any])
  }
}
