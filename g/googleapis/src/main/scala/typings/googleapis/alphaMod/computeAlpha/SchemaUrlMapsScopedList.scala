package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUrlMapsScopedList extends StObject {
  
  /**
    * A list of UrlMaps contained in this scope.
    */
  var urlMaps: js.UndefOr[js.Array[SchemaUrlMap]] = js.native
  
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}
object SchemaUrlMapsScopedList {
  
  @scala.inline
  def apply(): SchemaUrlMapsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapsScopedList]
  }
  
  @scala.inline
  implicit class SchemaUrlMapsScopedListMutableBuilder[Self <: SchemaUrlMapsScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrlMaps(value: js.Array[SchemaUrlMap]): Self = StObject.set(x, "urlMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlMapsUndefined: Self = StObject.set(x, "urlMaps", js.undefined)
    
    @scala.inline
    def setUrlMapsVarargs(value: SchemaUrlMap*): Self = StObject.set(x, "urlMaps", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
