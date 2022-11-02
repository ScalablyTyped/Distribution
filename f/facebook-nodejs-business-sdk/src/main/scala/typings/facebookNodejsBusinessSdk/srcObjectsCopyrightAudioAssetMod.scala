package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsCopyrightAudioAssetMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/copyright-audio-asset", JSImport.Default)
  @js.native
  open class default () extends CopyrightAudioAsset
  
  @js.native
  trait CopyrightAudioAsset extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[CopyrightAudioAsset] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[CopyrightAudioAsset] = js.native
  }
}
