package typings.googleapis.anon

import typings.googleapis.v3Mod.analyticsV3.SchemaWebPropertyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebPropertyRef extends StObject {
  
  var webPropertyRef: js.UndefOr[SchemaWebPropertyRef] = js.undefined
}
object WebPropertyRef {
  
  @scala.inline
  def apply(): WebPropertyRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebPropertyRef]
  }
  
  @scala.inline
  implicit class WebPropertyRefMutableBuilder[Self <: WebPropertyRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebPropertyRef(value: SchemaWebPropertyRef): Self = StObject.set(x, "webPropertyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyRefUndefined: Self = StObject.set(x, "webPropertyRef", js.undefined)
  }
}
