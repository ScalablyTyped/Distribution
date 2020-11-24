package typings.dropboxjs.Dropbox.File

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatOptions extends js.Object {
  
  var contentHash: String = js.native
  
  var deleted: Boolean = js.native
  
  var hash: String = js.native
  
  var httpCache: Boolean = js.native
  
  var readDir: Boolean = js.native
  
  var removed: Boolean = js.native
  
  var rev: String = js.native
  
  var version: Double = js.native
  
  var versionTag: String = js.native
}
object StatOptions {
  
  @scala.inline
  def apply(
    contentHash: String,
    deleted: Boolean,
    hash: String,
    httpCache: Boolean,
    readDir: Boolean,
    removed: Boolean,
    rev: String,
    version: Double,
    versionTag: String
  ): StatOptions = {
    val __obj = js.Dynamic.literal(contentHash = contentHash.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], httpCache = httpCache.asInstanceOf[js.Any], readDir = readDir.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], versionTag = versionTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatOptions]
  }
  
  @scala.inline
  implicit class StatOptionsOps[Self <: StatOptions] (val x: Self) extends AnyVal {
    
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
    def setContentHash(value: String): Self = this.set("contentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpCache(value: Boolean): Self = this.set("httpCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadDir(value: Boolean): Self = this.set("readDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoved(value: Boolean): Self = this.set("removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRev(value: String): Self = this.set("rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionTag(value: String): Self = this.set("versionTag", value.asInstanceOf[js.Any])
  }
}
