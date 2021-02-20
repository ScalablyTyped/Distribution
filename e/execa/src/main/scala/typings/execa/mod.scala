package typings.execa

import typings.execa.execaBooleans.`false`
import typings.execa.execaStrings.advanced
import typings.execa.execaStrings.ignore
import typings.execa.execaStrings.inherit
import typings.execa.execaStrings.json
import typings.execa.execaStrings.pipe
import typings.node.Buffer
import typings.node.childProcessMod.ChildProcess
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @JSImport("execa", JSImport.Namespace)
  @js.native
  def apply(file: String): ExecaChildProcess[String] = js.native
  @JSImport("execa", JSImport.Namespace)
  @js.native
  def apply(file: String, arguments: js.UndefOr[scala.Nothing], options: Options[Null | String]): ExecaChildProcess[String] = js.native
  @JSImport("execa", JSImport.Namespace)
  @js.native
  def apply(file: String, arguments: js.Array[String]): ExecaChildProcess[String] = js.native
  @JSImport("execa", JSImport.Namespace)
  @js.native
  def apply(file: String, arguments: js.Array[String], options: Options[Null | String]): ExecaChildProcess[String] = js.native
  @JSImport("execa", JSImport.Namespace)
  @js.native
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
  @JSImport("execa", "command")
  @js.native
  def command(command: String): ExecaChildProcess[String] = js.native
  @JSImport("execa", "command")
  @js.native
  def command(command: String, options: Options[Null | String]): ExecaChildProcess[String] = js.native
  
  /**
  	Same as `execa.command()` but synchronous.
  	@param command - The program/script to execute and its arguments.
  	@returns A result `Object` with `stdout` and `stderr` properties.
  	*/
  @JSImport("execa", "commandSync")
  @js.native
  def commandSync(command: String): ExecaSyncReturnValue[String] = js.native
  @JSImport("execa", "commandSync")
  @js.native
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
  @JSImport("execa", "node")
  @js.native
  def node(scriptPath: String): ExecaChildProcess[String] = js.native
  @JSImport("execa", "node")
  @js.native
  def node(scriptPath: String, arguments: js.UndefOr[scala.Nothing], options: NodeOptions[String]): ExecaChildProcess[String] = js.native
  @JSImport("execa", "node")
  @js.native
  def node(scriptPath: String, arguments: js.UndefOr[scala.Nothing], options: Options[Null]): ExecaChildProcess[Buffer] = js.native
  @JSImport("execa", "node")
  @js.native
  def node(scriptPath: String, arguments: js.Array[String]): ExecaChildProcess[String] = js.native
  @JSImport("execa", "node")
  @js.native
  def node(scriptPath: String, arguments: js.Array[String], options: NodeOptions[String]): ExecaChildProcess[String] = js.native
  @JSImport("execa", "node")
  @js.native
  def node(scriptPath: String, arguments: js.Array[String], options: Options[Null]): ExecaChildProcess[Buffer] = js.native
  @JSImport("execa", "node")
  @js.native
  def node(scriptPath: String, options: Options[Null | String]): ExecaChildProcess[String] = js.native
  
  /**
  	Execute a file synchronously.
  	This method throws an `Error` if the command fails.
  	@param file - The program/script to execute.
  	@param arguments - Arguments to pass to `file` on execution.
  	@returns A result `Object` with `stdout` and `stderr` properties.
  	*/
  @JSImport("execa", "sync")
  @js.native
  def sync(file: String): ExecaSyncReturnValue[String] = js.native
  @JSImport("execa", "sync")
  @js.native
  def sync(file: String, arguments: js.UndefOr[scala.Nothing], options: SyncOptions[Null | String]): ExecaSyncReturnValue[String] = js.native
  @JSImport("execa", "sync")
  @js.native
  def sync(file: String, arguments: js.Array[String]): ExecaSyncReturnValue[String] = js.native
  @JSImport("execa", "sync")
  @js.native
  def sync(file: String, arguments: js.Array[String], options: SyncOptions[Null | String]): ExecaSyncReturnValue[String] = js.native
  @JSImport("execa", "sync")
  @js.native
  def sync(file: String, options: SyncOptions[Null | String]): ExecaSyncReturnValue[String] = js.native
  
  @js.native
  trait CommonOptions[EncodingType] extends StObject {
    
    /**
    		Add an `.all` property on the promise and the resolved value. The property contains the output of the process with `stdout` and `stderr` interleaved.
    		@default false
    		*/
    val all: js.UndefOr[Boolean] = js.native
    
    /**
    		Explicitly set the value of `argv[0]` sent to the child process. This will be set to `command` or `file` if not specified.
    		*/
    val argv0: js.UndefOr[String] = js.native
    
    /**
    		Buffer the output from the spawned process. When set to `false`, you must read the output of `stdout` and `stderr` (or `all` if the `all` option is `true`). Otherwise the returned promise will not be resolved/rejected.
    		If the spawned process fails, `error.stdout`, `error.stderr`, and `error.all` will contain the buffered data.
    		@default true
    		*/
    val buffer: js.UndefOr[Boolean] = js.native
    
    /**
    		Kill the spawned process when the parent process exits unless either:
    			- the spawned process is [`detached`](https://nodejs.org/api/child_process.html#child_process_options_detached)
    			- the parent process is terminated abruptly, for example, with `SIGKILL` as opposed to `SIGTERM` or a normal exit
    		@default true
    		*/
    val cleanup: js.UndefOr[Boolean] = js.native
    
    /**
    		Current working directory of the child process.
    		@default process.cwd()
    		*/
    val cwd: js.UndefOr[String] = js.native
    
    /**
    		Prepare child to run independently of its parent process. Specific behavior [depends on the platform](https://nodejs.org/api/child_process.html#child_process_options_detached).
    		@default false
    		*/
    val detached: js.UndefOr[Boolean] = js.native
    
    /**
    		Specify the character encoding used to decode the `stdout` and `stderr` output. If set to `null`, then `stdout` and `stderr` will be a `Buffer` instead of a string.
    		@default 'utf8'
    		*/
    val encoding: js.UndefOr[EncodingType] = js.native
    
    /**
    		Environment key-value pairs. Extends automatically from `process.env`. Set `extendEnv` to `false` if you don't want this.
    		@default process.env
    		*/
    val env: js.UndefOr[ProcessEnv] = js.native
    
    /**
    		Path to the Node.js executable to use in child processes.
    		This can be either an absolute path or a path relative to the `cwd` option.
    		Requires `preferLocal` to be `true`.
    		For example, this can be used together with [`get-node`](https://github.com/ehmicky/get-node) to run a specific Node.js version in a child process.
    		@default process.execPath
    		*/
    val execPath: js.UndefOr[String] = js.native
    
    /**
    		Set to `false` if you don't want to extend the environment variables when providing the `env` property.
    		@default true
    		*/
    val extendEnv: js.UndefOr[Boolean] = js.native
    
    /**
    		Sets the group identity of the process.
    		*/
    val gid: js.UndefOr[Double] = js.native
    
    /**
    		Signal value to be used when the spawned process will be killed.
    		@default 'SIGTERM'
    		*/
    val killSignal: js.UndefOr[String | Double] = js.native
    
    /**
    		Preferred path to find locally installed binaries in (use with `preferLocal`).
    		@default process.cwd()
    		*/
    val localDir: js.UndefOr[String] = js.native
    
    /**
    		Largest amount of data in bytes allowed on `stdout` or `stderr`. Default: 100 MB.
    		@default 100_000_000
    		*/
    val maxBuffer: js.UndefOr[Double] = js.native
    
    /**
    		Prefer locally installed binaries when looking for a binary to execute.
    		If you `$ npm install foo`, you can then `execa('foo')`.
    		@default false
    		*/
    val preferLocal: js.UndefOr[Boolean] = js.native
    
    /**
    		Setting this to `false` resolves the promise with the error instead of rejecting it.
    		@default true
    		*/
    val reject: js.UndefOr[Boolean] = js.native
    
    /**
    		Specify the kind of serialization used for sending messages between processes when using the `stdio: 'ipc'` option or `execa.node()`:
    			- `json`: Uses `JSON.stringify()` and `JSON.parse()`.
    			- `advanced`: Uses [`v8.serialize()`](https://nodejs.org/api/v8.html#v8_v8_serialize_value)
    		Requires Node.js `13.2.0` or later.
    		[More info.](https://nodejs.org/api/child_process.html#child_process_advanced_serialization)
    		@default 'json'
    		*/
    val serialization: js.UndefOr[json | advanced] = js.native
    
    /**
    		If `true`, runs `command` inside of a shell. Uses `/bin/sh` on UNIX and `cmd.exe` on Windows. A different shell can be specified as a string. The shell should understand the `-c` switch on UNIX or `/d /s /c` on Windows.
    		We recommend against using this option since it is:
    		- not cross-platform, encouraging shell-specific syntax.
    		- slower, because of the additional shell interpretation.
    		- unsafe, potentially allowing command injection.
    		@default false
    		*/
    val shell: js.UndefOr[Boolean | String] = js.native
    
    /**
    		Same options as [`stdio`](https://nodejs.org/dist/latest-v6.x/docs/api/child_process.html#child_process_options_stdio).
    		@default 'pipe'
    		*/
    val stderr: js.UndefOr[StdioOption] = js.native
    
    /**
    		Same options as [`stdio`](https://nodejs.org/dist/latest-v6.x/docs/api/child_process.html#child_process_options_stdio).
    		@default 'pipe'
    		*/
    val stdin: js.UndefOr[StdioOption] = js.native
    
    /**
    		Child's [stdio](https://nodejs.org/api/child_process.html#child_process_options_stdio) configuration.
    		@default 'pipe'
    		*/
    val stdio: js.UndefOr[pipe | ignore | inherit | js.Array[StdioOption]] = js.native
    
    /**
    		Same options as [`stdio`](https://nodejs.org/dist/latest-v6.x/docs/api/child_process.html#child_process_options_stdio).
    		@default 'pipe'
    		*/
    val stdout: js.UndefOr[StdioOption] = js.native
    
    /**
    		Strip the final [newline character](https://en.wikipedia.org/wiki/Newline) from the output.
    		@default true
    		*/
    val stripFinalNewline: js.UndefOr[Boolean] = js.native
    
    /**
    		If `timeout` is greater than `0`, the parent will send the signal identified by the `killSignal` property (the default is `SIGTERM`) if the child runs longer than `timeout` milliseconds.
    		@default 0
    		*/
    val timeout: js.UndefOr[Double] = js.native
    
    /**
    		Sets the user identity of the process.
    		*/
    val uid: js.UndefOr[Double] = js.native
    
    /**
    		On Windows, do not create a new console window. Please note this also prevents `CTRL-C` [from working](https://github.com/nodejs/node/issues/29837) on Windows.
    		@default true
    		*/
    val windowsHide: js.UndefOr[Boolean] = js.native
    
    /**
    		If `true`, no quoting or escaping of arguments is done on Windows. Ignored on other platforms. This is set to `true` automatically when the `shell` option is `true`.
    		@default false
    		*/
    val windowsVerbatimArguments: js.UndefOr[Boolean] = js.native
  }
  object CommonOptions {
    
    @scala.inline
    def apply[EncodingType](): CommonOptions[EncodingType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonOptions[EncodingType]]
    }
    
    @scala.inline
    implicit class CommonOptionsMutableBuilder[Self <: CommonOptions[_], EncodingType] (val x: Self with CommonOptions[EncodingType]) extends AnyVal {
      
      @scala.inline
      def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      @scala.inline
      def setArgv0(value: String): Self = StObject.set(x, "argv0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgv0Undefined: Self = StObject.set(x, "argv0", js.undefined)
      
      @scala.inline
      def setBuffer(value: Boolean): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setCleanup(value: Boolean): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanupUndefined: Self = StObject.set(x, "cleanup", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      @scala.inline
      def setEncoding(value: EncodingType): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setExecPath(value: String): Self = StObject.set(x, "execPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecPathUndefined: Self = StObject.set(x, "execPath", js.undefined)
      
      @scala.inline
      def setExtendEnv(value: Boolean): Self = StObject.set(x, "extendEnv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendEnvUndefined: Self = StObject.set(x, "extendEnv", js.undefined)
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      @scala.inline
      def setKillSignal(value: String | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
      
      @scala.inline
      def setLocalDir(value: String): Self = StObject.set(x, "localDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalDirUndefined: Self = StObject.set(x, "localDir", js.undefined)
      
      @scala.inline
      def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
      
      @scala.inline
      def setPreferLocal(value: Boolean): Self = StObject.set(x, "preferLocal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferLocalUndefined: Self = StObject.set(x, "preferLocal", js.undefined)
      
      @scala.inline
      def setReject(value: Boolean): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUndefined: Self = StObject.set(x, "reject", js.undefined)
      
      @scala.inline
      def setSerialization(value: json | advanced): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
      
      @scala.inline
      def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
      
      @scala.inline
      def setStderr(value: StdioOption): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      @scala.inline
      def setStdin(value: StdioOption): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      @scala.inline
      def setStdio(value: pipe | ignore | inherit | js.Array[StdioOption]): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
      
      @scala.inline
      def setStdioVarargs(value: StdioOption*): Self = StObject.set(x, "stdio", js.Array(value :_*))
      
      @scala.inline
      def setStdout(value: StdioOption): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      @scala.inline
      def setStripFinalNewline(value: Boolean): Self = StObject.set(x, "stripFinalNewline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripFinalNewlineUndefined: Self = StObject.set(x, "stripFinalNewline", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
      
      @scala.inline
      def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
    }
  }
  
  type ExecaChildProcess[StdoutErrorType] = ChildProcess with ExecaChildPromise[StdoutErrorType] with js.Promise[ExecaReturnValue[StdoutErrorType]]
  
  @js.native
  trait ExecaChildPromise[StdoutErrorType] extends StObject {
    
    /**
    		Stream combining/interleaving [`stdout`](https://nodejs.org/api/child_process.html#child_process_subprocess_stdout) and [`stderr`](https://nodejs.org/api/child_process.html#child_process_subprocess_stderr).
    		This is `undefined` if either:
    			- the `all` option is `false` (the default value)
    			- both `stdout` and `stderr` options are set to [`'inherit'`, `'ipc'`, `Stream` or `integer`](https://nodejs.org/dist/latest-v6.x/docs/api/child_process.html#child_process_options_stdio)
    		*/
    var all: js.UndefOr[Readable] = js.native
    
    /**
    		Similar to [`childProcess.kill()`](https://nodejs.org/api/child_process.html#child_process_subprocess_kill_signal). This is preferred when cancelling the child process execution as the error is more descriptive and [`childProcessResult.isCanceled`](#iscanceled) is set to `true`.
    		*/
    def cancel(): Unit = js.native
    
    def `catch`[ResultType](): js.Promise[ExecaReturnValue[StdoutErrorType] | ResultType] = js.native
    def `catch`[ResultType](
      onRejected: js.Function1[/* reason */ ExecaError[StdoutErrorType], ResultType | js.Thenable[ResultType]]
    ): js.Promise[ExecaReturnValue[StdoutErrorType] | ResultType] = js.native
    
    /**
    		Same as the original [`child_process#kill()`](https://nodejs.org/api/child_process.html#child_process_subprocess_kill_signal), except if `signal` is `SIGTERM` (the default value) and the child process is not terminated after 5 seconds, force it by sending `SIGKILL`.
    		*/
    def kill(): Unit = js.native
    def kill(signal: js.UndefOr[scala.Nothing], options: KillOptions): Unit = js.native
    def kill(signal: String): Unit = js.native
    def kill(signal: String, options: KillOptions): Unit = js.native
  }
  
  @js.native
  trait ExecaError[StdoutErrorType] extends ExecaSyncError[StdoutErrorType] {
    
    /**
    		The output of the process with `stdout` and `stderr` interleaved.
    		This is `undefined` if either:
    		- the `all` option is `false` (default value)
    		- `execa.sync()` was used
    		*/
    var all: js.UndefOr[StdoutErrorType] = js.native
    
    /**
    		Whether the process was canceled.
    		*/
    var isCanceled: Boolean = js.native
  }
  object ExecaError {
    
    @scala.inline
    def apply[StdoutErrorType](
      command: String,
      exitCode: Double,
      failed: Boolean,
      isCanceled: Boolean,
      killed: Boolean,
      message: String,
      name: String,
      shortMessage: String,
      stderr: StdoutErrorType,
      stdout: StdoutErrorType,
      timedOut: Boolean
    ): ExecaError[StdoutErrorType] = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any], killed = killed.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shortMessage = shortMessage.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecaError[StdoutErrorType]]
    }
    
    @scala.inline
    implicit class ExecaErrorMutableBuilder[Self <: ExecaError[_], StdoutErrorType] (val x: Self with ExecaError[StdoutErrorType]) extends AnyVal {
      
      @scala.inline
      def setAll(value: StdoutErrorType): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      @scala.inline
      def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExecaReturnBase[StdoutStderrType] extends StObject {
    
    /**
    		The file and arguments that were run.
    		*/
    var command: String = js.native
    
    /**
    		The numeric exit code of the process that was run.
    		*/
    var exitCode: Double = js.native
    
    /**
    		Whether the process failed to run.
    		*/
    var failed: Boolean = js.native
    
    /**
    		Whether the process was killed.
    		*/
    var killed: Boolean = js.native
    
    /**
    		The name of the signal that was used to terminate the process. For example, `SIGFPE`.
    		If a signal terminated the process, this property is defined and included in the error message. Otherwise it is `undefined`.
    		*/
    var signal: js.UndefOr[String] = js.native
    
    /**
    		A human-friendly description of the signal that was used to terminate the process. For example, `Floating point arithmetic error`.
    		If a signal terminated the process, this property is defined and included in the error message. Otherwise it is `undefined`. It is also `undefined` when the signal is very uncommon which should seldomly happen.
    		*/
    var signalDescription: js.UndefOr[String] = js.native
    
    /**
    		The output of the process on stderr.
    		*/
    var stderr: StdoutStderrType = js.native
    
    /**
    		The output of the process on stdout.
    		*/
    var stdout: StdoutStderrType = js.native
    
    /**
    		Whether the process timed out.
    		*/
    var timedOut: Boolean = js.native
  }
  object ExecaReturnBase {
    
    @scala.inline
    def apply[StdoutStderrType](
      command: String,
      exitCode: Double,
      failed: Boolean,
      killed: Boolean,
      stderr: StdoutStderrType,
      stdout: StdoutStderrType,
      timedOut: Boolean
    ): ExecaReturnBase[StdoutStderrType] = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], killed = killed.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecaReturnBase[StdoutStderrType]]
    }
    
    @scala.inline
    implicit class ExecaReturnBaseMutableBuilder[Self <: ExecaReturnBase[_], StdoutStderrType] (val x: Self with ExecaReturnBase[StdoutStderrType]) extends AnyVal {
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailed(value: Boolean): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKilled(value: Boolean): Self = StObject.set(x, "killed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalDescription(value: String): Self = StObject.set(x, "signalDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalDescriptionUndefined: Self = StObject.set(x, "signalDescription", js.undefined)
      
      @scala.inline
      def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      @scala.inline
      def setStderr(value: StdoutStderrType): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdout(value: StdoutStderrType): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimedOut(value: Boolean): Self = StObject.set(x, "timedOut", value.asInstanceOf[js.Any])
    }
  }
  
  /**
  	Result of a child process execution. On success this is a plain object. On failure this is also an `Error` instance.
  	The child process fails when:
  	- its exit code is not `0`
  	- it was killed with a signal
  	- timing out
  	- being canceled
  	- there's not enough memory or there are already too many child processes
  	*/
  @js.native
  trait ExecaReturnValue[StdoutErrorType] extends ExecaReturnBase[StdoutErrorType] {
    
    /**
    		The output of the process with `stdout` and `stderr` interleaved.
    		This is `undefined` if either:
    		- the `all` option is `false` (default value)
    		- `execa.sync()` was used
    		*/
    var all: js.UndefOr[StdoutErrorType] = js.native
    
    /**
    		Whether the process was canceled.
    		*/
    var isCanceled: Boolean = js.native
  }
  object ExecaReturnValue {
    
    @scala.inline
    def apply[StdoutErrorType](
      command: String,
      exitCode: Double,
      failed: Boolean,
      isCanceled: Boolean,
      killed: Boolean,
      stderr: StdoutErrorType,
      stdout: StdoutErrorType,
      timedOut: Boolean
    ): ExecaReturnValue[StdoutErrorType] = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], isCanceled = isCanceled.asInstanceOf[js.Any], killed = killed.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecaReturnValue[StdoutErrorType]]
    }
    
    @scala.inline
    implicit class ExecaReturnValueMutableBuilder[Self <: ExecaReturnValue[_], StdoutErrorType] (val x: Self with ExecaReturnValue[StdoutErrorType]) extends AnyVal {
      
      @scala.inline
      def setAll(value: StdoutErrorType): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      @scala.inline
      def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExecaSyncError[StdoutErrorType]
    extends Error
       with ExecaReturnBase[StdoutErrorType] {
    
    /**
    		Original error message. This is the same as the `message` property except it includes neither the child process stdout/stderr nor some additional information added by Execa.
    		This is `undefined` unless the child process exited due to an `error` event or a timeout.
    		*/
    var originalMessage: js.UndefOr[String] = js.native
    
    /**
    		This is the same as the `message` property except it does not include the child process stdout/stderr.
    		*/
    var shortMessage: String = js.native
  }
  object ExecaSyncError {
    
    @scala.inline
    def apply[StdoutErrorType](
      command: String,
      exitCode: Double,
      failed: Boolean,
      killed: Boolean,
      message: String,
      name: String,
      shortMessage: String,
      stderr: StdoutErrorType,
      stdout: StdoutErrorType,
      timedOut: Boolean
    ): ExecaSyncError[StdoutErrorType] = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], killed = killed.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shortMessage = shortMessage.asInstanceOf[js.Any], stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any], timedOut = timedOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecaSyncError[StdoutErrorType]]
    }
    
    @scala.inline
    implicit class ExecaSyncErrorMutableBuilder[Self <: ExecaSyncError[_], StdoutErrorType] (val x: Self with ExecaSyncError[StdoutErrorType]) extends AnyVal {
      
      @scala.inline
      def setOriginalMessage(value: String): Self = StObject.set(x, "originalMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalMessageUndefined: Self = StObject.set(x, "originalMessage", js.undefined)
      
      @scala.inline
      def setShortMessage(value: String): Self = StObject.set(x, "shortMessage", value.asInstanceOf[js.Any])
    }
  }
  
  type ExecaSyncReturnValue[StdoutErrorType] = ExecaReturnBase[StdoutErrorType]
  
  @js.native
  trait KillOptions extends StObject {
    
    /**
    		Milliseconds to wait for the child process to terminate before sending `SIGKILL`.
    		Can be disabled with `false`.
    		@default 5000
    		*/
    var forceKillAfterTimeout: js.UndefOr[Double | `false`] = js.native
  }
  object KillOptions {
    
    @scala.inline
    def apply(): KillOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KillOptions]
    }
    
    @scala.inline
    implicit class KillOptionsMutableBuilder[Self <: KillOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceKillAfterTimeout(value: Double | `false`): Self = StObject.set(x, "forceKillAfterTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceKillAfterTimeoutUndefined: Self = StObject.set(x, "forceKillAfterTimeout", js.undefined)
    }
  }
  
  @js.native
  trait NodeOptions[EncodingType] extends Options[EncodingType] {
    
    /**
    		List of [CLI options](https://nodejs.org/api/cli.html#cli_options) passed to the Node.js executable.
    		@default process.execArgv
    		*/
    val nodeOptions: js.UndefOr[js.Array[String]] = js.native
    
    /**
    		The Node.js executable to use.
    		@default process.execPath
    		*/
    val nodePath: js.UndefOr[String] = js.native
  }
  object NodeOptions {
    
    @scala.inline
    def apply[EncodingType](): NodeOptions[EncodingType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeOptions[EncodingType]]
    }
    
    @scala.inline
    implicit class NodeOptionsMutableBuilder[Self <: NodeOptions[_], EncodingType] (val x: Self with NodeOptions[EncodingType]) extends AnyVal {
      
      @scala.inline
      def setNodeOptions(value: js.Array[String]): Self = StObject.set(x, "nodeOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeOptionsUndefined: Self = StObject.set(x, "nodeOptions", js.undefined)
      
      @scala.inline
      def setNodeOptionsVarargs(value: String*): Self = StObject.set(x, "nodeOptions", js.Array(value :_*))
      
      @scala.inline
      def setNodePath(value: String): Self = StObject.set(x, "nodePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodePathUndefined: Self = StObject.set(x, "nodePath", js.undefined)
    }
  }
  
  @js.native
  trait Options[EncodingType] extends CommonOptions[EncodingType] {
    
    /**
    		Write some input to the `stdin` of your binary.
    		*/
    val input: js.UndefOr[String | Buffer | Readable] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[EncodingType](): Options[EncodingType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[EncodingType]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], EncodingType] (val x: Self with Options[EncodingType]) extends AnyVal {
      
      @scala.inline
      def setInput(value: String | Buffer | Readable): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.execa.execaStrings.pipe
    - typings.execa.execaStrings.ipc
    - typings.execa.execaStrings.ignore
    - typings.execa.execaStrings.inherit
    - typings.node.streamMod.Stream
    - scala.Double
    - js.UndefOr[scala.Nothing]
  */
  type StdioOption = js.UndefOr[_StdioOption | Stream | Double]
  
  @js.native
  trait SyncOptions[EncodingType] extends CommonOptions[EncodingType] {
    
    /**
    		Write some input to the `stdin` of your binary.
    		*/
    val input: js.UndefOr[String | Buffer] = js.native
  }
  object SyncOptions {
    
    @scala.inline
    def apply[EncodingType](): SyncOptions[EncodingType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncOptions[EncodingType]]
    }
    
    @scala.inline
    implicit class SyncOptionsMutableBuilder[Self <: SyncOptions[_], EncodingType] (val x: Self with SyncOptions[EncodingType]) extends AnyVal {
      
      @scala.inline
      def setInput(value: String | Buffer): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    }
  }
  
  trait _StdioOption extends StObject
}
