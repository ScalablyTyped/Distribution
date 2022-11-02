package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsOffsitePixelMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/offsite-pixel", JSImport.Default)
  @js.native
  open class default () extends OffsitePixel
  
  @js.native
  trait OffsitePixel extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[OffsitePixel] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[OffsitePixel] = js.native
  }
}
