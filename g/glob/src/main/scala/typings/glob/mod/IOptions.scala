package typings.glob.mod

import org.scalablytyped.runtime.StringDictionary
import typings.glob.anon.IsDirectory
import typings.glob.globBooleans.`false`
import typings.glob.globStrings.DIR
import typings.glob.globStrings.FILE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOptions
  extends typings.minimatch.mod.IOptions {
  
  var absolute: js.UndefOr[Boolean] = js.native
  
  var cache: js.UndefOr[StringDictionary[Boolean | DIR | FILE | js.Array[String]]] = js.native
  
  var cwd: js.UndefOr[String] = js.native
  
  var follow: js.UndefOr[Boolean] = js.native
  
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  
  var mark: js.UndefOr[Boolean] = js.native
  
  var nodir: js.UndefOr[Boolean] = js.native
  
  var nomount: js.UndefOr[Boolean] = js.native
  
  var nosort: js.UndefOr[Boolean] = js.native
  
  var nounique: js.UndefOr[Boolean] = js.native
  
  var realpath: js.UndefOr[Boolean] = js.native
  
  var realpathCache: js.UndefOr[StringDictionary[String]] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
  
  var stat: js.UndefOr[Boolean] = js.native
  
  var statCache: js.UndefOr[StringDictionary[js.UndefOr[`false` | IsDirectory]]] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
  
  var symlinks: js.UndefOr[StringDictionary[js.UndefOr[Boolean]]] = js.native
  
  var sync: js.UndefOr[Boolean] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setAbsolute(value: Boolean): Self = this.set("absolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolute: Self = this.set("absolute", js.undefined)
    
    @scala.inline
    def setCache(value: StringDictionary[Boolean | DIR | FILE | js.Array[String]]): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setFollow(value: Boolean): Self = this.set("follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: String | js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setMark(value: Boolean): Self = this.set("mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMark: Self = this.set("mark", js.undefined)
    
    @scala.inline
    def setNodir(value: Boolean): Self = this.set("nodir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodir: Self = this.set("nodir", js.undefined)
    
    @scala.inline
    def setNomount(value: Boolean): Self = this.set("nomount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNomount: Self = this.set("nomount", js.undefined)
    
    @scala.inline
    def setNosort(value: Boolean): Self = this.set("nosort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNosort: Self = this.set("nosort", js.undefined)
    
    @scala.inline
    def setNounique(value: Boolean): Self = this.set("nounique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNounique: Self = this.set("nounique", js.undefined)
    
    @scala.inline
    def setRealpath(value: Boolean): Self = this.set("realpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealpath: Self = this.set("realpath", js.undefined)
    
    @scala.inline
    def setRealpathCache(value: StringDictionary[String]): Self = this.set("realpathCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealpathCache: Self = this.set("realpathCache", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setStat(value: Boolean): Self = this.set("stat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStat: Self = this.set("stat", js.undefined)
    
    @scala.inline
    def setStatCache(value: StringDictionary[js.UndefOr[`false` | IsDirectory]]): Self = this.set("statCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatCache: Self = this.set("statCache", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setSymlinks(value: StringDictionary[js.UndefOr[Boolean]]): Self = this.set("symlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymlinks: Self = this.set("symlinks", js.undefined)
    
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
  }
}
