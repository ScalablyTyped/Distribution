package typings.googleGax.iamServiceMod.google.iam.v1

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Policy. */
@js.native
trait IPolicy extends StObject {
  
  /** Policy bindings */
  var bindings: js.UndefOr[js.Array[IBinding] | Null] = js.native
  
  /** Policy etag */
  var etag: js.UndefOr[Uint8Array | Null] = js.native
  
  /** Policy version */
  var version: js.UndefOr[Double | Null] = js.native
}
object IPolicy {
  
  @scala.inline
  def apply(): IPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolicy]
  }
  
  @scala.inline
  implicit class IPolicyMutableBuilder[Self <: IPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindings(value: js.Array[IBinding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsNull: Self = StObject.set(x, "bindings", null)
    
    @scala.inline
    def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    @scala.inline
    def setBindingsVarargs(value: IBinding*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: Uint8Array): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagNull: Self = StObject.set(x, "etag", null)
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = StObject.set(x, "version", null)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
