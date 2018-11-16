package typings
package execaLib.execaMod.execaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecaStatic extends js.Object {
  /**
           * Execute a file.
           *
           * Think of this as a mix of `child_process.execFile` and `child_process.spawn`.
           * @returns a `child_process` instance which is enhanced to also be a `Promise` for a result `Object` with `stdout` and `stderr` properties.
           */
  def apply(file: java.lang.String): ExecaChildProcess = js.native
  /**
           * Execute a file.
           *
           * Think of this as a mix of `child_process.execFile` and `child_process.spawn`.
           * @returns a `child_process` instance which is enhanced to also be a `Promise` for a result `Object` with `stdout` and `stderr` properties.
           */
  def apply(file: java.lang.String, args: js.Array[java.lang.String]): ExecaChildProcess = js.native
  /**
           * Execute a file.
           *
           * Think of this as a mix of `child_process.execFile` and `child_process.spawn`.
           * @returns a `child_process` instance which is enhanced to also be a `Promise` for a result `Object` with `stdout` and `stderr` properties.
           */
  def apply(file: java.lang.String, args: js.Array[java.lang.String], options: Options): ExecaChildProcess = js.native
  def apply(file: java.lang.String, options: Options): ExecaChildProcess = js.native
  /**
           * Execute a command through the system shell.
           *
           * Prefer `execa()` whenever possible, as it's both faster and safer.
           * @returns a `child_process` instance which is enhanced to also be a `Promise` for a result `Object` with `stdout` and `stderr` properties.
           */
  def shell(command: java.lang.String): ExecaChildProcess = js.native
  /**
           * Execute a command through the system shell.
           *
           * Prefer `execa()` whenever possible, as it's both faster and safer.
           * @returns a `child_process` instance which is enhanced to also be a `Promise` for a result `Object` with `stdout` and `stderr` properties.
           */
  def shell(command: java.lang.String, options: Options): ExecaChildProcess = js.native
  /**
           * Execute a command synchronously through the system shell.
           *
           * @returns the same result object as `child_process.spawnSync`.
           * @throws an `Error` if the command fails.
           */
  def shellSync(command: java.lang.String): ExecaReturns = js.native
  /**
           * Execute a command synchronously through the system shell.
           *
           * @returns the same result object as `child_process.spawnSync`.
           * @throws an `Error` if the command fails.
           */
  def shellSync(command: java.lang.String, options: Options): ExecaReturns = js.native
  /**
           * Execute a file.
           *
           * Think of this as a mix of `child_process.execFile` and `child_process.spawn`.
           * @returns a `child_process` instance which is enhanced to also be a `Promise` for `stderr`.
           */
  def stderr(file: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  /**
           * Execute a file.
           *
           * Think of this as a mix of `child_process.execFile` and `child_process.spawn`.
           * @returns a `child_process` instance which is enhanced to also be a `Promise` for `stderr`.
           */
  def stderr(file: java.lang.String, args: js.Array[java.lang.String]): stdLib.Promise[java.lang.String] = js.native
  /**
           * Execute a file.
           *
           * Think of this as a mix of `child_process.execFile` and `child_process.spawn`.
           * @returns a `child_process` instance which is enhanced to also be a `Promise` for `stderr`.
           */
  def stderr(file: java.lang.String, args: js.Array[java.lang.String], options: Options): stdLib.Promise[java.lang.String] = js.native
  def stderr(file: java.lang.String, options: Options): stdLib.Promise[java.lang.String] = js.native
  /**
           * Execute a file.
           *
           * Think of this as a mix of `child_process.execFile` and `child_process.spawn`.
           * @returns a `child_process` instance which is enhanced to also be a `Promise` for `stdout`.
           */
  def stdout(file: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  /**
           * Execute a file.
           *
           * Think of this as a mix of `child_process.execFile` and `child_process.spawn`.
           * @returns a `child_process` instance which is enhanced to also be a `Promise` for `stdout`.
           */
  def stdout(file: java.lang.String, args: js.Array[java.lang.String]): stdLib.Promise[java.lang.String] = js.native
  /**
           * Execute a file.
           *
           * Think of this as a mix of `child_process.execFile` and `child_process.spawn`.
           * @returns a `child_process` instance which is enhanced to also be a `Promise` for `stdout`.
           */
  def stdout(file: java.lang.String, args: js.Array[java.lang.String], options: Options): stdLib.Promise[java.lang.String] = js.native
  def stdout(file: java.lang.String, options: Options): stdLib.Promise[java.lang.String] = js.native
  /**
           * Execute a file synchronously.
           *
           * Think of this as a mix of `child_process.execFile` and `child_process.spawn`.
           * @returns the same result object as `child_process.spawnSync`.
           * @throws an `Error` if the command fails.
           */
  def sync(file: java.lang.String): ExecaReturns = js.native
  /**
           * Execute a file synchronously.
           *
           * Think of this as a mix of `child_process.execFile` and `child_process.spawn`.
           * @returns the same result object as `child_process.spawnSync`.
           * @throws an `Error` if the command fails.
           */
  def sync(file: java.lang.String, args: js.Array[java.lang.String]): ExecaReturns = js.native
  /**
           * Execute a file synchronously.
           *
           * Think of this as a mix of `child_process.execFile` and `child_process.spawn`.
           * @returns the same result object as `child_process.spawnSync`.
           * @throws an `Error` if the command fails.
           */
  def sync(file: java.lang.String, args: js.Array[java.lang.String], options: SyncOptions): ExecaReturns = js.native
  def sync(file: java.lang.String, options: SyncOptions): ExecaReturns = js.native
}

