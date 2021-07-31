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
  
  @scala.inline
  def apply[T](): LicensePost[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicensePost[T]]
  }
  
  @scala.inline
  implicit class LicensePostMutableBuilder[Self <: LicensePost[?], T] (val x: Self & LicensePost[T]) extends AnyVal {
    
    @scala.inline
    def setAcknowledge(value: Boolean): Self = StObject.set(x, "acknowledge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcknowledgeUndefined: Self = StObject.set(x, "acknowledge", js.undefined)
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
