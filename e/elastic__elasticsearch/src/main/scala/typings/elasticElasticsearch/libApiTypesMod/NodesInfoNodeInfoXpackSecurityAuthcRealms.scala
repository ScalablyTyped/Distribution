package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoXpackSecurityAuthcRealms extends StObject {
  
  var file: js.UndefOr[Record[String, NodesInfoNodeInfoXpackSecurityAuthcRealmsStatus]] = js.undefined
  
  var native: js.UndefOr[Record[String, NodesInfoNodeInfoXpackSecurityAuthcRealmsStatus]] = js.undefined
  
  var pki: js.UndefOr[Record[String, NodesInfoNodeInfoXpackSecurityAuthcRealmsStatus]] = js.undefined
}
object NodesInfoNodeInfoXpackSecurityAuthcRealms {
  
  inline def apply(): NodesInfoNodeInfoXpackSecurityAuthcRealms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesInfoNodeInfoXpackSecurityAuthcRealms]
  }
  
  extension [Self <: NodesInfoNodeInfoXpackSecurityAuthcRealms](x: Self) {
    
    inline def setFile(value: Record[String, NodesInfoNodeInfoXpackSecurityAuthcRealmsStatus]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setNative(value: Record[String, NodesInfoNodeInfoXpackSecurityAuthcRealmsStatus]): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
    
    inline def setPki(value: Record[String, NodesInfoNodeInfoXpackSecurityAuthcRealmsStatus]): Self = StObject.set(x, "pki", value.asInstanceOf[js.Any])
    
    inline def setPkiUndefined: Self = StObject.set(x, "pki", js.undefined)
  }
}
