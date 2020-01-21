package typings.execa.mod

import typings.execa.execaStrings.ignore
import typings.execa.execaStrings.inherit
import typings.execa.execaStrings.pipe
import typings.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions[EncodingType] extends js.Object {
  /**
  		Explicitly set the value of `argv[0]` sent to the child process. This will be set to `command` or `file` if not specified.
  		*/
  val argv0: js.UndefOr[String] = js.undefined
  /**
  		Buffer the output from the spawned process. When buffering is disabled you must consume the output of the `stdout` and `stderr` streams because the promise will not be resolved/rejected until they have completed.
  		If the spawned process fails, `error.stdout`, `error.stderr`, and `error.all` will contain the buffered data.
  		@default true
  		*/
  val buffer: js.UndefOr[Boolean] = js.undefined
  /**
  		Kill the spawned process when the parent process exits unless either:
  			- the spawned process is [`detached`](https://nodejs.org/api/child_process.html#child_process_options_detached)
  			- the parent process is terminated abruptly, for example, with `SIGKILL` as opposed to `SIGTERM` or a normal exit
  		@default true
  		*/
  val cleanup: js.UndefOr[Boolean] = js.undefined
  /**
  		Current working directory of the child process.
  		@default process.cwd()
  		*/
  val cwd: js.UndefOr[String] = js.undefined
  /**
  		Prepare child to run independently of its parent process. Specific behavior [depends on the platform](https://nodejs.org/api/child_process.html#child_process_options_detached).
  		@default false
  		*/
  val detached: js.UndefOr[Boolean] = js.undefined
  /**
  		Specify the character encoding used to decode the `stdout` and `stderr` output. If set to `null`, then `stdout` and `stderr` will be a `Buffer` instead of a string.
  		@default 'utf8'
  		*/
  val encoding: js.UndefOr[EncodingType] = js.undefined
  /**
  		Environment key-value pairs. Extends automatically from `process.env`. Set `extendEnv` to `false` if you don't want this.
  		@default process.env
  		*/
  val env: js.UndefOr[ProcessEnv] = js.undefined
  /**
  		Set to `false` if you don't want to extend the environment variables when providing the `env` property.
  		@default true
  		*/
  val extendEnv: js.UndefOr[Boolean] = js.undefined
  /**
  		Sets the group identity of the process.
  		*/
  val gid: js.UndefOr[Double] = js.undefined
  /**
  		Signal value to be used when the spawned process will be killed.
  		@default 'SIGTERM'
  		*/
  val killSignal: js.UndefOr[String | Double] = js.undefined
  /**
  		Preferred path to find locally installed binaries in (use with `preferLocal`).
  		@default process.cwd()
  		*/
  val localDir: js.UndefOr[String] = js.undefined
  /**
  		Largest amount of data in bytes allowed on `stdout` or `stderr`. Default: 100 MB.
  		@default 100_000_000
  		*/
  val maxBuffer: js.UndefOr[Double] = js.undefined
  /**
  		Prefer locally installed binaries when looking for a binary to execute.
  		If you `$ npm install foo`, you can then `execa('foo')`.
  		@default false
  		*/
  val preferLocal: js.UndefOr[Boolean] = js.undefined
  /**
  		Setting this to `false` resolves the promise with the error instead of rejecting it.
  		@default true
  		*/
  val reject: js.UndefOr[Boolean] = js.undefined
  /**
  		If `true`, runs `command` inside of a shell. Uses `/bin/sh` on UNIX and `cmd.exe` on Windows. A different shell can be specified as a string. The shell should understand the `-c` switch on UNIX or `/d /s /c` on Windows.
  		We recommend against using this option since it is:
  		- not cross-platform, encouraging shell-specific syntax.
  		- slower, because of the additional shell interpretation.
  		- unsafe, potentially allowing command injection.
  		@default false
  		*/
  val shell: js.UndefOr[Boolean | String] = js.undefined
  /**
  		Same options as [`stdio`](https://nodejs.org/dist/latest-v6.x/docs/api/child_process.html#child_process_options_stdio).
  		@default 'pipe'
  		*/
  val stderr: js.UndefOr[StdioOption] = js.undefined
  /**
  		Same options as [`stdio`](https://nodejs.org/dist/latest-v6.x/docs/api/child_process.html#child_process_options_stdio).
  		@default 'pipe'
  		*/
  val stdin: js.UndefOr[StdioOption] = js.undefined
  /**
  		Child's [stdio](https://nodejs.org/api/child_process.html#child_process_options_stdio) configuration.
  		@default 'pipe'
  		*/
  val stdio: js.UndefOr[pipe | ignore | inherit | js.Array[StdioOption]] = js.undefined
  /**
  		Same options as [`stdio`](https://nodejs.org/dist/latest-v6.x/docs/api/child_process.html#child_process_options_stdio).
  		@default 'pipe'
  		*/
  val stdout: js.UndefOr[StdioOption] = js.undefined
  /**
  		Strip the final [newline character](https://en.wikipedia.org/wiki/Newline) from the output.
  		@default true
  		*/
  val stripFinalNewline: js.UndefOr[Boolean] = js.undefined
  /**
  		If `timeout` is greater than `0`, the parent will send the signal identified by the `killSignal` property (the default is `SIGTERM`) if the child runs longer than `timeout` milliseconds.
  		@default 0
  		*/
  val timeout: js.UndefOr[Double] = js.undefined
  /**
  		Sets the user identity of the process.
  		*/
  val uid: js.UndefOr[Double] = js.undefined
  /**
  		If `true`, no quoting or escaping of arguments is done on Windows. Ignored on other platforms. This is set to `true` automatically when the `shell` option is `true`.
  		@default false
  		*/
  val windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply[EncodingType](
    argv0: String = null,
    buffer: js.UndefOr[Boolean] = js.undefined,
    cleanup: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    encoding: EncodingType = null,
    env: ProcessEnv = null,
    extendEnv: js.UndefOr[Boolean] = js.undefined,
    gid: Int | Double = null,
    killSignal: String | Double = null,
    localDir: String = null,
    maxBuffer: Int | Double = null,
    preferLocal: js.UndefOr[Boolean] = js.undefined,
    reject: js.UndefOr[Boolean] = js.undefined,
    shell: Boolean | String = null,
    stderr: StdioOption = null,
    stdin: StdioOption = null,
    stdio: pipe | ignore | inherit | js.Array[StdioOption] = null,
    stdout: StdioOption = null,
    stripFinalNewline: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    uid: Int | Double = null,
    windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  ): CommonOptions[EncodingType] = {
    val __obj = js.Dynamic.literal()
    if (argv0 != null) __obj.updateDynamic("argv0")(argv0.asInstanceOf[js.Any])
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (!js.isUndefined(cleanup)) __obj.updateDynamic("cleanup")(cleanup.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(extendEnv)) __obj.updateDynamic("extendEnv")(extendEnv.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal.asInstanceOf[js.Any])
    if (localDir != null) __obj.updateDynamic("localDir")(localDir.asInstanceOf[js.Any])
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(preferLocal)) __obj.updateDynamic("preferLocal")(preferLocal.asInstanceOf[js.Any])
    if (!js.isUndefined(reject)) __obj.updateDynamic("reject")(reject.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (stderr != null) __obj.updateDynamic("stderr")(stderr.asInstanceOf[js.Any])
    if (stdin != null) __obj.updateDynamic("stdin")(stdin.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (stdout != null) __obj.updateDynamic("stdout")(stdout.asInstanceOf[js.Any])
    if (!js.isUndefined(stripFinalNewline)) __obj.updateDynamic("stripFinalNewline")(stripFinalNewline.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOptions[EncodingType]]
  }
}

