package typings.glob.mod

import org.scalablytyped.runtime.StringDictionary
import typings.glob.anon.IsDirectory
import typings.glob.globBooleans.`false`
import typings.glob.globStrings.DIR
import typings.glob.globStrings.FILE
import typings.minimatch.mod.IMinimatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGlobBase extends js.Object {
  
  var aborted: Boolean = js.native
  
  var cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]] = js.native
  
  var found: js.Array[String] = js.native
  
  var minimatch: IMinimatch = js.native
  
  var options: IOptions = js.native
  
  var realpathCache: StringDictionary[String] = js.native
  
  var statCache: StringDictionary[js.UndefOr[`false` | IsDirectory]] = js.native
  
  var symlinks: StringDictionary[js.UndefOr[Boolean]] = js.native
}
object IGlobBase {
  
  @scala.inline
  def apply(
    aborted: Boolean,
    cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]],
    found: js.Array[String],
    minimatch: IMinimatch,
    options: IOptions,
    realpathCache: StringDictionary[String],
    statCache: StringDictionary[js.UndefOr[`false` | IsDirectory]],
    symlinks: StringDictionary[js.UndefOr[Boolean]]
  ): IGlobBase = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], minimatch = minimatch.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], realpathCache = realpathCache.asInstanceOf[js.Any], statCache = statCache.asInstanceOf[js.Any], symlinks = symlinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGlobBase]
  }
  
  @scala.inline
  implicit class IGlobBaseOps[Self <: IGlobBase] (val x: Self) extends AnyVal {
    
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
    def setAborted(value: Boolean): Self = this.set("aborted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCache(value: StringDictionary[Boolean | DIR | FILE | js.Array[String]]): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoundVarargs(value: String*): Self = this.set("found", js.Array(value :_*))
    
    @scala.inline
    def setFound(value: js.Array[String]): Self = this.set("found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimatch(value: IMinimatch): Self = this.set("minimatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: IOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealpathCache(value: StringDictionary[String]): Self = this.set("realpathCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatCache(value: StringDictionary[js.UndefOr[`false` | IsDirectory]]): Self = this.set("statCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymlinks(value: StringDictionary[js.UndefOr[Boolean]]): Self = this.set("symlinks", value.asInstanceOf[js.Any])
  }
}
