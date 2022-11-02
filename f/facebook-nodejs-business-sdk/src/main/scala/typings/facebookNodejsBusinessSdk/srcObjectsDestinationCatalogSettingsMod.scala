package typings.facebookNodejsBusinessSdk

import typings.facebookNodejsBusinessSdk.srcAbstractCrudObjectMod.AbstractCrudObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsDestinationCatalogSettingsMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/destination-catalog-settings", JSImport.Default)
  @js.native
  open class default () extends DestinationCatalogSettings
  
  @js.native
  trait DestinationCatalogSettings extends AbstractCrudObject {
    
    def get(fields: js.Array[String]): js.Promise[DestinationCatalogSettings] = js.native
    def get(fields: js.Array[String], params: Record[String, Any]): js.Promise[DestinationCatalogSettings] = js.native
  }
}
