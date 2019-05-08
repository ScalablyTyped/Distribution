package typings
package googleDashProtoDashFilesLib.buildSrcLoadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-proto-files/build/src/load", "GoogleProtoFilesRoot")
@js.native
class GoogleProtoFilesRoot ()
  extends protobufjsLib.protobufjsMod.Root {
  def this(options: GoogleProtoFilesRootOptions) = this()
  def resolvePath(`_`: java.lang.String, includePath: java.lang.String, alreadyNormalized: scala.Boolean): java.lang.String = js.native
}

/* static members */
@JSImport("google-proto-files/build/src/load", "GoogleProtoFilesRoot")
@js.native
object GoogleProtoFilesRoot extends js.Object {
  def getCommonProtoFiles(): js.Array[java.lang.String] = js.native
}

