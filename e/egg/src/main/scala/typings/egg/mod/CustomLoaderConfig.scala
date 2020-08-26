package typings.egg.mod

import typings.egg.eggStrings.app
import typings.egg.eggStrings.ctx
import typings.eggCore.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent egg.egg.RemoveSpecProp<egg-core.egg-core.FileLoaderOption, 'inject' | 'target'> */
@js.native
trait CustomLoaderConfig extends js.Object {
  var call: js.UndefOr[Boolean] = js.native
  var caseStyle: js.UndefOr[String | (js.Function1[/* str */ String, js.Array[String]])] = js.native
  var directory: String | js.Array[String] = js.native
  var filter: js.UndefOr[js.Function1[/* obj */ js.Object, Boolean]] = js.native
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  var initializer: js.UndefOr[js.Function2[/* obj */ js.Object, /* options */ Path, _]] = js.native
  /**
    * an object you wanner load to, value can only be 'ctx' or 'app'. default to app
    */
  var inject: js.UndefOr[ctx | app] = js.native
  /**
    * whether need to load files in plugins or framework, default to false
    */
  var loadunit: js.UndefOr[Boolean] = js.native
  var `match`: js.UndefOr[String | js.Array[String]] = js.native
  var `override`: js.UndefOr[Boolean] = js.native
}

object CustomLoaderConfig {
  @scala.inline
  def apply(directory: String | js.Array[String]): CustomLoaderConfig = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLoaderConfig]
  }
  @scala.inline
  implicit class CustomLoaderConfigOps[Self <: CustomLoaderConfig] (val x: Self) extends AnyVal {
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
    def setInject(value: ctx | app): Self = this.set("inject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInject: Self = this.set("inject", js.undefined)
    @scala.inline
    def setLoadunit(value: Boolean): Self = this.set("loadunit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadunit: Self = this.set("loadunit", js.undefined)
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

