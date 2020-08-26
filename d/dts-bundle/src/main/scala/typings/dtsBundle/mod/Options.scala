package typings.dtsBundle.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var baseDir: js.UndefOr[String] = js.native
  var emitOnIncludedFileNotFound: js.UndefOr[Boolean] = js.native
  var emitOnNoIncludedFileNotFound: js.UndefOr[Boolean] = js.native
  var exclude: js.UndefOr[RegExp | (js.Function2[/* file */ String, /* external */ Boolean, Boolean])] = js.native
  var externals: js.UndefOr[Boolean] = js.native
  var headerPath: js.UndefOr[String] = js.native
  var headerText: js.UndefOr[String] = js.native
  var indent: js.UndefOr[String] = js.native
  var main: String = js.native
  var name: String = js.native
  var newLine: js.UndefOr[String] = js.native
  var out: js.UndefOr[String] = js.native
  var outputAsModuleFolder: js.UndefOr[Boolean] = js.native
  var prefix: js.UndefOr[String] = js.native
  var referenceExternals: js.UndefOr[Boolean] = js.native
  var removeSource: js.UndefOr[Boolean] = js.native
  var separator: js.UndefOr[String] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(main: String, name: String): Options = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setMain(value: String): Self = this.set("main", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseDir(value: String): Self = this.set("baseDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseDir: Self = this.set("baseDir", js.undefined)
    @scala.inline
    def setEmitOnIncludedFileNotFound(value: Boolean): Self = this.set("emitOnIncludedFileNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitOnIncludedFileNotFound: Self = this.set("emitOnIncludedFileNotFound", js.undefined)
    @scala.inline
    def setEmitOnNoIncludedFileNotFound(value: Boolean): Self = this.set("emitOnNoIncludedFileNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitOnNoIncludedFileNotFound: Self = this.set("emitOnNoIncludedFileNotFound", js.undefined)
    @scala.inline
    def setExcludeFunction2(value: (/* file */ String, /* external */ Boolean) => Boolean): Self = this.set("exclude", js.Any.fromFunction2(value))
    @scala.inline
    def setExclude(value: RegExp | (js.Function2[/* file */ String, /* external */ Boolean, Boolean])): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setExternals(value: Boolean): Self = this.set("externals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternals: Self = this.set("externals", js.undefined)
    @scala.inline
    def setHeaderPath(value: String): Self = this.set("headerPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderPath: Self = this.set("headerPath", js.undefined)
    @scala.inline
    def setHeaderText(value: String): Self = this.set("headerText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderText: Self = this.set("headerText", js.undefined)
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setNewLine(value: String): Self = this.set("newLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewLine: Self = this.set("newLine", js.undefined)
    @scala.inline
    def setOut(value: String): Self = this.set("out", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOut: Self = this.set("out", js.undefined)
    @scala.inline
    def setOutputAsModuleFolder(value: Boolean): Self = this.set("outputAsModuleFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputAsModuleFolder: Self = this.set("outputAsModuleFolder", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setReferenceExternals(value: Boolean): Self = this.set("referenceExternals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceExternals: Self = this.set("referenceExternals", js.undefined)
    @scala.inline
    def setRemoveSource(value: Boolean): Self = this.set("removeSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveSource: Self = this.set("removeSource", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

