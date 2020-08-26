package typings.execa.mod

import typings.execa.execaStrings.advanced
import typings.execa.execaStrings.ignore
import typings.execa.execaStrings.inherit
import typings.execa.execaStrings.json
import typings.execa.execaStrings.pipe
import typings.node.processMod.global.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonOptions[EncodingType] extends js.Object {
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
  implicit class CommonOptionsOps[Self <: CommonOptions[_], EncodingType] (val x: Self with CommonOptions[EncodingType]) extends AnyVal {
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
    def setAll(value: Boolean): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    @scala.inline
    def setArgv0(value: String): Self = this.set("argv0", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgv0: Self = this.set("argv0", js.undefined)
    @scala.inline
    def setBuffer(value: Boolean): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setCleanup(value: Boolean): Self = this.set("cleanup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCleanup: Self = this.set("cleanup", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setDetached(value: Boolean): Self = this.set("detached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetached: Self = this.set("detached", js.undefined)
    @scala.inline
    def setEncoding(value: EncodingType): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEnv(value: ProcessEnv): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setExecPath(value: String): Self = this.set("execPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecPath: Self = this.set("execPath", js.undefined)
    @scala.inline
    def setExtendEnv(value: Boolean): Self = this.set("extendEnv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendEnv: Self = this.set("extendEnv", js.undefined)
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    @scala.inline
    def setKillSignal(value: String | Double): Self = this.set("killSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKillSignal: Self = this.set("killSignal", js.undefined)
    @scala.inline
    def setLocalDir(value: String): Self = this.set("localDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalDir: Self = this.set("localDir", js.undefined)
    @scala.inline
    def setMaxBuffer(value: Double): Self = this.set("maxBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBuffer: Self = this.set("maxBuffer", js.undefined)
    @scala.inline
    def setPreferLocal(value: Boolean): Self = this.set("preferLocal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferLocal: Self = this.set("preferLocal", js.undefined)
    @scala.inline
    def setReject(value: Boolean): Self = this.set("reject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReject: Self = this.set("reject", js.undefined)
    @scala.inline
    def setSerialization(value: json | advanced): Self = this.set("serialization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerialization: Self = this.set("serialization", js.undefined)
    @scala.inline
    def setShell(value: Boolean | String): Self = this.set("shell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShell: Self = this.set("shell", js.undefined)
    @scala.inline
    def setStderr(value: StdioOption): Self = this.set("stderr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStderr: Self = this.set("stderr", js.undefined)
    @scala.inline
    def setStdin(value: StdioOption): Self = this.set("stdin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
    @scala.inline
    def setStdioVarargs(value: StdioOption*): Self = this.set("stdio", js.Array(value :_*))
    @scala.inline
    def setStdio(value: pipe | ignore | inherit | js.Array[StdioOption]): Self = this.set("stdio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdio: Self = this.set("stdio", js.undefined)
    @scala.inline
    def setStdout(value: StdioOption): Self = this.set("stdout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
    @scala.inline
    def setStripFinalNewline(value: Boolean): Self = this.set("stripFinalNewline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripFinalNewline: Self = this.set("stripFinalNewline", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    @scala.inline
    def setWindowsHide(value: Boolean): Self = this.set("windowsHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowsHide: Self = this.set("windowsHide", js.undefined)
    @scala.inline
    def setWindowsVerbatimArguments(value: Boolean): Self = this.set("windowsVerbatimArguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowsVerbatimArguments: Self = this.set("windowsVerbatimArguments", js.undefined)
  }
  
}

