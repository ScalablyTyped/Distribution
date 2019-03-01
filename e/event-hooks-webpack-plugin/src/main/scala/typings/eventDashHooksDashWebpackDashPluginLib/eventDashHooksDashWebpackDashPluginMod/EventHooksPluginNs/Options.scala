package typings
package eventDashHooksDashWebpackDashPluginLib.eventDashHooksDashWebpackDashPluginMod.EventHooksPluginNs

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
    additionalPass: js.Function0[scala.Unit] = null,
    afterCompile: js.Function0[scala.Unit] = null,
    afterEmit: js.Function0[scala.Unit] = null,
    afterEnvironment: js.Function0[scala.Unit] = null,
    afterPlugins: js.Function0[scala.Unit] = null,
    afterResolvers: js.Function0[scala.Unit] = null,
    beforeCompile: js.Function0[scala.Unit] = null,
    beforeRun: js.Function0[scala.Unit] = null,
    compilation: js.Function0[scala.Unit] = null,
    compile: js.Function0[scala.Unit] = null,
    contextModuleFactory: js.Function0[scala.Unit] = null,
    done: js.Function0[scala.Unit] = null,
    emit: js.Function0[scala.Unit] = null,
    entryOption: js.Function0[scala.Unit] = null,
    environment: js.Function0[scala.Unit] = null,
    failed: js.Function0[scala.Unit] = null,
    invalid: js.Function0[scala.Unit] = null,
    make: js.Function0[scala.Unit] = null,
    normalModuleFactory: js.Function0[scala.Unit] = null,
    run: js.Function0[scala.Unit] = null,
    shouldEmit: js.Function0[scala.Unit] = null,
    thisCompilation: js.Function0[scala.Unit] = null,
    watchClose: js.Function0[scala.Unit] = null,
    watchRun: js.Function0[scala.Unit] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (additionalPass != null) __obj.updateDynamic("additionalPass")(additionalPass)
    if (afterCompile != null) __obj.updateDynamic("afterCompile")(afterCompile)
    if (afterEmit != null) __obj.updateDynamic("afterEmit")(afterEmit)
    if (afterEnvironment != null) __obj.updateDynamic("afterEnvironment")(afterEnvironment)
    if (afterPlugins != null) __obj.updateDynamic("afterPlugins")(afterPlugins)
    if (afterResolvers != null) __obj.updateDynamic("afterResolvers")(afterResolvers)
    if (beforeCompile != null) __obj.updateDynamic("beforeCompile")(beforeCompile)
    if (beforeRun != null) __obj.updateDynamic("beforeRun")(beforeRun)
    if (compilation != null) __obj.updateDynamic("compilation")(compilation)
    if (compile != null) __obj.updateDynamic("compile")(compile)
    if (contextModuleFactory != null) __obj.updateDynamic("contextModuleFactory")(contextModuleFactory)
    if (done != null) __obj.updateDynamic("done")(done)
    if (emit != null) __obj.updateDynamic("emit")(emit)
    if (entryOption != null) __obj.updateDynamic("entryOption")(entryOption)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (failed != null) __obj.updateDynamic("failed")(failed)
    if (invalid != null) __obj.updateDynamic("invalid")(invalid)
    if (make != null) __obj.updateDynamic("make")(make)
    if (normalModuleFactory != null) __obj.updateDynamic("normalModuleFactory")(normalModuleFactory)
    if (run != null) __obj.updateDynamic("run")(run)
    if (shouldEmit != null) __obj.updateDynamic("shouldEmit")(shouldEmit)
    if (thisCompilation != null) __obj.updateDynamic("thisCompilation")(thisCompilation)
    if (watchClose != null) __obj.updateDynamic("watchClose")(watchClose)
    if (watchRun != null) __obj.updateDynamic("watchRun")(watchRun)
    __obj.asInstanceOf[Options]
  }
}

