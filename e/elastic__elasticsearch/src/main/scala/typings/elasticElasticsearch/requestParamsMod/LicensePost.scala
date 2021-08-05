package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicensePost[T]
  extends StObject
     with Generic {
  
  var acknowledge: js.UndefOr[Boolean] = js.undefined
  
  var body: js.UndefOr[T] = js.undefined
}
object LicensePost {
  
  inline def apply[T](): LicensePost[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicensePost[T]]
  }
  
  extension [Self <: LicensePost[?], T](x: Self & LicensePost[T]) {
    
    inline def setAcknowledge(value: Boolean): Self = StObject.set(x, "acknowledge", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgeUndefined: Self = StObject.set(x, "acknowledge", js.undefined)
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
