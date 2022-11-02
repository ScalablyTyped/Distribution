package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsCanvasDynamicSettingMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/canvas-dynamic-setting", JSImport.Default)
  @js.native
  open class default () extends CanvasDynamicSetting
  
  @js.native
  trait CanvasDynamicSetting extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[CanvasDynamicSetting] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[CanvasDynamicSetting] = js.native
  }
}
