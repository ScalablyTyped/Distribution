package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.facebookNodejsBusinessSdk.srcVideoUploaderMod.SlideshowSpec
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsAdVideoMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/ad-video", JSImport.Default)
  @js.native
  open class default () extends AdVideo
  
  @js.native
  trait AdVideo extends AbstractCrudObject {
    
    def create(
      batch: typings.facebookNodejsBusinessSdk.srcApiBatchMod.default,
      failureHandler: js.Function1[/* repeated */ Any, Any],
      successHandler: js.Function1[/* repeated */ Any, Any]
    ): Any = js.native
    
    def filepath: String = js.native
    
    def getThumbnails(fields: Record[String, Any], params: Record[String, Any]): typings.facebookNodejsBusinessSdk.srcCursorMod.default = js.native
    
    def slideshow_spec: js.UndefOr[SlideshowSpec | Null] = js.native
    
    def waitUntilEncodingReady(): Unit = js.native
    def waitUntilEncodingReady(interval: Double): Unit = js.native
    def waitUntilEncodingReady(interval: Double, timeout: Double): Unit = js.native
    def waitUntilEncodingReady(interval: Unit, timeout: Double): Unit = js.native
  }
}
