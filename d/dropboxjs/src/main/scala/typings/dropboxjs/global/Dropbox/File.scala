package typings.dropboxjs.global.Dropbox

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object File {
  
  @JSGlobal("Dropbox.File.CopyReference")
  @js.native
  class CopyReference ()
    extends StObject
       with typings.dropboxjs.Dropbox.File.CopyReference {
    
    /* CompleteClass */
    var expiresAt: Date = js.native
    
    /* CompleteClass */
    var tag: String = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Object = js.native
  }
  object CopyReference {
    
    @JSGlobal("Dropbox.File.CopyReference")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def parse(refData: String): typings.dropboxjs.Dropbox.File.CopyReference = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(refData.asInstanceOf[js.Any]).asInstanceOf[typings.dropboxjs.Dropbox.File.CopyReference]
    /* static member */
    inline def parse(refData: js.Object): typings.dropboxjs.Dropbox.File.CopyReference = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(refData.asInstanceOf[js.Any]).asInstanceOf[typings.dropboxjs.Dropbox.File.CopyReference]
  }
  
  @JSGlobal("Dropbox.File.ShareUrl")
  @js.native
  class ShareUrl ()
    extends StObject
       with typings.dropboxjs.Dropbox.File.ShareUrl {
    
    /* CompleteClass */
    var expiresAt: Date = js.native
    
    /* CompleteClass */
    var isDirect: Boolean = js.native
    
    /* CompleteClass */
    var isPreview: Boolean = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Object = js.native
    
    /* CompleteClass */
    var url: String = js.native
  }
  object ShareUrl {
    
    @JSGlobal("Dropbox.File.ShareUrl")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def parse(urlData: String, isDirect: Boolean): typings.dropboxjs.Dropbox.File.ShareUrl = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlData.asInstanceOf[js.Any], isDirect.asInstanceOf[js.Any])).asInstanceOf[typings.dropboxjs.Dropbox.File.ShareUrl]
    /* static member */
    inline def parse(urlData: js.Object, isDirect: Boolean): typings.dropboxjs.Dropbox.File.ShareUrl = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlData.asInstanceOf[js.Any], isDirect.asInstanceOf[js.Any])).asInstanceOf[typings.dropboxjs.Dropbox.File.ShareUrl]
  }
  
  @JSGlobal("Dropbox.File.Stat")
  @js.native
  class Stat ()
    extends StObject
       with typings.dropboxjs.Dropbox.File.Stat {
    
    /* CompleteClass */
    var clientModifiedAt: Date = js.native
    
    /* CompleteClass */
    var contentHash: String = js.native
    
    /* CompleteClass */
    var hasThumbnail: Boolean = js.native
    
    /* CompleteClass */
    var humanSize: String = js.native
    
    /* CompleteClass */
    var inAppFolder: Boolean = js.native
    
    /* CompleteClass */
    var isFile: Boolean = js.native
    
    /* CompleteClass */
    var isFolder: Boolean = js.native
    
    /* CompleteClass */
    var isRemoved: Boolean = js.native
    
    /* CompleteClass */
    var mimeType: String = js.native
    
    /* CompleteClass */
    var modifiedAt: Date = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var path: String = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Object = js.native
    
    /* CompleteClass */
    var typeIcon: String = js.native
    
    /* CompleteClass */
    var versionTag: String = js.native
  }
  object Stat {
    
    @JSGlobal("Dropbox.File.Stat")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def parse(metadata: js.Object): typings.dropboxjs.Dropbox.File.Stat = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(metadata.asInstanceOf[js.Any]).asInstanceOf[typings.dropboxjs.Dropbox.File.Stat]
  }
}
