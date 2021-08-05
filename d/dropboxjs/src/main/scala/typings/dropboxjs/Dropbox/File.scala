package typings.dropboxjs.Dropbox

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object File {
  
  trait CopyReference extends StObject {
    
    var expiresAt: Date
    
    var tag: String
    
    def toJSON(): js.Object
  }
  object CopyReference {
    
    inline def apply(expiresAt: Date, tag: String, toJSON: () => js.Object): CopyReference = {
      val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[CopyReference]
    }
    
    extension [Self <: CopyReference](x: Self) {
      
      inline def setExpiresAt(value: Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait ShareUrl extends StObject {
    
    var expiresAt: Date
    
    var isDirect: Boolean
    
    var isPreview: Boolean
    
    def toJSON(): js.Object
    
    var url: String
  }
  object ShareUrl {
    
    inline def apply(expiresAt: Date, isDirect: Boolean, isPreview: Boolean, toJSON: () => js.Object, url: String): ShareUrl = {
      val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any], isDirect = isDirect.asInstanceOf[js.Any], isPreview = isPreview.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShareUrl]
    }
    
    extension [Self <: ShareUrl](x: Self) {
      
      inline def setExpiresAt(value: Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      inline def setIsDirect(value: Boolean): Self = StObject.set(x, "isDirect", value.asInstanceOf[js.Any])
      
      inline def setIsPreview(value: Boolean): Self = StObject.set(x, "isPreview", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stat extends StObject {
    
    var clientModifiedAt: Date
    
    var contentHash: String
    
    var hasThumbnail: Boolean
    
    var humanSize: String
    
    var inAppFolder: Boolean
    
    var isFile: Boolean
    
    var isFolder: Boolean
    
    var isRemoved: Boolean
    
    var mimeType: String
    
    var modifiedAt: Date
    
    var name: String
    
    var path: String
    
    var size: Double
    
    def toJSON(): js.Object
    
    var typeIcon: String
    
    var versionTag: String
  }
  object Stat {
    
    inline def apply(
      clientModifiedAt: Date,
      contentHash: String,
      hasThumbnail: Boolean,
      humanSize: String,
      inAppFolder: Boolean,
      isFile: Boolean,
      isFolder: Boolean,
      isRemoved: Boolean,
      mimeType: String,
      modifiedAt: Date,
      name: String,
      path: String,
      size: Double,
      toJSON: () => js.Object,
      typeIcon: String,
      versionTag: String
    ): Stat = {
      val __obj = js.Dynamic.literal(clientModifiedAt = clientModifiedAt.asInstanceOf[js.Any], contentHash = contentHash.asInstanceOf[js.Any], hasThumbnail = hasThumbnail.asInstanceOf[js.Any], humanSize = humanSize.asInstanceOf[js.Any], inAppFolder = inAppFolder.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], isRemoved = isRemoved.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], modifiedAt = modifiedAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), typeIcon = typeIcon.asInstanceOf[js.Any], versionTag = versionTag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stat]
    }
    
    extension [Self <: Stat](x: Self) {
      
      inline def setClientModifiedAt(value: Date): Self = StObject.set(x, "clientModifiedAt", value.asInstanceOf[js.Any])
      
      inline def setContentHash(value: String): Self = StObject.set(x, "contentHash", value.asInstanceOf[js.Any])
      
      inline def setHasThumbnail(value: Boolean): Self = StObject.set(x, "hasThumbnail", value.asInstanceOf[js.Any])
      
      inline def setHumanSize(value: String): Self = StObject.set(x, "humanSize", value.asInstanceOf[js.Any])
      
      inline def setInAppFolder(value: Boolean): Self = StObject.set(x, "inAppFolder", value.asInstanceOf[js.Any])
      
      inline def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
      
      inline def setIsFolder(value: Boolean): Self = StObject.set(x, "isFolder", value.asInstanceOf[js.Any])
      
      inline def setIsRemoved(value: Boolean): Self = StObject.set(x, "isRemoved", value.asInstanceOf[js.Any])
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setModifiedAt(value: Date): Self = StObject.set(x, "modifiedAt", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setTypeIcon(value: String): Self = StObject.set(x, "typeIcon", value.asInstanceOf[js.Any])
      
      inline def setVersionTag(value: String): Self = StObject.set(x, "versionTag", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatOptions extends StObject {
    
    var contentHash: String
    
    var deleted: Boolean
    
    var hash: String
    
    var httpCache: Boolean
    
    var readDir: Boolean
    
    var removed: Boolean
    
    var rev: String
    
    var version: Double
    
    var versionTag: String
  }
  object StatOptions {
    
    inline def apply(
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
    
    extension [Self <: StatOptions](x: Self) {
      
      inline def setContentHash(value: String): Self = StObject.set(x, "contentHash", value.asInstanceOf[js.Any])
      
      inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHttpCache(value: Boolean): Self = StObject.set(x, "httpCache", value.asInstanceOf[js.Any])
      
      inline def setReadDir(value: Boolean): Self = StObject.set(x, "readDir", value.asInstanceOf[js.Any])
      
      inline def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionTag(value: String): Self = StObject.set(x, "versionTag", value.asInstanceOf[js.Any])
    }
  }
}
