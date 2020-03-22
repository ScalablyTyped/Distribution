package typings.execa.mod

import typings.execa.execaStrings.advanced
import typings.execa.execaStrings.ignore
import typings.execa.execaStrings.inherit
import typings.execa.execaStrings.json
import typings.execa.execaStrings.pipe
import typings.node.Buffer
import typings.node.NodeJS.ProcessEnv
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[EncodingType] extends CommonOptions[EncodingType] {
  /**
  		Write some input to the `stdin` of your binary.
  		*/
  val input: js.UndefOr[String | Buffer | Readable] = js.undefined
}

object Options {
  @scala.inline
  def apply[EncodingType](
    all: js.UndefOr[Boolean] = js.undefined,
    argv0: String = null,
    buffer: js.UndefOr[Boolean] = js.undefined,
    cleanup: js.UndefOr[Boolean] = js.undefined,
    cwd: String = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    encoding: EncodingType = null,
    env: ProcessEnv = null,
    execPath: String = null,
    extendEnv: js.UndefOr[Boolean] = js.undefined,
    gid: Int | Double = null,
    input: String | Buffer | Readable = null,
    killSignal: String | Double = null,
    localDir: String = null,
    maxBuffer: Int | Double = null,
    preferLocal: js.UndefOr[Boolean] = js.undefined,
    reject: js.UndefOr[Boolean] = js.undefined,
    serialization: json | advanced = null,
    shell: Boolean | String = null,
    stderr: StdioOption = null,
    stdin: StdioOption = null,
    stdio: pipe | ignore | inherit | js.Array[StdioOption] = null,
    stdout: StdioOption = null,
    stripFinalNewline: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    uid: Int | Double = null,
    windowsHide: js.UndefOr[Boolean] = js.undefined,
    windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  ): Options[EncodingType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (argv0 != null) __obj.updateDynamic("argv0")(argv0.asInstanceOf[js.Any])
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (!js.isUndefined(cleanup)) __obj.updateDynamic("cleanup")(cleanup.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (execPath != null) __obj.updateDynamic("execPath")(execPath.asInstanceOf[js.Any])
    if (!js.isUndefined(extendEnv)) __obj.updateDynamic("extendEnv")(extendEnv.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal.asInstanceOf[js.Any])
    if (localDir != null) __obj.updateDynamic("localDir")(localDir.asInstanceOf[js.Any])
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(preferLocal)) __obj.updateDynamic("preferLocal")(preferLocal.asInstanceOf[js.Any])
    if (!js.isUndefined(reject)) __obj.updateDynamic("reject")(reject.asInstanceOf[js.Any])
    if (serialization != null) __obj.updateDynamic("serialization")(serialization.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (stderr != null) __obj.updateDynamic("stderr")(stderr.asInstanceOf[js.Any])
    if (stdin != null) __obj.updateDynamic("stdin")(stdin.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (stdout != null) __obj.updateDynamic("stdout")(stdout.asInstanceOf[js.Any])
    if (!js.isUndefined(stripFinalNewline)) __obj.updateDynamic("stripFinalNewline")(stripFinalNewline.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[EncodingType]]
  }
}

