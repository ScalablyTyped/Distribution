package typings.enhancedResolve.mod

import typings.enhancedResolve.AnonEncoding
import typings.enhancedResolve.AnonFlag
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.Stats
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enhanced-resolve", "NodeJsInputFileSystem")
@js.native
class NodeJsInputFileSystem () extends js.Object {
  def readFile(filename: String, callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]): Unit = js.native
  def readFile(
    filename: String,
    encoding: String,
    callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
  ): Unit = js.native
  def readFile(
    filename: String,
    options: AnonEncoding,
    callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
  ): Unit = js.native
  def readFile(
    filename: String,
    options: AnonFlag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
  def readFileSync(filename: String): Buffer = js.native
  def readFileSync(filename: String, encoding: String): String = js.native
  def readFileSync(filename: String, options: AnonEncoding): String = js.native
  def readFileSync(filename: String, options: AnonFlag): Buffer = js.native
  def readdir(path: String, callback: js.Function2[/* err */ Error, /* files */ js.Array[String], Unit]): Unit = js.native
  def readdirSync(path: String): js.Array[String] = js.native
  def readlink(path: String): Unit = js.native
  def readlink(path: String, callback: js.Function2[/* err */ ErrnoException, /* linkString */ String, _]): Unit = js.native
  def readlinkSync(path: String): String = js.native
  def readlinkSync(path: Buffer): String = js.native
  def stat(path: String): Unit = js.native
  def stat(path: String, callback: js.Function2[/* err */ ErrnoException, /* stats */ Stats, _]): Unit = js.native
  def statSync(path: String): Stats = js.native
  def statSync(path: Buffer): Stats = js.native
}

