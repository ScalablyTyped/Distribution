package typings.eggCore.mod

import typings.eggCore.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileLoaderOption extends js.Object {
  
  /** determine whether invoke when exports is function */
  var call: js.UndefOr[Boolean] = js.native
  
  /** set property's case when converting a filepath to property list. */
  var caseStyle: js.UndefOr[String | (js.Function1[/* str */ String, js.Array[String]])] = js.native
  
  /** directories to be loaded */
  var directory: String | js.Array[String] = js.native
  
  /** a function that filter the exports which can be loaded */
  var filter: js.UndefOr[js.Function1[/* obj */ js.Object, Boolean]] = js.native
  
  /** ignore the files when load, support glob */
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  
  /** custom file exports, receive two parameters, first is the inject object(if not js file, will be content buffer), second is an `options` object that contain `path` */
  var initializer: js.UndefOr[js.Function2[/* obj */ js.Object, /* options */ Path, _]] = js.native
  
  /** an object that be the argument when invoke the function */
  var inject: js.UndefOr[js.Object] = js.native
  
  /** match the files when load, support glob, default to all js files */
  var `match`: js.UndefOr[String | js.Array[String]] = js.native
  
  /** determine whether override the property when get the same name */
  var `override`: js.UndefOr[Boolean] = js.native
  
  /** attach the target object from loaded files */
  var target: js.Object = js.native
}
object FileLoaderOption {
  
  @scala.inline
  def apply(directory: String | js.Array[String], target: js.Object): FileLoaderOption = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileLoaderOption]
  }
  
  @scala.inline
  implicit class FileLoaderOptionOps[Self <: FileLoaderOption] (val x: Self) extends AnyVal {
    
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
    def setDirectoryVarargs(value: String*): Self = this.set("directory", js.Array(value :_*))
    
    @scala.inline
    def setDirectory(value: String | js.Array[String]): Self = this.set("directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Object): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCall(value: Boolean): Self = this.set("call", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCall: Self = this.set("call", js.undefined)
    
    @scala.inline
    def setCaseStyleFunction1(value: /* str */ String => js.Array[String]): Self = this.set("caseStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCaseStyle(value: String | (js.Function1[/* str */ String, js.Array[String]])): Self = this.set("caseStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseStyle: Self = this.set("caseStyle", js.undefined)
    
    @scala.inline
    def setFilter(value: /* obj */ js.Object => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    
    @scala.inline
    def setIgnore(value: String | js.Array[String]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setInitializer(value: (/* obj */ js.Object, /* options */ Path) => _): Self = this.set("initializer", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInitializer: Self = this.set("initializer", js.undefined)
    
    @scala.inline
    def setInject(value: js.Object): Self = this.set("inject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInject: Self = this.set("inject", js.undefined)
    
    @scala.inline
    def setMatchVarargs(value: String*): Self = this.set("match", js.Array(value :_*))
    
    @scala.inline
    def setMatch(value: String | js.Array[String]): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    
    @scala.inline
    def setOverride(value: Boolean): Self = this.set("override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverride: Self = this.set("override", js.undefined)
  }
}
