package typings.googleProtobuf.apiPbMod

import typings.googleProtobuf.mod.Message
import typings.googleProtobuf.sourceContextPbMod.SourceContext
import typings.googleProtobuf.typePbMod.Option
import typings.googleProtobuf.typePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/api_pb", "Api")
@js.native
class Api_ () extends Message {
  def addMethods(): Method = js.native
  def addMethods(value: Method): Method = js.native
  def addMethods(value: Method, index: Double): Method = js.native
  def addMixins(): Mixin = js.native
  def addMixins(value: Mixin): Mixin = js.native
  def addMixins(value: Mixin, index: Double): Mixin = js.native
  def addOptions(): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  def clearMethodsList(): Unit = js.native
  def clearMixinsList(): Unit = js.native
  def clearOptionsList(): Unit = js.native
  def clearSourceContext(): Unit = js.native
  def getMethodsList(): js.Array[Method] = js.native
  def getMixinsList(): js.Array[Mixin] = js.native
  def getName(): String = js.native
  def getOptionsList(): js.Array[Option] = js.native
  def getSourceContext(): js.UndefOr[SourceContext] = js.native
  def getSyntax(): Syntax = js.native
  def getVersion(): String = js.native
  def hasSourceContext(): Boolean = js.native
  def setMethodsList(value: js.Array[Method]): Unit = js.native
  def setMixinsList(value: js.Array[Mixin]): Unit = js.native
  def setName(value: String): Unit = js.native
  def setOptionsList(value: js.Array[Option]): Unit = js.native
  def setSourceContext(): Unit = js.native
  def setSourceContext(value: SourceContext): Unit = js.native
  def setSyntax(value: Syntax): Unit = js.native
  def setVersion(value: String): Unit = js.native
}

