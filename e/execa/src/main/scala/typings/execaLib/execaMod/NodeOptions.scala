package typings
package execaLib.execaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeOptions[EncodingType] extends Options[EncodingType] {
  /**
  		List of [CLI options](https://nodejs.org/api/cli.html#cli_options) passed to the Node.js executable.
  		@default process.execArgv
  		*/
  val nodeOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  		The Node.js executable to use.
  		@default process.execPath
  		*/
  val nodePath: js.UndefOr[java.lang.String] = js.undefined
}

object NodeOptions {
  @scala.inline
  def apply[EncodingType](
    argv0: java.lang.String = null,
    buffer: js.UndefOr[scala.Boolean] = js.undefined,
    cleanup: js.UndefOr[scala.Boolean] = js.undefined,
    cwd: java.lang.String = null,
    detached: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: EncodingType = null,
    env: nodeLib.NodeJSNs.ProcessEnv = null,
    extendEnv: js.UndefOr[scala.Boolean] = js.undefined,
    gid: scala.Int | scala.Double = null,
    input: java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable = null,
    killSignal: java.lang.String | scala.Double = null,
    localDir: java.lang.String = null,
    maxBuffer: scala.Int | scala.Double = null,
    nodeOptions: js.Array[java.lang.String] = null,
    nodePath: java.lang.String = null,
    preferLocal: js.UndefOr[scala.Boolean] = js.undefined,
    reject: js.UndefOr[scala.Boolean] = js.undefined,
    shell: scala.Boolean | java.lang.String = null,
    stderr: StdioOption = null,
    stdin: StdioOption = null,
    stdio: execaLib.execaLibStrings.pipe | execaLib.execaLibStrings.ignore | execaLib.execaLibStrings.inherit | js.Array[StdioOption] = null,
    stdout: StdioOption = null,
    stripFinalNewline: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    uid: scala.Int | scala.Double = null,
    windowsVerbatimArguments: js.UndefOr[scala.Boolean] = js.undefined
  ): NodeOptions[EncodingType] = {
    val __obj = js.Dynamic.literal()
    if (argv0 != null) __obj.updateDynamic("argv0")(argv0)
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (!js.isUndefined(cleanup)) __obj.updateDynamic("cleanup")(cleanup)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env)
    if (!js.isUndefined(extendEnv)) __obj.updateDynamic("extendEnv")(extendEnv)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal.asInstanceOf[js.Any])
    if (localDir != null) __obj.updateDynamic("localDir")(localDir)
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    if (nodeOptions != null) __obj.updateDynamic("nodeOptions")(nodeOptions)
    if (nodePath != null) __obj.updateDynamic("nodePath")(nodePath)
    if (!js.isUndefined(preferLocal)) __obj.updateDynamic("preferLocal")(preferLocal)
    if (!js.isUndefined(reject)) __obj.updateDynamic("reject")(reject)
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (stderr != null) __obj.updateDynamic("stderr")(stderr.asInstanceOf[js.Any])
    if (stdin != null) __obj.updateDynamic("stdin")(stdin.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (stdout != null) __obj.updateDynamic("stdout")(stdout.asInstanceOf[js.Any])
    if (!js.isUndefined(stripFinalNewline)) __obj.updateDynamic("stripFinalNewline")(stripFinalNewline)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments)
    __obj.asInstanceOf[NodeOptions[EncodingType]]
  }
}

