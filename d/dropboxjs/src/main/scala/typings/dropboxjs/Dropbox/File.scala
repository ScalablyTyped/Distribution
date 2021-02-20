package typings.dropboxjs.Dropbox

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object File {
  
  @js.native
  trait CopyReference extends StObject {
    
    var expiresAt: Date = js.native
    
    var tag: String = js.native
    
    def toJSON(): js.Object = js.native
  }
  object CopyReference {
    
    @scala.inline
    def apply(expiresAt: Date, tag: String, toJSON: () => js.Object): CopyReference = {
      val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[CopyReference]
    }
    
    @scala.inline
    implicit class CopyReferenceMutableBuilder[Self <: CopyReference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpiresAt(value: Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ShareUrl extends StObject {
    
    var expiresAt: Date = js.native
    
    var isDirect: Boolean = js.native
    
    var isPreview: Boolean = js.native
    
    def toJSON(): js.Object = js.native
    
    var url: String = js.native
  }
  object ShareUrl {
    
    @scala.inline
    def apply(expiresAt: Date, isDirect: Boolean, isPreview: Boolean, toJSON: () => js.Object, url: String): ShareUrl = {
      val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any], isDirect = isDirect.asInstanceOf[js.Any], isPreview = isPreview.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShareUrl]
    }
    
    @scala.inline
    implicit class ShareUrlMutableBuilder[Self <: ShareUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpiresAt(value: Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDirect(value: Boolean): Self = StObject.set(x, "isDirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPreview(value: Boolean): Self = StObject.set(x, "isPreview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Stat extends StObject {
    
    var clientModifiedAt: Date = js.native
    
    var contentHash: String = js.native
    
    var hasThumbnail: Boolean = js.native
    
    var humanSize: String = js.native
    
    var inAppFolder: Boolean = js.native
    
    var isFile: Boolean = js.native
    
    var isFolder: Boolean = js.native
    
    var isRemoved: Boolean = js.native
    
    var mimeType: String = js.native
    
    var modifiedAt: Date = js.native
    
    var name: String = js.native
    
    var path: String = js.native
    
    var size: Double = js.native
    
    def toJSON(): js.Object = js.native
    
    var typeIcon: String = js.native
    
    var versionTag: String = js.native
  }
  object Stat {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class StatMutableBuilder[Self <: Stat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientModifiedAt(value: Date): Self = StObject.set(x, "clientModifiedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentHash(value: String): Self = StObject.set(x, "contentHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasThumbnail(value: Boolean): Self = StObject.set(x, "hasThumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHumanSize(value: String): Self = StObject.set(x, "humanSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInAppFolder(value: Boolean): Self = StObject.set(x, "inAppFolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFolder(value: Boolean): Self = StObject.set(x, "isFolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRemoved(value: Boolean): Self = StObject.set(x, "isRemoved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedAt(value: Date): Self = StObject.set(x, "modifiedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTypeIcon(value: String): Self = StObject.set(x, "typeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionTag(value: String): Self = StObject.set(x, "versionTag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StatOptions extends StObject {
    
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
    implicit class StatOptionsMutableBuilder[Self <: StatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentHash(value: String): Self = StObject.set(x, "contentHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpCache(value: Boolean): Self = StObject.set(x, "httpCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadDir(value: Boolean): Self = StObject.set(x, "readDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionTag(value: String): Self = StObject.set(x, "versionTag", value.asInstanceOf[js.Any])
    }
  }
}
