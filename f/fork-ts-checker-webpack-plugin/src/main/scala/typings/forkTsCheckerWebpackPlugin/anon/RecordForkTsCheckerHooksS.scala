package typings.forkTsCheckerWebpackPlugin.anon

import typings.tapable.mod.AsyncSeriesHook
import typings.tapable.mod.SyncHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/hooks.ForkTsCheckerHooks, tapable.tapable.SyncHook<any, any, any> | tapable.tapable.AsyncSeriesHook<any, any, any>> */
trait RecordForkTsCheckerHooksS extends js.Object {
  var cancel: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])
  var done: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])
  var emit: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])
  var receive: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])
  var serviceBeforeStart: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])
  var serviceOutOfMemory: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])
  var serviceStart: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])
  var serviceStartError: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])
  var waiting: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])
}

object RecordForkTsCheckerHooksS {
  @scala.inline
  def apply(
    cancel: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]),
    done: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]),
    emit: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]),
    receive: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]),
    serviceBeforeStart: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]),
    serviceOutOfMemory: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]),
    serviceStart: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]),
    serviceStartError: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _]),
    waiting: (SyncHook[_, _, _]) | (AsyncSeriesHook[_, _, _])
  ): RecordForkTsCheckerHooksS = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], emit = emit.asInstanceOf[js.Any], receive = receive.asInstanceOf[js.Any], serviceBeforeStart = serviceBeforeStart.asInstanceOf[js.Any], serviceOutOfMemory = serviceOutOfMemory.asInstanceOf[js.Any], serviceStart = serviceStart.asInstanceOf[js.Any], serviceStartError = serviceStartError.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordForkTsCheckerHooksS]
  }
}

