package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /** Base URL of the Source */
  var baseUrl: String
  
  /** File Count provided as SourceData */
  var count: Double
  
  /** Any data provided by this Source */
  var data: js.UndefOr[js.Array[SourceData]] = js.undefined
  
  /** When this Source was added */
  var dateAdded: js.Date
  
  var id: Double
  
  /** Last time this Source was updated */
  var lastUpdated: js.Date
  
  /** Name of the Source */
  var name: String
  
  /** Base URL of the Source */
  var sourceFileUrl: String
}
object Source {
  
  inline def apply(
    baseUrl: String,
    count: Double,
    dateAdded: js.Date,
    id: Double,
    lastUpdated: js.Date,
    name: String,
    sourceFileUrl: String
  ): Source = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dateAdded = dateAdded.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sourceFileUrl = sourceFileUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[SourceData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: SourceData*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDateAdded(value: js.Date): Self = StObject.set(x, "dateAdded", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSourceFileUrl(value: String): Self = StObject.set(x, "sourceFileUrl", value.asInstanceOf[js.Any])
  }
}
