package typings.devtoolsProtocol.mod.Protocol.IndexedDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMetadataResponse extends StObject {
  
  /**
    * the entries count
    */
  var entriesCount: Double
  
  /**
    * the current value of key generator, to become the next inserted
    * key into the object store. Valid if objectStore.autoIncrement
    * is true.
    */
  var keyGeneratorValue: Double
}
object GetMetadataResponse {
  
  inline def apply(entriesCount: Double, keyGeneratorValue: Double): GetMetadataResponse = {
    val __obj = js.Dynamic.literal(entriesCount = entriesCount.asInstanceOf[js.Any], keyGeneratorValue = keyGeneratorValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetadataResponse]
  }
  
  extension [Self <: GetMetadataResponse](x: Self) {
    
    inline def setEntriesCount(value: Double): Self = StObject.set(x, "entriesCount", value.asInstanceOf[js.Any])
    
    inline def setKeyGeneratorValue(value: Double): Self = StObject.set(x, "keyGeneratorValue", value.asInstanceOf[js.Any])
  }
}
