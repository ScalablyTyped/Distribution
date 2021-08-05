package typings.elasticElasticsearch.anon

import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Url extends StObject {
  
  var url: URL_
}
object Url {
  
  inline def apply(url: URL_): Url = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
  
  extension [Self <: Url](x: Self) {
    
    inline def setUrl(value: URL_): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
