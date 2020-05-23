package typings.globWatcher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions extends js.Object {
  /**
    * If relying upon the [`fs.Stats`](http://nodejs.org/api/fs.html#fs_class_fs_stats) object that
    * may get passed with `add`, `addDir`, and `change` events, set this to `true` to ensure it is
    * provided even in cases where it wasn't already available from the underlying watch events.
    */
  var alwaysStat: js.UndefOr[Boolean] = js.undefined
  /**
    * `true` if `useFsEvents` and `usePolling` are `false`). Automatically filters out artifacts
    * that occur when using editors that use "atomic writes" instead of writing directly to the
    * source file. If a file is re-added within 100 ms of being deleted, Chokidar emits a `change`
    * event rather than `unlink` then `add`. If the default of 100 ms does not work well for you,
    * you can override it by setting `atomic` to a custom value, in milliseconds.
    */
  var atomic: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * can be set to an object in order to adjust timing params:
    */
  var awaitWriteFinish: js.UndefOr[AwaitWriteFinishOptions | Boolean] = js.undefined
  /**
    * Interval of file system polling for binary files. ([see list of binary extensions](https://gi
    * thub.com/sindresorhus/binary-extensions/blob/master/binary-extensions.json))
    */
  var binaryInterval: js.UndefOr[Double] = js.undefined
  /**
    * The base directory from which watch `paths` are to be derived. Paths emitted with events will
    * be relative to this.
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * The delay to wait before triggering the fn.
    * Useful for waiting on many changes before doing the work on changed files, e.g. find-and-replace on many files.
    * @default 200
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * If set, limits how many levels of subdirectories will be traversed.
    */
  var depth: js.UndefOr[Double] = js.undefined
  /**
    *  If set to true then the strings passed to .watch() and .add() are treated as literal path
    *  names, even if they look like globs. Default: false.
    */
  var disableGlobbing: js.UndefOr[Boolean] = js.undefined
  /**
    * An event name or array of event names to listen for. Useful if you only need to watch specific events.
    * @default [ 'add', 'change', 'unlink' ]
    */
  var events: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * When `false`, only the symlinks themselves will be watched for changes instead of following
    * the link references and bubbling events through the link's path.
    */
  var followSymlinks: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to `false` then `add`/`addDir` events are also emitted for matching paths while
    * instantiating the watching as chokidar discovers these file paths (before the `ready` event).
    */
  var ignoreInitial: js.UndefOr[Boolean] = js.undefined
  /**
    *  Indicates whether to watch files that don't have read permissions if possible. If watching
    *  fails due to `EPERM` or `EACCES` with this set to `true`, the errors will be suppressed
    *  silently.
    */
  var ignorePermissionErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * ([anymatch](https://github.com/es128/anymatch)-compatible definition) Defines files/paths to
    * be ignored. The whole relative or absolute path is tested, not just filename. If a function
    * with two arguments is provided, it gets called twice per path - once with a single argument
    * (the path), second time with two arguments (the path and the
    * [`fs.Stats`](http://nodejs.org/api/fs.html#fs_class_fs_stats) object of that path).
    */
  var ignored: js.UndefOr[js.Any] = js.undefined
  /**
    * Interval of file system polling.
    */
  var interval: js.UndefOr[Double] = js.undefined
  // copied from https://github.com/paulmillr/chokidar/blob/5e09c85ea04ffb7fd9cdb829892540e93ce63553/types/index.d.ts
  /**
    * Indicates whether the process should continue to run as long as files are being watched. If
    * set to `false` when using `fsevents` to watch, no more events will be emitted after `ready`,
    * even if the process continues to run.
    */
  var persistent: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not a file change should queue the fn execution if the fn is already running. Useful for a long running fn.
    * @default true
    */
  var queue: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to use the `fsevents` watching interface if available. When set to `true` explicitly
    * and `fsevents` is available this supercedes the `usePolling` setting. When set to `false` on
    * OS X, `usePolling: true` becomes the default.
    */
  var useFsEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to use fs.watchFile (backed by polling), or fs.watch. If polling leads to high CPU
    * utilization, consider setting this to `false`. It is typically necessary to **set this to
    * `true` to successfully watch files over a network**, and it may be necessary to successfully
    * watch files in other non-standard situations. Setting to `true` explicitly on OS X overrides
    * the `useFsEvents` default.
    */
  var usePolling: js.UndefOr[Boolean] = js.undefined
}

object WatchOptions {
  @scala.inline
  def apply(
    alwaysStat: js.UndefOr[Boolean] = js.undefined,
    atomic: Boolean | Double = null,
    awaitWriteFinish: AwaitWriteFinishOptions | Boolean = null,
    binaryInterval: js.UndefOr[Double] = js.undefined,
    cwd: String = null,
    delay: js.UndefOr[Double] = js.undefined,
    depth: js.UndefOr[Double] = js.undefined,
    disableGlobbing: js.UndefOr[Boolean] = js.undefined,
    events: String | js.Array[String] = null,
    followSymlinks: js.UndefOr[Boolean] = js.undefined,
    ignoreInitial: js.UndefOr[Boolean] = js.undefined,
    ignorePermissionErrors: js.UndefOr[Boolean] = js.undefined,
    ignored: js.Any = null,
    interval: js.UndefOr[Double] = js.undefined,
    persistent: js.UndefOr[Boolean] = js.undefined,
    queue: js.UndefOr[Boolean] = js.undefined,
    useFsEvents: js.UndefOr[Boolean] = js.undefined,
    usePolling: js.UndefOr[Boolean] = js.undefined
  ): WatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysStat)) __obj.updateDynamic("alwaysStat")(alwaysStat.get.asInstanceOf[js.Any])
    if (atomic != null) __obj.updateDynamic("atomic")(atomic.asInstanceOf[js.Any])
    if (awaitWriteFinish != null) __obj.updateDynamic("awaitWriteFinish")(awaitWriteFinish.asInstanceOf[js.Any])
    if (!js.isUndefined(binaryInterval)) __obj.updateDynamic("binaryInterval")(binaryInterval.get.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableGlobbing)) __obj.updateDynamic("disableGlobbing")(disableGlobbing.get.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(followSymlinks)) __obj.updateDynamic("followSymlinks")(followSymlinks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreInitial)) __obj.updateDynamic("ignoreInitial")(ignoreInitial.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePermissionErrors)) __obj.updateDynamic("ignorePermissionErrors")(ignorePermissionErrors.get.asInstanceOf[js.Any])
    if (ignored != null) __obj.updateDynamic("ignored")(ignored.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useFsEvents)) __obj.updateDynamic("useFsEvents")(useFsEvents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usePolling)) __obj.updateDynamic("usePolling")(usePolling.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchOptions]
  }
}

