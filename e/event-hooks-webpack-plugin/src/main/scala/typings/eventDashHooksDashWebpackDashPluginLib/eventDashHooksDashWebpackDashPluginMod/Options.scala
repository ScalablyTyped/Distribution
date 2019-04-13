package typings
package eventDashHooksDashWebpackDashPluginLib.eventDashHooksDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var additionalPass: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterCompile: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterEmit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterEnvironment: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterPlugins: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterResolvers: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var beforeCompile: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var beforeRun: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var compilation: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var compile: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var contextModuleFactory: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var done: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var emit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var entryOption: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var environment: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var failed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var invalid: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var make: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var normalModuleFactory: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var run: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var shouldEmit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var thisCompilation: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var watchClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var watchRun: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    additionalPass: () => scala.Unit = null,
    afterCompile: () => scala.Unit = null,
    afterEmit: () => scala.Unit = null,
    afterEnvironment: () => scala.Unit = null,
    afterPlugins: () => scala.Unit = null,
    afterResolvers: () => scala.Unit = null,
    beforeCompile: () => scala.Unit = null,
    beforeRun: () => scala.Unit = null,
    compilation: () => scala.Unit = null,
    compile: () => scala.Unit = null,
    contextModuleFactory: () => scala.Unit = null,
    done: () => scala.Unit = null,
    emit: () => scala.Unit = null,
    entryOption: () => scala.Unit = null,
    environment: () => scala.Unit = null,
    failed: () => scala.Unit = null,
    invalid: () => scala.Unit = null,
    make: () => scala.Unit = null,
    normalModuleFactory: () => scala.Unit = null,
    run: () => scala.Unit = null,
    shouldEmit: () => scala.Unit = null,
    thisCompilation: () => scala.Unit = null,
    watchClose: () => scala.Unit = null,
    watchRun: () => scala.Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (additionalPass != null) __obj.updateDynamic("additionalPass")(js.Any.fromFunction0(additionalPass))
    if (afterCompile != null) __obj.updateDynamic("afterCompile")(js.Any.fromFunction0(afterCompile))
    if (afterEmit != null) __obj.updateDynamic("afterEmit")(js.Any.fromFunction0(afterEmit))
    if (afterEnvironment != null) __obj.updateDynamic("afterEnvironment")(js.Any.fromFunction0(afterEnvironment))
    if (afterPlugins != null) __obj.updateDynamic("afterPlugins")(js.Any.fromFunction0(afterPlugins))
    if (afterResolvers != null) __obj.updateDynamic("afterResolvers")(js.Any.fromFunction0(afterResolvers))
    if (beforeCompile != null) __obj.updateDynamic("beforeCompile")(js.Any.fromFunction0(beforeCompile))
    if (beforeRun != null) __obj.updateDynamic("beforeRun")(js.Any.fromFunction0(beforeRun))
    if (compilation != null) __obj.updateDynamic("compilation")(js.Any.fromFunction0(compilation))
    if (compile != null) __obj.updateDynamic("compile")(js.Any.fromFunction0(compile))
    if (contextModuleFactory != null) __obj.updateDynamic("contextModuleFactory")(js.Any.fromFunction0(contextModuleFactory))
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction0(done))
    if (emit != null) __obj.updateDynamic("emit")(js.Any.fromFunction0(emit))
    if (entryOption != null) __obj.updateDynamic("entryOption")(js.Any.fromFunction0(entryOption))
    if (environment != null) __obj.updateDynamic("environment")(js.Any.fromFunction0(environment))
    if (failed != null) __obj.updateDynamic("failed")(js.Any.fromFunction0(failed))
    if (invalid != null) __obj.updateDynamic("invalid")(js.Any.fromFunction0(invalid))
    if (make != null) __obj.updateDynamic("make")(js.Any.fromFunction0(make))
    if (normalModuleFactory != null) __obj.updateDynamic("normalModuleFactory")(js.Any.fromFunction0(normalModuleFactory))
    if (run != null) __obj.updateDynamic("run")(js.Any.fromFunction0(run))
    if (shouldEmit != null) __obj.updateDynamic("shouldEmit")(js.Any.fromFunction0(shouldEmit))
    if (thisCompilation != null) __obj.updateDynamic("thisCompilation")(js.Any.fromFunction0(thisCompilation))
    if (watchClose != null) __obj.updateDynamic("watchClose")(js.Any.fromFunction0(watchClose))
    if (watchRun != null) __obj.updateDynamic("watchRun")(js.Any.fromFunction0(watchRun))
    __obj.asInstanceOf[Options]
  }
}

