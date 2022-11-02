package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsMusicVideoCopyrightMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/music-video-copyright", JSImport.Default)
  @js.native
  open class default () extends MusicVideoCopyright
  
  @js.native
  trait MusicVideoCopyright extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[MusicVideoCopyright] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[MusicVideoCopyright] = js.native
  }
}
