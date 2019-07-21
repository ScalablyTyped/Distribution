package typings
package execaLib.execaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("execa", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Execute a file.
  	Think of this as a mix of `child_process.execFile` and `child_process.spawn`.
  	@param file - The program/script to execute.
  	@param arguments - Arguments to pass to `file` on execution.
  	@returns A [`child_process` instance](https://nodejs.org/api/child_process.html#child_process_class_childprocess), which is enhanced to also be a `Promise` for a result `Object` with `stdout` and `stderr` properties.
  	@example
  	```
  	import execa from 'execa';
  	(async () => {
  		const {stdout} = await execa('echo', ['unicorns']);
  		console.log(stdout);
  		//=> 'unicorns'
  		// Cancelling a spawned process
  		const subprocess = execa('node');
  		setTimeout(() => { spawned.cancel() }, 1000);
  		try {
  			await subprocess;
  		} catch (error) {
  			console.log(subprocess.killed); // true
  			console.log(error.isCanceled); // true
  		}
  	})();
  	// Pipe the child process stdout to the current stdout
  	execa('echo', ['unicorns']).stdout.pipe(process.stdout);
  	```
  	*/
  def apply(file: java.lang.String): ExecaChildProcess[java.lang.String] = js.native
  def apply(file: java.lang.String, arguments: js.Array[java.lang.String]): ExecaChildProcess[java.lang.String] = js.native
  def apply(
    file: java.lang.String,
    arguments: js.Array[java.lang.String],
    options: Options[scala.Null | java.lang.String]
  ): ExecaChildProcess[java.lang.String] = js.native
  def apply(file: java.lang.String, options: Options[scala.Null | java.lang.String]): ExecaChildProcess[java.lang.String] = js.native
  /**
  	Same as `execa()` except both file and arguments are specified in a single `command` string. For example, `execa('echo', ['unicorns'])` is the same as `execa.command('echo unicorns')`.
  	If the file or an argument contains spaces, they must be escaped with backslashes. This matters especially if `command` is not a constant but a variable, for example with `__dirname` or `process.cwd()`. Except for spaces, no escaping/quoting is needed.
  	The `shell` option must be used if the `command` uses shell-specific features, as opposed to being a simple `file` followed by its `arguments`.
  	@param command - The program/script to execute and its arguments.
  	@returns A [`child_process` instance](https://nodejs.org/api/child_process.html#child_process_class_childprocess), which is enhanced to also be a `Promise` for a result `Object` with `stdout` and `stderr` properties.
  	@example
  	```
  	import execa from 'execa';
  	(async () => {
  		const {stdout} = await execa.command('echo unicorns');
  		console.log(stdout);
  		//=> 'unicorns'
  	})();
  	```
  	*/
  def command(command: java.lang.String): ExecaChildProcess[java.lang.String] = js.native
  def command(command: java.lang.String, options: Options[scala.Null | java.lang.String]): ExecaChildProcess[java.lang.String] = js.native
  /**
  	Same as `execa.command()` but synchronous.
  	@param command - The program/script to execute and its arguments.
  	@returns A result `Object` with `stdout` and `stderr` properties.
  	*/
  def commandSync(command: java.lang.String): ExecaSyncReturnValue[java.lang.String] = js.native
  def commandSync(command: java.lang.String, options: SyncOptions[scala.Null | java.lang.String]): ExecaSyncReturnValue[java.lang.String] = js.native
  /**
  	Execute a Node.js script as a child process.
  	Same as `execa('node', [scriptPath, ...arguments], options)` except (like [`child_process#fork()`](https://nodejs.org/api/child_process.html#child_process_child_process_fork_modulepath_args_options)):
  		- the current Node version and options are used. This can be overridden using the `nodePath` and `nodeArguments` options.
  		- the `shell` option cannot be used
  		- an extra channel [`ipc`](https://nodejs.org/api/child_process.html#child_process_options_stdio) is passed to [`stdio`](#stdio)
  	@param scriptPath - Node.js script to execute.
  	@param arguments - Arguments to pass to `scriptPath` on execution.
  	@returns A [`child_process` instance](https://nodejs.org/api/child_process.html#child_process_class_childprocess), which is enhanced to also be a `Promise` for a result `Object` with `stdout` and `stderr` properties.
  	*/
  def node(scriptPath: java.lang.String): ExecaChildProcess[java.lang.String] = js.native
  def node(scriptPath: java.lang.String, arguments: js.Array[java.lang.String]): ExecaChildProcess[java.lang.String] = js.native
  def node(
    scriptPath: java.lang.String,
    arguments: js.Array[java.lang.String],
    options: NodeOptions[java.lang.String]
  ): ExecaChildProcess[java.lang.String] = js.native
  def node(scriptPath: java.lang.String, arguments: js.Array[java.lang.String], options: Options[scala.Null]): ExecaChildProcess[nodeLib.Buffer] = js.native
  def node(scriptPath: java.lang.String, options: Options[scala.Null | java.lang.String]): ExecaChildProcess[java.lang.String] = js.native
  /**
  	Execute a file synchronously.
  	This method throws an `Error` if the command fails.
  	@param file - The program/script to execute.
  	@param arguments - Arguments to pass to `file` on execution.
  	@returns A result `Object` with `stdout` and `stderr` properties.
  	*/
  def sync(file: java.lang.String): ExecaSyncReturnValue[java.lang.String] = js.native
  def sync(file: java.lang.String, arguments: js.Array[java.lang.String]): ExecaSyncReturnValue[java.lang.String] = js.native
  def sync(
    file: java.lang.String,
    arguments: js.Array[java.lang.String],
    options: SyncOptions[scala.Null | java.lang.String]
  ): ExecaSyncReturnValue[java.lang.String] = js.native
  def sync(file: java.lang.String, options: SyncOptions[scala.Null | java.lang.String]): ExecaSyncReturnValue[java.lang.String] = js.native
}

