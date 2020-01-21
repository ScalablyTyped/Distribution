package typings.googleProtobuf.pluginPbMod

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "Version")
@js.native
class Version_ () extends Message {
  def clearMajor(): Unit = js.native
  def clearMinor(): Unit = js.native
  def clearPatch(): Unit = js.native
  def clearSuffix(): Unit = js.native
  def getMajor(): js.UndefOr[Double] = js.native
  def getMinor(): js.UndefOr[Double] = js.native
  def getPatch(): js.UndefOr[Double] = js.native
  def getSuffix(): js.UndefOr[String] = js.native
  def hasMajor(): Boolean = js.native
  def hasMinor(): Boolean = js.native
  def hasPatch(): Boolean = js.native
  def hasSuffix(): Boolean = js.native
  def setMajor(value: Double): Unit = js.native
  def setMinor(value: Double): Unit = js.native
  def setPatch(value: Double): Unit = js.native
  def setSuffix(value: String): Unit = js.native
}

