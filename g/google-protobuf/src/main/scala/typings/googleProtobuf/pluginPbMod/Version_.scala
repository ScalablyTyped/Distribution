package typings.googleProtobuf.pluginPbMod

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "Version")
@js.native
class Version_ () extends Message {
  
  def clearMajor(): Version = js.native
  
  def clearMinor(): Version = js.native
  
  def clearPatch(): Version = js.native
  
  def clearSuffix(): Version = js.native
  
  def getMajor(): js.UndefOr[Double] = js.native
  
  def getMinor(): js.UndefOr[Double] = js.native
  
  def getPatch(): js.UndefOr[Double] = js.native
  
  def getSuffix(): js.UndefOr[String] = js.native
  
  def hasMajor(): Boolean = js.native
  
  def hasMinor(): Boolean = js.native
  
  def hasPatch(): Boolean = js.native
  
  def hasSuffix(): Boolean = js.native
  
  def setMajor(value: Double): Version = js.native
  
  def setMinor(value: Double): Version = js.native
  
  def setPatch(value: Double): Version = js.native
  
  def setSuffix(value: String): Version = js.native
}
