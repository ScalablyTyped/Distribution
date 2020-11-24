package typings.googleProtobuf.apiPbMod

import typings.googleProtobuf.mod.Message
import typings.googleProtobuf.sourceContextPbMod.SourceContext
import typings.googleProtobuf.typePbMod.Option
import typings.googleProtobuf.typePbMod.Syntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/api_pb", "Api")
@js.native
class Api_ () extends Message {
  
  def addMethods(): Method = js.native
  def addMethods(value: js.UndefOr[scala.Nothing], index: Double): Method = js.native
  def addMethods(value: Method): Method = js.native
  def addMethods(value: Method, index: Double): Method = js.native
  
  def addMixins(): Mixin = js.native
  def addMixins(value: js.UndefOr[scala.Nothing], index: Double): Mixin = js.native
  def addMixins(value: Mixin): Mixin = js.native
  def addMixins(value: Mixin, index: Double): Mixin = js.native
  
  def addOptions(): Option = js.native
  def addOptions(value: js.UndefOr[scala.Nothing], index: Double): Option = js.native
  def addOptions(value: Option): Option = js.native
  def addOptions(value: Option, index: Double): Option = js.native
  
  def clearMethodsList(): Api = js.native
  
  def clearMixinsList(): Api = js.native
  
  def clearOptionsList(): Api = js.native
  
  def clearSourceContext(): Api = js.native
  
  def getMethodsList(): js.Array[Method] = js.native
  
  def getMixinsList(): js.Array[Mixin] = js.native
  
  def getName(): String = js.native
  
  def getOptionsList(): js.Array[Option] = js.native
  
  def getSourceContext(): js.UndefOr[SourceContext] = js.native
  
  def getSyntax(): Syntax = js.native
  
  def getVersion(): String = js.native
  
  def hasSourceContext(): Boolean = js.native
  
  def setMethodsList(value: js.Array[Method]): Api = js.native
  
  def setMixinsList(value: js.Array[Mixin]): Api = js.native
  
  def setName(value: String): Api = js.native
  
  def setOptionsList(value: js.Array[Option]): Api = js.native
  
  def setSourceContext(): Api = js.native
  def setSourceContext(value: SourceContext): Api = js.native
  
  def setSyntax(value: Syntax): Api = js.native
  
  def setVersion(value: String): Api = js.native
}
