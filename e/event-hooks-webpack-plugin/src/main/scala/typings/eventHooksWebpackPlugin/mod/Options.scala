package typings.eventHooksWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var additionalPass: js.UndefOr[js.Function0[Unit]] = js.native
  var afterCompile: js.UndefOr[js.Function0[Unit]] = js.native
  var afterEmit: js.UndefOr[js.Function0[Unit]] = js.native
  var afterEnvironment: js.UndefOr[js.Function0[Unit]] = js.native
  var afterPlugins: js.UndefOr[js.Function0[Unit]] = js.native
  var afterResolvers: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeCompile: js.UndefOr[js.Function0[Unit]] = js.native
  var beforeRun: js.UndefOr[js.Function0[Unit]] = js.native
  var compilation: js.UndefOr[js.Function0[Unit]] = js.native
  var compile: js.UndefOr[js.Function0[Unit]] = js.native
  var contextModuleFactory: js.UndefOr[js.Function0[Unit]] = js.native
  var done: js.UndefOr[js.Function0[Unit]] = js.native
  var emit: js.UndefOr[js.Function0[Unit]] = js.native
  var entryOption: js.UndefOr[js.Function0[Unit]] = js.native
  var environment: js.UndefOr[js.Function0[Unit]] = js.native
  var failed: js.UndefOr[js.Function0[Unit]] = js.native
  var invalid: js.UndefOr[js.Function0[Unit]] = js.native
  var make: js.UndefOr[js.Function0[Unit]] = js.native
  var normalModuleFactory: js.UndefOr[js.Function0[Unit]] = js.native
  var run: js.UndefOr[js.Function0[Unit]] = js.native
  var shouldEmit: js.UndefOr[js.Function0[Unit]] = js.native
  var thisCompilation: js.UndefOr[js.Function0[Unit]] = js.native
  var watchClose: js.UndefOr[js.Function0[Unit]] = js.native
  var watchRun: js.UndefOr[js.Function0[Unit]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setAdditionalPass(value: () => Unit): Self = this.set("additionalPass", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAdditionalPass: Self = this.set("additionalPass", js.undefined)
    @scala.inline
    def setAfterCompile(value: () => Unit): Self = this.set("afterCompile", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterCompile: Self = this.set("afterCompile", js.undefined)
    @scala.inline
    def setAfterEmit(value: () => Unit): Self = this.set("afterEmit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterEmit: Self = this.set("afterEmit", js.undefined)
    @scala.inline
    def setAfterEnvironment(value: () => Unit): Self = this.set("afterEnvironment", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterEnvironment: Self = this.set("afterEnvironment", js.undefined)
    @scala.inline
    def setAfterPlugins(value: () => Unit): Self = this.set("afterPlugins", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterPlugins: Self = this.set("afterPlugins", js.undefined)
    @scala.inline
    def setAfterResolvers(value: () => Unit): Self = this.set("afterResolvers", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterResolvers: Self = this.set("afterResolvers", js.undefined)
    @scala.inline
    def setBeforeCompile(value: () => Unit): Self = this.set("beforeCompile", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeCompile: Self = this.set("beforeCompile", js.undefined)
    @scala.inline
    def setBeforeRun(value: () => Unit): Self = this.set("beforeRun", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeRun: Self = this.set("beforeRun", js.undefined)
    @scala.inline
    def setCompilation(value: () => Unit): Self = this.set("compilation", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCompilation: Self = this.set("compilation", js.undefined)
    @scala.inline
    def setCompile(value: () => Unit): Self = this.set("compile", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCompile: Self = this.set("compile", js.undefined)
    @scala.inline
    def setContextModuleFactory(value: () => Unit): Self = this.set("contextModuleFactory", js.Any.fromFunction0(value))
    @scala.inline
    def deleteContextModuleFactory: Self = this.set("contextModuleFactory", js.undefined)
    @scala.inline
    def setDone(value: () => Unit): Self = this.set("done", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    @scala.inline
    def setEmit(value: () => Unit): Self = this.set("emit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteEmit: Self = this.set("emit", js.undefined)
    @scala.inline
    def setEntryOption(value: () => Unit): Self = this.set("entryOption", js.Any.fromFunction0(value))
    @scala.inline
    def deleteEntryOption: Self = this.set("entryOption", js.undefined)
    @scala.inline
    def setEnvironment(value: () => Unit): Self = this.set("environment", js.Any.fromFunction0(value))
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setFailed(value: () => Unit): Self = this.set("failed", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFailed: Self = this.set("failed", js.undefined)
    @scala.inline
    def setInvalid(value: () => Unit): Self = this.set("invalid", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
    @scala.inline
    def setMake(value: () => Unit): Self = this.set("make", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMake: Self = this.set("make", js.undefined)
    @scala.inline
    def setNormalModuleFactory(value: () => Unit): Self = this.set("normalModuleFactory", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNormalModuleFactory: Self = this.set("normalModuleFactory", js.undefined)
    @scala.inline
    def setRun(value: () => Unit): Self = this.set("run", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
    @scala.inline
    def setShouldEmit(value: () => Unit): Self = this.set("shouldEmit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteShouldEmit: Self = this.set("shouldEmit", js.undefined)
    @scala.inline
    def setThisCompilation(value: () => Unit): Self = this.set("thisCompilation", js.Any.fromFunction0(value))
    @scala.inline
    def deleteThisCompilation: Self = this.set("thisCompilation", js.undefined)
    @scala.inline
    def setWatchClose(value: () => Unit): Self = this.set("watchClose", js.Any.fromFunction0(value))
    @scala.inline
    def deleteWatchClose: Self = this.set("watchClose", js.undefined)
    @scala.inline
    def setWatchRun(value: () => Unit): Self = this.set("watchRun", js.Any.fromFunction0(value))
    @scala.inline
    def deleteWatchRun: Self = this.set("watchRun", js.undefined)
  }
  
}

