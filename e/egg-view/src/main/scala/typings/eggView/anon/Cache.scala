package typings.eggView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cache extends js.Object {
  
  var cache: Boolean = js.native
  
  var defaultExtension: String = js.native
  
  var defaultViewEngine: String = js.native
  
  var mapping: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PlainObject<string> */ js.Any = js.native
  
  var root: String = js.native
}
object Cache {
  
  @scala.inline
  def apply(
    cache: Boolean,
    defaultExtension: String,
    defaultViewEngine: String,
    mapping: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PlainObject<string> */ js.Any,
    root: String
  ): Cache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], defaultExtension = defaultExtension.asInstanceOf[js.Any], defaultViewEngine = defaultViewEngine.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
  
  @scala.inline
  implicit class CacheOps[Self <: Cache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultExtension(value: String): Self = this.set("defaultExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultViewEngine(value: String): Self = this.set("defaultViewEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapping(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PlainObject<string> */ js.Any
    ): Self = this.set("mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
  }
}
