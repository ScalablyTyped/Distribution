package typings.fsExtra.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyOptions extends StObject {
  
  var dereference: js.UndefOr[Boolean] = js.undefined
  
  var errorOnExist: js.UndefOr[Boolean] = js.undefined
  
  var filter: js.UndefOr[CopyFilterSync | CopyFilterAsync] = js.undefined
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
  
  var preserveTimestamps: js.UndefOr[Boolean] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object CopyOptions {
  
  @scala.inline
  def apply(): CopyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptions]
  }
  
  @scala.inline
  implicit class CopyOptionsMutableBuilder[Self <: CopyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDereference(value: Boolean): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDereferenceUndefined: Self = StObject.set(x, "dereference", js.undefined)
    
    @scala.inline
    def setErrorOnExist(value: Boolean): Self = StObject.set(x, "errorOnExist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorOnExistUndefined: Self = StObject.set(x, "errorOnExist", js.undefined)
    
    @scala.inline
    def setFilter(value: (/* src */ String, /* dest */ String) => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    @scala.inline
    def setPreserveTimestamps(value: Boolean): Self = StObject.set(x, "preserveTimestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveTimestampsUndefined: Self = StObject.set(x, "preserveTimestamps", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
