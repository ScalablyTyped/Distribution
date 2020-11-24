package typings.execa.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  	import execa = require('execa');
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
  def apply(file: String): ExecaChildProcess[String] = js.native
  def apply(file: String, arguments: js.UndefOr[scala.Nothing], options: Options[Null | String]): ExecaChildProcess[String] = js.native
  def apply(file: String, arguments: js.Array[String]): ExecaChildProcess[String] = js.native
  def apply(file: String, arguments: js.Array[String], options: Options[Null | String]): ExecaChildProcess[String] = js.native
  def apply(file: String, options: Options[Null | String]): ExecaChildProcess[String] = js.native
  
  /**
  	Same as `execa()` except both file and arguments are specified in a single `command` string. For example, `execa('echo', ['unicorns'])` is the same as `execa.command('echo unicorns')`.
  	If the file or an argument contains spaces, they must be escaped with backslashes. This matters especially if `command` is not a constant but a variable, for example with `__dirname` or `process.cwd()`. Except for spaces, no escaping/quoting is needed.
  	The `shell` option must be used if the `command` uses shell-specific features, as opposed to being a simple `file` followed by its `arguments`.
  	@param command - The program/script to execute and its arguments.
  	@returns A [`child_process` instance](https://nodejs.org/api/child_process.html#child_process_class_childprocess), which is enhanced to also be a `Promise` for a result `Object` with `stdout` and `stderr` properties.
  	@example
  	```
  	import execa = require('execa');
  	(async () => {
  		const {stdout} = await execa.command('echo unicorns');
  		console.log(stdout);
  		//=> 'unicorns'
  	})();
  	```
  	*/
  def command(command: String): ExecaChildProcess[String] = js.native
  def command(command: String, options: Options[Null | String]): ExecaChildProcess[String] = js.native
  
  /**
  	Same as `execa.command()` but synchronous.
  	@param command - The program/script to execute and its arguments.
  	@returns A result `Object` with `stdout` and `stderr` properties.
  	*/
  def commandSync(command: String): ExecaSyncReturnValue[String] = js.native
  def commandSync(command: String, options: SyncOptions[Null | String]): ExecaSyncReturnValue[String] = js.native
  
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
  def node(scriptPath: String): ExecaChildProcess[String] = js.native
  def node(scriptPath: String, arguments: js.UndefOr[scala.Nothing], options: NodeOptions[String]): ExecaChildProcess[String] = js.native
  def node(scriptPath: String, arguments: js.UndefOr[scala.Nothing], options: Options[Null]): ExecaChildProcess[Buffer] = js.native
  def node(scriptPath: String, arguments: js.Array[String]): ExecaChildProcess[String] = js.native
  def node(scriptPath: String, arguments: js.Array[String], options: NodeOptions[String]): ExecaChildProcess[String] = js.native
  def node(scriptPath: String, arguments: js.Array[String], options: Options[Null]): ExecaChildProcess[Buffer] = js.native
  def node(scriptPath: String, options: Options[Null | String]): ExecaChildProcess[String] = js.native
  
  /**
  	Execute a file synchronously.
  	This method throws an `Error` if the command fails.
  	@param file - The program/script to execute.
  	@param arguments - Arguments to pass to `file` on execution.
  	@returns A result `Object` with `stdout` and `stderr` properties.
  	*/
  def sync(file: String): ExecaSyncReturnValue[String] = js.native
  def sync(file: String, arguments: js.UndefOr[scala.Nothing], options: SyncOptions[Null | String]): ExecaSyncReturnValue[String] = js.native
  def sync(file: String, arguments: js.Array[String]): ExecaSyncReturnValue[String] = js.native
  def sync(file: String, arguments: js.Array[String], options: SyncOptions[Null | String]): ExecaSyncReturnValue[String] = js.native
  def sync(file: String, options: SyncOptions[Null | String]): ExecaSyncReturnValue[String] = js.native
}
