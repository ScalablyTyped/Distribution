package typings.devtoolsProtocol.mod.Protocol.ApplicationCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationCache extends js.Object {
  
  /**
    * Application cache creation time.
    */
  var creationTime: Double = js.native
  
  /**
    * Manifest URL.
    */
  var manifestURL: String = js.native
  
  /**
    * Application cache resources.
    */
  var resources: js.Array[ApplicationCacheResource] = js.native
  
  /**
    * Application cache size.
    */
  var size: Double = js.native
  
  /**
    * Application cache update time.
    */
  var updateTime: Double = js.native
}
object ApplicationCache {
  
  @scala.inline
  def apply(
    creationTime: Double,
    manifestURL: String,
    resources: js.Array[ApplicationCacheResource],
    size: Double,
    updateTime: Double
  ): ApplicationCache = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], manifestURL = manifestURL.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCache]
  }
  
  @scala.inline
  implicit class ApplicationCacheOps[Self <: typings.devtoolsProtocol.mod.Protocol.ApplicationCache.ApplicationCache] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: Double): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestURL(value: String): Self = this.set("manifestURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesVarargs(value: ApplicationCacheResource*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[ApplicationCacheResource]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTime(value: Double): Self = this.set("updateTime", value.asInstanceOf[js.Any])
  }
}
