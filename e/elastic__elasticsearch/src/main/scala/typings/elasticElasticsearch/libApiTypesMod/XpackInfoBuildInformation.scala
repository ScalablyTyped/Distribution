package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackInfoBuildInformation extends StObject {
  
  var date: DateTime
  
  var hash: String
}
object XpackInfoBuildInformation {
  
  inline def apply(date: DateTime, hash: String): XpackInfoBuildInformation = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackInfoBuildInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackInfoBuildInformation] (val x: Self) extends AnyVal {
    
    inline def setDate(value: DateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
  }
}
